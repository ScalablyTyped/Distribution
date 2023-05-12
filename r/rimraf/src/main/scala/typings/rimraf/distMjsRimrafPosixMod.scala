package typings.rimraf

import typings.rimraf.mod.RimrafAsyncOptions
import typings.rimraf.mod.RimrafSyncOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsRimrafPosixMod {
  
  @JSImport("rimraf/dist/mjs/rimraf-posix", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def rimrafPosix(path: String, opt: RimrafAsyncOptions): js.Promise[Boolean] = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafPosix")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Boolean]]
  
  inline def rimrafPosixSync(path: String, opt: RimrafSyncOptions): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("rimrafPosixSync")(path.asInstanceOf[js.Any], opt.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
