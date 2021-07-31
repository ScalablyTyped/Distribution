package typings.reactNativePermissions

import typings.reactNativePermissions.typesMod.LocationAccuracy
import typings.reactNativePermissions.typesMod.LocationAccuracyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsupportedPlatformMethodsMod {
  
  @JSImport("react-native-permissions/dist/typescript/unsupportedPlatformMethods", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def checkLocationAccuracy(): js.Promise[LocationAccuracy] = ^.asInstanceOf[js.Dynamic].applyDynamic("checkLocationAccuracy")().asInstanceOf[js.Promise[LocationAccuracy]]
  
  @scala.inline
  def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("openLimitedPhotoLibraryPicker")().asInstanceOf[js.Promise[Unit]]
  
  @scala.inline
  def requestLocationAccuracy(_options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = ^.asInstanceOf[js.Dynamic].applyDynamic("requestLocationAccuracy")(_options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[LocationAccuracy]]
}
