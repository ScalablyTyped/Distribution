package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenSelectDialogOptions extends js.Object {
  /** Defaults to true */
  var showImages: js.UndefOr[Boolean] = js.undefined
  /** Defaults to false */
  var showVideos: js.UndefOr[Boolean] = js.undefined
}

object OpenSelectDialogOptions {
  @scala.inline
  def apply(showImages: js.UndefOr[Boolean] = js.undefined, showVideos: js.UndefOr[Boolean] = js.undefined): OpenSelectDialogOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(showImages)) __obj.updateDynamic("showImages")(showImages.get.asInstanceOf[js.Any])
    if (!js.isUndefined(showVideos)) __obj.updateDynamic("showVideos")(showVideos.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenSelectDialogOptions]
  }
}

