package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transition Types for Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typings.spectacle.spectacleStrings.slide
  - typings.spectacle.spectacleStrings.zoom
  - typings.spectacle.spectacleStrings.fade
  - typings.spectacle.spectacleStrings.spin
*/
trait transitionType extends js.Object

object transitionType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def fade: typings.spectacle.spectacleStrings.fade = this.cast("fade")
  @scala.inline
  def slide: typings.spectacle.spectacleStrings.slide = this.cast("slide")
  @scala.inline
  def spin: typings.spectacle.spectacleStrings.spin = this.cast("spin")
  @scala.inline
  def zoom: typings.spectacle.spectacleStrings.zoom = this.cast("zoom")
}

