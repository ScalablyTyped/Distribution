package typings.reactNativeNavigation.layoutMod

import typings.reactNativeNavigation.optionsMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LayoutSplitView extends js.Object {
  /**
    * Set detail layout (the larger screen, flexes)
    */
  var detail: js.UndefOr[Layout[js.Object]] = js.native
  /**
    * Set ID of the stack so you can use Navigation.mergeOptions to
    * update options
    */
  var id: js.UndefOr[String] = js.native
  /**
    * Set master layout (the smaller screen, sidebar)
    */
  var master: js.UndefOr[Layout[js.Object]] = js.native
  /**
    * Configure split view
    */
  var options: js.UndefOr[Options] = js.native
}

object LayoutSplitView {
  @scala.inline
  def apply(): LayoutSplitView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LayoutSplitView]
  }
  @scala.inline
  implicit class LayoutSplitViewOps[Self <: LayoutSplitView] (val x: Self) extends AnyVal {
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
    def setDetail(value: Layout[js.Object]): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDetail: Self = this.set("detail", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setMaster(value: Layout[js.Object]): Self = this.set("master", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaster: Self = this.set("master", js.undefined)
    @scala.inline
    def setOptions(value: Options): Self = this.set("options", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOptions: Self = this.set("options", js.undefined)
  }
  
}

