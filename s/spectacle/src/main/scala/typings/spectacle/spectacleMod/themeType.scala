package typings.spectacle.spectacleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Theme Types for CodePane in Spectacle
  */
/* Rewritten from type alias, can be one of: 
  - typings.spectacle.spectacleStrings.dark
  - typings.spectacle.spectacleStrings.light
  - typings.spectacle.spectacleStrings.external
*/
trait themeType extends js.Object

object themeType {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def dark: typings.spectacle.spectacleStrings.dark = this.cast("dark")
  @scala.inline
  def external: typings.spectacle.spectacleStrings.external = this.cast("external")
  @scala.inline
  def light: typings.spectacle.spectacleStrings.light = this.cast("light")
}

