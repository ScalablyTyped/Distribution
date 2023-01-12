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
  
  var qSelectionObjectDef: Any
}
object IGenericSelectionListProperties {
  
  inline def apply(qInfo: IGenericSelectionNxInfo, qSelectionObjectDef: Any): IGenericSelectionListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qSelectionObjectDef = qSelectionObjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericSelectionListProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IGenericSelectionListProperties] (val x: Self) extends AnyVal {
    
    inline def setQInfo(value: IGenericSelectionNxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    inline def setQSelectionObjectDef(value: Any): Self = StObject.set(x, "qSelectionObjectDef", value.asInstanceOf[js.Any])
  }
}
