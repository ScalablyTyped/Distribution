package typings
package seenLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Listener extends js.Object {
  def on(`type`: java.lang.String, listener: stdLib.EventListener): seenLib.seenMod.EventsNs.Dispatcher
}

object Anon_Listener {
  @scala.inline
  def apply(on: (java.lang.String, stdLib.EventListener) => seenLib.seenMod.EventsNs.Dispatcher): Anon_Listener = {
    val __obj = js.Dynamic.literal(on = js.Any.fromFunction2(on))
  
    __obj.asInstanceOf[Anon_Listener]
  }
}

