package typings.qrImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qrImage.qrImageStrings.png
  - typings.qrImage.qrImageStrings.svg
  - typings.qrImage.qrImageStrings.pdf
  - typings.qrImage.qrImageStrings.eps
*/
trait imageType extends js.Object

object imageType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eps: typings.qrImage.qrImageStrings.eps = this.cast("eps")
  @scala.inline
  def pdf: typings.qrImage.qrImageStrings.pdf = this.cast("pdf")
  @scala.inline
  def png: typings.qrImage.qrImageStrings.png = this.cast("png")
  @scala.inline
  def svg: typings.qrImage.qrImageStrings.svg = this.cast("svg")
}

