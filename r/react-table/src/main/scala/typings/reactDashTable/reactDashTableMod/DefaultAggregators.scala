package typings.reactDashTable.reactDashTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashTable.reactDashTableStrings.sum
  - typings.reactDashTable.reactDashTableStrings.average
  - typings.reactDashTable.reactDashTableStrings.median
  - typings.reactDashTable.reactDashTableStrings.uniqueCount
  - typings.reactDashTable.reactDashTableStrings.count
*/
trait DefaultAggregators extends js.Object

object DefaultAggregators {
  @scala.inline
  def average: typings.reactDashTable.reactDashTableStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typings.reactDashTable.reactDashTableStrings.count = this.cast("count")
  @scala.inline
  def median: typings.reactDashTable.reactDashTableStrings.median = this.cast("median")
  @scala.inline
  def sum: typings.reactDashTable.reactDashTableStrings.sum = this.cast("sum")
  @scala.inline
  def uniqueCount: typings.reactDashTable.reactDashTableStrings.uniqueCount = this.cast("uniqueCount")
}

