package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * InteractDef
  */
trait IInteractDef extends StObject {
  
  /**
    * Buttons displayed in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    * One of:
    *
    * - 0 means that the qButtons property is not relevant.
    * - 17 means that the message box contains the OK and Cancel buttons or the stop-sign icon.
    */
  var qButtons: js.UndefOr[Double] = js.undefined
  
  /**
    * This property is set to true if the returned statement is an hidden script statement.
    */
  var qHidden: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Is not used in Qlik Sense.
    */
  var qInput: js.UndefOr[String] = js.undefined
  
  /**
    * Next script statement to be executed.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qLine: js.UndefOr[String] = js.undefined
  
  /**
    * Message used in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    */
  var qMsg: js.UndefOr[String] = js.undefined
  
  /**
    * First line number of the next statement to be executed.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qNewLineNr: js.UndefOr[Double] = js.undefined
  
  /**
    * First line number of the previously executed statement.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    */
  var qOldLineNr: js.UndefOr[Double] = js.undefined
  
  /**
    * Path specified by the Include script variable.
    * This property is used if the type of interaction is IT_SCRIPTLINE.
    * Example of an Include variable:
    *
    * $(Include=lib:\\MyDataFiles\abc.txt);
    */
  var qPath: js.UndefOr[String] = js.undefined
  
  /**
    * Not relevant for describing the requested user interaction.
    */
  var qResult: Double
  
  /**
    * Title used in the message box dialog.
    * This property is relevant if qType is IT_MSGBOX.
    */
  var qTitle: js.UndefOr[String] = js.undefined
  
  /**
    * Interaction type.
    */
  var qType: js.UndefOr[InteractionType] = js.undefined
}
object IInteractDef {
  
  inline def apply(qResult: Double): IInteractDef = {
    val __obj = js.Dynamic.literal(qResult = qResult.asInstanceOf[js.Any])
    __obj.asInstanceOf[IInteractDef]
  }
  
  extension [Self <: IInteractDef](x: Self) {
    
    inline def setQButtons(value: Double): Self = StObject.set(x, "qButtons", value.asInstanceOf[js.Any])
    
    inline def setQButtonsUndefined: Self = StObject.set(x, "qButtons", js.undefined)
    
    inline def setQHidden(value: Boolean): Self = StObject.set(x, "qHidden", value.asInstanceOf[js.Any])
    
    inline def setQHiddenUndefined: Self = StObject.set(x, "qHidden", js.undefined)
    
    inline def setQInput(value: String): Self = StObject.set(x, "qInput", value.asInstanceOf[js.Any])
    
    inline def setQInputUndefined: Self = StObject.set(x, "qInput", js.undefined)
    
    inline def setQLine(value: String): Self = StObject.set(x, "qLine", value.asInstanceOf[js.Any])
    
    inline def setQLineUndefined: Self = StObject.set(x, "qLine", js.undefined)
    
    inline def setQMsg(value: String): Self = StObject.set(x, "qMsg", value.asInstanceOf[js.Any])
    
    inline def setQMsgUndefined: Self = StObject.set(x, "qMsg", js.undefined)
    
    inline def setQNewLineNr(value: Double): Self = StObject.set(x, "qNewLineNr", value.asInstanceOf[js.Any])
    
    inline def setQNewLineNrUndefined: Self = StObject.set(x, "qNewLineNr", js.undefined)
    
    inline def setQOldLineNr(value: Double): Self = StObject.set(x, "qOldLineNr", value.asInstanceOf[js.Any])
    
    inline def setQOldLineNrUndefined: Self = StObject.set(x, "qOldLineNr", js.undefined)
    
    inline def setQPath(value: String): Self = StObject.set(x, "qPath", value.asInstanceOf[js.Any])
    
    inline def setQPathUndefined: Self = StObject.set(x, "qPath", js.undefined)
    
    inline def setQResult(value: Double): Self = StObject.set(x, "qResult", value.asInstanceOf[js.Any])
    
    inline def setQTitle(value: String): Self = StObject.set(x, "qTitle", value.asInstanceOf[js.Any])
    
    inline def setQTitleUndefined: Self = StObject.set(x, "qTitle", js.undefined)
    
    inline def setQType(value: InteractionType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
    
    inline def setQTypeUndefined: Self = StObject.set(x, "qType", js.undefined)
  }
}
