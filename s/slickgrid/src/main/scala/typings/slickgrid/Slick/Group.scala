package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group[T /* <: SlickData */] extends NonDataRow {
  /***
    * Whether a group is collapsed.
    * @property collapsed
    * @type {Boolean}
    */
  var collapsed: Boolean
  /***
    * Number of rows in the group.
    * @property count
    * @type {Integer}
    */
  var count: Double
  /**
    * A unique key used to identify the group.  This key can be used in calls to DataView
    * collapseGroup() or expandGroup().
    * @property groupingKey
    * @type {Object}
    */
  var groupingKey: js.Any
  /**
    * Sub-groups that are part of the group.
    * @property groups
    * @type {Array}
    */
  var groups: js.Array[Group[T]]
  /**
    * Grouping level, starting with 0.
    * @property level
    * @type {Number}
    */
  var level: Double
  /**
    * Rows that are part of the group.
    * @property rows
    * @type {Array}
    */
  var rows: js.Array[T]
  /***
    * Formatted display value of the group.
    * @property title
    * @type {String}
    */
  var title: String
  /***
    * GroupTotals, if any.
    * @property totals
    * @type {GroupTotals}
    */
  var totals: GroupTotals[T]
  /***
    * Grouping value.
    * @property value
    * @type {Object}
    */
  var value: js.Any
  /***
    * Compares two Group instances.
    * @method equals
    * @return {Boolean}
    * @param group {Group} Group instance to compare to.
    * todo: this is on the prototype (NonDataRow()) instance, not Group, maybe doesn't matter?
    */
  def equals(group: Group[T]): Boolean
}

object Group {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](
    collapsed: Boolean,
    count: Double,
    equals: Group[T] => Boolean,
    groupingKey: js.Any,
    groups: js.Array[Group[T]],
    level: Double,
    rows: js.Array[T],
    title: String,
    totals: GroupTotals[T],
    value: js.Any
  ): Group[T] = {
    val __obj = js.Dynamic.literal(collapsed = collapsed.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], equals = js.Any.fromFunction1(equals), groupingKey = groupingKey.asInstanceOf[js.Any], groups = groups.asInstanceOf[js.Any], level = level.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], totals = totals.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Group[T]]
  }
}

