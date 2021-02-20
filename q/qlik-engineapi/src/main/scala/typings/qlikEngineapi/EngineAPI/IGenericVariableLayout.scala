package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Is the layout for GenericVariableProperties.
  */
@js.native
trait IGenericVariableLayout extends IGenericBaseLayout {
  
  /**
    * If set to true, it means that the variable was defined via script.
    */
  var qIsScriptCreated: Boolean = js.native
  
  /**
    * A value.
    */
  var qNum: Double = js.native
  
  /**
    * Some text.
    */
  var qText: String = js.native
}
object IGenericVariableLayout {
  
  @scala.inline
  def apply(qInfo: INxInfo, qIsScriptCreated: Boolean, qMeta: INxMeta, qNum: Double, qText: String): IGenericVariableLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qIsScriptCreated = qIsScriptCreated.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any], qNum = qNum.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericVariableLayout]
  }
  
  @scala.inline
  implicit class IGenericVariableLayoutMutableBuilder[Self <: IGenericVariableLayout] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQIsScriptCreated(value: Boolean): Self = StObject.set(x, "qIsScriptCreated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQNum(value: Double): Self = StObject.set(x, "qNum", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
