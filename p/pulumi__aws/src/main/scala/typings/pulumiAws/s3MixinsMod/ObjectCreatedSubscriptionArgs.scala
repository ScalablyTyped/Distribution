package typings.pulumiAws.s3MixinsMod

import typings.pulumiAws.pulumiAwsStrings.Asterisk
import typings.pulumiAws.pulumiAwsStrings.CompleteMultipartUpload
import typings.pulumiAws.pulumiAwsStrings.Copy
import typings.pulumiAws.pulumiAwsStrings.Post
import typings.pulumiAws.pulumiAwsStrings.Put
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ObjectCreatedSubscriptionArgs extends CommonBucketSubscriptionArgs {
  
  var event: js.UndefOr[Asterisk | Put | Post | Copy | CompleteMultipartUpload] = js.native
}
object ObjectCreatedSubscriptionArgs {
  
  @scala.inline
  def apply(): ObjectCreatedSubscriptionArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectCreatedSubscriptionArgs]
  }
  
  @scala.inline
  implicit class ObjectCreatedSubscriptionArgsOps[Self <: ObjectCreatedSubscriptionArgs] (val x: Self) extends AnyVal {
    
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
    def setEvent(value: Asterisk | Put | Post | Copy | CompleteMultipartUpload): Self = this.set("event", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEvent: Self = this.set("event", js.undefined)
  }
}
