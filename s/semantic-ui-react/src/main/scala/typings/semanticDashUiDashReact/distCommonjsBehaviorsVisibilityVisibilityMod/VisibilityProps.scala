package typings.semanticDashUiDashReact.distCommonjsBehaviorsVisibilityVisibilityMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.reactMod.ReactNode
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.events
import typings.semanticDashUiDashReact.semanticDashUiDashReactStrings.repaint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityProps
  extends StrictVisibilityProps
     with /* key */ StringDictionary[js.Any]

object VisibilityProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
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
  ): VisibilityProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
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
    __obj.asInstanceOf[VisibilityProps]
  }
}

