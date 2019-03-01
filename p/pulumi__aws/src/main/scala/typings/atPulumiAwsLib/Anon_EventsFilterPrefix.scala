package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefix extends js.Object {
  var events: js.Array[java.lang.String]
  var filterPrefix: js.UndefOr[java.lang.String] = js.undefined
  var filterSuffix: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var lambdaFunctionArn: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_EventsFilterPrefix {
  @scala.inline
  def apply(
    events: js.Array[java.lang.String],
    id: java.lang.String,
    filterPrefix: java.lang.String = null,
    filterSuffix: java.lang.String = null,
    lambdaFunctionArn: java.lang.String = null
  ): Anon_EventsFilterPrefix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("id")(id)
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    if (lambdaFunctionArn != null) __obj.updateDynamic("lambdaFunctionArn")(lambdaFunctionArn)
    __obj.asInstanceOf[Anon_EventsFilterPrefix]
  }
}

