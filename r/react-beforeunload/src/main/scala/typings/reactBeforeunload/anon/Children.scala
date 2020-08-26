package typings.reactBeforeunload.anon

import typings.react.mod.ReactNode
import typings.reactBeforeunload.mod.UseBeforeunloadHandler
import typings.std.Event
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Children extends js.Object {
  var children: js.UndefOr[ReactNode] = js.native
  var onBeforeunload: UseBeforeunloadHandler = js.native
}

object Children {
  @scala.inline
  def apply(onBeforeunload: /* arg */ Event => js.UndefOr[String | Unit]): Children = {
    val __obj = js.Dynamic.literal(onBeforeunload = js.Any.fromFunction1(onBeforeunload))
    __obj.asInstanceOf[Children]
  }
  @scala.inline
  implicit class ChildrenOps[Self <: Children] (val x: Self) extends AnyVal {
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
    def setOnBeforeunload(value: /* arg */ Event => js.UndefOr[String | Unit]): Self = this.set("onBeforeunload", js.Any.fromFunction1(value))
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

