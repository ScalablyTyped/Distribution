package typings.rmcNukaCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBoxSizing extends js.Object {
  var MozBoxSizing: String
  var boxSizing: String
  var display: String
  var height: String
  var position: String
  var visibility: String
  var width: js.UndefOr[String] = js.undefined
}

object AnonBoxSizing {
  @scala.inline
  def apply(
    MozBoxSizing: String,
    boxSizing: String,
    display: String,
    height: String,
    position: String,
    visibility: String,
    width: String = null
  ): AnonBoxSizing = {
    val __obj = js.Dynamic.literal(MozBoxSizing = MozBoxSizing.asInstanceOf[js.Any], boxSizing = boxSizing.asInstanceOf[js.Any], display = display.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], visibility = visibility.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBoxSizing]
  }
}

