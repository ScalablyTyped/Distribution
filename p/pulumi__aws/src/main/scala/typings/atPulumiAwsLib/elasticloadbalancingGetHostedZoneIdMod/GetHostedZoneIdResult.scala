package typings
package atPulumiAwsLib.elasticloadbalancingGetHostedZoneIdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneIdResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetHostedZoneIdResult {
  @scala.inline
  def apply(id: java.lang.String): GetHostedZoneIdResult = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[GetHostedZoneIdResult]
  }
}

