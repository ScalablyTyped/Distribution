package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthTtlClientId extends js.Object {
  var authTtl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var clientId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var iatTtl: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Double]] = js.undefined
  var issuer: atPulumiPulumiLib.outputMod.Input[java.lang.String]
}

object Anon_AuthTtlClientId {
  @scala.inline
  def apply(
    issuer: atPulumiPulumiLib.outputMod.Input[java.lang.String],
    authTtl: atPulumiPulumiLib.outputMod.Input[scala.Double] = null,
    clientId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    iatTtl: atPulumiPulumiLib.outputMod.Input[scala.Double] = null
  ): Anon_AuthTtlClientId = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    if (authTtl != null) __obj.updateDynamic("authTtl")(authTtl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (iatTtl != null) __obj.updateDynamic("iatTtl")(iatTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthTtlClientId]
  }
}

