package typings.atPulumiAws.typesInputMod.mediapackage

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHlsIngest extends js.Object {
  /**
    * A list of the ingest endpoints
    */
  var ingestEndpoints: js.UndefOr[Input[js.Array[Input[ChannelHlsIngestIngestEndpoint]]]] = js.undefined
}

object ChannelHlsIngest {
  @scala.inline
  def apply(ingestEndpoints: Input[js.Array[Input[ChannelHlsIngestIngestEndpoint]]] = null): ChannelHlsIngest = {
    val __obj = js.Dynamic.literal()
    if (ingestEndpoints != null) __obj.updateDynamic("ingestEndpoints")(ingestEndpoints.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChannelHlsIngest]
  }
}

