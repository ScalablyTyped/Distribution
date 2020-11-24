package typings.rsvp.mod

import typings.rsvp.mod.RSVP.Deferred
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsvp", "defer")
@js.native
object defer extends js.Object {
  
  def apply[T](): Deferred[T] = js.native
  def apply[T](label: String): Deferred[T] = js.native
}
