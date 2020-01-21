package typings.roll.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.roll.rollStrings.sum
  - typings.roll.rollStrings.add
  - typings.roll.rollStrings.subtract
  - typings.roll.rollStrings.multiply
  - typings.roll.rollStrings.divide
  - typings.roll.rollStrings.`best-of`
  - typings.roll.rollStrings.`worst-of`
*/
trait RollTransformationKey extends js.Object

object RollTransformationKey {
  @scala.inline
  def add: typings.roll.rollStrings.add = this.cast("add")
  @scala.inline
  def `best-of`: typings.roll.rollStrings.`best-of` = this.cast("best-of")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def divide: typings.roll.rollStrings.divide = this.cast("divide")
  @scala.inline
  def multiply: typings.roll.rollStrings.multiply = this.cast("multiply")
  @scala.inline
  def subtract: typings.roll.rollStrings.subtract = this.cast("subtract")
  @scala.inline
  def sum: typings.roll.rollStrings.sum = this.cast("sum")
  @scala.inline
  def `worst-of`: typings.roll.rollStrings.`worst-of` = this.cast("worst-of")
}

