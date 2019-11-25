package typings.reactDashNative.reactDashNativeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashNative.reactDashNativeStrings.All
  - typings.reactDashNative.reactDashNativeStrings.Videos
  - typings.reactDashNative.reactDashNativeStrings.Photos
*/
trait CameraRollAssetType extends js.Object

object CameraRollAssetType {
  @scala.inline
  def All: typings.reactDashNative.reactDashNativeStrings.All = this.cast("All")
  @scala.inline
  def Photos: typings.reactDashNative.reactDashNativeStrings.Photos = this.cast("Photos")
  @scala.inline
  def Videos: typings.reactDashNative.reactDashNativeStrings.Videos = this.cast("Videos")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

