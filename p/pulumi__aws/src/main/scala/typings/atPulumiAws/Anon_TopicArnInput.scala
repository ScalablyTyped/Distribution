package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TopicArnInput extends js.Object {
  var topicArn: Input[String]
}

object Anon_TopicArnInput {
  @scala.inline
  def apply(topicArn: Input[String]): Anon_TopicArnInput = {
    val __obj = js.Dynamic.literal(topicArn = topicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_TopicArnInput]
  }
}

