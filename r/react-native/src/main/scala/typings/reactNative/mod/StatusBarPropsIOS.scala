package typings.reactNative.mod

import typings.reactNative.reactNativeStrings.fade
import typings.reactNative.reactNativeStrings.slide
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBarPropsIOS extends js.Object {
  /**
    * Sets the color of the status bar text.
    */
  var barStyle: js.UndefOr[StatusBarStyle] = js.native
  /**
    * If the network activity indicator should be visible.
    */
  var networkActivityIndicatorVisible: js.UndefOr[Boolean] = js.native
  /**
    * The transition effect when showing and hiding the status bar using
    * the hidden prop. Defaults to 'fade'.
    */
  var showHideTransition: js.UndefOr[fade | slide] = js.native
}

object StatusBarPropsIOS {
  @scala.inline
  def apply(): StatusBarPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarPropsIOS]
  }
  @scala.inline
  implicit class StatusBarPropsIOSOps[Self <: StatusBarPropsIOS] (val x: Self) extends AnyVal {
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
    def setBarStyle(value: StatusBarStyle): Self = this.set("barStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBarStyle: Self = this.set("barStyle", js.undefined)
    @scala.inline
    def setNetworkActivityIndicatorVisible(value: Boolean): Self = this.set("networkActivityIndicatorVisible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNetworkActivityIndicatorVisible: Self = this.set("networkActivityIndicatorVisible", js.undefined)
    @scala.inline
    def setShowHideTransition(value: fade | slide): Self = this.set("showHideTransition", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShowHideTransition: Self = this.set("showHideTransition", js.undefined)
  }
  
}

