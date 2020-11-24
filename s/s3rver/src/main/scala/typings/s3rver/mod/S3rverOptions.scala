package typings.s3rver.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait S3rverOptions extends js.Object {
  
  var address: js.UndefOr[String] = js.native
  
  var cert: js.UndefOr[String | Buffer] = js.native
  
  var configureBuckets: js.UndefOr[js.Array[S3rverBucketConfig]] = js.native
  
  var directory: String = js.native
  
  var errorDocument: js.UndefOr[String] = js.native
  
  var hostname: js.UndefOr[String] = js.native
  
  var indexDocument: js.UndefOr[String] = js.native
  
  var key: js.UndefOr[String | Buffer] = js.native
  
  var port: js.UndefOr[Double] = js.native
  
  var resetOnClose: js.UndefOr[Boolean] = js.native
  
  var silent: js.UndefOr[Boolean] = js.native
}
object S3rverOptions {
  
  @scala.inline
  def apply(directory: String): S3rverOptions = {
    val __obj = js.Dynamic.literal(directory = directory.asInstanceOf[js.Any])
    __obj.asInstanceOf[S3rverOptions]
  }
  
  @scala.inline
  implicit class S3rverOptionsOps[Self <: S3rverOptions] (val x: Self) extends AnyVal {
    
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
    def setDirectory(value: String): Self = this.set("directory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddress(value: String): Self = this.set("address", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAddress: Self = this.set("address", js.undefined)
    
    @scala.inline
    def setCert(value: String | Buffer): Self = this.set("cert", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCert: Self = this.set("cert", js.undefined)
    
    @scala.inline
    def setConfigureBucketsVarargs(value: S3rverBucketConfig*): Self = this.set("configureBuckets", js.Array(value :_*))
    
    @scala.inline
    def setConfigureBuckets(value: js.Array[S3rverBucketConfig]): Self = this.set("configureBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteConfigureBuckets: Self = this.set("configureBuckets", js.undefined)
    
    @scala.inline
    def setErrorDocument(value: String): Self = this.set("errorDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDocument: Self = this.set("errorDocument", js.undefined)
    
    @scala.inline
    def setHostname(value: String): Self = this.set("hostname", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHostname: Self = this.set("hostname", js.undefined)
    
    @scala.inline
    def setIndexDocument(value: String): Self = this.set("indexDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexDocument: Self = this.set("indexDocument", js.undefined)
    
    @scala.inline
    def setKey(value: String | Buffer): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKey: Self = this.set("key", js.undefined)
    
    @scala.inline
    def setPort(value: Double): Self = this.set("port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePort: Self = this.set("port", js.undefined)
    
    @scala.inline
    def setResetOnClose(value: Boolean): Self = this.set("resetOnClose", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteResetOnClose: Self = this.set("resetOnClose", js.undefined)
    
    @scala.inline
    def setSilent(value: Boolean): Self = this.set("silent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSilent: Self = this.set("silent", js.undefined)
  }
}
