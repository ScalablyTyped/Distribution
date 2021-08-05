package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkListProperties width extend GenericProperties
  */
trait IGenericBookmarkListProperties
  extends StObject
     with IGenericProperties {
  
  var qBookmarkListDef: IBookmarkListDef
  
  @JSName("qInfo")
  var qInfo_IGenericBookmarkListProperties: IGenericBookmarkListNxInfo
}
object IGenericBookmarkListProperties {
  
  inline def apply(qBookmarkListDef: IBookmarkListDef, qInfo: IGenericBookmarkListNxInfo): IGenericBookmarkListProperties = {
    val __obj = js.Dynamic.literal(qBookmarkListDef = qBookmarkListDef.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkListProperties]
  }
  
  extension [Self <: IGenericBookmarkListProperties](x: Self) {
    
    inline def setQBookmarkListDef(value: IBookmarkListDef): Self = StObject.set(x, "qBookmarkListDef", value.asInstanceOf[js.Any])
    
    inline def setQInfo(value: IGenericBookmarkListNxInfo): Self = StObject.set(x, "qInfo", value.asInstanceOf[js.Any])
  }
}
