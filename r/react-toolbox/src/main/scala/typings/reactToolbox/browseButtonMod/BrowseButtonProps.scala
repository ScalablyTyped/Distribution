package typings.reactToolbox.browseButtonMod

import typings.reactToolbox.baseMod.ButtonBaseProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrowseButtonProps extends ButtonBaseProps {
  /**
    * If true, the button will have a flat look.
    * @default false
    */
  var flat: js.UndefOr[Boolean] = js.native
  /**
    * If true, the button will have a floating look.
    * @default false
    */
  var floating: js.UndefOr[Boolean] = js.native
  /**
    * Creates a link for the button.
    */
  var href: js.UndefOr[String] = js.native
  /**
    * The text string to use for the name of the button.
    */
  var label: js.UndefOr[String] = js.native
  /**
    * To be used with floating button. If true, the button will be smaller.
    * @default false
    */
  var mini: js.UndefOr[Boolean] = js.native
  var onChange: js.UndefOr[js.Function] = js.native
  /**
    * If true, the button will have a raised look.
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[BrowseButtonTheme] = js.native
}

object BrowseButtonProps {
  @scala.inline
  def apply(): BrowseButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BrowseButtonProps]
  }
  @scala.inline
  implicit class BrowseButtonPropsOps[Self <: BrowseButtonProps] (val x: Self) extends AnyVal {
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
    def setFlat(value: Boolean): Self = this.set("flat", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFlat: Self = this.set("flat", js.undefined)
    @scala.inline
    def setFloating(value: Boolean): Self = this.set("floating", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFloating: Self = this.set("floating", js.undefined)
    @scala.inline
    def setHref(value: String): Self = this.set("href", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHref: Self = this.set("href", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setMini(value: Boolean): Self = this.set("mini", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMini: Self = this.set("mini", js.undefined)
    @scala.inline
    def setOnChange(value: js.Function): Self = this.set("onChange", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnChange: Self = this.set("onChange", js.undefined)
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    @scala.inline
    def setTheme(value: BrowseButtonTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

