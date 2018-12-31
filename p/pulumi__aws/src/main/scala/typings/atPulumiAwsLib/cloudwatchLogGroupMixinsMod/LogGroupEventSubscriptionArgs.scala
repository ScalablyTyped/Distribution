package typings
package atPulumiAwsLib.cloudwatchLogGroupMixinsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LogGroupEventSubscriptionArgs extends js.Object {
  /**
    * A valid CloudWatch Logs filter pattern for subscribing to a filtered stream of log events. If
    * not provided, the empty-string pattern will be used.
    */
  var filterPattern: js.UndefOr[java.lang.String] = js.undefined
}

