package typings.reactDashJss.libInjectSheetMod

import typings.jss.jssMod.JSS
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ P in keyof jss.Anon_ClassNamePrefix<any> ]:? jss.Anon_ClassNamePrefix<any>[P]} */ trait InjectOptions extends js.Object {
  var jss: js.UndefOr[JSS] = js.undefined
  var theming: js.UndefOr[Theming] = js.undefined
}

object InjectOptions {
  @scala.inline
  def apply(jss: JSS = null, theming: Theming = null): InjectOptions = {
    val __obj = js.Dynamic.literal()
    if (jss != null) __obj.updateDynamic("jss")(jss)
    if (theming != null) __obj.updateDynamic("theming")(theming)
    __obj.asInstanceOf[InjectOptions]
  }
}

