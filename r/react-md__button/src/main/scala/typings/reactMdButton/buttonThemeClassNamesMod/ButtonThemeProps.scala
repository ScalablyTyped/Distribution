package typings.reactMdButton.buttonThemeClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ButtonThemeProps extends js.Object {
  /**
    * This is the specific material design button type to use. This can either be
    * set to "text" or "icon". When this is set to "text", the styles applied
    * will make buttons with just text or text with icons render nicely. When
    * this is set to "icon", the styles applied will make icon only buttons
    * render nicely.
    */
  var buttonType: js.UndefOr[ButtonType] = js.native
  /**
    * An optional className to also apply to the button for additional theming
    * and styling. This will be merged with the `Button.theme` class name styles.
    */
  var className: js.UndefOr[String] = js.native
  /**
    * Enabling this prop will apply the disabled styles to a `Button`. When this
    * is also applied to the button component, the button will be updated so that
    * it can no longer be interacted with.
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * The material design theme to apply to the button. The theme prop will
    * update the look and feel of the button by applying different background
    * and/or foreground colors.
    */
  var theme: js.UndefOr[ButtonTheme] = js.native
  /**
    * The material design theme type to apply. The themeTYpe prop will update the
    * look and feel of the button by applying different border or box shadow.
    */
  var themeType: js.UndefOr[ButtonThemeType] = js.native
}

object ButtonThemeProps {
  @scala.inline
  def apply(): ButtonThemeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonThemeProps]
  }
  @scala.inline
  implicit class ButtonThemePropsOps[Self <: ButtonThemeProps] (val x: Self) extends AnyVal {
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
    def setButtonType(value: ButtonType): Self = this.set("buttonType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtonType: Self = this.set("buttonType", js.undefined)
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setTheme(value: ButtonTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
    @scala.inline
    def setThemeType(value: ButtonThemeType): Self = this.set("themeType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteThemeType: Self = this.set("themeType", js.undefined)
  }
  
}

