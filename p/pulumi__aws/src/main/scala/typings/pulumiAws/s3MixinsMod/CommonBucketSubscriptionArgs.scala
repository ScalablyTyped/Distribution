package typings.pulumiAws.s3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommonBucketSubscriptionArgs extends js.Object {
  
  /**
    * An optional prefix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterPrefix: js.UndefOr[String] = js.native
  
  /**
    * An optional suffix to filter down notifications.  See
    * aws.s3.BucketNotification.lambdaFunctions for more details.
    */
  var filterSuffix: js.UndefOr[String] = js.native
}
object CommonBucketSubscriptionArgs {
  
  @scala.inline
  def apply(): CommonBucketSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonBucketSubscriptionArgs]
  }
  
  @scala.inline
  implicit class CommonBucketSubscriptionArgsOps[Self <: CommonBucketSubscriptionArgs] (val x: Self) extends AnyVal {
    
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
    def setFilterPrefix(value: String): Self = this.set("filterPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterPrefix: Self = this.set("filterPrefix", js.undefined)
    
    @scala.inline
    def setFilterSuffix(value: String): Self = this.set("filterSuffix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFilterSuffix: Self = this.set("filterSuffix", js.undefined)
  }
}
