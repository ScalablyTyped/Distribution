package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.bookmark
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * BookmarkListDef
  */
@js.native
trait IBookmarkListDef extends StObject {
  
  /**
    * Data typ JSON
    */
  var qData: js.Any = js.native
  
  /**
    * Type of the list
    */
  var qType: bookmark = js.native
}
object IBookmarkListDef {
  
  @scala.inline
  def apply(qData: js.Any, qType: bookmark): IBookmarkListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBookmarkListDef]
  }
  
  @scala.inline
  implicit class IBookmarkListDefMutableBuilder[Self <: IBookmarkListDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQData(value: js.Any): Self = StObject.set(x, "qData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: bookmark): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
