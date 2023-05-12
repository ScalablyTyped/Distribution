package typings.rimraf

import typings.rimraf.mod.RimrafAsyncOptions
import typings.rimraf.mod.RimrafSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsRimrafWindowsMod {
  
  @JSImport("rimraf/dist/mjs/rimraf-windows", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rimrafWindows(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafWindows")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def rimrafWindowsSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafWindowsSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
