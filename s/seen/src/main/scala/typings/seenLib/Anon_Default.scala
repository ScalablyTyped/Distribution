package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Default extends js.Object {
  def default(): seenLib.seenMod.Model
}

object Anon_Default {
  @scala.inline
  def apply(default: () => seenLib.seenMod.Model): Anon_Default = {
    val __obj = js.Dynamic.literal(default = js.Any.fromFunction0(default))
  
    __obj.asInstanceOf[Anon_Default]
  }
}

