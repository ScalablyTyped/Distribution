package typings.stellarSdk.mod.xdr

import typings.node.Buffer
import typings.stellarSdk.stellarSdkStrings.base64
import typings.stellarSdk.stellarSdkStrings.hex
import typings.stellarSdk.stellarSdkStrings.raw
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("stellar-sdk", "xdr.SurveyResponseBody")
@js.native
class SurveyResponseBody ()
  extends typings.stellarBase.mod.xdr.SurveyResponseBody
object SurveyResponseBody {
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.fromXDR")
  @js.native
  def fromXDR(input: Buffer): typings.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.fromXDR")
  @js.native
  def fromXDR_base64(input: String, format: base64): typings.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.fromXDR")
  @js.native
  def fromXDR_hex(input: String, format: hex): typings.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.fromXDR")
  @js.native
  def fromXDR_raw(input: Buffer, format: raw): typings.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.isValid")
  @js.native
  def isValid(value: typings.stellarBase.xdrMod.xdr.SurveyResponseBody): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.read")
  @js.native
  def read(io: Buffer): typings.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.surveyTopology")
  @js.native
  def surveyTopology(value: typings.stellarBase.xdrMod.xdr.TopologyResponseBody): typings.stellarBase.xdrMod.xdr.SurveyResponseBody = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.toXDR")
  @js.native
  def toXDR(value: typings.stellarBase.xdrMod.xdr.SurveyResponseBody): Buffer = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.validateXDR")
  @js.native
  def validateXDR(input: Buffer): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.validateXDR")
  @js.native
  def validateXDR_base64(input: String, format: base64): Boolean = js.native
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.validateXDR")
  @js.native
  def validateXDR_hex(input: String, format: hex): Boolean = js.native
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.validateXDR")
  @js.native
  def validateXDR_raw(input: Buffer, format: raw): Boolean = js.native
  
  /* static member */
  @JSImport("stellar-sdk", "xdr.SurveyResponseBody.write")
  @js.native
  def write(value: typings.stellarBase.xdrMod.xdr.SurveyResponseBody, io: Buffer): Unit = js.native
}
