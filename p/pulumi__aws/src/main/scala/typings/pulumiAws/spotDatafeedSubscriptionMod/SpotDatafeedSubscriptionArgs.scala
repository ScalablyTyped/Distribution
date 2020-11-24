package typings.pulumiAws.spotDatafeedSubscriptionMod

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpotDatafeedSubscriptionArgs extends js.Object {
  
  /**
    * The Amazon S3 bucket in which to store the Spot instance data feed.
    */
  val bucket: Input[String] = js.native
  
  /**
    * Path of folder inside bucket to place spot pricing data.
    */
  val prefix: js.UndefOr[Input[String]] = js.native
}
object SpotDatafeedSubscriptionArgs {
  
  @scala.inline
  def apply(bucket: Input[String]): SpotDatafeedSubscriptionArgs = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpotDatafeedSubscriptionArgs]
  }
  
  @scala.inline
  implicit class SpotDatafeedSubscriptionArgsOps[Self <: SpotDatafeedSubscriptionArgs] (val x: Self) extends AnyVal {
    
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
    def setPrefix(value: Input[String]): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
  }
}
