package typings
package smoothDashScrollbarLib.interfacesScrollbarMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScrollIntoViewOptions extends js.Object {
  var alignToTop: scala.Boolean
  var offsetBottom: scala.Double
  var offsetLeft: scala.Double
  var offsetTop: scala.Double
  var onlyScrollIfNeeded: scala.Boolean
}

object ScrollIntoViewOptions {
  @scala.inline
  def apply(
    alignToTop: scala.Boolean,
    offsetBottom: scala.Double,
    offsetLeft: scala.Double,
    offsetTop: scala.Double,
    onlyScrollIfNeeded: scala.Boolean
  ): ScrollIntoViewOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("alignToTop")(alignToTop)
    __obj.updateDynamic("offsetBottom")(offsetBottom)
    __obj.updateDynamic("offsetLeft")(offsetLeft)
    __obj.updateDynamic("offsetTop")(offsetTop)
    __obj.updateDynamic("onlyScrollIfNeeded")(onlyScrollIfNeeded)
    __obj.asInstanceOf[ScrollIntoViewOptions]
  }
}

