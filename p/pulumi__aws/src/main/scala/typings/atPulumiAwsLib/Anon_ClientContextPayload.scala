package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ClientContextPayload extends js.Object {
  var clientContext: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var payload: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  var qualifier: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
}

object Anon_ClientContextPayload {
  @scala.inline
  def apply(
    clientContext: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    payload: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    qualifier: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null
  ): Anon_ClientContextPayload = {
    val __obj = js.Dynamic.literal()
    if (clientContext != null) __obj.updateDynamic("clientContext")(clientContext.asInstanceOf[js.Any])
    if (payload != null) __obj.updateDynamic("payload")(payload.asInstanceOf[js.Any])
    if (qualifier != null) __obj.updateDynamic("qualifier")(qualifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ClientContextPayload]
  }
}

