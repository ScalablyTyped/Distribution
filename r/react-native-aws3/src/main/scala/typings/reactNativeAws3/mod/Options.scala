package typings.reactNativeAws3.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * Your S3 AWSAccessKeyId
    */
  var accessKey: String = js.native
  
  /**
    * The Access Control List of this object
    * @default "public-read"
    */
  var acl: js.UndefOr[String] = js.native
  
  /**
    * AWS S3 url
    * @default "s3.amazonaws.com"
    */
  var awsUrl: js.UndefOr[String] = js.native
  
  /**
    * Your S3 bucket
    */
  var bucket: String = js.native
  
  /**
    * Prefix, or path to the file on S3, i.e. uploads/ (note the trailing slash)
    */
  var keyPrefix: js.UndefOr[String] = js.native
  
  /**
    * The region of your S3 bucket
    */
  var region: String = js.native
  
  /**
    * Your S3 AWSSecretKey
    */
  var secretKey: String = js.native
  
  /**
    * HTTP response status if successful
    * @default 201
    */
  var successActionStatus: js.UndefOr[Double] = js.native
  
  /**
    * Devices time offset from world clock in milliseconds
    * @default 0
    */
  var timeDelta: js.UndefOr[Double] = js.native
}
object Options {
  
  @scala.inline
  def apply(accessKey: String, bucket: String, region: String, secretKey: String): Options = {
    val __obj = js.Dynamic.literal(accessKey = accessKey.asInstanceOf[js.Any], bucket = bucket.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], secretKey = secretKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setAccessKey(value: String): Self = this.set("accessKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecretKey(value: String): Self = this.set("secretKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAcl(value: String): Self = this.set("acl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAcl: Self = this.set("acl", js.undefined)
    
    @scala.inline
    def setAwsUrl(value: String): Self = this.set("awsUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAwsUrl: Self = this.set("awsUrl", js.undefined)
    
    @scala.inline
    def setKeyPrefix(value: String): Self = this.set("keyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyPrefix: Self = this.set("keyPrefix", js.undefined)
    
    @scala.inline
    def setSuccessActionStatus(value: Double): Self = this.set("successActionStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessActionStatus: Self = this.set("successActionStatus", js.undefined)
    
    @scala.inline
    def setTimeDelta(value: Double): Self = this.set("timeDelta", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTimeDelta: Self = this.set("timeDelta", js.undefined)
  }
}
