package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefix extends js.Object {
  var events: js.Array[String]
  var filterPrefix: js.UndefOr[String] = js.undefined
  var filterSuffix: js.UndefOr[String] = js.undefined
  var id: String
  var lambdaFunctionArn: js.UndefOr[String] = js.undefined
}

object Anon_EventsFilterPrefix {
  @scala.inline
  def apply(
    events: js.Array[String],
    id: String,
    filterPrefix: String = null,
    filterSuffix: String = null,
    lambdaFunctionArn: String = null
  ): Anon_EventsFilterPrefix = {
    val __obj = js.Dynamic.literal(events = events, id = id)
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    if (lambdaFunctionArn != null) __obj.updateDynamic("lambdaFunctionArn")(lambdaFunctionArn)
    __obj.asInstanceOf[Anon_EventsFilterPrefix]
  }
}

