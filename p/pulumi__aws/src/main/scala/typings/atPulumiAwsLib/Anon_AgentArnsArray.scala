package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AgentArnsArray extends js.Object {
  var agentArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
}

object Anon_AgentArnsArray {
  @scala.inline
  def apply(
    agentArns: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[java.lang.String]]]
  ): Anon_AgentArnsArray = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("agentArns")(agentArns.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AgentArnsArray]
  }
}

