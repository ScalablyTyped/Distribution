package typings.semanticUiReact.visibilityVisibilityMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.semanticUiReactStrings.events
import typings.semanticUiReact.semanticUiReactStrings.repaint
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Window
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StrictVisibilityProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.native
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.native
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[Document | Window | HTMLElement] = js.native
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the
    * threshold is met.
    */
  var continuous: js.UndefOr[Boolean] = js.native
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[Boolean] = js.native
  /**
    * Value that context should be adjusted in pixels. Useful for making content appear below content fixed to the
    * page.
    */
  var offset: js.UndefOr[Double | String | js.Array[String]] = js.native
  /**
    * Element's bottom edge has passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's bottom edge has not passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's bottom edge has passed bottom of screen
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's bottom edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element is not visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOffScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element is visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOnScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /** Element is not visible on the screen. */
  var onPassed: js.UndefOr[VisibilityOnPassed] = js.native
  /**
    * Any part of an element is visible on screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassing: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top has not passed top of screen but bottom has.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassingReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has not passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUpdate: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.native
  /** When set to false a callback will occur each time an element passes the threshold for a condition. */
  var once: js.UndefOr[Boolean] = js.native
  /**
    * Allows to choose the mode of the position calculations:
    * - `events` - (default) update and fire callbacks only on scroll/resize events
    * - `repaint` - update and fire callbacks on browser repaint (animation frames)
    */
  var updateOn: js.UndefOr[events | repaint] = js.native
}

object StrictVisibilityProps {
  @scala.inline
  def apply(): StrictVisibilityProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StrictVisibilityProps]
  }
  @scala.inline
  implicit class StrictVisibilityPropsOps[Self <: StrictVisibilityProps] (val x: Self) extends AnyVal {
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
    def setContext(value: Document | Window | HTMLElement): Self = this.set("context", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContext: Self = this.set("context", js.undefined)
    @scala.inline
    def setContinuous(value: Boolean): Self = this.set("continuous", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteContinuous: Self = this.set("continuous", js.undefined)
    @scala.inline
    def setFireOnMount(value: Boolean): Self = this.set("fireOnMount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFireOnMount: Self = this.set("fireOnMount", js.undefined)
    @scala.inline
    def setOffsetVarargs(value: String*): Self = this.set("offset", js.Array(value :_*))
    @scala.inline
    def setOffset(value: Double | String | js.Array[String]): Self = this.set("offset", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    @scala.inline
    def setOnBottomPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onBottomPassed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBottomPassed: Self = this.set("onBottomPassed", js.undefined)
    @scala.inline
    def setOnBottomPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onBottomPassedReverse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBottomPassedReverse: Self = this.set("onBottomPassedReverse", js.undefined)
    @scala.inline
    def setOnBottomVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onBottomVisible", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBottomVisible: Self = this.set("onBottomVisible", js.undefined)
    @scala.inline
    def setOnBottomVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onBottomVisibleReverse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnBottomVisibleReverse: Self = this.set("onBottomVisibleReverse", js.undefined)
    @scala.inline
    def setOnOffScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onOffScreen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnOffScreen: Self = this.set("onOffScreen", js.undefined)
    @scala.inline
    def setOnOnScreen(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onOnScreen", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnOnScreen: Self = this.set("onOnScreen", js.undefined)
    @scala.inline
    def setOnPassed(value: VisibilityOnPassed): Self = this.set("onPassed", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnPassed: Self = this.set("onPassed", js.undefined)
    @scala.inline
    def setOnPassing(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onPassing", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPassing: Self = this.set("onPassing", js.undefined)
    @scala.inline
    def setOnPassingReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onPassingReverse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnPassingReverse: Self = this.set("onPassingReverse", js.undefined)
    @scala.inline
    def setOnTopPassed(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onTopPassed", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTopPassed: Self = this.set("onTopPassed", js.undefined)
    @scala.inline
    def setOnTopPassedReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onTopPassedReverse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTopPassedReverse: Self = this.set("onTopPassedReverse", js.undefined)
    @scala.inline
    def setOnTopVisible(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onTopVisible", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTopVisible: Self = this.set("onTopVisible", js.undefined)
    @scala.inline
    def setOnTopVisibleReverse(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onTopVisibleReverse", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnTopVisibleReverse: Self = this.set("onTopVisibleReverse", js.undefined)
    @scala.inline
    def setOnUpdate(value: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit): Self = this.set("onUpdate", js.Any.fromFunction2(value))
    @scala.inline
    def deleteOnUpdate: Self = this.set("onUpdate", js.undefined)
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    @scala.inline
    def setUpdateOn(value: events | repaint): Self = this.set("updateOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdateOn: Self = this.set("updateOn", js.undefined)
  }
  
}

