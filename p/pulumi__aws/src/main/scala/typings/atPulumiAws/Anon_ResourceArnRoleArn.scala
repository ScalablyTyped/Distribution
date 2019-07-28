package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ResourceArnRoleArn extends js.Object {
  var resourceArn: Input[String]
  var roleArn: Input[String]
}

object Anon_ResourceArnRoleArn {
  @scala.inline
  def apply(resourceArn: Input[String], roleArn: Input[String]): Anon_ResourceArnRoleArn = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_ResourceArnRoleArn]
  }
}

