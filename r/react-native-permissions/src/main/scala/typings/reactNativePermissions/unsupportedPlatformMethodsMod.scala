package typings.reactNativePermissions

import typings.reactNativePermissions.typesMod.LocationAccuracy
import typings.reactNativePermissions.typesMod.LocationAccuracyOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-permissions/dist/typescript/unsupportedPlatformMethods", JSImport.Namespace)
@js.native
object unsupportedPlatformMethodsMod extends js.Object {
  
  def checkLocationAccuracy(): js.Promise[LocationAccuracy] = js.native
  
  def openLimitedPhotoLibraryPicker(): js.Promise[Unit] = js.native
  
  def requestLocationAccuracy(_options: LocationAccuracyOptions): js.Promise[LocationAccuracy] = js.native
}
