package typings
package semanticDashUiDashReactLib.distCommonjsBehaviorsVisibilityVisibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityProps
  extends StrictVisibilityProps
     with /* key */ org.scalablytyped.runtime.StringDictionary[js.Any]

object VisibilityProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ org.scalablytyped.runtime.StringDictionary[js.Any] = null,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNs.ReactNode = null,
    context: js.Object = null,
    continuous: js.UndefOr[scala.Boolean] = js.undefined,
    fireOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]) = null,
    onBottomPassed: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onBottomPassedReverse: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onBottomVisible: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onBottomVisibleReverse: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onOffScreen: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onOnScreen: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onPassed: VisibilityOnPassed = null,
    onPassing: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onPassingReverse: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onTopPassed: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onTopPassedReverse: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onTopVisible: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onTopVisibleReverse: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    onUpdate: js.Function2[/* nothing */ scala.Null, /* data */ VisibilityEventData, scala.Unit] = null,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    updateOn: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.events | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.repaint = null
  ): VisibilityProps = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottomPassed != null) __obj.updateDynamic("onBottomPassed")(onBottomPassed)
    if (onBottomPassedReverse != null) __obj.updateDynamic("onBottomPassedReverse")(onBottomPassedReverse)
    if (onBottomVisible != null) __obj.updateDynamic("onBottomVisible")(onBottomVisible)
    if (onBottomVisibleReverse != null) __obj.updateDynamic("onBottomVisibleReverse")(onBottomVisibleReverse)
    if (onOffScreen != null) __obj.updateDynamic("onOffScreen")(onOffScreen)
    if (onOnScreen != null) __obj.updateDynamic("onOnScreen")(onOnScreen)
    if (onPassed != null) __obj.updateDynamic("onPassed")(onPassed)
    if (onPassing != null) __obj.updateDynamic("onPassing")(onPassing)
    if (onPassingReverse != null) __obj.updateDynamic("onPassingReverse")(onPassingReverse)
    if (onTopPassed != null) __obj.updateDynamic("onTopPassed")(onTopPassed)
    if (onTopPassedReverse != null) __obj.updateDynamic("onTopPassedReverse")(onTopPassedReverse)
    if (onTopVisible != null) __obj.updateDynamic("onTopVisible")(onTopVisible)
    if (onTopVisibleReverse != null) __obj.updateDynamic("onTopVisibleReverse")(onTopVisibleReverse)
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(onUpdate)
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityProps]
  }
}

