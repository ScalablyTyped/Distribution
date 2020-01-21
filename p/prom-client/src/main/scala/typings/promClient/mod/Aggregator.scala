package typings.promClient.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.promClient.promClientStrings.omit
  - typings.promClient.promClientStrings.sum
  - typings.promClient.promClientStrings.first
  - typings.promClient.promClientStrings.min
  - typings.promClient.promClientStrings.max
  - typings.promClient.promClientStrings.average
*/
trait Aggregator extends js.Object

object Aggregator {
  @scala.inline
  def average: typings.promClient.promClientStrings.average = this.cast("average")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def first: typings.promClient.promClientStrings.first = this.cast("first")
  @scala.inline
  def max: typings.promClient.promClientStrings.max = this.cast("max")
  @scala.inline
  def min: typings.promClient.promClientStrings.min = this.cast("min")
  @scala.inline
  def omit: typings.promClient.promClientStrings.omit = this.cast("omit")
  @scala.inline
  def sum: typings.promClient.promClientStrings.sum = this.cast("sum")
}

