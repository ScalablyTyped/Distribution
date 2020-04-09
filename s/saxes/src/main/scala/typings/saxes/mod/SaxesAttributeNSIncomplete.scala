package typings.saxes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Exclude<saxes.saxes.SaxesAttributeNS, 'uri'> */
/* Rewritten from type alias, can be one of: 
  - typings.saxes.saxesStrings.local
  - typings.saxes.saxesStrings.prefix
  - typings.saxes.saxesStrings.value
  - typings.saxes.saxesStrings.name
*/
trait SaxesAttributeNSIncomplete
  extends AttributeEventForOptions[js.Any]

object SaxesAttributeNSIncomplete {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def local: typings.saxes.saxesStrings.local = this.cast("local")
  @scala.inline
  def name: typings.saxes.saxesStrings.name = this.cast("name")
  @scala.inline
  def prefix: typings.saxes.saxesStrings.prefix = this.cast("prefix")
  @scala.inline
  def value: typings.saxes.saxesStrings.value = this.cast("value")
}

