package typings
package rheostatLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object rheostatLibStrings {
  @js.native
  sealed trait horizontal
    extends rheostatLib.rheostatMod.Orientation
  
  @js.native
  sealed trait vertical
    extends rheostatLib.rheostatMod.Orientation
  
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  @scala.inline
  def vertical: vertical = "vertical".asInstanceOf[vertical]
}

