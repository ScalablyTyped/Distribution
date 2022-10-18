package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCliCommandsPolicyMod {
  
  @JSImport("snyk/dist/cli/commands/policy", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[js.Promise[String]]
  inline def default(path: String): js.Promise[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[String]]
}
