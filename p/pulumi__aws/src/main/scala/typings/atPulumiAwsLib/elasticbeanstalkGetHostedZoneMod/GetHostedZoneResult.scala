package typings
package atPulumiAwsLib.elasticbeanstalkGetHostedZoneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetHostedZoneResult extends js.Object {
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
}

object GetHostedZoneResult {
  @scala.inline
  def apply(id: java.lang.String): GetHostedZoneResult = {
    val __obj = js.Dynamic.literal(id = id)
  
    __obj.asInstanceOf[GetHostedZoneResult]
  }
}

