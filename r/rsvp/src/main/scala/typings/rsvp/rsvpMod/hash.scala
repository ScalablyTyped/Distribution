package typings.rsvp.rsvpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rsvp", "hash")
@js.native
object hash extends js.Object {
  def apply[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.rsvp.rsvpStrings.hash with T
  ): typings.rsvp.rsvpMod.RSVP.Promise[T] = js.native
  def apply[T](
    `object`: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: rsvp.rsvp.RSVP.Arg<T[P]>}
    */ typings.rsvp.rsvpStrings.hash with T,
    label: String
  ): typings.rsvp.rsvpMod.RSVP.Promise[T] = js.native
}

