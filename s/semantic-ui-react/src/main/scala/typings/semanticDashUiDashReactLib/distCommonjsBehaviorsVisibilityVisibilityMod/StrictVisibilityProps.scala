package typings
package semanticDashUiDashReactLib.distCommonjsBehaviorsVisibilityVisibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StrictVisibilityProps extends js.Object {
  /** An element type to render as (string or function). */
  var as: js.UndefOr[js.Any] = js.undefined
  /** Primary content. */
  var children: js.UndefOr[reactLib.reactMod.ReactNs.ReactNode] = js.undefined
  /** Context which sticky element should stick to. */
  var context: js.UndefOr[js.Object] = js.undefined
  /**
    * When set to true a callback will occur anytime an element passes a condition not just immediately after the
    * threshold is met.
    */
  var continuous: js.UndefOr[scala.Boolean] = js.undefined
  /** Fires callbacks immediately after mount. */
  var fireOnMount: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Value that context should be adjusted in pixels. Useful for making content appear below content fixed to the
    * page.
    */
  var offset: js.UndefOr[scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String])] = js.undefined
  /**
    * Element's bottom edge has passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassed: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's bottom edge has not passed top of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomPassedReverse: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's bottom edge has passed bottom of screen
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisible: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's bottom edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onBottomVisibleReverse: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element is not visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOffScreen: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element is visible on the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onOnScreen: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /** Element is not visible on the screen. */
  var onPassed: js.UndefOr[VisibilityOnPassed] = js.undefined
  /**
    * Any part of an element is visible on screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassing: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's top has not passed top of screen but bottom has.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onPassingReverse: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's top edge has passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassed: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's top edge has not passed top of the screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopPassedReverse: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisible: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's top edge has not passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onTopVisibleReverse: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /**
    * Element's top edge has passed bottom of screen.
    *
    * @param {null}
    * @param {object} data - All props.
    */
  var onUpdate: js.UndefOr[
    js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit]
  ] = js.undefined
  /** When set to false a callback will occur each time an element passes the threshold for a condition. */
  var once: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Allows to choose the mode of the position calculations:
    * - `events` - (default) update and fire callbacks only on scroll/resize events
    * - `repaint` - update and fire callbacks on browser repaint (animation frames)
    */
  var updateOn: js.UndefOr[
    semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.events | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.repaint
  ] = js.undefined
}

