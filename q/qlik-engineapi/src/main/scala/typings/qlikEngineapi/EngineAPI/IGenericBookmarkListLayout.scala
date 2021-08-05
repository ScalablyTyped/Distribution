package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkListLayout width extend GenericBaseLayout
  */
trait IGenericBookmarkListLayout
  extends StObject
     with IGenericBaseLayout {
  
  var qBookmarkList: IBookmarkList
}
object IGenericBookmarkListLayout {
  
  inline def apply(qBookmarkList: IBookmarkList, qInfo: INxInfo, qMeta: INxMeta): IGenericBookmarkListLayout = {
    val __obj = js.Dynamic.literal(qBookmarkList = qBookmarkList.asInstanceOf[js.Any], qInfo = qInfo.asInstanceOf[js.Any], qMeta = qMeta.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkListLayout]
  }
  
  extension [Self <: IGenericBookmarkListLayout](x: Self) {
    
    inline def setQBookmarkList(value: IBookmarkList): Self = StObject.set(x, "qBookmarkList", value.asInstanceOf[js.Any])
  }
}
