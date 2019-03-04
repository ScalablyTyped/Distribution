package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CertificateComputeType extends js.Object {
  var certificate: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var computeType: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var environmentVariables: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameTypeValue]]]
  ] = js.undefined
  var image: atPulumiPulumiLib.outputMod.Input[java.lang.String]
  var privilegedMode: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
  var `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_CertificateComputeType {
  @scala.inline
  def apply(
    computeType: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    image: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    `type`: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    certificate: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    environmentVariables: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_NameTypeValue]]] = null,
    privilegedMode: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_CertificateComputeType = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], image = image.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (certificate != null) __obj.updateDynamic("certificate")(certificate.asInstanceOf[js.Any])
    if (environmentVariables != null) __obj.updateDynamic("environmentVariables")(environmentVariables.asInstanceOf[js.Any])
    if (privilegedMode != null) __obj.updateDynamic("privilegedMode")(privilegedMode.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CertificateComputeType]
  }
}

