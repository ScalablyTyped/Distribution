package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBaseLayout...
  */
trait IGenericBaseLayout extends StObject {
  
  var qInfo: INxInfo
  
  var qMeta: INxMeta
}
object IGenericBaseLayout {
  
  inline def apply(qInfo: INxInfo, qMeta: INxMeta): IGenericBaseLayout = {
    val __obj = js.Dynamic.literal(qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBaseLayout]
  }
  
  extension [Self <: IGenericBaseLayout](x: Self) {
    
    inline def setQInfo(value: INxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
    
    inline def setQMeta(value: INxMeta): Self = StObject.set(x, "qMeta", value.asInstanceOf[js.Any])
  }
}
