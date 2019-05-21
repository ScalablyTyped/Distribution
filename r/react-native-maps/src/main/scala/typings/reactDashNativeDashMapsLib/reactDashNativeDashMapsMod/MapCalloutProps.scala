package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapCalloutProps extends js.Object {
  var onPress: js.UndefOr[
    js.Function1[
      /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionCalloutpress], 
      scala.Unit
    ]
  ] = js.undefined
  var tooltip: js.UndefOr[scala.Boolean] = js.undefined
}

object MapCalloutProps {
  @scala.inline
  def apply(
    onPress: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionCalloutpress] => scala.Unit = null,
    tooltip: js.UndefOr[scala.Boolean] = js.undefined
  ): MapCalloutProps = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    if (!js.isUndefined(tooltip)) __obj.updateDynamic("tooltip")(tooltip)
    __obj.asInstanceOf[MapCalloutProps]
  }
}

