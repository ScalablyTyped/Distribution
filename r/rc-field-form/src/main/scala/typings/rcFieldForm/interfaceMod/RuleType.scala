package typings.rcFieldForm.interfaceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rcFieldForm.rcFieldFormStrings.string
  - typings.rcFieldForm.rcFieldFormStrings.number
  - typings.rcFieldForm.rcFieldFormStrings.boolean
  - typings.rcFieldForm.rcFieldFormStrings.method
  - typings.rcFieldForm.rcFieldFormStrings.regexp
  - typings.rcFieldForm.rcFieldFormStrings.integer
  - typings.rcFieldForm.rcFieldFormStrings.float
  - typings.rcFieldForm.rcFieldFormStrings.`object`
  - typings.rcFieldForm.rcFieldFormStrings.enum
  - typings.rcFieldForm.rcFieldFormStrings.date
  - typings.rcFieldForm.rcFieldFormStrings.url
  - typings.rcFieldForm.rcFieldFormStrings.hex
  - typings.rcFieldForm.rcFieldFormStrings.email
*/
trait RuleType extends js.Object

object RuleType {
  @scala.inline
  def boolean: typings.rcFieldForm.rcFieldFormStrings.boolean = this.cast("boolean")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def date: typings.rcFieldForm.rcFieldFormStrings.date = this.cast("date")
  @scala.inline
  def email: typings.rcFieldForm.rcFieldFormStrings.email = this.cast("email")
  @scala.inline
  def enum: typings.rcFieldForm.rcFieldFormStrings.enum = this.cast("enum")
  @scala.inline
  def float: typings.rcFieldForm.rcFieldFormStrings.float = this.cast("float")
  @scala.inline
  def hex: typings.rcFieldForm.rcFieldFormStrings.hex = this.cast("hex")
  @scala.inline
  def integer: typings.rcFieldForm.rcFieldFormStrings.integer = this.cast("integer")
  @scala.inline
  def method: typings.rcFieldForm.rcFieldFormStrings.method = this.cast("method")
  @scala.inline
  def number: typings.rcFieldForm.rcFieldFormStrings.number = this.cast("number")
  @scala.inline
  def `object`: typings.rcFieldForm.rcFieldFormStrings.`object` = this.cast("object")
  @scala.inline
  def regexp: typings.rcFieldForm.rcFieldFormStrings.regexp = this.cast("regexp")
  @scala.inline
  def string: typings.rcFieldForm.rcFieldFormStrings.string = this.cast("string")
  @scala.inline
  def url: typings.rcFieldForm.rcFieldFormStrings.url = this.cast("url")
}

