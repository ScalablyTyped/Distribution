package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNative.reactNativeStrings.All
  - typings.reactNative.reactNativeStrings.Videos
  - typings.reactNative.reactNativeStrings.Photos
*/
trait CameraRollAssetType extends js.Object

object CameraRollAssetType {
  @scala.inline
  def All: typings.reactNative.reactNativeStrings.All = this.cast("All")
  @scala.inline
  def Photos: typings.reactNative.reactNativeStrings.Photos = this.cast("Photos")
  @scala.inline
  def Videos: typings.reactNative.reactNativeStrings.Videos = this.cast("Videos")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

