package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Curve25519Public
import typings.stellarBase.xdrMod.xdr.SurveyMessageCommandType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandType extends StObject {
  
  var commandType: SurveyMessageCommandType = js.native
  
  var encryptionKey: Curve25519Public = js.native
  
  var ledgerNum: Double = js.native
  
  var surveyedPeerId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
  
  var surveyorPeerId: typings.stellarBase.xdrMod.xdr.NodeId = js.native
}
object CommandType {
  
  @scala.inline
  def apply(
    commandType: SurveyMessageCommandType,
    encryptionKey: Curve25519Public,
    ledgerNum: Double,
    surveyedPeerId: typings.stellarBase.xdrMod.xdr.NodeId,
    surveyorPeerId: typings.stellarBase.xdrMod.xdr.NodeId
  ): CommandType = {
    val __obj = js.Dynamic.literal(commandType = commandType.asInstanceOf[js.Any], encryptionKey = encryptionKey.asInstanceOf[js.Any], ledgerNum = ledgerNum.asInstanceOf[js.Any], surveyedPeerId = surveyedPeerId.asInstanceOf[js.Any], surveyorPeerId = surveyorPeerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandType]
  }
  
  @scala.inline
  implicit class CommandTypeMutableBuilder[Self <: CommandType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommandType(value: SurveyMessageCommandType): Self = StObject.set(x, "commandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptionKey(value: Curve25519Public): Self = StObject.set(x, "encryptionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerNum(value: Double): Self = StObject.set(x, "ledgerNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyedPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = StObject.set(x, "surveyedPeerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyorPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = StObject.set(x, "surveyorPeerId", value.asInstanceOf[js.Any])
  }
}
