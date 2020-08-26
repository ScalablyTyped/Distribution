package typings.reactNativeElements.mod

import typings.reactNativeElements.anon.PartialTouchableOpacityPr
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchBarIOS extends SearchBarPlatform {
  /**
    * Props passed to cancel button
    */
  var cancelButtonProps: js.UndefOr[PartialTouchableOpacityPr] = js.native
  /**
    * title of cancel button on iOS.  Default: 'Cancel'.
    */
  var cancelButtonTitle: js.UndefOr[String] = js.native
  /**
    * When `true` the cancel button will stay visible after blur events.
    */
  var showCancel: js.UndefOr[Boolean] = js.native
}

object SearchBarIOS {
  @scala.inline
  def apply(): SearchBarIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SearchBarIOS]
  }
  @scala.inline
  implicit class SearchBarIOSOps[Self <: SearchBarIOS] (val x: Self) extends AnyVal {
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
    def setCancelButtonProps(value: PartialTouchableOpacityPr): Self = this.set("cancelButtonProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonProps: Self = this.set("cancelButtonProps", js.undefined)
    @scala.inline
    def setCancelButtonTitle(value: String): Self = this.set("cancelButtonTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelButtonTitle: Self = this.set("cancelButtonTitle", js.undefined)
    @scala.inline
    def setShowCancel(value: Boolean): Self = this.set("showCancel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowCancel: Self = this.set("showCancel", js.undefined)
  }
  
}

