package typings.revalidator.Revalidator_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.revalidator.revalidatorStrings.string
  - typings.revalidator.revalidatorStrings.number
  - typings.revalidator.revalidatorStrings.integer
  - typings.revalidator.revalidatorStrings.array
  - typings.revalidator.revalidatorStrings.boolean
  - typings.revalidator.revalidatorStrings.`object`
  - typings.revalidator.revalidatorStrings.`null`
  - typings.revalidator.revalidatorStrings.any
*/
trait Types extends js.Object

object Types {
  @scala.inline
  def any: typings.revalidator.revalidatorStrings.any = this.cast("any")
  @scala.inline
  def array: typings.revalidator.revalidatorStrings.array = this.cast("array")
  @scala.inline
  def boolean: typings.revalidator.revalidatorStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def integer: typings.revalidator.revalidatorStrings.integer = this.cast("integer")
  @scala.inline
  def `null`: typings.revalidator.revalidatorStrings.`null` = this.cast("null")
  @scala.inline
  def number: typings.revalidator.revalidatorStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.revalidator.revalidatorStrings.`object` = this.cast("object")
  @scala.inline
  def string: typings.revalidator.revalidatorStrings.string = this.cast("string")
}

