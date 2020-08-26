package typings.simonwepSelectionJs.mod

import typings.std.HTMLElement
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SelectionOptions extends js.Object {
  var boundaries: js.UndefOr[js.Array[String]] = js.native
  var `class`: js.UndefOr[String] = js.native
  var disableTouch: js.UndefOr[Boolean] = js.native
  var frame: js.UndefOr[Node] = js.native
  var manualScrollSpeed: js.UndefOr[Double] = js.native
  var mode: js.UndefOr[Mode] = js.native
  var scrollSpeedDivider: js.UndefOr[Double] = js.native
  var selectables: js.UndefOr[js.Array[String]] = js.native
  var selectionAreaContainer: js.UndefOr[String | HTMLElement | (js.Array[String | HTMLElement])] = js.native
  var singleClick: js.UndefOr[Boolean] = js.native
  var startThreshold: js.UndefOr[Double] = js.native
  var startareas: js.UndefOr[js.Array[String]] = js.native
  var tapMode: js.UndefOr[TapMode] = js.native
}

object SelectionOptions {
  @scala.inline
  def apply(): SelectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SelectionOptions]
  }
  @scala.inline
  implicit class SelectionOptionsOps[Self <: SelectionOptions] (val x: Self) extends AnyVal {
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
    def setBoundariesVarargs(value: String*): Self = this.set("boundaries", js.Array(value :_*))
    @scala.inline
    def setBoundaries(value: js.Array[String]): Self = this.set("boundaries", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBoundaries: Self = this.set("boundaries", js.undefined)
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setDisableTouch(value: Boolean): Self = this.set("disableTouch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableTouch: Self = this.set("disableTouch", js.undefined)
    @scala.inline
    def setFrame(value: Node): Self = this.set("frame", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFrame: Self = this.set("frame", js.undefined)
    @scala.inline
    def setManualScrollSpeed(value: Double): Self = this.set("manualScrollSpeed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteManualScrollSpeed: Self = this.set("manualScrollSpeed", js.undefined)
    @scala.inline
    def setMode(value: Mode): Self = this.set("mode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    @scala.inline
    def setScrollSpeedDivider(value: Double): Self = this.set("scrollSpeedDivider", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteScrollSpeedDivider: Self = this.set("scrollSpeedDivider", js.undefined)
    @scala.inline
    def setSelectablesVarargs(value: String*): Self = this.set("selectables", js.Array(value :_*))
    @scala.inline
    def setSelectables(value: js.Array[String]): Self = this.set("selectables", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectables: Self = this.set("selectables", js.undefined)
    @scala.inline
    def setSelectionAreaContainerVarargs(value: (String | HTMLElement)*): Self = this.set("selectionAreaContainer", js.Array(value :_*))
    @scala.inline
    def setSelectionAreaContainer(value: String | HTMLElement | (js.Array[String | HTMLElement])): Self = this.set("selectionAreaContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectionAreaContainer: Self = this.set("selectionAreaContainer", js.undefined)
    @scala.inline
    def setSingleClick(value: Boolean): Self = this.set("singleClick", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSingleClick: Self = this.set("singleClick", js.undefined)
    @scala.inline
    def setStartThreshold(value: Double): Self = this.set("startThreshold", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartThreshold: Self = this.set("startThreshold", js.undefined)
    @scala.inline
    def setStartareasVarargs(value: String*): Self = this.set("startareas", js.Array(value :_*))
    @scala.inline
    def setStartareas(value: js.Array[String]): Self = this.set("startareas", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartareas: Self = this.set("startareas", js.undefined)
    @scala.inline
    def setTapMode(value: TapMode): Self = this.set("tapMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTapMode: Self = this.set("tapMode", js.undefined)
  }
  
}

