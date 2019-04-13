package typings
package rsvpLib.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "hash")
@js.native
object hash extends js.Object {
  def apply[T](
    `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ rsvpLib.rsvpLibStrings.hash with T
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
  def apply[T](
    `object`: /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ rsvpLib.rsvpLibStrings.hash with T,
    label: java.lang.String
  ): rsvpLib.rsvpMod.RSVPNs.Promise[T] = js.native
}

