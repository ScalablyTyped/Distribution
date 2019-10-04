package typings.atPulumiAws.typesOutputMod.mqNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBrokerInstance extends js.Object {
  var consoleUrl: String
  var endpoints: js.Array[String]
  var ipAddress: String
}

object GetBrokerInstance {
  @scala.inline
  def apply(consoleUrl: String, endpoints: js.Array[String], ipAddress: String): GetBrokerInstance = {
    val __obj = js.Dynamic.literal(consoleUrl = consoleUrl, endpoints = endpoints, ipAddress = ipAddress)
  
    __obj.asInstanceOf[GetBrokerInstance]
  }
}

