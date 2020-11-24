package typings.rsvp.mod.RSVP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait State extends js.Object
// RSVP supplies status for promises in certain places.
@JSImport("rsvp", "RSVP.State")
@js.native
object State extends js.Object {
  
  @js.native
  sealed trait fulfilled extends State
  
  @js.native
  sealed trait pending extends State
  
  @js.native
  sealed trait rejected extends State
}
