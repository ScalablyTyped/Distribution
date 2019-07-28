package typings.reactDashNativeDashSafeDashAreaDashView.reactDashNativeDashSafeDashAreaDashViewMod

import typings.reactDashNativeDashSafeDashAreaDashView.Anon_Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped any */ trait SafeAreaViewProps extends js.Object {
  var forceInset: js.UndefOr[Anon_Bottom] = js.undefined
}

object SafeAreaViewProps {
  @scala.inline
  def apply(forceInset: Anon_Bottom = null): SafeAreaViewProps = {
    val __obj = js.Dynamic.literal()
    if (forceInset != null) __obj.updateDynamic("forceInset")(forceInset)
    __obj.asInstanceOf[SafeAreaViewProps]
  }
}

