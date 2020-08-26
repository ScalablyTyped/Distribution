package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * InteractDef
  */
@js.native
trait IInteractDef extends js.Object {
  /**
    * Buttons displayed in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    * One of:
    *
    * - 0 means that the qButtons property is not relevant.
    * - 17 means that the message box contains the OK and Cancel buttons or the stop-sign icon.
    */
  var qButtons: js.UndefOr[Double] = js.native
  /**
    * This property is set to true if the returned statement is an hidden script statement.
    */
  var qHidden: js.UndefOr[Boolean] = js.native
  /**
    * Is not used in Qlik Sense.
    */
  var qInput: js.UndefOr[String] = js.native
  /**
    * Next script statement to be executed.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qLine: js.UndefOr[String] = js.native
  /**
    * Message used in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    */
  var qMsg: js.UndefOr[String] = js.native
  /**
    * First line number of the next statement to be executed.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qNewLineNr: js.UndefOr[Double] = js.native
  /**
    * First line number of the previously executed statement.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qOldLineNr: js.UndefOr[Double] = js.native
  /**
    * Path specified by the Include script variable.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    * Example of an Include variable:
    *
    * $(Include=lib:\\MyDataFiles\abc.txt);
    */
  var qPath: js.UndefOr[String] = js.native
  /**
    * Not relevant for describing the requested user interaction.
    */
  var qResult: Double = js.native
  /**
    * Title used in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    */
  var qTitle: js.UndefOr[String] = js.native
  /**
    * Interaction type.
    */
  var qType: js.UndefOr[InteractionType] = js.native
}

object IInteractDef {
  @scala.inline
  def apply(qResult: Double): IInteractDef = {
    val __obj = js.Dynamic.literal(qResult = qResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractDef]
  }
  @scala.inline
  implicit class IInteractDefOps[Self <: IInteractDef] (val x: Self) extends AnyVal {
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
    def setQResult(value: Double): Self = this.set("qResult", value.asInstanceOf[js.Any])
    @scala.inline
    def setQButtons(value: Double): Self = this.set("qButtons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQButtons: Self = this.set("qButtons", js.undefined)
    @scala.inline
    def setQHidden(value: Boolean): Self = this.set("qHidden", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQHidden: Self = this.set("qHidden", js.undefined)
    @scala.inline
    def setQInput(value: String): Self = this.set("qInput", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQInput: Self = this.set("qInput", js.undefined)
    @scala.inline
    def setQLine(value: String): Self = this.set("qLine", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQLine: Self = this.set("qLine", js.undefined)
    @scala.inline
    def setQMsg(value: String): Self = this.set("qMsg", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQMsg: Self = this.set("qMsg", js.undefined)
    @scala.inline
    def setQNewLineNr(value: Double): Self = this.set("qNewLineNr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQNewLineNr: Self = this.set("qNewLineNr", js.undefined)
    @scala.inline
    def setQOldLineNr(value: Double): Self = this.set("qOldLineNr", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQOldLineNr: Self = this.set("qOldLineNr", js.undefined)
    @scala.inline
    def setQPath(value: String): Self = this.set("qPath", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQPath: Self = this.set("qPath", js.undefined)
    @scala.inline
    def setQTitle(value: String): Self = this.set("qTitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQTitle: Self = this.set("qTitle", js.undefined)
    @scala.inline
    def setQType(value: InteractionType): Self = this.set("qType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQType: Self = this.set("qType", js.undefined)
  }
  
}

