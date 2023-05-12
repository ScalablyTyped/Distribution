package typings.rimraf

import typings.rimraf.mod.RimrafAsyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsPathArgMod {
  
  @JSImport("rimraf/dist/mjs/path-arg", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(path: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def default(path: String, opt: RimrafAsyncOptions): String = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[String]
}
