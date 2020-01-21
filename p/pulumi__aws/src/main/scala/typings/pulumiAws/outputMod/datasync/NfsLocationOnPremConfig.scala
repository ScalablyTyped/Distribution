package typings.pulumiAws.outputMod.datasync

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NfsLocationOnPremConfig extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
    */
  var agentArns: js.Array[String] = js.native
}

object NfsLocationOnPremConfig {
  @scala.inline
  def apply(agentArns: js.Array[String]): NfsLocationOnPremConfig = {
    val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NfsLocationOnPremConfig]
  }
}

