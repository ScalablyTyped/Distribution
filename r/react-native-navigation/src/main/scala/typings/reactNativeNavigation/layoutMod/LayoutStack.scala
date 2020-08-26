package typings.reactNativeNavigation.layoutMod

import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutStack extends js.Object {
  /**
    * Set children screens
    */
  var children: js.UndefOr[js.Array[LayoutStackChildren]] = js.native
  /**
    * Set ID of the stack so you can use Navigation.mergeOptions to
    * update options
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Set options
    */
  var options: js.UndefOr[Options] = js.native
}

object LayoutStack {
  @scala.inline
  def apply(): LayoutStack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutStack]
  }
  @scala.inline
  implicit class LayoutStackOps[Self <: LayoutStack] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: LayoutStackChildren*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[LayoutStackChildren]): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

