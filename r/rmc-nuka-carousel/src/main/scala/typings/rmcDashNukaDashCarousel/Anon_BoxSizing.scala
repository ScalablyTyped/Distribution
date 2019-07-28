package typings.rmcDashNukaDashCarousel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoxSizing extends js.Object {
  var MozBoxSizing: String
  var boxSizing: String
  var display: String
  var height: String
  var position: String
  var visibility: String
  var width: js.UndefOr[String] = js.undefined
}

object Anon_BoxSizing {
  @scala.inline
  def apply(
    MozBoxSizing: String,
    boxSizing: String,
    display: String,
    height: String,
    position: String,
    visibility: String,
    width: String = null
  ): Anon_BoxSizing = {
    val __obj = js.Dynamic.literal(MozBoxSizing = MozBoxSizing, boxSizing = boxSizing, display = display, height = height, position = position, visibility = visibility)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_BoxSizing]
  }
}

