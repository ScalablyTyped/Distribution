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
  val name: java.lang.String
  val `type`: java.lang.String
  val value: java.lang.String
  val version: scala.Double
  val withDecryption: js.UndefOr[scala.Boolean] = js.undefined
}

object GetParameterResult {
  @scala.inline
  def apply(
    arn: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    `type`: java.lang.String,
    value: java.lang.String,
    version: scala.Double,
    withDecryption: js.UndefOr[scala.Boolean] = js.undefined
  ): GetParameterResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, value = value, version = version)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(withDecryption)) __obj.updateDynamic("withDecryption")(withDecryption)
    __obj.asInstanceOf[GetParameterResult]
  }
}

