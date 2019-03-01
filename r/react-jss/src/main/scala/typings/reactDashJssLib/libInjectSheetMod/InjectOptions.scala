package typings
package reactDashJssLib.libInjectSheetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof jss.Anon_ClassNamePrefix<any> ]:? jss.Anon_ClassNamePrefix<any>[P]} */ trait InjectOptions extends js.Object {
  var jss: js.UndefOr[jssLib.jssMod.JSS] = js.undefined
  var theming: js.UndefOr[Theming] = js.undefined
}

object InjectOptions {
  @scala.inline
  def apply(jss: jssLib.jssMod.JSS = null, theming: Theming = null): InjectOptions = {
    val __obj = js.Dynamic.literal()
    if (jss != null) __obj.updateDynamic("jss")(jss)
    if (theming != null) __obj.updateDynamic("theming")(theming)
    __obj.asInstanceOf[InjectOptions]
  }
}

