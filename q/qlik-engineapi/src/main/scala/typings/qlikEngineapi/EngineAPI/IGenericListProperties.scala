package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericListProperties...
  */
trait IGenericListProperties
  extends StObject
     with IGenericProperties {
  
  var qListObjectDef: IListObjectDef
}
object IGenericListProperties {
  
  inline def apply(qInfo: INxInfo, qListObjectDef: IListObjectDef): IGenericListProperties = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qListObjectDef = qListObjectDef.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericListProperties]
  }
  
  extension [Self <: IGenericListProperties](x: Self) {
    
    inline def setQListObjectDef(value: IListObjectDef): Self = StObject.set(x, "qListObjectDef", value.asInstanceOf[js.Any])
  }
}
