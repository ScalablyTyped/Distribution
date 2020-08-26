package typings.reactNativeNavigation.layoutMod

import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutTopTabs extends js.Object {
  /**
    * Set the children screens
    */
  var children: js.UndefOr[js.Array[LayoutTabsChildren]] = js.native
  /**
    * Set the layout's id so Navigation.mergeOptions can be used to update options
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Configure top tabs
    */
  var options: js.UndefOr[Options] = js.native
}

object LayoutTopTabs {
  @scala.inline
  def apply(): LayoutTopTabs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutTopTabs]
  }
  @scala.inline
  implicit class LayoutTopTabsOps[Self <: LayoutTopTabs] (val x: Self) extends AnyVal {
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
    def setChildrenVarargs(value: LayoutTabsChildren*): Self = this.set("children", js.Array(value :_*))
    @scala.inline
    def setChildren(value: js.Array[LayoutTabsChildren]): Self = this.set("children", value.asInstanceOf[js.Any])
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

