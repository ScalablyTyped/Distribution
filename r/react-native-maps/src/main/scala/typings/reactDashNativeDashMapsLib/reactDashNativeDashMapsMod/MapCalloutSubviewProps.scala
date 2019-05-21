package typings
package reactDashNativeDashMapsLib.reactDashNativeDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait MapCalloutSubviewProps extends js.Object {
  var onPress: js.UndefOr[
    js.Function1[
      /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionCalloutinsidepress], 
      scala.Unit
    ]
  ] = js.undefined
}

object MapCalloutSubviewProps {
  @scala.inline
  def apply(
    onPress: /* event */ MapEvent[reactDashNativeDashMapsLib.Anon_ActionCalloutinsidepress] => scala.Unit = null
  ): MapCalloutSubviewProps = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[MapCalloutSubviewProps]
  }
}

