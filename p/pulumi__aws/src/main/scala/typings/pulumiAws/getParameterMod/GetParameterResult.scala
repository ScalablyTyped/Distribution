package typings.pulumiAws.getParameterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetParameterResult extends js.Object {
  val arn: String = js.native
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  val name: String = js.native
  val `type`: String = js.native
  val value: String = js.native
  val version: Double = js.native
  val withDecryption: js.UndefOr[Boolean] = js.native
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
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(withDecryption)) __obj.updateDynamic("withDecryption")(withDecryption.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetParameterResult]
  }
}

