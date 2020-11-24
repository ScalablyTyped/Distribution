package typings.signalfx.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IngestOptions extends js.Object {
  
  var batchSize: js.UndefOr[Double] = js.native
  
  var dimensions: js.UndefOr[js.Object] = js.native
  
  var enableAmazonUniqueId: js.UndefOr[Boolean] = js.native
  
  var ingestEndpoint: js.UndefOr[String] = js.native
  
  var proxy: js.UndefOr[String] = js.native
  
  var timeout: js.UndefOr[Double] = js.native
  
  var userAgents: js.UndefOr[js.Array[String]] = js.native
}
object IngestOptions {
  
  @scala.inline
  def apply(): IngestOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IngestOptions]
  }
  
  @scala.inline
  implicit class IngestOptionsOps[Self <: IngestOptions] (val x: Self) extends AnyVal {
    
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
    def setBatchSize(value: Double): Self = this.set("batchSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBatchSize: Self = this.set("batchSize", js.undefined)
    
    @scala.inline
    def setDimensions(value: js.Object): Self = this.set("dimensions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDimensions: Self = this.set("dimensions", js.undefined)
    
    @scala.inline
    def setEnableAmazonUniqueId(value: Boolean): Self = this.set("enableAmazonUniqueId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnableAmazonUniqueId: Self = this.set("enableAmazonUniqueId", js.undefined)
    
    @scala.inline
    def setIngestEndpoint(value: String): Self = this.set("ingestEndpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIngestEndpoint: Self = this.set("ingestEndpoint", js.undefined)
    
    @scala.inline
    def setProxy(value: String): Self = this.set("proxy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProxy: Self = this.set("proxy", js.undefined)
    
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
    
    @scala.inline
    def setUserAgentsVarargs(value: String*): Self = this.set("userAgents", js.Array(value :_*))
    
    @scala.inline
    def setUserAgents(value: js.Array[String]): Self = this.set("userAgents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUserAgents: Self = this.set("userAgents", js.undefined)
  }
}
