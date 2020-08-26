package typings.reactNativeNavigation.optionsMod

import typings.reactNativeNavigation.reactNativeNavigationStrings.dark
import typings.reactNativeNavigation.reactNativeNavigationStrings.light
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OptionsStatusBar extends js.Object {
  /**
    * Set the background color of the status bar
    * #### (Android specific)
    */
  var backgroundColor: js.UndefOr[Color] = js.native
  /**
    * Draw screen behind the status bar
    * #### (Android specific)
    */
  var drawBehind: js.UndefOr[Boolean] = js.native
  /**
    * Set the text color of the status bar
    * @default 'light'
    */
  var style: js.UndefOr[light | dark] = js.native
  /**
    * Allows the StatusBar to be translucent (blurred)
    * #### (Android specific)
    */
  var translucent: js.UndefOr[Boolean] = js.native
  /**
    * Set the status bar visibility
    * @default true
    */
  var visible: js.UndefOr[Boolean] = js.native
}

object OptionsStatusBar {
  @scala.inline
  def apply(): OptionsStatusBar = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OptionsStatusBar]
  }
  @scala.inline
  implicit class OptionsStatusBarOps[Self <: OptionsStatusBar] (val x: Self) extends AnyVal {
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
    def setBackgroundColor(value: Color): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    @scala.inline
    def setDrawBehind(value: Boolean): Self = this.set("drawBehind", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDrawBehind: Self = this.set("drawBehind", js.undefined)
    @scala.inline
    def setStyle(value: light | dark): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setTranslucent(value: Boolean): Self = this.set("translucent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTranslucent: Self = this.set("translucent", js.undefined)
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

