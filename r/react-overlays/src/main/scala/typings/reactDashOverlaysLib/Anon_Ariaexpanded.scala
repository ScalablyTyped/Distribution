package typings
package reactDashOverlaysLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Ariaexpanded extends js.Object {
  var `aria-expanded`: scala.Boolean
  var `aria-haspopup`: reactDashOverlaysLib.reactDashOverlaysLibNumbers.`true`
  var ref: js.UndefOr[js.Function1[/* element */ reactLib.HTMLElement, scala.Unit]] = js.undefined
}

object Anon_Ariaexpanded {
  @scala.inline
  def apply(
    `aria-expanded`: scala.Boolean,
    `aria-haspopup`: reactDashOverlaysLib.reactDashOverlaysLibNumbers.`true`,
    ref: js.Function1[/* element */ reactLib.HTMLElement, scala.Unit] = null
  ): Anon_Ariaexpanded = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("aria-expanded")(`aria-expanded`)
    __obj.updateDynamic("aria-haspopup")(`aria-haspopup`)
    if (ref != null) __obj.updateDynamic("ref")(ref)
    __obj.asInstanceOf[Anon_Ariaexpanded]
  }
}

