package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.BookmarkList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkListNxInfo width extend NxInfo
  */
trait IGenericBookmarkListNxInfo
  extends StObject
     with INxInfo {
  
  @JSName("qType")
  var qType_IGenericBookmarkListNxInfo: BookmarkList
}
object IGenericBookmarkListNxInfo {
  
  inline def apply(): IGenericBookmarkListNxInfo = {
    val __obj = js.Dynamic.literal(qType = "BookmarkList")
    __obj.asInstanceOf[IGenericBookmarkListNxInfo]
  }
  
  extension [Self <: IGenericBookmarkListNxInfo](x: Self) {
    
    inline def setQType(value: BookmarkList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
