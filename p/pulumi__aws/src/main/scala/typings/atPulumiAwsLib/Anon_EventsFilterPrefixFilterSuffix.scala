package typings
package atPulumiAwsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefixFilterSuffix extends js.Object {
  var events: js.Array[java.lang.String]
  var filterPrefix: js.UndefOr[java.lang.String] = js.undefined
  var filterSuffix: js.UndefOr[java.lang.String] = js.undefined
  var id: java.lang.String
  var queueArn: java.lang.String
}

object Anon_EventsFilterPrefixFilterSuffix {
  @scala.inline
  def apply(
    events: js.Array[java.lang.String],
    id: java.lang.String,
    queueArn: java.lang.String,
    filterPrefix: java.lang.String = null,
    filterSuffix: java.lang.String = null
  ): Anon_EventsFilterPrefixFilterSuffix = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("events")(events)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("queueArn")(queueArn)
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[Anon_EventsFilterPrefixFilterSuffix]
  }
}

