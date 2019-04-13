package typings
package semanticDashUiDashReactLib.distCommonjsBehaviorsVisibilityVisibilityMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VisibilityEventData extends VisibilityProps {
  var calculations: VisibilityCalculations
}

object VisibilityEventData {
  @scala.inline
  def apply(
    calculations: VisibilityCalculations,
    as: js.Any = null,
    children: reactLib.reactMod.ReactNode = null,
    context: js.Object = null,
    continuous: js.UndefOr[scala.Boolean] = js.undefined,
    fireOnMount: js.UndefOr[scala.Boolean] = js.undefined,
    offset: scala.Double | java.lang.String | (js.Array[scala.Double | java.lang.String]) = null,
    onBottomPassed: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onBottomPassedReverse: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onBottomVisible: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onBottomVisibleReverse: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onOffScreen: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onOnScreen: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onPassed: VisibilityOnPassed = null,
    onPassing: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onPassingReverse: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onTopPassed: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onTopPassedReverse: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onTopVisible: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onTopVisibleReverse: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    onUpdate: (/* nothing */ scala.Null, /* data */ VisibilityEventData) => scala.Unit = null,
    once: js.UndefOr[scala.Boolean] = js.undefined,
    updateOn: semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.events | semanticDashUiDashReactLib.semanticDashUiDashReactLibStrings.repaint = null
  ): VisibilityEventData = {
    val __obj = js.Dynamic.literal(calculations = calculations)
    if (as != null) __obj.updateDynamic("as")(as)
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(continuous)) __obj.updateDynamic("continuous")(continuous)
    if (!js.isUndefined(fireOnMount)) __obj.updateDynamic("fireOnMount")(fireOnMount)
    if (offset != null) __obj.updateDynamic("offset")(offset.asInstanceOf[js.Any])
    if (onBottomPassed != null) __obj.updateDynamic("onBottomPassed")(js.Any.fromFunction2(onBottomPassed))
    if (onBottomPassedReverse != null) __obj.updateDynamic("onBottomPassedReverse")(js.Any.fromFunction2(onBottomPassedReverse))
    if (onBottomVisible != null) __obj.updateDynamic("onBottomVisible")(js.Any.fromFunction2(onBottomVisible))
    if (onBottomVisibleReverse != null) __obj.updateDynamic("onBottomVisibleReverse")(js.Any.fromFunction2(onBottomVisibleReverse))
    if (onOffScreen != null) __obj.updateDynamic("onOffScreen")(js.Any.fromFunction2(onOffScreen))
    if (onOnScreen != null) __obj.updateDynamic("onOnScreen")(js.Any.fromFunction2(onOnScreen))
    if (onPassed != null) __obj.updateDynamic("onPassed")(onPassed)
    if (onPassing != null) __obj.updateDynamic("onPassing")(js.Any.fromFunction2(onPassing))
    if (onPassingReverse != null) __obj.updateDynamic("onPassingReverse")(js.Any.fromFunction2(onPassingReverse))
    if (onTopPassed != null) __obj.updateDynamic("onTopPassed")(js.Any.fromFunction2(onTopPassed))
    if (onTopPassedReverse != null) __obj.updateDynamic("onTopPassedReverse")(js.Any.fromFunction2(onTopPassedReverse))
    if (onTopVisible != null) __obj.updateDynamic("onTopVisible")(js.Any.fromFunction2(onTopVisible))
    if (onTopVisibleReverse != null) __obj.updateDynamic("onTopVisibleReverse")(js.Any.fromFunction2(onTopVisibleReverse))
    if (onUpdate != null) __obj.updateDynamic("onUpdate")(js.Any.fromFunction2(onUpdate))
    if (!js.isUndefined(once)) __obj.updateDynamic("once")(once)
    if (updateOn != null) __obj.updateDynamic("updateOn")(updateOn.asInstanceOf[js.Any])
    __obj.asInstanceOf[VisibilityEventData]
  }
}

