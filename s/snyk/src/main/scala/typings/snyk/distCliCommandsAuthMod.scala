package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsAuthMod {
  
  @JSImport("snyk/dist/cli/commands/auth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(apiToken: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(apiToken.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
