package typings.std.Intl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// http://cldr.unicode.org/index/cldr-spec/plural-rules#TOC-Determining-Plural-Categories
/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.zero
  - typings.std.stdStrings.one
  - typings.std.stdStrings.two
  - typings.std.stdStrings.few
  - typings.std.stdStrings.many
  - typings.std.stdStrings.other
*/
trait LDMLPluralRule extends js.Object

object LDMLPluralRule {
  @scala.inline
  def few: typings.std.stdStrings.few = "few".asInstanceOf[typings.std.stdStrings.few]
  @scala.inline
  def many: typings.std.stdStrings.many = "many".asInstanceOf[typings.std.stdStrings.many]
  @scala.inline
  def one: typings.std.stdStrings.one = "one".asInstanceOf[typings.std.stdStrings.one]
  @scala.inline
  def other: typings.std.stdStrings.other = "other".asInstanceOf[typings.std.stdStrings.other]
  @scala.inline
  def two: typings.std.stdStrings.two = "two".asInstanceOf[typings.std.stdStrings.two]
  @scala.inline
  def zero: typings.std.stdStrings.zero = "zero".asInstanceOf[typings.std.stdStrings.zero]
}

