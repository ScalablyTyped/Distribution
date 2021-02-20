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
trait SurveyResponseMessage extends StObject {
  
  def commandType(): SurveyMessageCommandType = js.native
  def commandType(value: SurveyMessageCommandType): SurveyMessageCommandType = js.native
  
  def encryptedBody(): Buffer = js.native
  def encryptedBody(value: Buffer): Buffer = js.native
  
  def ledgerNum(): Double = js.native
  def ledgerNum(value: Double): Double = js.native
  
  def surveyedPeerId(): NodeId = js.native
  def surveyedPeerId(value: NodeId): NodeId = js.native
  
  def surveyorPeerId(): NodeId = js.native
  def surveyorPeerId(value: NodeId): NodeId = js.native
  
  def toXDR(): Buffer = js.native
  @JSName("toXDR")
  def toXDR_base64(format: base64): String = js.native
  @JSName("toXDR")
  def toXDR_hex(format: hex): String = js.native
  @JSName("toXDR")
  def toXDR_raw(format: raw): Buffer = js.native
}
