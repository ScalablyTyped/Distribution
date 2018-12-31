package typings
package shopifyDashPrimeLib.distOptionsBaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BasicListOptions extends js.Object {
  /**
    * The maximum number of objects that should be returned, up to 250. Setting this parameter above 250 will result in an error.
    */
  var limit: js.UndefOr[scala.Double] = js.undefined
  /**
    * The page number of the result list to retrieve. Use this in tandem with limit to page through the webhooks in a shop.
    */
  var page: js.UndefOr[scala.Double] = js.undefined
}

