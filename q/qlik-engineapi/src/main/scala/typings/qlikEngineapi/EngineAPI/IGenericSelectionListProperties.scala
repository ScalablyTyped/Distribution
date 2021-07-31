package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericSelectionListProperties width extend GenericObjectProperties
  */
trait IGenericSelectionListProperties
  extends StObject
     with IGenericObjectProperties {
  
  @JSName("qInfo")
  var qInfo_IGenericSelectionListProperties: IGenericSelectionNxInfo
  
  var qSelectionObjectDef: js.Any
}
object IGenericSelectionListProperties {
  
  @scala.inline
  def apply(qInfo: IGenericSelectionNxInfo, qSelectionObjectDef: js.Any): IGenericSelectionListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qSelectionObjectDef = qSelectionObjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionListProperties]
  }
  
  @scala.inline
  implicit class IGenericSelectionListPropertiesMutableBuilder[Self <: IGenericSelectionListProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQInfo(value: IGenericSelectionNxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSelectionObjectDef(value: js.Any): Self = StObject.set(x, "qSelectionObjectDef", value.asInstanceOf[js.Any])
  }
}
