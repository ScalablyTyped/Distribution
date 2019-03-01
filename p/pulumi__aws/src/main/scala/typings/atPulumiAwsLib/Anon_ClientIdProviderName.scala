package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientIdProviderName extends js.Object {
  var clientId: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var providerName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var serverSideTokenCheck: js.UndefOr[atPulumiPulumiLib.outputMod.Input[scala.Boolean]] = js.undefined
}

object Anon_ClientIdProviderName {
  @scala.inline
  def apply(
    clientId: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    providerName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    serverSideTokenCheck: atPulumiPulumiLib.outputMod.Input[scala.Boolean] = null
  ): Anon_ClientIdProviderName = {
    val __obj = js.Dynamic.literal()
    if (clientId != null) __obj.updateDynamic("clientId")(clientId.asInstanceOf[js.Any])
    if (providerName != null) __obj.updateDynamic("providerName")(providerName.asInstanceOf[js.Any])
    if (serverSideTokenCheck != null) __obj.updateDynamic("serverSideTokenCheck")(serverSideTokenCheck.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientIdProviderName]
  }
}

