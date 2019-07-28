package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_EventsFilterPrefixFilterSuffix extends js.Object {
  var events: js.Array[String]
  var filterPrefix: js.UndefOr[String] = js.undefined
  var filterSuffix: js.UndefOr[String] = js.undefined
  var id: String
  var queueArn: String
}

object Anon_EventsFilterPrefixFilterSuffix {
  @scala.inline
  def apply(
    events: js.Array[String],
    id: String,
    queueArn: String,
    filterPrefix: String = null,
    filterSuffix: String = null
  ): Anon_EventsFilterPrefixFilterSuffix = {
    val __obj = js.Dynamic.literal(events = events, id = id, queueArn = queueArn)
    if (filterPrefix != null) __obj.updateDynamic("filterPrefix")(filterPrefix)
    if (filterSuffix != null) __obj.updateDynamic("filterSuffix")(filterSuffix)
    __obj.asInstanceOf[Anon_EventsFilterPrefixFilterSuffix]
  }
}

