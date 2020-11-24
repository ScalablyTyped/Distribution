package typings.pulumiAws.inputMod.storagegateway

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NfsFileShareCacheAttributes extends js.Object {
  
  /**
    * Refreshes a file share's cache by using Time To Live (TTL).
    * TTL is the length of time since the last refresh after which access to the directory would cause the file gateway
    * to first refresh that directory's contents from the Amazon S3 bucket. Valid Values: 300 to 2,592,000 seconds (5 minutes to 30 days)
    */
  var cacheStaleTimeoutInSeconds: js.UndefOr[Input[Double]] = js.native
}
object NfsFileShareCacheAttributes {
  
  @scala.inline
  def apply(): NfsFileShareCacheAttributes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NfsFileShareCacheAttributes]
  }
  
  @scala.inline
  implicit class NfsFileShareCacheAttributesOps[Self <: NfsFileShareCacheAttributes] (val x: Self) extends AnyVal {
    
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
    def setCacheStaleTimeoutInSeconds(value: Input[Double]): Self = this.set("cacheStaleTimeoutInSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCacheStaleTimeoutInSeconds: Self = this.set("cacheStaleTimeoutInSeconds", js.undefined)
  }
}
