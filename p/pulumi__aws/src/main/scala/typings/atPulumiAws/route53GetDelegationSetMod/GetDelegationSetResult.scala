package typings.atPulumiAws.route53GetDelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDelegationSetResult extends js.Object {
  val callerReference: String
  val id: String
  val nameServers: js.Array[String]
}

object GetDelegationSetResult {
  @scala.inline
  def apply(callerReference: String, id: String, nameServers: js.Array[String]): GetDelegationSetResult = {
    val __obj = js.Dynamic.literal(callerReference = callerReference, id = id, nameServers = nameServers)
  
    __obj.asInstanceOf[GetDelegationSetResult]
  }
}

