package typings.pulumiAws.outputMod.s3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketWebsite extends js.Object {
  
  /**
    * An absolute path to the document to return in case of a 4XX error.
    */
  var errorDocument: js.UndefOr[String] = js.native
  
  /**
    * Amazon S3 returns this index document when requests are made to the root domain or any of the subfolders.
    */
  var indexDocument: js.UndefOr[String] = js.native
  
  /**
    * A hostname to redirect all website requests for this bucket to. Hostname can optionally be prefixed with a protocol (`http://` or `https://`) to use when redirecting requests. The default is the protocol that is used in the original request.
    */
  var redirectAllRequestsTo: js.UndefOr[String] = js.native
  
  /**
    * A json array containing [routing rules](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-s3-websiteconfiguration-routingrules.html)
    * describing redirect behavior and when redirects are applied.
    */
  var routingRules: js.UndefOr[String] = js.native
}
object BucketWebsite {
  
  @scala.inline
  def apply(): BucketWebsite = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketWebsite]
  }
  
  @scala.inline
  implicit class BucketWebsiteOps[Self <: BucketWebsite] (val x: Self) extends AnyVal {
    
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
    def setErrorDocument(value: String): Self = this.set("errorDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErrorDocument: Self = this.set("errorDocument", js.undefined)
    
    @scala.inline
    def setIndexDocument(value: String): Self = this.set("indexDocument", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIndexDocument: Self = this.set("indexDocument", js.undefined)
    
    @scala.inline
    def setRedirectAllRequestsTo(value: String): Self = this.set("redirectAllRequestsTo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRedirectAllRequestsTo: Self = this.set("redirectAllRequestsTo", js.undefined)
    
    @scala.inline
    def setRoutingRules(value: String): Self = this.set("routingRules", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoutingRules: Self = this.set("routingRules", js.undefined)
  }
}
