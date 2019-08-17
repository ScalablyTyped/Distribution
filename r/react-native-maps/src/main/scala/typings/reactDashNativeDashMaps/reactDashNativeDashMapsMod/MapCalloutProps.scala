package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.reactDashNativeDashMaps.Anon_ActionCalloutpress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties * / any */ trait MapCalloutProps extends js.Object {
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[Anon_ActionCalloutpress], Unit]] = js.undefined
  var tooltip: js.UndefOr[Boolean] = js.undefined
}

object MapCalloutProps {
  @scala.inline
  def apply(
    onPress: /* event */ MapEvent[Anon_ActionCalloutpress] => Unit = null,
    tooltip: js.UndefOr[Boolean] = js.undefined
  ): MapCalloutProps = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[MapCalloutProps]
  }
}

