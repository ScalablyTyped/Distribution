package typings
package reactDashCalendarDashTimelineLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_GroupIdKey extends js.Object {
  var groupIdKey: java.lang.String
  var groupTitleKey: java.lang.String
  var itemGroupKey: java.lang.String
  var itemIdKey: java.lang.String
  var itemTimeEndKey: java.lang.String
  var itemTimeStartKey: java.lang.String
  var itemTitleKey: java.lang.String
}

object Anon_GroupIdKey {
  @scala.inline
  def apply(
    groupIdKey: java.lang.String,
    groupTitleKey: java.lang.String,
    itemGroupKey: java.lang.String,
    itemIdKey: java.lang.String,
    itemTimeEndKey: java.lang.String,
    itemTimeStartKey: java.lang.String,
    itemTitleKey: java.lang.String
  ): Anon_GroupIdKey = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("groupIdKey")(groupIdKey)
    __obj.updateDynamic("groupTitleKey")(groupTitleKey)
    __obj.updateDynamic("itemGroupKey")(itemGroupKey)
    __obj.updateDynamic("itemIdKey")(itemIdKey)
    __obj.updateDynamic("itemTimeEndKey")(itemTimeEndKey)
    __obj.updateDynamic("itemTimeStartKey")(itemTimeStartKey)
    __obj.updateDynamic("itemTitleKey")(itemTitleKey)
    __obj.asInstanceOf[Anon_GroupIdKey]
  }
}

