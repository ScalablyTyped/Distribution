package typings.qrcodeGenerator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qrcodeGenerator.qrcodeGeneratorStrings.L
  - typings.qrcodeGenerator.qrcodeGeneratorStrings.M
  - typings.qrcodeGenerator.qrcodeGeneratorStrings.Q
  - typings.qrcodeGenerator.qrcodeGeneratorStrings.H
*/
trait ErrorCorrectionLevel extends js.Object

object ErrorCorrectionLevel {
  @scala.inline
  def H: typings.qrcodeGenerator.qrcodeGeneratorStrings.H = this.cast("H")
  @scala.inline
  def L: typings.qrcodeGenerator.qrcodeGeneratorStrings.L = this.cast("L")
  @scala.inline
  def M: typings.qrcodeGenerator.qrcodeGeneratorStrings.M = this.cast("M")
  @scala.inline
  def Q: typings.qrcodeGenerator.qrcodeGeneratorStrings.Q = this.cast("Q")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

