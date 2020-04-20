package typings.qlik.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Selectionobject extends js.Object {
  var qBackCount: Double
  var qForwardCount: Double
  var qSelections: js.Array[NxCurrentSelectionItem]
}

object Selectionobject {
  @scala.inline
  def apply(qBackCount: Double, qForwardCount: Double, qSelections: js.Array[NxCurrentSelectionItem]): Selectionobject = {
    val __obj = js.Dynamic.literal(qBackCount = qBackCount.asInstanceOf[js.Any], qForwardCount = qForwardCount.asInstanceOf[js.Any], qSelections = qSelections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Selectionobject]
  }
}

