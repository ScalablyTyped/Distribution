package typings
package atPulumiAwsLib.ssmGetParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameterResult extends js.Object {
  val arn: java.lang.String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: java.lang.String
  val `type`: java.lang.String
  val value: java.lang.String
}

object GetParameterResult {
  @scala.inline
  def apply(arn: java.lang.String, id: java.lang.String, `type`: java.lang.String, value: java.lang.String): GetParameterResult = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("arn")(arn)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[GetParameterResult]
  }
}

