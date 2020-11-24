package typings.reactNativeCommunityCameraroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cameraroll", "getPhotos")
@js.native
object getPhotos extends js.Object {
  
  /**
    * Returns a Promise with photo identifier objects from the local camera
    * roll of the device matching shape defined by `getPhotosReturnChecker`.
    */
  def apply(params: GetPhotosParams): js.Promise[PhotoIdentifiersPage] = js.native
}
