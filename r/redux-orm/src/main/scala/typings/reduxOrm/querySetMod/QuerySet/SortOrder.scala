package typings.reduxOrm.querySetMod.QuerySet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Optional ordering direction.
  *
  * {@see QuerySet.orderBy}
  */
/* Rewritten from type alias, can be one of: 
  - typings.reduxOrm.reduxOrmBooleans.`true`
  - typings.reduxOrm.reduxOrmBooleans.`false`
  - typings.reduxOrm.reduxOrmStrings.asc
  - typings.reduxOrm.reduxOrmStrings.desc
*/
trait SortOrder extends js.Object

object SortOrder {
  @scala.inline
  def asc: typings.reduxOrm.reduxOrmStrings.asc = "asc".asInstanceOf[typings.reduxOrm.reduxOrmStrings.asc]
  @scala.inline
  def desc: typings.reduxOrm.reduxOrmStrings.desc = "desc".asInstanceOf[typings.reduxOrm.reduxOrmStrings.desc]
  @scala.inline
  def `false`: typings.reduxOrm.reduxOrmBooleans.`false` = false.asInstanceOf[typings.reduxOrm.reduxOrmBooleans.`false`]
  @scala.inline
  def `true`: typings.reduxOrm.reduxOrmBooleans.`true` = true.asInstanceOf[typings.reduxOrm.reduxOrmBooleans.`true`]
}

