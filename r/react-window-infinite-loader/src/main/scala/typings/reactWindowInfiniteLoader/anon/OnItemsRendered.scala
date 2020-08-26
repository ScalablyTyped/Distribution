package typings.reactWindowInfiniteLoader.anon

import typings.react.mod.Ref
import typings.reactWindow.mod.ListOnItemsRenderedProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnItemsRendered extends js.Object {
  var onItemsRendered: typings.reactWindowInfiniteLoader.mod.OnItemsRendered = js.native
  var ref: Ref[_] = js.native
}

object OnItemsRendered {
  @scala.inline
  def apply(onItemsRendered: /* props */ ListOnItemsRenderedProps => js.Any): OnItemsRendered = {
    val __obj = js.Dynamic.literal(onItemsRendered = js.Any.fromFunction1(onItemsRendered))
    __obj.asInstanceOf[OnItemsRendered]
  }
  @scala.inline
  implicit class OnItemsRenderedOps[Self <: OnItemsRendered] (val x: Self) extends AnyVal {
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
    def setOnItemsRendered(value: /* props */ ListOnItemsRenderedProps => js.Any): Self = this.set("onItemsRendered", js.Any.fromFunction1(value))
    @scala.inline
    def setRefFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("ref", js.Any.fromFunction1(value))
    @scala.inline
    def setRef(value: Ref[_]): Self = this.set("ref", value.asInstanceOf[js.Any])
    @scala.inline
    def setRefNull: Self = this.set("ref", null)
  }
  
}

