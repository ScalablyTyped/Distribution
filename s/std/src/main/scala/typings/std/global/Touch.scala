package typings.std.global

import org.scalablytyped.runtime.Instantiable1
import typings.std.TouchInit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Touch")
@js.native
class Touch protected ()
  extends typings.std.Touch {
  def this(touchInitDict: TouchInit) = this()
}

@JSGlobal("Touch")
@js.native
object Touch
  extends Instantiable1[/* touchInitDict */ TouchInit, typings.std.Touch]

