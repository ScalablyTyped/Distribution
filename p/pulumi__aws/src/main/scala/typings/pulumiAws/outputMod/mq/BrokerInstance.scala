package typings.pulumiAws.outputMod.mq

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerInstance extends js.Object {
  var consoleUrl: String = js.native
  var endpoints: js.Array[String] = js.native
  var ipAddress: String = js.native
}

object BrokerInstance {
  @scala.inline
  def apply(consoleUrl: String, endpoints: js.Array[String], ipAddress: String): BrokerInstance = {
    val __obj = js.Dynamic.literal(consoleUrl = consoleUrl.asInstanceOf[js.Any], endpoints = endpoints.asInstanceOf[js.Any], ipAddress = ipAddress.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[BrokerInstance]
  }
}

