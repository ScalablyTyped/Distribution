package typings.rcTable.anon

import typings.react.mod.Ref
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OnScroll extends js.Object {
  var ref: Ref[ScrollLeft] = js.native
  var scrollbarSize: Double = js.native
  def onScroll(info: CurrentTarget): Unit = js.native
}

object OnScroll {
  @scala.inline
  def apply(onScroll: CurrentTarget => Unit, scrollbarSize: Double): OnScroll = {
    val __obj = js.Dynamic.literal(onScroll = js.Any.fromFunction1(onScroll), scrollbarSize = scrollbarSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[OnScroll]
  }
  @scala.inline
  implicit class OnScrollOps[Self <: OnScroll] (val x: Self) extends AnyVal {
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
    def setOnScroll(value: CurrentTarget => Unit): Self = this.set("onScroll", js.Any.fromFunction1(value))
    @scala.inline
    def setScrollbarSize(value: Double): Self = this.set("scrollbarSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefFunction1(value: /* instance */ ScrollLeft | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[ScrollLeft]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

