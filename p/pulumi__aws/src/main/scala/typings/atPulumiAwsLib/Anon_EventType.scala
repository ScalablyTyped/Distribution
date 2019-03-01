package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventType extends js.Object {
  var eventType: java.lang.String
  var includeBody: js.UndefOr[scala.Boolean] = js.undefined
  var lambdaArn: java.lang.String
}

object Anon_EventType {
  @scala.inline
  def apply(
    eventType: java.lang.String,
    lambdaArn: java.lang.String,
    includeBody: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_EventType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("eventType")(eventType)
    __obj.updateDynamic("lambdaArn")(lambdaArn)
    if (!js.isUndefined(includeBody)) __obj.updateDynamic("includeBody")(includeBody)
    __obj.asInstanceOf[Anon_EventType]
  }
}

