package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PositionTopicArn extends js.Object {
  var position: Input[Double]
  var topicArn: Input[String]
}

object Anon_PositionTopicArn {
  @scala.inline
  def apply(position: Input[Double], topicArn: Input[String]): Anon_PositionTopicArn = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PositionTopicArn]
  }
}

