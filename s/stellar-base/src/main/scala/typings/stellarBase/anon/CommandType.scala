package typings.stellarBase.anon

import typings.stellarBase.xdrMod.xdr.Curve25519Public
import typings.stellarBase.xdrMod.xdr.SurveyMessageCommandType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandType extends js.Object {
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
  implicit class CommandTypeOps[Self <: CommandType] (val x: Self) extends AnyVal {
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
    def setEncryptionKey(value: Curve25519Public): Self = this.set("encryptionKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setLedgerNum(value: Double): Self = this.set("ledgerNum", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurveyedPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = this.set("surveyedPeerId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSurveyorPeerId(value: typings.stellarBase.xdrMod.xdr.NodeId): Self = this.set("surveyorPeerId", value.asInstanceOf[js.Any])
  }
  
}

