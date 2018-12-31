package typings
package shopifyDashBuyLib.ShopifyBuyNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  var after: js.UndefOr[java.lang.String] = js.undefined
  var before: js.UndefOr[java.lang.String] = js.undefined
  var first: js.UndefOr[java.lang.String] = js.undefined
  var last: js.UndefOr[java.lang.String] = js.undefined
  /**
    * query: title, collection_type, updated_at
    * TODO probably will remove before Defintely Typed PR,
    * as their  community guidelines
    */
  var query: java.lang.String
  var reverse: js.UndefOr[scala.Boolean] = js.undefined
  var sortBy: java.lang.String
}

