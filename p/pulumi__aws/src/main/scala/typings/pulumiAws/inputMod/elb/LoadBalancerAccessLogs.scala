package typings.pulumiAws.inputMod.elb

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LoadBalancerAccessLogs extends js.Object {
  
  /**
    * The S3 bucket name to store the logs in.
    */
  var bucket: Input[String] = js.native
  
  /**
    * The S3 bucket prefix. Logs are stored in the root if not configured.
    */
  var bucketPrefix: js.UndefOr[Input[String]] = js.native
  
  /**
    * Boolean to enable / disable `accessLogs`. Default is `true`
    */
  var enabled: js.UndefOr[Input[Boolean]] = js.native
  
  /**
    * The publishing interval in minutes. Default: 60 minutes.
    */
  var interval: js.UndefOr[Input[Double]] = js.native
}
object LoadBalancerAccessLogs {
  
  @scala.inline
  def apply(bucket: Input[String]): LoadBalancerAccessLogs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadBalancerAccessLogs]
  }
  
  @scala.inline
  implicit class LoadBalancerAccessLogsOps[Self <: LoadBalancerAccessLogs] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: Input[String]): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBucketPrefix(value: Input[String]): Self = this.set("bucketPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBucketPrefix: Self = this.set("bucketPrefix", js.undefined)
    
    @scala.inline
    def setEnabled(value: Input[Boolean]): Self = this.set("enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEnabled: Self = this.set("enabled", js.undefined)
    
    @scala.inline
    def setInterval(value: Input[Double]): Self = this.set("interval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInterval: Self = this.set("interval", js.undefined)
  }
}
