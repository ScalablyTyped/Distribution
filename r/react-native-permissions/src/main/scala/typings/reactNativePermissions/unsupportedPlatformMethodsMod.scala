package typings.reactNativePermissions

import typings.reactNativePermissions.typesMod.LocationAccuracy
import typings.reactNativePermissions.typesMod.LocationAccuracyOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object unsupportedPlatformMethodsMod {
  
  @JSImport("react-native-permissions/dist/typescript/unsupportedPlatformMethods", "checkLocationAccuracy")
  @js.native
  def checkLocationAccuracy(): js.Promise[LocationAccuracy] = js.native
  
  @JSImport("react-native-permissions/dist/typescript/unsupportedPlatformMethods", "openLimitedPhotoLibraryPicker")
  @js.native
  def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = js.native
  
  @JSImport("react-native-permissions/dist/typescript/unsupportedPlatformMethods", "requestLocationAccuracy")
  @js.native
  def requestLocationAccuracy(_options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = js.native
}
