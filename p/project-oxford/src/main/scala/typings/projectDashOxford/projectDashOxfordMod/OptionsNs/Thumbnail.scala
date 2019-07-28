package typings.projectDashOxford.projectDashOxfordMod.OptionsNs

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
   // Width of the thumb in pixels
  var height: js.UndefOr[Double] = js.undefined
   // Url to image to be thumbnailed
  var path: js.UndefOr[String] = js.undefined
   // Should SmartCropping be enabled?
  var pipe: js.UndefOr[Writable] = js.undefined
   // Height of the thumb in pixels
  var smartCropping: js.UndefOr[Boolean] = js.undefined
  var url: js.UndefOr[String] = js.undefined
   // Path to image to be thumbnailed
  var width: js.UndefOr[Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(
    height: Int | Double = null,
    path: String = null,
    pipe: Writable = null,
    smartCropping: js.UndefOr[Boolean] = js.undefined,
    url: String = null,
    width: Int | Double = null
  ): Thumbnail = {
    val __obj = js.Dynamic.literal()
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (path != null) __obj.updateDynamic("path")(path)
    if (pipe != null) __obj.updateDynamic("pipe")(pipe)
    if (!js.isUndefined(smartCropping)) __obj.updateDynamic("smartCropping")(smartCropping)
    if (url != null) __obj.updateDynamic("url")(url)
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Thumbnail]
  }
}

