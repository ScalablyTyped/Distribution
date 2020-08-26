package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StatusBarProps
  extends StatusBarPropsIOS
     with StatusBarPropsAndroid {
  /**
    * If the transition between status bar property changes should be
    * animated. Supported for backgroundColor, barStyle and hidden.
    */
  var animated: js.UndefOr[Boolean] = js.native
  /**
    * If the status bar is hidden.
    */
  var hidden: js.UndefOr[Boolean] = js.native
}

object StatusBarProps {
  @scala.inline
  def apply(): StatusBarProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StatusBarProps]
  }
  @scala.inline
  implicit class StatusBarPropsOps[Self <: StatusBarProps] (val x: Self) extends AnyVal {
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimated: Self = this.set("animated", js.undefined)
    @scala.inline
    def setHidden(value: Boolean): Self = this.set("hidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHidden: Self = this.set("hidden", js.undefined)
  }
  
}

