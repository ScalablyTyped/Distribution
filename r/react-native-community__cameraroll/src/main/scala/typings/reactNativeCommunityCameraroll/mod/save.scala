package typings.reactNativeCommunityCameraroll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@react-native-community/cameraroll", "save")
@js.native
object save extends js.Object {
  
  /**
    * Saves the photo or video to the camera roll or photo library.
    */
  def apply(tag: String): js.Promise[String] = js.native
  def apply(tag: String, options: SaveToCameraRollOptions): js.Promise[String] = js.native
}
