package typings.atPulumiAws.typesInputMod.datasync

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait NfsLocationOnPremConfig extends js.Object {
  /**
    * List of Amazon Resource Names (ARNs) of the DataSync Agents used to connect to the NFS server.
    */
  var agentArns: Input[js.Array[Input[String]]]
}

object NfsLocationOnPremConfig {
  @scala.inline
  def apply(agentArns: Input[js.Array[Input[String]]]): NfsLocationOnPremConfig = {
    val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NfsLocationOnPremConfig]
  }
}

