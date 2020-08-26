package typings.routeNode.routeNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RouteNodeOptions extends js.Object {
  var finalSort: js.UndefOr[Boolean] = js.native
  var onAdd: js.UndefOr[Callback] = js.native
  var parent: js.UndefOr[RouteNode] = js.native
  var sort: js.UndefOr[Boolean] = js.native
}

object RouteNodeOptions {
  @scala.inline
  def apply(): RouteNodeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RouteNodeOptions]
  }
  @scala.inline
  implicit class RouteNodeOptionsOps[Self <: RouteNodeOptions] (val x: Self) extends AnyVal {
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
    def setFinalSort(value: Boolean): Self = this.set("finalSort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFinalSort: Self = this.set("finalSort", js.undefined)
    @scala.inline
    def setOnAdd(value: /* repeated */ js.Any => Unit): Self = this.set("onAdd", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnAdd: Self = this.set("onAdd", js.undefined)
    @scala.inline
    def setParent(value: RouteNode): Self = this.set("parent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParent: Self = this.set("parent", js.undefined)
    @scala.inline
    def setSort(value: Boolean): Self = this.set("sort", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSort: Self = this.set("sort", js.undefined)
  }
  
}

