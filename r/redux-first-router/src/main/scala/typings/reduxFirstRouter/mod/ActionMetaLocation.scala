package typings.reduxFirstRouter.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionMetaLocation extends js.Object {
  var current: Location = js.native
  var history: Nullable[HistoryData] = js.native
  var kind: Nullable[String] = js.native
  var prev: Location = js.native
}

object ActionMetaLocation {
  @scala.inline
  def apply(current: Location, prev: Location): ActionMetaLocation = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], prev = prev.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionMetaLocation]
  }
  @scala.inline
  implicit class ActionMetaLocationOps[Self <: ActionMetaLocation] (val x: Self) extends AnyVal {
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
    def setCurrent(value: Location): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrev(value: Location): Self = this.set("prev", value.asInstanceOf[js.Any])
    @scala.inline
    def setHistory(value: Nullable[HistoryData]): Self = this.set("history", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHistory: Self = this.set("history", js.undefined)
    @scala.inline
    def setHistoryNull: Self = this.set("history", null)
    @scala.inline
    def setKind(value: Nullable[String]): Self = this.set("kind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKind: Self = this.set("kind", js.undefined)
    @scala.inline
    def setKindNull: Self = this.set("kind", null)
  }
  
}

