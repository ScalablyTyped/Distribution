package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LedgerEntryChange extends js.Object {
  def created(): LedgerEntry = js.native
  def created(value: LedgerEntry): LedgerEntry = js.native
  def removed(): LedgerKey = js.native
  def removed(value: LedgerKey): LedgerKey = js.native
  def state(): LedgerEntry = js.native
  def state(value: LedgerEntry): LedgerEntry = js.native
  def switch(): LedgerEntryChangeType = js.native
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  def updated(): LedgerEntry = js.native
  def updated(value: LedgerEntry): LedgerEntry = js.native
  def value(): LedgerEntry | LedgerKey = js.native
}

