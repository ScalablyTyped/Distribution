package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericDimensionsListProperties width extend GenericProperties
  */
trait IGenericDimensionsListProperties
  extends StObject
     with IGenericProperties {
  
  var qDimensionListDef: IDimensionListDef
  
  @JSName("qInfo")
  var qInfo_IGenericDimensionsListProperties: IGenericDimensionListNxInfo
}
object IGenericDimensionsListProperties {
  
  inline def apply(qDimensionListDef: IDimensionListDef, qInfo: IGenericDimensionListNxInfo): IGenericDimensionsListProperties = {
    val __obj = js.Dynamic.literal(qDimensionListDef = qDimensionListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericDimensionsListProperties]
  }
  
  extension [Self <: IGenericDimensionsListProperties](x: Self) {
    
    inline def setQDimensionListDef(value: IDimensionListDef): Self = StObject.set(x, "qDimensionListDef", value.asInstanceOf[js.Any])
    
    inline def setQInfo(value: IGenericDimensionListNxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
  }
}
