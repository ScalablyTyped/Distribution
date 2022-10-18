package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibYarnMod {
  
  @JSImport("snyk/dist/lib/yarn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def yarn(method: String, packages: js.Array[String], live: Boolean, cwd: String, flags: js.Array[String]): js.Promise[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("yarn")(method.asInstanceOf[js.Any], packages.asInstanceOf[js.Any], live.asInstanceOf[js.Any], cwd.asInstanceOf[js.Any], flags.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Any]]
}
