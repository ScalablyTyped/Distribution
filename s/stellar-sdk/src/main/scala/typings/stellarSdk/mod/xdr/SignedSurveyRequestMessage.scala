package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarBase.anon.Request
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage")
@js.native
class SignedSurveyRequestMessage protected ()
  extends typings.stellarBase.mod.xdr.SignedSurveyRequestMessage {
  def this(attributes: Request) = this()
}
object SignedSurveyRequestMessage {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SignedSurveyRequestMessage.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.SignedSurveyRequestMessage, io: Buffer): Unit = js.native
}
