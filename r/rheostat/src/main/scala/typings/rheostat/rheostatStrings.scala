package typings.rheostat

import typings.rheostat.mod.Orientation
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rheostatStrings {
  @js.native
  sealed trait horizontal extends Orientation
  
  @js.native
  sealed trait vertical extends Orientation
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

