package typings.atPulumiAws.typesOutputMod.apigateway

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccountThrottleSettings extends js.Object {
  /**
    * The absolute maximum number of times API Gateway allows the API to be called per second (RPS).
    */
  var burstLimit: Double
  /**
    * The number of times API Gateway allows the API to be called per second on average (RPS).
    */
  var rateLimit: Double
}

object AccountThrottleSettings {
  @scala.inline
  def apply(burstLimit: Double, rateLimit: Double): AccountThrottleSettings = {
    val __obj = js.Dynamic.literal(burstLimit = burstLimit, rateLimit = rateLimit)
  
    __obj.asInstanceOf[AccountThrottleSettings]
  }
}

