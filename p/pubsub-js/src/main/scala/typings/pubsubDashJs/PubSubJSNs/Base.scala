package typings.pubsubDashJs.PubSubJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base
  extends Publish
     with Subscribe
     with Unsubscribe
     with ClearAllSubscriptions {
  var name: String = js.native
  var version: String = js.native
}

