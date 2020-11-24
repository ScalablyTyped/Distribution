package typings.rsvp.mod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("rsvp", "race")
@js.native
object race extends js.Object {
  
  def apply[T](values: js.Array[T]): js.Promise[T] = js.native
  def apply[T](values: Iterable[T | js.Thenable[T]]): js.Promise[T] = js.native
}
