package typings.reactNative.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshControlPropsIOS extends ViewProps {
  /**
    * The color of the refresh indicator.
    */
  var tintColor: js.UndefOr[ColorValue] = js.native
  /**
    * The title displayed under the refresh indicator.
    */
  var title: js.UndefOr[String] = js.native
  /**
    * Title color.
    */
  var titleColor: js.UndefOr[ColorValue] = js.native
}

object RefreshControlPropsIOS {
  @scala.inline
  def apply(): RefreshControlPropsIOS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshControlPropsIOS]
  }
  @scala.inline
  implicit class RefreshControlPropsIOSOps[Self <: RefreshControlPropsIOS] (val x: Self) extends AnyVal {
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
    def setTintColor(value: ColorValue): Self = this.set("tintColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTintColor: Self = this.set("tintColor", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
    @scala.inline
    def setTitleColor(value: ColorValue): Self = this.set("titleColor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleColor: Self = this.set("titleColor", js.undefined)
  }
  
}

