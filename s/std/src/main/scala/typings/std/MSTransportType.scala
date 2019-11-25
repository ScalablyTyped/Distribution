package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.std.stdStrings.Embedded
  - typings.std.stdStrings.USB
  - typings.std.stdStrings.NFC
  - typings.std.stdStrings.BT
*/
trait MSTransportType extends js.Object

object MSTransportType {
  @scala.inline
  def BT: typings.std.stdStrings.BT = this.cast("BT")
  @scala.inline
  def Embedded: typings.std.stdStrings.Embedded = this.cast("Embedded")
  @scala.inline
  def NFC: typings.std.stdStrings.NFC = this.cast("NFC")
  @scala.inline
  def USB: typings.std.stdStrings.USB = this.cast("USB")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

