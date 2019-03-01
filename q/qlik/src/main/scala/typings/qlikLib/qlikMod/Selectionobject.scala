package typings
package qlikLib.qlikMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectionobject extends js.Object {
  var qBackCount: scala.Double
  var qForwardCount: scala.Double
  var qSelections: js.Array[NxCurrentSelectionItem]
}

object Selectionobject {
  @scala.inline
  def apply(
    qBackCount: scala.Double,
    qForwardCount: scala.Double,
    qSelections: js.Array[NxCurrentSelectionItem]
  ): Selectionobject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qBackCount")(qBackCount)
    __obj.updateDynamic("qForwardCount")(qForwardCount)
    __obj.updateDynamic("qSelections")(qSelections)
    __obj.asInstanceOf[Selectionobject]
  }
}

