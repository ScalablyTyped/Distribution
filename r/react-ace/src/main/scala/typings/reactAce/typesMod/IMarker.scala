package typings.reactAce.typesMod

import typings.aceBuilds.mod.Ace.MarkerRenderer
import typings.aceBuilds.mod.Ace.Range
import typings.reactAce.reactAceStrings.fullLine
import typings.reactAce.reactAceStrings.screenLine
import typings.reactAce.reactAceStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMarker extends js.Object {
  var className: String = js.native
  var endCol: Double = js.native
  var endRow: Double = js.native
  var inFront: js.UndefOr[Boolean] = js.native
  var startCol: Double = js.native
  var startRow: Double = js.native
  var `type`: fullLine | screenLine | text | MarkerRenderer = js.native
}

object IMarker {
  @scala.inline
  def apply(
    className: String,
    endCol: Double,
    endRow: Double,
    startCol: Double,
    startRow: Double,
    `type`: fullLine | screenLine | text | MarkerRenderer
  ): IMarker = {
    val __obj = js.Dynamic.literal(className = className.asInstanceOf[js.Any], endCol = endCol.asInstanceOf[js.Any], endRow = endRow.asInstanceOf[js.Any], startCol = startCol.asInstanceOf[js.Any], startRow = startRow.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMarker]
  }
  @scala.inline
  implicit class IMarkerOps[Self <: IMarker] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndCol(value: Double): Self = this.set("endCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndRow(value: Double): Self = this.set("endRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartCol(value: Double): Self = this.set("startCol", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartRow(value: Double): Self = this.set("startRow", value.asInstanceOf[js.Any])
    @scala.inline
    def setTypeFunction5(
      value: (/* html */ js.Array[String], /* range */ Range, /* left */ Double, /* top */ Double, /* config */ js.Any) => Unit
    ): Self = this.set("type", js.Any.fromFunction5(value))
    @scala.inline
    def setType(value: fullLine | screenLine | text | MarkerRenderer): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setInFront(value: Boolean): Self = this.set("inFront", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInFront: Self = this.set("inFront", js.undefined)
  }
  
}

