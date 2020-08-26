package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CloudFront extends js.Object {
  var eventType: String = js.native
  var includeBody: Boolean = js.native
  var origin: Origin = js.native
  var pathPattern: String = js.native
}

object CloudFront {
  @scala.inline
  def apply(eventType: String, includeBody: Boolean, origin: Origin, pathPattern: String): CloudFront = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], includeBody = includeBody.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFront]
  }
  @scala.inline
  implicit class CloudFrontOps[Self <: CloudFront] (val x: Self) extends AnyVal {
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
    def setEventType(value: String): Self = this.set("eventType", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncludeBody(value: Boolean): Self = this.set("includeBody", value.asInstanceOf[js.Any])
    @scala.inline
    def setOrigin(value: Origin): Self = this.set("origin", value.asInstanceOf[js.Any])
    @scala.inline
    def setPathPattern(value: String): Self = this.set("pathPattern", value.asInstanceOf[js.Any])
  }
  
}

