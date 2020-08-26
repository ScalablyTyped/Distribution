package typings.reactToolbox.rippleMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RippleProps
  extends /**
  * Additional properties passed to Radio container.
  */
/* key */ StringDictionary[js.Any] {
  /**
    * Children to pass through the component.
    */
  var children: js.UndefOr[ReactNode] = js.native
  /**
    * True in case you want a centered ripple.
    * @default false
    */
  var disabled: js.UndefOr[Boolean] = js.native
  /**
    * Function that will be called when the ripple animation ends.
    */
  var onRippleEnded: js.UndefOr[js.Function] = js.native
  /**
    * Factor to indicate how much should the ripple spread under the component.
    * @default 2
    */
  var spread: js.UndefOr[Double] = js.native
  /**
    * Classnames object defining the component style.
    */
  var theme: js.UndefOr[RippleTheme] = js.native
}

object RippleProps {
  @scala.inline
  def apply(): RippleProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RippleProps]
  }
  @scala.inline
  implicit class RipplePropsOps[Self <: RippleProps] (val x: Self) extends AnyVal {
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
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDisabled(value: Boolean): Self = this.set("disabled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisabled: Self = this.set("disabled", js.undefined)
    @scala.inline
    def setOnRippleEnded(value: js.Function): Self = this.set("onRippleEnded", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnRippleEnded: Self = this.set("onRippleEnded", js.undefined)
    @scala.inline
    def setSpread(value: Double): Self = this.set("spread", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpread: Self = this.set("spread", js.undefined)
    @scala.inline
    def setTheme(value: RippleTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

