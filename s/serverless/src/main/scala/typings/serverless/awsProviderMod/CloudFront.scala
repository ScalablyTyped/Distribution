package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CloudFront extends js.Object {
  var eventType: String
  var includeBody: Boolean
  var origin: Origin
  var pathPattern: String
}

object CloudFront {
  @scala.inline
  def apply(eventType: String, includeBody: Boolean, origin: Origin, pathPattern: String): CloudFront = {
    val __obj = js.Dynamic.literal(eventType = eventType.asInstanceOf[js.Any], includeBody = includeBody.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], pathPattern = pathPattern.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloudFront]
  }
}

