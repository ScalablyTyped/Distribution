package typings.stellarBase.anon

import typings.node.Buffer
import typings.stellarBase.xdrMod.xdr.SurveyMessageCommandType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EncryptedBody extends js.Object {
  
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
  implicit class EncryptedBodyOps[Self <: EncryptedBody] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCommandType(value: SurveyMessageCommandType): Self = this.set("commandType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEncryptedBody(value: Buffer): Self = this.set("encryptedBody", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLedgerNum(value: Double): Self = this.set("ledgerNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyedPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = this.set("surveyedPeerId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSurveyorPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = this.set("surveyorPeerId", value.asInstanceOf[js.Any])
  }
}
