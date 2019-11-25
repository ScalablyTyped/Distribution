package typings.reactDashImgpro.reactDashImgproMod.ReactImgpro

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactDashImgpro.reactDashImgproStrings.neighbor
  - typings.reactDashImgpro.reactDashImgproStrings.bilinear
  - typings.reactDashImgpro.reactDashImgproStrings.bicubic
  - typings.reactDashImgpro.reactDashImgproStrings.hermite
  - typings.reactDashImgpro.reactDashImgproStrings.bezier
*/
trait Mode extends js.Object

object Mode {
  @scala.inline
  def bezier: typings.reactDashImgpro.reactDashImgproStrings.bezier = this.cast("bezier")
  @scala.inline
  def bicubic: typings.reactDashImgpro.reactDashImgproStrings.bicubic = this.cast("bicubic")
  @scala.inline
  def bilinear: typings.reactDashImgpro.reactDashImgproStrings.bilinear = this.cast("bilinear")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def hermite: typings.reactDashImgpro.reactDashImgproStrings.hermite = this.cast("hermite")
  @scala.inline
  def neighbor: typings.reactDashImgpro.reactDashImgproStrings.neighbor = this.cast("neighbor")
}

