package typings.rcCascader.cascaderMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CascaderOption
  extends /* key */ StringDictionary[js.Any] {
  var children: js.UndefOr[js.Array[CascaderOption]] = js.native
  var disabled: js.UndefOr[Boolean] = js.native
  var isLeaf: js.UndefOr[Boolean] = js.native
  var label: js.UndefOr[ReactNode] = js.native
  var loading: js.UndefOr[Boolean] = js.native
  var value: js.UndefOr[String | Double] = js.native
}

object CascaderOption {
  @scala.inline
  def apply(): CascaderOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CascaderOption]
  }
  @scala.inline
  implicit class CascaderOptionOps[Self <: CascaderOption] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: CascaderOption*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[CascaderOption]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setIsLeaf(value: Boolean): Self = this.set("isLeaf", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsLeaf: Self = this.set("isLeaf", js.undefined)
    @scala.inline
    def setLabel(value: ReactNode): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setLoading(value: Boolean): Self = this.set("loading", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoading: Self = this.set("loading", js.undefined)
    @scala.inline
    def setValue(value: String | Double): Self = this.set("value", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
  
}

