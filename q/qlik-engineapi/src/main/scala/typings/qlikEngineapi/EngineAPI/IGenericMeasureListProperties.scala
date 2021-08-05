package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * IGenericMeasureListProperties
  */
trait IGenericMeasureListProperties
  extends StObject
     with IGenericProperties {
  
  @JSName("qInfo")
  var qInfo_IGenericMeasureListProperties: IGenericMeassureListNxInfo
  
  var qMeasureListDef: IMeasureListDef
}
object IGenericMeasureListProperties {
  
  inline def apply(qInfo: IGenericMeassureListNxInfo, qMeasureListDef: IMeasureListDef): IGenericMeasureListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeasureListDef = qMeasureListDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericMeasureListProperties]
  }
  
  extension [Self <: IGenericMeasureListProperties](x: Self) {
    
    inline def setQInfo(value: IGenericMeassureListNxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    inline def setQMeasureListDef(value: IMeasureListDef): Self = StObject.set(x, "qMeasureListDef", value.asInstanceOf[js.Any])
  }
}
