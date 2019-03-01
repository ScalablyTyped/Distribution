package typings
package shopifyDashPrimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Disconnectifnecessary extends js.Object {
  var disconnect_if_necessary: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Disconnectifnecessary {
  @scala.inline
  def apply(disconnect_if_necessary: js.UndefOr[scala.Boolean] = js.undefined): Anon_Disconnectifnecessary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disconnect_if_necessary)) __obj.updateDynamic("disconnect_if_necessary")(disconnect_if_necessary)
    __obj.asInstanceOf[Anon_Disconnectifnecessary]
  }
}

