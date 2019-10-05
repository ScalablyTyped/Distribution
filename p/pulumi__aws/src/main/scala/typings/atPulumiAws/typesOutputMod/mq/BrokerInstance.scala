package typings.atPulumiAws.typesOutputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BrokerInstance extends js.Object {
  var consoleUrl: String
  var endpoints: js.Array[String]
  var ipAddress: String
}

object BrokerInstance {
  @scala.inline
  def apply(consoleUrl: String, endpoints: js.Array[String], ipAddress: String): BrokerInstance = {
    val __obj = js.Dynamic.literal(consoleUrl = consoleUrl, endpoints = endpoints, ipAddress = ipAddress)
  
    __obj.asInstanceOf[BrokerInstance]
  }
}

