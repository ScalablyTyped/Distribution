package typings.slickgrid.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Group")
@js.native
class Group[T /* <: SlickData */] () extends NonDataRow {
  /***
  		* Whether a group is collapsed.
  		* @property collapsed
  		* @type {Boolean}
  		*/
  var collapsed: Boolean = js.native
  /***
  		* Number of rows in the group.
  		* @property count
  		* @type {Integer}
  		*/
  var count: Double = js.native
  /**
  		* A unique key used to identify the group.  This key can be used in calls to DataView
  		* collapseGroup() or expandGroup().
  		* @property groupingKey
  		* @type {Object}
  		*/
  var groupingKey: js.Any = js.native
  /**
  		* Sub-groups that are part of the group.
  		* @property groups
  		* @type {Array}
  		*/
  var groups: js.Array[Group[T]] = js.native
  /**
  		* Grouping level, starting with 0.
  		* @property level
  		* @type {Number}
  		*/
  var level: Double = js.native
  /**
  		* Rows that are part of the group.
  		* @property rows
  		* @type {Array}
  		*/
  var rows: js.Array[T] = js.native
  /***
  		* Formatted display value of the group.
  		* @property title
  		* @type {String}
  		*/
  var title: String = js.native
  /***
  		* GroupTotals, if any.
  		* @property totals
  		* @type {GroupTotals}
  		*/
  var totals: GroupTotals[T] = js.native
  /***
  		* Grouping value.
  		* @property value
  		* @type {Object}
  		*/
  var value: js.Any = js.native
  /***
  		* Compares two Group instances.
  		* @method equals
  		* @return {Boolean}
  		* @param group {Group} Group instance to compare to.
  		* todo: this is on the prototype (NonDataRow()) instance, not Group, maybe doesn't matter?
  		*/
  def equals(group: Group[T]): Boolean = js.native
}

