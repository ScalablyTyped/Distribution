package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_TopicArnInput extends js.Object {
  var topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_TopicArnInput {
  @scala.inline
  def apply(topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]): Anon_TopicArnInput = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("topicArn")(topicArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_TopicArnInput]
  }
}

