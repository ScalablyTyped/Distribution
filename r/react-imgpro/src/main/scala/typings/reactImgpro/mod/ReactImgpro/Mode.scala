package typings.reactImgpro.mod.ReactImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactImgpro.reactImgproStrings.neighbor
  - typings.reactImgpro.reactImgproStrings.bilinear
  - typings.reactImgpro.reactImgproStrings.bicubic
  - typings.reactImgpro.reactImgproStrings.hermite
  - typings.reactImgpro.reactImgproStrings.bezier
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def bezier: typings.reactImgpro.reactImgproStrings.bezier = this.cast("bezier")
  @scala.inline
  def bicubic: typings.reactImgpro.reactImgproStrings.bicubic = this.cast("bicubic")
  @scala.inline
  def bilinear: typings.reactImgpro.reactImgproStrings.bilinear = this.cast("bilinear")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hermite: typings.reactImgpro.reactImgproStrings.hermite = this.cast("hermite")
  @scala.inline
  def neighbor: typings.reactImgpro.reactImgproStrings.neighbor = this.cast("neighbor")
}

