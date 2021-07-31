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
  
  @scala.inline
  def apply(): IGenericBookmarkListNxInfo = {
    val __obj = js.Dynamic.literal(qType = "BookmarkList")
    __obj.asInstanceOf[IGenericBookmarkListNxInfo]
  }
  
  @scala.inline
  implicit class IGenericBookmarkListNxInfoMutableBuilder[Self <: IGenericBookmarkListNxInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQType(value: BookmarkList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
