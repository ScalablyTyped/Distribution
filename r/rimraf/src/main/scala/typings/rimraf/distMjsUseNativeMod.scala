package typings.rimraf

import typings.rimraf.mod.RimrafAsyncOptions
import typings.rimraf.mod.RimrafOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMjsUseNativeMod {
  
  @JSImport("rimraf/dist/mjs/use-native", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def useNative(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useNative")().asInstanceOf[Boolean]
  inline def useNative(opt: RimrafAsyncOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useNative")(opt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  inline def useNativeSync(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useNativeSync")().asInstanceOf[Boolean]
  inline def useNativeSync(opt: RimrafOptions): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("useNativeSync")(opt.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
