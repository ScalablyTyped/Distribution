package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScpStatementPledges extends StObject {
  
  def confirm(): ScpStatementConfirm = js.native
  def confirm(value: ScpStatementConfirm): ScpStatementConfirm = js.native
  
  def externalize(): ScpStatementExternalize = js.native
  def externalize(value: ScpStatementExternalize): ScpStatementExternalize = js.native
  
  def nominate(): ScpNomination = js.native
  def nominate(value: ScpNomination): ScpNomination = js.native
  
  def prepare(): ScpStatementPrepare = js.native
  def prepare(value: ScpStatementPrepare): ScpStatementPrepare = js.native
  
  def switch(): ScpStatementType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): ScpStatementPrepare | ScpStatementConfirm | ScpStatementExternalize | ScpNomination = js.native
}
