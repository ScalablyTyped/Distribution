package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_KinesisStreamArnRoleArn extends js.Object {
  var kinesisStreamArn: Input[String]
  var roleArn: Input[String]
}

object Anon_KinesisStreamArnRoleArn {
  @scala.inline
  def apply(kinesisStreamArn: Input[String], roleArn: Input[String]): Anon_KinesisStreamArnRoleArn = {
    val __obj = js.Dynamic.literal(kinesisStreamArn = kinesisStreamArn.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_KinesisStreamArnRoleArn]
  }
}

