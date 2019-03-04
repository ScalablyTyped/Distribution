package typings
package reactDashStripeDashElementsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ApiKey extends js.Object {
  var apiKey: java.lang.String
  var stripe: js.UndefOr[scala.Nothing] = js.undefined
}

object Anon_ApiKey {
  @scala.inline
  def apply(apiKey: java.lang.String, stripe: js.UndefOr[scala.Nothing] = js.undefined): Anon_ApiKey = {
    val __obj = js.Dynamic.literal(apiKey = apiKey)
    if (!js.isUndefined(stripe)) __obj.updateDynamic("stripe")(stripe)
    __obj.asInstanceOf[Anon_ApiKey]
  }
}

