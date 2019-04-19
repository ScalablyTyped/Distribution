package typings
package reactDashHooksDashHelperLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object reactDashHooksDashHelperMod {
  type ChangeForm = js.Function1[/* value */ FormTarget, js.Any]
  type InputChange = js.Function1[
    /* event */ (reactLib.reactMod.SyntheticEvent[stdLib.HTMLInputElement, reactLib.Event]) | reactLib.reactMod.ChangeEvent[stdLib.HTMLInputElement], 
    scala.Unit
  ]
  type SetForm = ChangeForm with InputChange
}
