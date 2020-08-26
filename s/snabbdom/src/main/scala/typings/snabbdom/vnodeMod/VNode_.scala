package typings.snabbdom.vnodeMod

import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VNode_ extends js.Object {
  var children: js.UndefOr[js.Array[VNode_ | String]] = js.native
  var data: js.UndefOr[VNodeData] = js.native
  var elm: js.UndefOr[Node] = js.native
  var key: js.UndefOr[Key] = js.native
  var sel: js.UndefOr[String] = js.native
  var text: js.UndefOr[String] = js.native
}

object VNode_ {
  @scala.inline
  def apply(): VNode_ = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VNode_]
  }
  @scala.inline
  implicit class VNode_Ops[Self <: VNode_] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: (VNode_ | String)*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[VNode_ | String]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setData(value: VNodeData): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setElm(value: Node): Self = this.set("elm", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElm: Self = this.set("elm", js.undefined)
    @scala.inline
    def setKey(value: Key): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    @scala.inline
    def setSel(value: String): Self = this.set("sel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSel: Self = this.set("sel", js.undefined)
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

