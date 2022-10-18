package typings.reactNativePermissions

import typings.reactNativePermissions.distTypescriptTypesMod.LocationAccuracy
import typings.reactNativePermissions.distTypescriptTypesMod.LocationAccuracyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypescriptUnsupportedPlatformMethodsMod {
  
  @JSImport("react-native-permissions/dist/typescript/unsupportedPlatformMethods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkLocationAccuracy(): js.Promise[LocationAccuracy] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLocationAccuracy")().asInstanceOf[js.Promise[LocationAccuracy]]
  
  inline def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openLimitedPhotoLibraryPicker")().asInstanceOf[js.Promise[Unit]]
  
  inline def requestLocationAccuracy(_options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLocationAccuracy")(_options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationAccuracy]]
}
