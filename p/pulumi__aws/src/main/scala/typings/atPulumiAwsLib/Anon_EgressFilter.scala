package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EgressFilter extends js.Object {
  var egressFilter: js.UndefOr[Anon_Type] = js.undefined
}

object Anon_EgressFilter {
  @scala.inline
  def apply(egressFilter: Anon_Type = null): Anon_EgressFilter = {
    val __obj = js.Dynamic.literal()
    if (egressFilter != null) __obj.updateDynamic("egressFilter")(egressFilter)
    __obj.asInstanceOf[Anon_EgressFilter]
  }
}

