package typings.pulumiAws.outputMod.mediapackage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  
  @scala.inline
  implicit class ChannelHlsIngestOps[Self <: ChannelHlsIngest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIngestEndpointsVarargs(value: ChannelHlsIngestIngestEndpoint*): Self = this.set("ingestEndpoints", js.Array(value :_*))
    
    @scala.inline
    def setIngestEndpoints(value: js.Array[ChannelHlsIngestIngestEndpoint]): Self = this.set("ingestEndpoints", value.asInstanceOf[js.Any])
  }
}
