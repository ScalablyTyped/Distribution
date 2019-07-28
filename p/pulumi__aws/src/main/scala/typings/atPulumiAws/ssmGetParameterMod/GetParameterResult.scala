package typings.atPulumiAws.ssmGetParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameterResult extends js.Object {
  val arn: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  val name: String
  val `type`: String
  val value: String
  val version: Double
  val withDecryption: js.UndefOr[Boolean] = js.undefined
}

object GetParameterResult {
  @scala.inline
  def apply(
    arn: String,
    id: String,
    name: String,
    `type`: String,
    value: String,
    version: Double,
    withDecryption: js.UndefOr[Boolean] = js.undefined
  ): GetParameterResult = {
    val __obj = js.Dynamic.literal(arn = arn, id = id, name = name, value = value, version = version)
    __obj.updateDynamic("type")(`type`)
    if (!js.isUndefined(withDecryption)) __obj.updateDynamic("withDecryption")(withDecryption)
    __obj.asInstanceOf[GetParameterResult]
  }
}

