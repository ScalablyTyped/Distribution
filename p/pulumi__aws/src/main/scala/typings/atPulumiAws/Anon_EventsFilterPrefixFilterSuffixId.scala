package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefixFilterSuffixId extends js.Object {
  var events: js.Array[String]
  var filterPrefix: js.UndefOr[String] = js.undefined
  var filterSuffix: js.UndefOr[String] = js.undefined
  var id: String
  var topicArn: String
}

object Anon_EventsFilterPrefixFilterSuffixId {
  @scala.inline
  def apply(
    events: js.Array[String],
    id: String,
    topicArn: String,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): Anon_EventsFilterPrefixFilterSuffixId = {
    val __obj = js.Dynamic.literal(events = events, id = id, topicArn = topicArn)
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[Anon_EventsFilterPrefixFilterSuffixId]
  }
}

