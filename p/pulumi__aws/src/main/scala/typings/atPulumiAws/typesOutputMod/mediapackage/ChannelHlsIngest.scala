package typings.atPulumiAws.typesOutputMod.mediapackage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChannelHlsIngest extends js.Object {
  /**
    * A list of the ingest endpoints
    */
  var ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint]
}

object ChannelHlsIngest {
  @scala.inline
  def apply(ingestEndpoints: js.Array[ChannelHlsIngestIngestEndpoint]): ChannelHlsIngest = {
    val __obj = js.Dynamic.literal(ingestEndpoints = ingestEndpoints)
  
    __obj.asInstanceOf[ChannelHlsIngest]
  }
}

