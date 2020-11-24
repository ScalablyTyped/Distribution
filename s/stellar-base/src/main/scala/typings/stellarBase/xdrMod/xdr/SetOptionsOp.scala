package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetOptionsOp extends js.Object {
  
  def clearFlags(): Null | Double = js.native
  def clearFlags(value: Double): Null | Double = js.native
  
  def highThreshold(): Null | Double = js.native
  def highThreshold(value: Double): Null | Double = js.native
  
  def homeDomain(): Null | String | Buffer = js.native
  def homeDomain(value: String): Null | String | Buffer = js.native
  def homeDomain(value: Buffer): Null | String | Buffer = js.native
  
  def inflationDest(): Null | AccountId = js.native
  def inflationDest(value: AccountId): Null | AccountId = js.native
  
  def lowThreshold(): Null | Double = js.native
  def lowThreshold(value: Double): Null | Double = js.native
  
  def masterWeight(): Null | Double = js.native
  def masterWeight(value: Double): Null | Double = js.native
  
  def medThreshold(): Null | Double = js.native
  def medThreshold(value: Double): Null | Double = js.native
  
  def setFlags(): Null | Double = js.native
  def setFlags(value: Double): Null | Double = js.native
  
  def signer(): Null | Signer = js.native
  def signer(value: Signer): Null | Signer = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
