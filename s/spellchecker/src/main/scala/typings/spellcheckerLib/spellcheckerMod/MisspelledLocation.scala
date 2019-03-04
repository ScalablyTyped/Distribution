package typings
package spellcheckerLib.spellcheckerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MisspelledLocation extends js.Object {
  var end: scala.Double
  var start: scala.Double
}

object MisspelledLocation {
  @scala.inline
  def apply(end: scala.Double, start: scala.Double): MisspelledLocation = {
    val __obj = js.Dynamic.literal(end = end, start = start)
  
    __obj.asInstanceOf[MisspelledLocation]
  }
}

