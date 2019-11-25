package typings.qrDashImage.qrDashImageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.qrDashImage.qrDashImageStrings.png
  - typings.qrDashImage.qrDashImageStrings.svg
  - typings.qrDashImage.qrDashImageStrings.pdf
  - typings.qrDashImage.qrDashImageStrings.eps
*/
trait image_type extends js.Object

object image_type {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def eps: typings.qrDashImage.qrDashImageStrings.eps = this.cast("eps")
  @scala.inline
  def pdf: typings.qrDashImage.qrDashImageStrings.pdf = this.cast("pdf")
  @scala.inline
  def png: typings.qrDashImage.qrDashImageStrings.png = this.cast("png")
  @scala.inline
  def svg: typings.qrDashImage.qrDashImageStrings.svg = this.cast("svg")
}

