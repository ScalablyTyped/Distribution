package typings.pulumiAws.bucketMetricMod

import typings.pulumiAws.inputMod.s3.BucketMetricFilter
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BucketMetricState extends js.Object {
  
  /**
    * The name of the bucket to put metric configuration.
    */
  val bucket: js.UndefOr[Input[String]] = js.native
  
  /**
    * [Object filtering](http://docs.aws.amazon.com/AmazonS3/latest/dev/metrics-configurations.html#metrics-configurations-filter) that accepts a prefix, tags, or a logical AND of prefix and tags (documented below).
    */
  val filter: js.UndefOr[Input[BucketMetricFilter]] = js.native
  
  /**
    * Unique identifier of the metrics configuration for the bucket.
    */
  val name: js.UndefOr[Input[String]] = js.native
}
object BucketMetricState {
  
  @scala.inline
  def apply(): BucketMetricState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BucketMetricState]
  }
  
  @scala.inline
  implicit class BucketMetricStateOps[Self <: BucketMetricState] (val x: Self) extends AnyVal {
    
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
    def deleteBucket: Self = this.set("bucket", js.undefined)
    
    @scala.inline
    def setFilter(value: Input[BucketMetricFilter]): Self = this.set("filter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
}
