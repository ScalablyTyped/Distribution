package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.SurveyMessageCommandType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptedBody extends StObject {
  
  var commandType: SurveyMessageCommandType = js.native
  
  var encryptedBody: Buffer = js.native
  
  var ledgerNum: Double = js.native
  
  var surveyedPeerId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
  
  var surveyorPeerId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
}
object EncryptedBody {
  
  @scala.inline
  def apply(
    commandType: SurveyMessageCommandType,
    encryptedBody: Buffer,
    ledgerNum: Double,
    surveyedPeerId: typings.stellarBase.xdrMod.xdr.NodeId,
    surveyorPeerId: typings.stellarBase.xdrMod.xdr.NodeId
  ): EncryptedBody = {
    val __obj = js.Dynamic.literal(commandType = commandType.asInstanceOf[js.Any], encryptedBody = encryptedBody.asInstanceOf[js.Any], ledgerNum = ledgerNum.asInstanceOf[js.Any], surveyedPeerId = surveyedPeerId.asInstanceOf[js.Any], surveyorPeerId = surveyorPeerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EncryptedBody]
  }
  
  @scala.inline
  implicit class EncryptedBodyMutableBuilder[Self <: EncryptedBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandType(value: SurveyMessageCommandType): Self = StObject.set(x, "commandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedBody(value: Buffer): Self = StObject.set(x, "encryptedBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerNum(value: Double): Self = StObject.set(x, "ledgerNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyedPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = StObject.set(x, "surveyedPeerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyorPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = StObject.set(x, "surveyorPeerId", value.asInstanceOf[js.Any])
  }
}
