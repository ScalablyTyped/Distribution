package typings
package atPulumiAwsLib.route53GetDelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDelegationSetResult extends js.Object {
  val callerReference: java.lang.String
  val nameServers: js.Array[java.lang.String]
}

object GetDelegationSetResult {
  @scala.inline
  def apply(callerReference: java.lang.String, nameServers: js.Array[java.lang.String]): GetDelegationSetResult = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("callerReference")(callerReference)
    __obj.updateDynamic("nameServers")(nameServers)
    __obj.asInstanceOf[GetDelegationSetResult]
  }
}

