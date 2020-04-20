package typings.spectacle.mod

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
  def fade: typings.spectacle.spectacleStrings.fade = "fade".asInstanceOf[typings.spectacle.spectacleStrings.fade]
  @scala.inline
  def slide: typings.spectacle.spectacleStrings.slide = "slide".asInstanceOf[typings.spectacle.spectacleStrings.slide]
  @scala.inline
  def spin: typings.spectacle.spectacleStrings.spin = "spin".asInstanceOf[typings.spectacle.spectacleStrings.spin]
  @scala.inline
  def zoom: typings.spectacle.spectacleStrings.zoom = "zoom".asInstanceOf[typings.spectacle.spectacleStrings.zoom]
}

