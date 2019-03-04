package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointIdIndex extends js.Object {
  var endpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var id: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var index: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_EndpointIdIndex {
  @scala.inline
  def apply(
    endpoint: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    id: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    index: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    roleArn: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_EndpointIdIndex = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointIdIndex]
  }
}

