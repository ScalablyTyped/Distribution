package typings.semanticUiReact.visibilityVisibilityMod

import typings.react.mod.ReactNode
import typings.semanticUiReact.semanticUiReactStrings.events
import typings.semanticUiReact.semanticUiReactStrings.repaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictVisibilityProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[ReactNode] = js.undefined
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the
    * threshold is met.
    */
  var continuous: js.UndefOr[Boolean] = js.undefined
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[Boolean] = js.undefined
  /**
    * Value that context should be adjusted in pixels. Useful for making content appear below content fixed to the
    * page.
    */
  var offset: js.UndefOr[Double | String | (js.Array[Double | String])] = js.undefined
  /**
    * Element's bottom edge has passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's bottom edge has not passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's bottom edge has passed bottom of screen
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's bottom edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element is not visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOffScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element is visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOnScreen: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /** Element is not visible on the screen. */
  var onPassed: js.UndefOr[VisibilityOnPassed] = js.undefined
  /**
    * Any part of an element is visible on screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassing: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top has not passed top of screen but bottom has.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassingReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassed: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has not passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassedReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisible: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisibleReverse: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUpdate: js.UndefOr[js.Function2[/* nothing */ Null, /* data */ VisibilityEventData, Unit]] = js.undefined
  /** When set to false a callback will occur each time an element passes the threshold for a condition. */
  var once: js.UndefOr[Boolean] = js.undefined
  /**
    * Allows to choose the mode of the position calculations:
    * - `events` - (default) update and fire callbacks only on scroll/resize events
    * - `repaint` - update and fire callbacks on browser repaint (animation frames)
    */
  var updateOn: js.UndefOr[events | repaint] = js.undefined
}

object StrictVisibilityProps {
  @scala.inline
  def apply(
    as: js.Any = null,
    children: ReactNode = null,
    context: js.Object = null,
    continuous: js.UndefOr[Boolean] = js.undefined,
    fireOnMount: js.UndefOr[Boolean] = js.undefined,
    offset: Double | String | (js.Array[Double | String]) = null,
    onBottomPassed: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onBottomPassedReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onBottomVisible: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onBottomVisibleReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onOffScreen: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onOnScreen: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onPassed: VisibilityOnPassed = null,
    onPassing: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onPassingReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onTopPassed: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onTopPassedReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onTopVisible: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onTopVisibleReverse: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    onUpdate: (/* nothing */ Null, /* data */ VisibilityEventData) => Unit = null,
    once: js.UndefOr[Boolean] = js.undefined,
    updateOn: events | repaint = null
  ): StrictVisibilityProps = {
    val __obj = js.Dynamic.literal()
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous.asInstanceOf[js.Any])
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount.asInstanceOf[js.Any])
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottomPassed != null) __obj.updateDynamic("onBottomPassed")(js.Any.fromFunction2(onBottomPassed))
    if (onBottomPassedReverse != null) __obj.updateDynamic("onBottomPassedReverse")(js.Any.fromFunction2(onBottomPassedReverse))
    if (onBottomVisible != null) __obj.updateDynamic("onBottomVisible")(js.Any.fromFunction2(onBottomVisible))
    if (onBottomVisibleReverse != null) __obj.updateDynamic("onBottomVisibleReverse")(js.Any.fromFunction2(onBottomVisibleReverse))
    if (onOffScreen != null) __obj.updateDynamic("onOffScreen")(js.Any.fromFunction2(onOffScreen))
    if (onOnScreen != null) __obj.updateDynamic("onOnScreen")(js.Any.fromFunction2(onOnScreen))
    if (onPassed != null) __obj.updateDynamic("onPassed")(onPassed.asInstanceOf[js.Any])
    if (onPassing != null) __obj.updateDynamic("onPassing")(js.Any.fromFunction2(onPassing))
    if (onPassingReverse != null) __obj.updateDynamic("onPassingReverse")(js.Any.fromFunction2(onPassingReverse))
    if (onTopPassed != null) __obj.updateDynamic("onTopPassed")(js.Any.fromFunction2(onTopPassed))
    if (onTopPassedReverse != null) __obj.updateDynamic("onTopPassedReverse")(js.Any.fromFunction2(onTopPassedReverse))
    if (onTopVisible != null) __obj.updateDynamic("onTopVisible")(js.Any.fromFunction2(onTopVisible))
    if (onTopVisibleReverse != null) __obj.updateDynamic("onTopVisibleReverse")(js.Any.fromFunction2(onTopVisibleReverse))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once.asInstanceOf[js.Any])
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StrictVisibilityProps]
  }
}

