package typings.reactToolbox.buttonButtonMod

import org.scalablytyped.runtime.StringDictionary
import typings.reactToolbox.baseMod.ButtonBaseProps
import typings.reactToolbox.baseMod.ButtonTheme
import typings.reactToolbox.rippleMod.RippleTheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.reactToolbox.rippleMod.RippleProps because var conflicts: children, disabled. Inlined onRippleEnded, spread, theme */ @js.native
trait ButtonProps
  extends ButtonBaseProps
     with /**
  * Additional properties passed to rippled component.
  */
/* key */ StringDictionary[js.Any] {
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
  /**
    * Function that will be called when the ripple animation ends.
    */
  var onRippleEnded: js.UndefOr[js.Function] = js.native
  /**
    * If true, the button will have a raised look.
    * @default false
    */
  var raised: js.UndefOr[Boolean] = js.native
  /**
    * Factor to indicate how much should the ripple spread under the component.
    * @default 2
    */
  var spread: js.UndefOr[Double] = js.native
  /**
    * Passed down to the root element
    */
  var target: js.UndefOr[String] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[ButtonTheme | RippleTheme] = js.native
}

object ButtonProps {
  @scala.inline
  def apply(): ButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ButtonProps]
  }
  @scala.inline
  implicit class ButtonPropsOps[Self <: ButtonProps] (val x: Self) extends AnyVal {
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
    def setOnRippleEnded(value: js.Function): Self = this.set("onRippleEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRippleEnded: Self = this.set("onRippleEnded", js.undefined)
    @scala.inline
    def setRaised(value: Boolean): Self = this.set("raised", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRaised: Self = this.set("raised", js.undefined)
    @scala.inline
    def setSpread(value: Double): Self = this.set("spread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpread: Self = this.set("spread", js.undefined)
    @scala.inline
    def setTarget(value: String): Self = this.set("target", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    @scala.inline
    def setTheme(value: ButtonTheme | RippleTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

