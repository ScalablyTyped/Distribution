package typings.pulumiAws.sqsMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueueEventSubscriptionArgs extends js.Object {
  
  /**
    * The largest number of records that AWS Lambda will retrieve. The maximum batch size supported
    * by Amazon Simple Queue Service is up to 10 queue messages per batch. The default setting is
    * 10.
    *
    * See https://docs.aws.amazon.com/lambda/latest/dg/with-sqs.html for more details.
    */
  var batchSize: js.UndefOr[Double] = js.native
}
object QueueEventSubscriptionArgs {
  
  @scala.inline
  def apply(): QueueEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueueEventSubscriptionArgs]
  }
  
  @scala.inline
  implicit class QueueEventSubscriptionArgsOps[Self <: QueueEventSubscriptionArgs] (val x: Self) extends AnyVal {
    
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
  }
}
