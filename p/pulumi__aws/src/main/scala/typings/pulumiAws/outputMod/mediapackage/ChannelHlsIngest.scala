package typings.pulumiAws.outputMod.mediapackage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChannelHlsIngest extends js.Object {
  /**
    * A list of the ingest endpoints
    */
  var ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint] = js.native
}

object ChannelHlsIngest {
  @scala.inline
  def apply(ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint]): ChannelHlsIngest = {
    val __obj = js.Dynamic.literal(ingestEndpoints = ingestEndpoints.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ChannelHlsIngest]
  }
}

