package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EndpointIdIndexRoleArn extends js.Object {
  var endpoint: Input[String]
  var id: Input[String]
  var index: Input[String]
  var roleArn: Input[String]
  var `type`: Input[String]
}

object Anon_EndpointIdIndexRoleArn {
  @scala.inline
  def apply(
    endpoint: Input[String],
    id: Input[String],
    index: Input[String],
    roleArn: Input[String],
    `type`: Input[String]
  ): Anon_EndpointIdIndexRoleArn = {
    val __obj = js.Dynamic.literal(endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_EndpointIdIndexRoleArn]
  }
}

