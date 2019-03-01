package typings
package projectDashOxfordLib.projectDashOxfordMod.OptionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Thumbnail extends js.Object {
   // Width of the thumb in pixels
  var height: js.UndefOr[scala.Double] = js.undefined
   // Url to image to be thumbnailed
  var path: js.UndefOr[java.lang.String] = js.undefined
   // Should SmartCropping be enabled?
  var pipe: js.UndefOr[nodeLib.streamMod.Writable] = js.undefined
   // Height of the thumb in pixels
  var smartCropping: js.UndefOr[scala.Boolean] = js.undefined
  var url: js.UndefOr[java.lang.String] = js.undefined
   // Path to image to be thumbnailed
  var width: js.UndefOr[scala.Double] = js.undefined
}

object Thumbnail {
  @scala.inline
  def apply(
    height: scala.Int | scala.Double = null,
    path: java.lang.String = null,
    pipe: nodeLib.streamMod.Writable = null,
    smartCropping: js.UndefOr[scala.Boolean] = js.undefined,
    url: java.lang.String = null,
    width: scala.Int | scala.Double = null
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

