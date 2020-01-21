package typings.qrcodeGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qrcodeGenerator.qrcodeGeneratorStrings.Numeric
  - typings.qrcodeGenerator.qrcodeGeneratorStrings.Alphanumeric
  - typings.qrcodeGenerator.qrcodeGeneratorStrings.Byte
  - typings.qrcodeGenerator.qrcodeGeneratorStrings.Kanji
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def Alphanumeric: typings.qrcodeGenerator.qrcodeGeneratorStrings.Alphanumeric = this.cast("Alphanumeric")
  @scala.inline
  def Byte: typings.qrcodeGenerator.qrcodeGeneratorStrings.Byte = this.cast("Byte")
  @scala.inline
  def Kanji: typings.qrcodeGenerator.qrcodeGeneratorStrings.Kanji = this.cast("Kanji")
  @scala.inline
  def Numeric: typings.qrcodeGenerator.qrcodeGeneratorStrings.Numeric = this.cast("Numeric")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

