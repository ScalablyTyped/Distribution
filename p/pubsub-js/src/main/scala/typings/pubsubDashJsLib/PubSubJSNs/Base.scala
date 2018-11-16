package typings
package pubsubDashJsLib.PubSubJSNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Base
  extends Publish
     with Subscribe
     with Unsubscribe
     with ClearAllSubscriptions {
  var name: java.lang.String = js.native
  var version: java.lang.String = js.native
}

