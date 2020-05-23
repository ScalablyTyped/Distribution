package typings.reactLoaderSpinner.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoaderProps extends js.Object {
  var color: js.UndefOr[String] = js.undefined
   // in milliseconds
  var height: js.UndefOr[Double] = js.undefined
  var timeout: js.UndefOr[Double] = js.undefined
  var `type`: js.UndefOr[Types] = js.undefined
  var visible: js.UndefOr[Boolean | String] = js.undefined
  var width: js.UndefOr[Double] = js.undefined
}

object LoaderProps {
  @scala.inline
  def apply(
    color: String = null,
    height: js.UndefOr[Double] = js.undefined,
    timeout: js.UndefOr[Double] = js.undefined,
    `type`: Types = null,
    visible: Boolean | String = null,
    width: js.UndefOr[Double] = js.undefined
  ): LoaderProps = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (!js.isUndefined(height)) __obj.updateDynamic("height")(height.get.asInstanceOf[js.Any])
    if (!js.isUndefined(timeout)) __obj.updateDynamic("timeout")(timeout.get.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (visible != null) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (!js.isUndefined(width)) __obj.updateDynamic("width")(width.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoaderProps]
  }
}

