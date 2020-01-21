package typings.reactTable.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactTable.reactTableStrings.sum
  - typings.reactTable.reactTableStrings.average
  - typings.reactTable.reactTableStrings.median
  - typings.reactTable.reactTableStrings.uniqueCount
  - typings.reactTable.reactTableStrings.count
*/
trait DefaultAggregators extends js.Object

object DefaultAggregators {
  @scala.inline
  def average: typings.reactTable.reactTableStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def count: typings.reactTable.reactTableStrings.count = this.cast("count")
  @scala.inline
  def median: typings.reactTable.reactTableStrings.median = this.cast("median")
  @scala.inline
  def sum: typings.reactTable.reactTableStrings.sum = this.cast("sum")
  @scala.inline
  def uniqueCount: typings.reactTable.reactTableStrings.uniqueCount = this.cast("uniqueCount")
}

