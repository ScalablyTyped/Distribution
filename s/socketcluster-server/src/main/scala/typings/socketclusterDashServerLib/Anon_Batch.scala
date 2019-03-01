package typings
package socketclusterDashServerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Batch extends js.Object {
  var batch: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Batch {
  @scala.inline
  def apply(batch: js.UndefOr[scala.Boolean] = js.undefined): Anon_Batch = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(batch)) __obj.updateDynamic("batch")(batch)
    __obj.asInstanceOf[Anon_Batch]
  }
}

