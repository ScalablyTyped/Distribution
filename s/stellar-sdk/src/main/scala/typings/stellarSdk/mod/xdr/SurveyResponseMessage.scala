package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.SurveyResponseMessage")
@js.native
class SurveyResponseMessage protected ()
  extends typings.stellarBase.mod.xdr.SurveyResponseMessage {
  def this(attributes: typings.stellarBase.anon.EncryptedBody) = this()
}
object SurveyResponseMessage {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.SurveyResponseMessage): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.SurveyResponseMessage = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.SurveyResponseMessage): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseMessage.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.SurveyResponseMessage, io: Buffer): Unit = js.native
}
