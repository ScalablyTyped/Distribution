package typings.stellarBase.xdrMod.xdr

import typings.node.Buffer
import typings.stellarBase.stellarBaseStrings.base64
import typings.stellarBase.stellarBaseStrings.hex
import typings.stellarBase.stellarBaseStrings.raw
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScpStatementPrepare extends js.Object {
  
  def ballot(): ScpBallot = js.native
  def ballot(value: ScpBallot): ScpBallot = js.native
  
  def nC(): Double = js.native
  def nC(value: Double): Double = js.native
  
  def nH(): Double = js.native
  def nH(value: Double): Double = js.native
  
  def prepared(): Null | ScpBallot = js.native
  def prepared(value: ScpBallot): Null | ScpBallot = js.native
  
  def preparedPrime(): Null | ScpBallot = js.native
  def preparedPrime(value: ScpBallot): Null | ScpBallot = js.native
  
  def quorumSetHash(): Buffer = js.native
  def quorumSetHash(value: Buffer): Buffer = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
