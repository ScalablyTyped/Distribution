package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventType extends js.Object {
  var eventType: String
  var includeBody: js.UndefOr[Boolean] = js.undefined
  var lambdaArn: String
}

object Anon_EventType {
  @scala.inline
  def apply(eventType: String, lambdaArn: String, includeBody: js.UndefOr[Boolean] = js.undefined): Anon_EventType = {
    val __obj = js.Dynamic.literal(eventType = eventType, lambdaArn = lambdaArn)
    if (!js.isUndefined(includeBody)) __obj.updateDynamic("includeBody")(includeBody)
    __obj.asInstanceOf[Anon_EventType]
  }
}

