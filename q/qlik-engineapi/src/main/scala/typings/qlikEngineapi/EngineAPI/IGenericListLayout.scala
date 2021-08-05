package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericListLayout...
  */
trait IGenericListLayout
  extends StObject
     with IGenericBaseLayout {
  
  var qListObject: IListObject
}
object IGenericListLayout {
  
  inline def apply(qInfo: INxInfo, qListObject: IListObject, qMeta: INxMeta): IGenericListLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qListObject = qListObject.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericListLayout]
  }
  
  extension [Self <: IGenericListLayout](x: Self) {
    
    inline def setQListObject(value: IListObject): Self = StObject.set(x, "qListObject", value.asInstanceOf[js.Any])
  }
}
