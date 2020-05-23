package typings.slickgrid.global.Slick

import typings.slickgrid.Slick.SlickData
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Slick.Group")
@js.native
class Group[T /* <: SlickData */] ()
  extends typings.slickgrid.Slick.Group[T] {
  /***
    * Whether a group is collapsed.
    * @property collapsed
    * @type {Boolean}
    */
  /* CompleteClass */
  override var collapsed: Boolean = js.native
  /***
    * Number of rows in the group.
    * @property count
    * @type {Integer}
    */
  /* CompleteClass */
  override var count: Double = js.native
  /**
    * A unique key used to identify the group.  This key can be used in calls to DataView
    * collapseGroup() or expandGroup().
    * @property groupingKey
    * @type {Object}
    */
  /* CompleteClass */
  override var groupingKey: js.Any = js.native
  /**
    * Sub-groups that are part of the group.
    * @property groups
    * @type {Array}
    */
  /* CompleteClass */
  override var groups: js.Array[typings.slickgrid.Slick.Group[T]] = js.native
  /**
    * Grouping level, starting with 0.
    * @property level
    * @type {Number}
    */
  /* CompleteClass */
  override var level: Double = js.native
  /**
    * Rows that are part of the group.
    * @property rows
    * @type {Array}
    */
  /* CompleteClass */
  override var rows: js.Array[T] = js.native
  /***
    * Formatted display value of the group.
    * @property title
    * @type {String}
    */
  /* CompleteClass */
  override var title: String = js.native
  /***
    * GroupTotals, if any.
    * @property totals
    * @type {GroupTotals}
    */
  /* CompleteClass */
  override var totals: typings.slickgrid.Slick.GroupTotals[T] = js.native
  /***
    * Grouping value.
    * @property value
    * @type {Object}
    */
  /* CompleteClass */
  override var value: js.Any = js.native
  /***
    * Compares two Group instances.
    * @method equals
    * @return {Boolean}
    * @param group {Group} Group instance to compare to.
    * todo: this is on the prototype (NonDataRow()) instance, not Group, maybe doesn't matter?
    */
  /* CompleteClass */
  override def equals(group: typings.slickgrid.Slick.Group[T]): Boolean = js.native
}

