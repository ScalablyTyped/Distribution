package typings.reduxOrm

import typings.reduxOrm.querySetMod.QuerySet.SortOrder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reduxOrmBooleans {
  @js.native
  sealed trait `false` extends SortOrder
  
  @js.native
  sealed trait `true` extends SortOrder
  
  @scala.inline
  def `false`: `false` = false.asInstanceOf[`false`]
  @scala.inline
  def `true`: `true` = true.asInstanceOf[`true`]
}

