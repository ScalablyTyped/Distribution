package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointId extends js.Object {
  var endpointId: js.UndefOr[java.lang.String] = js.undefined
  var weight: js.UndefOr[scala.Double] = js.undefined
}

object Anon_EndpointId {
  @scala.inline
  def apply(endpointId: java.lang.String = null, weight: scala.Int | scala.Double = null): Anon_EndpointId = {
    val __obj = js.Dynamic.literal()
    if (endpointId != null) __obj.updateDynamic("endpointId")(endpointId)
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointId]
  }
}

