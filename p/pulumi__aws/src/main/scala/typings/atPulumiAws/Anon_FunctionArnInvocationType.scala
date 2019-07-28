package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionArnInvocationType extends js.Object {
  var functionArn: String
  var invocationType: String
  var position: Double
  var topicArn: js.UndefOr[String] = js.undefined
}

object Anon_FunctionArnInvocationType {
  @scala.inline
  def apply(functionArn: String, invocationType: String, position: Double, topicArn: String = null): Anon_FunctionArnInvocationType = {
    val __obj = js.Dynamic.literal(functionArn = functionArn, invocationType = invocationType, position = position)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_FunctionArnInvocationType]
  }
}

