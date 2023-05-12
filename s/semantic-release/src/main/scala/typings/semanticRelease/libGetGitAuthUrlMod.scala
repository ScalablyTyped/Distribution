package typings.semanticRelease

import typings.semanticRelease.mod.Context
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libGetGitAuthUrlMod {
  
  @JSImport("semantic-release/lib/get-git-auth-url", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(context: Context): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(context.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
