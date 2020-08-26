package typings.pulumiAws.s3MixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BucketEventSubscriptionArgs extends CommonBucketSubscriptionArgs {
  /**
    * Events to subscribe to. For example: "[s3:ObjectCreated:*]".  Cannot be empty.
    */
  var events: js.Array[String] = js.native
}

object BucketEventSubscriptionArgs {
  @scala.inline
  def apply(events: js.Array[String]): BucketEventSubscriptionArgs = {
    val __obj = js.Dynamic.literal(events = events.asInstanceOf[js.Any])
    __obj.asInstanceOf[BucketEventSubscriptionArgs]
  }
  @scala.inline
  implicit class BucketEventSubscriptionArgsOps[Self <: BucketEventSubscriptionArgs] (val x: Self) extends AnyVal {
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
    def setEventsVarargs(value: String*): Self = this.set("events", js.Array(value :_*))
    @scala.inline
    def setEvents(value: js.Array[String]): Self = this.set("events", value.asInstanceOf[js.Any])
  }
  
}

