package typings.reactToolbox.iconButtonMod

import typings.reactToolbox.baseMod.ButtonBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IconButtonProps extends ButtonBaseProps {
  /**
    * Creates a link for the button.
    */
  var href: js.UndefOr[String] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[IconButtonTheme] = js.native
}

object IconButtonProps {
  @scala.inline
  def apply(): IconButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IconButtonProps]
  }
  @scala.inline
  implicit class IconButtonPropsOps[Self <: IconButtonProps] (val x: Self) extends AnyVal {
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
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setTheme(value: IconButtonTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

