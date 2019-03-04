package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Certificate extends js.Object {
  var certificate: js.UndefOr[java.lang.String] = js.undefined
  var computeType: java.lang.String
  var environmentVariables: js.Array[Anon_NameType]
  var image: java.lang.String
  var privilegedMode: js.UndefOr[scala.Boolean] = js.undefined
  var `type`: java.lang.String
}

object Anon_Certificate {
  @scala.inline
  def apply(
    computeType: java.lang.String,
    environmentVariables: js.Array[Anon_NameType],
    image: java.lang.String,
    `type`: java.lang.String,
    certificate: java.lang.String = null,
    privilegedMode: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_Certificate = {
    val __obj = js.Dynamic.literal(computeType = computeType, environmentVariables = environmentVariables, image = image)
    __obj.updateDynamic("type")(`type`)
    if (certificate != null) __obj.updateDynamic("certificate")(certificate)
    if (!js.isUndefined(privilegedMode)) __obj.updateDynamic("privilegedMode")(privilegedMode)
    __obj.asInstanceOf[Anon_Certificate]
  }
}

