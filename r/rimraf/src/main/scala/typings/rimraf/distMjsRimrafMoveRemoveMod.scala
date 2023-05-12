package typings.rimraf

import typings.rimraf.mod.RimrafAsyncOptions
import typings.rimraf.mod.RimrafSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsRimrafMoveRemoveMod {
  
  @JSImport("rimraf/dist/mjs/rimraf-move-remove", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rimrafMoveRemove(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafMoveRemove")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def rimrafMoveRemoveSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafMoveRemoveSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
