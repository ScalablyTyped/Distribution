package typings.rimraf

import typings.rimraf.mod.RimrafAsyncOptions
import typings.rimraf.mod.RimrafSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsRimrafManualMod {
  
  @JSImport("rimraf/dist/mjs/rimraf-manual", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rimrafManual(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafManual")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def rimrafManualSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafManualSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
