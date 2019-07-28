package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IngestEndpointsAnonPasswordUrl extends js.Object {
  var ingestEndpoints: js.UndefOr[Input[js.Array[Input[Anon_PasswordUrl]]]] = js.undefined
}

object Anon_IngestEndpointsAnonPasswordUrl {
  @scala.inline
  def apply(ingestEndpoints: Input[js.Array[Input[Anon_PasswordUrl]]] = null): Anon_IngestEndpointsAnonPasswordUrl = {
    val __obj = js.Dynamic.literal()
    if (ingestEndpoints != null) __obj.updateDynamic("ingestEndpoints")(ingestEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IngestEndpointsAnonPasswordUrl]
  }
}

