package typings
package reactDashFoundationLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BOTTOM extends js.Object {
  var BOTTOM: reactDashFoundationLib.enumsMod.VerticalAlignments
  var MIDDLE: reactDashFoundationLib.enumsMod.VerticalAlignments
  var STRETCH: reactDashFoundationLib.enumsMod.VerticalAlignments
  var TOP: reactDashFoundationLib.enumsMod.VerticalAlignments
}

object Anon_BOTTOM {
  @scala.inline
  def apply(
    BOTTOM: reactDashFoundationLib.enumsMod.VerticalAlignments,
    MIDDLE: reactDashFoundationLib.enumsMod.VerticalAlignments,
    STRETCH: reactDashFoundationLib.enumsMod.VerticalAlignments,
    TOP: reactDashFoundationLib.enumsMod.VerticalAlignments
  ): Anon_BOTTOM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BOTTOM")(BOTTOM)
    __obj.updateDynamic("MIDDLE")(MIDDLE)
    __obj.updateDynamic("STRETCH")(STRETCH)
    __obj.updateDynamic("TOP")(TOP)
    __obj.asInstanceOf[Anon_BOTTOM]
  }
}

