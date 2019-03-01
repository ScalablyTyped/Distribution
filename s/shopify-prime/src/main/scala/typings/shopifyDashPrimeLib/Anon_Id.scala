package typings
package shopifyDashPrimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Id extends js.Object {
  var id: js.UndefOr[scala.Double] = js.undefined
  var position: js.UndefOr[scala.Double] = js.undefined
  var product_id: js.UndefOr[scala.Double] = js.undefined
}

object Anon_Id {
  @scala.inline
  def apply(
    id: scala.Int | scala.Double = null,
    position: scala.Int | scala.Double = null,
    product_id: scala.Int | scala.Double = null
  ): Anon_Id = {
    val __obj = js.Dynamic.literal()
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Id]
  }
}

