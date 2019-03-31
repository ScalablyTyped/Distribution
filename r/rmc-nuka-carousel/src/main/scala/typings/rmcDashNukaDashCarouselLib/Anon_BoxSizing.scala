package typings
package rmcDashNukaDashCarouselLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BoxSizing extends js.Object {
  var MozBoxSizing: java.lang.String
  var boxSizing: java.lang.String
  var display: java.lang.String
  var height: java.lang.String
  var position: java.lang.String
  var visibility: java.lang.String
  var width: js.UndefOr[java.lang.String]
}

object Anon_BoxSizing {
  @scala.inline
  def apply(
    MozBoxSizing: java.lang.String,
    boxSizing: java.lang.String,
    display: java.lang.String,
    height: java.lang.String,
    position: java.lang.String,
    visibility: java.lang.String,
    width: java.lang.String = null
  ): Anon_BoxSizing = {
    val __obj = js.Dynamic.literal(MozBoxSizing = MozBoxSizing, boxSizing = boxSizing, display = display, height = height, position = position, visibility = visibility)
    if (width != null) __obj.updateDynamic("width")(width)
    __obj.asInstanceOf[Anon_BoxSizing]
  }
}

