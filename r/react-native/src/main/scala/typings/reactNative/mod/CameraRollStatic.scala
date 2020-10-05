package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.photo
import typings.reactNative.reactNativeStrings.video
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CameraRollStatic extends js.Object {
   //'Album','All','Event','Faces','Library','PhotoStream','SavedPhotos'
  var AssetTypeOptions: js.Array[CameraRollAssetType] = js.native
  var GroupTypesOptions: js.Array[CameraRollGroupType] = js.native
  /**
    * Invokes callback with photo identifier objects from the local camera roll of the device matching shape defined by getPhotosReturnChecker.
    *
    * @param params See getPhotosParamChecker.
    */
  def getPhotos(params: GetPhotosParamType): js.Promise[GetPhotosReturnType] = js.native
   // "All", "Videos", "Photos"
  /**
    * Saves the image to the camera roll / gallery.
    *
    * @tag On Android, this is a local URI, such as "file:///sdcard/img.png".
    * On iOS, the tag can be one of the following:
    *      local URI
    *      assets-library tag
    *      a tag not maching any of the above, which means the image data will be stored in memory (and consume memory as long as the process is alive)
    *
    * @deprecated use saveToCameraRoll instead
    */
  def saveImageWithTag(tag: String): js.Promise[String] = js.native
  /**
    * Saves the photo or video to the camera roll / gallery.
    *
    * On Android, the tag must be a local image or video URI, such as `"file:///sdcard/img.png"`.
    *
    * On iOS, the tag can be any image URI (including local, remote asset-library and base64 data URIs)
    * or a local video file URI (remote or data URIs are not supported for saving video at this time).
    *
    * If the tag has a file extension of .mov or .mp4, it will be inferred as a video. Otherwise
    * it will be treated as a photo. To override the automatic choice, you can pass an optional
    * `type` parameter that must be one of 'photo' or 'video'.
    *
    * Returns a Promise which will resolve with the new URI.
    */
  def saveToCameraRoll(tag: String): js.Promise[String] = js.native
  @JSName("saveToCameraRoll")
  def saveToCameraRoll_photo(tag: String, `type`: photo): js.Promise[String] = js.native
  @JSName("saveToCameraRoll")
  def saveToCameraRoll_video(tag: String, `type`: video): js.Promise[String] = js.native
}

