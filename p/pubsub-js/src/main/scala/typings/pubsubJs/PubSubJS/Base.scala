package typings.pubsubJs.PubSubJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base
  extends CountSubscriptions
     with ClearAllSubscriptions
     with GetSubscriptions
     with Publish
     with Subscribe
     with Unsubscribe {
  var name: String = js.native
  var version: String = js.native
}

