package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.BookmarkList
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * GenericBookmarkListNxInfo width extend NxInfo
  */
@js.native
trait IGenericBookmarkListNxInfo extends INxInfo {
  
  @JSName("qType")
  var qType_IGenericBookmarkListNxInfo: BookmarkList = js.native
}
object IGenericBookmarkListNxInfo {
  
  @scala.inline
  def apply(qType: BookmarkList): IGenericBookmarkListNxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IGenericBookmarkListNxInfo]
  }
  
  @scala.inline
  implicit class IGenericBookmarkListNxInfoMutableBuilder[Self <: IGenericBookmarkListNxInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQType(value: BookmarkList): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
