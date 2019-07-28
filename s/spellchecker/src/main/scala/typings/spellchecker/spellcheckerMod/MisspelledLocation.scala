package typings.spellchecker.spellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MisspelledLocation extends js.Object {
  var end: Double
  var start: Double
}

object MisspelledLocation {
  @scala.inline
  def apply(end: Double, start: Double): MisspelledLocation = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[MisspelledLocation]
  }
}

