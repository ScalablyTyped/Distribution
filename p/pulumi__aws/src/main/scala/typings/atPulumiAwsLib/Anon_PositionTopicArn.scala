package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PositionTopicArn extends js.Object {
  var position: atPulumiPulumiLib.outputMod.Input[scala.Double]
  var topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_PositionTopicArn {
  @scala.inline
  def apply(
    position: atPulumiPulumiLib.outputMod.Input[scala.Double],
    topicArn: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  ): Anon_PositionTopicArn = {
    val __obj = js.Dynamic.literal(position = position.asInstanceOf[js.Any], topicArn = topicArn.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_PositionTopicArn]
  }
}

