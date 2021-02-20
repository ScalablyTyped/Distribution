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
trait ClaimPredicate extends StObject {
  
  def absBefore(): Int64 = js.native
  def absBefore(value: Int64): Int64 = js.native
  
  def andPredicates(): js.Array[ClaimPredicate] = js.native
  def andPredicates(value: js.Array[ClaimPredicate]): js.Array[ClaimPredicate] = js.native
  
  def notPredicate(): Null | ClaimPredicate = js.native
  def notPredicate(value: ClaimPredicate): Null | ClaimPredicate = js.native
  
  def orPredicates(): js.Array[ClaimPredicate] = js.native
  def orPredicates(value: js.Array[ClaimPredicate]): js.Array[ClaimPredicate] = js.native
  
  def relBefore(): Int64 = js.native
  def relBefore(value: Int64): Int64 = js.native
  
  def switch(): ClaimPredicateType = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
  
  def value(): js.Array[ClaimPredicate] | Null | ClaimPredicate | Int64 | Unit = js.native
}
