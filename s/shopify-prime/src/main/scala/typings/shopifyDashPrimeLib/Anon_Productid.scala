package typings
package shopifyDashPrimeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Productid extends js.Object {
  var product_id: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Productid {
  @scala.inline
  def apply(product_id: scala.Int | scala.Double = null, title: java.lang.String = null): Anon_Productid = {
    val __obj = js.Dynamic.literal()
    if (product_id != null) __obj.updateDynamic("product_id")(product_id.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Anon_Productid]
  }
}

