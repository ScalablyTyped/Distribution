package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IngestEndpointsAnonPasswordUrl extends js.Object {
  var ingestEndpoints: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_PasswordUrl]]]
  ] = js.undefined
}

object Anon_IngestEndpointsAnonPasswordUrl {
  @scala.inline
  def apply(
    ingestEndpoints: atPulumiPulumiLib.outputMod.Input[js.Array[atPulumiPulumiLib.outputMod.Input[Anon_PasswordUrl]]] = null
  ): Anon_IngestEndpointsAnonPasswordUrl = {
    val __obj = js.Dynamic.literal()
    if (ingestEndpoints != null) __obj.updateDynamic("ingestEndpoints")(ingestEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IngestEndpointsAnonPasswordUrl]
  }
}

