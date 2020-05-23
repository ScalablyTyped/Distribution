package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackParameters extends js.Object {
  var ParameterKey: String
  var ParameterValue: String
}

object StackParameters {
  @scala.inline
  def apply(ParameterKey: String, ParameterValue: String): StackParameters = {
    val __obj = js.Dynamic.literal(ParameterKey = ParameterKey.asInstanceOf[js.Any], ParameterValue = ParameterValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackParameters]
  }
}

