package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_FunctionArnInvocationType extends js.Object {
  var functionArn: java.lang.String
  var invocationType: java.lang.String
  var position: scala.Double
  var topicArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_FunctionArnInvocationType {
  @scala.inline
  def apply(
    functionArn: java.lang.String,
    invocationType: java.lang.String,
    position: scala.Double,
    topicArn: java.lang.String = null
  ): Anon_FunctionArnInvocationType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("functionArn")(functionArn)
    __obj.updateDynamic("invocationType")(invocationType)
    __obj.updateDynamic("position")(position)
    if (topicArn != null) __obj.updateDynamic("topicArn")(topicArn)
    __obj.asInstanceOf[Anon_FunctionArnInvocationType]
  }
}

