package typings.pulumiAws.getDelegationSetMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDelegationSetResult extends js.Object {
  val callerReference: String = js.native
  val id: String = js.native
  val nameServers: js.Array[String] = js.native
}

object GetDelegationSetResult {
  @scala.inline
  def apply(callerReference: String, id: String, nameServers: js.Array[String]): GetDelegationSetResult = {
    val __obj = js.Dynamic.literal(callerReference = callerReference.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], nameServers = nameServers.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GetDelegationSetResult]
  }
}

