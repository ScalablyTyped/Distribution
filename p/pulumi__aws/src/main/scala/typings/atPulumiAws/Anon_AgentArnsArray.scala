package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentArnsArray extends js.Object {
  var agentArns: Input[js.Array[Input[String]]]
}

object Anon_AgentArnsArray {
  @scala.inline
  def apply(agentArns: Input[js.Array[Input[String]]]): Anon_AgentArnsArray = {
    val __obj = js.Dynamic.literal(agentArns = agentArns.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_AgentArnsArray]
  }
}

