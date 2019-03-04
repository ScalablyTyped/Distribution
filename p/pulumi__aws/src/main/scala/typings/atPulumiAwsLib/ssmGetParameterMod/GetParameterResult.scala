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
    val __obj = js.Dynamic.literal(arn = arn, id = id, value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[GetParameterResult]
  }
}

