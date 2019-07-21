package typings
package reactDashNativeDashSafeDashAreaDashViewLib.reactDashNativeDashSafeDashAreaDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait SafeAreaViewProps extends js.Object {
  var forceInset: js.UndefOr[reactDashNativeDashSafeDashAreaDashViewLib.Anon_Bottom] = js.undefined
}

object SafeAreaViewProps {
  @scala.inline
  def apply(forceInset: reactDashNativeDashSafeDashAreaDashViewLib.Anon_Bottom = null): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    if (forceInset != null) __obj.updateDynamic("forceInset")(forceInset)
    __obj.asInstanceOf[SafeAreaViewProps]
  }
}

