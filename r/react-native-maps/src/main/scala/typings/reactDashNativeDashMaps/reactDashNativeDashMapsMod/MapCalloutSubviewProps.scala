package typings.reactDashNativeDashMaps.reactDashNativeDashMapsMod

import typings.reactDashNativeDashMaps.Anon_ActionCalloutinsidepress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped / * import warning: QualifyReferences.resolveTypeRef many Couldn't qualify ViewProperties * / any */ trait MapCalloutSubviewProps extends js.Object {
  var onPress: js.UndefOr[js.Function1[/* event */ MapEvent[Anon_ActionCalloutinsidepress], Unit]] = js.undefined
}

object MapCalloutSubviewProps {
  @scala.inline
  def apply(onPress: /* event */ MapEvent[Anon_ActionCalloutinsidepress] => Unit = null): MapCalloutSubviewProps = {
    val __obj = js.Dynamic.literal()
    if (onPress != null) __obj.updateDynamic("onPress")(js.Any.fromFunction1(onPress))
    __obj.asInstanceOf[MapCalloutSubviewProps]
  }
}

