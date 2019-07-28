package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AuthTtlClientId extends js.Object {
  var authTtl: js.UndefOr[Input[Double]] = js.undefined
  var clientId: js.UndefOr[Input[String]] = js.undefined
  var iatTtl: js.UndefOr[Input[Double]] = js.undefined
  var issuer: Input[String]
}

object Anon_AuthTtlClientId {
  @scala.inline
  def apply(
    issuer: Input[String],
    authTtl: Input[Double] = null,
    clientId: Input[String] = null,
    iatTtl: Input[Double] = null
  ): Anon_AuthTtlClientId = {
    val __obj = js.Dynamic.literal(issuer = issuer.asInstanceOf[js.Any])
    if (authTtl != null) __obj.updateDynamic("authTtl")(authTtl.asInstanceOf[js.Any])
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (iatTtl != null) __obj.updateDynamic("iatTtl")(iatTtl.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_AuthTtlClientId]
  }
}

