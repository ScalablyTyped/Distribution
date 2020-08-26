package typings.semanticUiReact.responsiveResponsiveMod

import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictResponsiveProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
    * otherwise, assumes a width of 0.
    */
  var getWidth: js.UndefOr[js.Function0[Double]] = js.native
  /** The maximum width at which content will be displayed. */
  var maxWidth: js.UndefOr[Double | String] = js.native
  /** The minimum width at which content will be displayed. */
  var minWidth: js.UndefOr[Double | String] = js.native
  /**
    * Called on update.
    *
    * @param {SyntheticEvent} event - The React SyntheticEvent object
    * @param {object} data - All props and the event value.
    */
  var onUpdate: js.UndefOr[
    js.Function2[
      /* event */ SyntheticEvent[HTMLElement, Event], 
      /* data */ ResponsiveOnUpdateData, 
      Unit
    ]
  ] = js.native
}

object StrictResponsiveProps {
  @scala.inline
  def apply(): StrictResponsiveProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictResponsiveProps]
  }
  @scala.inline
  implicit class StrictResponsivePropsOps[Self <: StrictResponsiveProps] (val x: Self) extends AnyVal {
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
    def setAs(value: js.Any): Self = this.set("as", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAs: Self = this.set("as", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setFireOnMount(value: Boolean): Self = this.set("fireOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFireOnMount: Self = this.set("fireOnMount", js.undefined)
    @scala.inline
    def setGetWidth(value: () => Double): Self = this.set("getWidth", js.Any.fromFunction0(value))
    @scala.inline
    def deleteGetWidth: Self = this.set("getWidth", js.undefined)
    @scala.inline
    def setMaxWidth(value: Double | String): Self = this.set("maxWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxWidth: Self = this.set("maxWidth", js.undefined)
    @scala.inline
    def setMinWidth(value: Double | String): Self = this.set("minWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinWidth: Self = this.set("minWidth", js.undefined)
    @scala.inline
    def setOnUpdate(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ ResponsiveOnUpdateData) => Unit): Self = this.set("onUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
  }
  
}

