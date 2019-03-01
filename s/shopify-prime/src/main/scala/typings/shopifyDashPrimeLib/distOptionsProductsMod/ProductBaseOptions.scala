package typings
package shopifyDashPrimeLib.distOptionsProductsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductBaseOptions extends js.Object {
  /**
    * Filter by collection id
    */
  var collection_id: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filter Redirects with given target
    */
  var product_type: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Filter by product vendor
    */
  var vendor: js.UndefOr[java.lang.String] = js.undefined
}

object ProductBaseOptions {
  @scala.inline
  def apply(
    collection_id: java.lang.String = null,
    product_type: java.lang.String = null,
    vendor: java.lang.String = null
  ): ProductBaseOptions = {
    val __obj = js.Dynamic.literal()
    if (collection_id != null) __obj.updateDynamic("collection_id")(collection_id)
    if (product_type != null) __obj.updateDynamic("product_type")(product_type)
    if (vendor != null) __obj.updateDynamic("vendor")(vendor)
    __obj.asInstanceOf[ProductBaseOptions]
  }
}

