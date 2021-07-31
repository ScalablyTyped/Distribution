package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * List of of content files (Information about the list of content files)
  */
trait IStaticContentList extends StObject {
  
  var qItems: IStaticContentListItem
}
object IStaticContentList {
  
  @scala.inline
  def apply(qItems: IStaticContentListItem): IStaticContentList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IStaticContentList]
  }
  
  @scala.inline
  implicit class IStaticContentListMutableBuilder[Self <: IStaticContentList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQItems(value: IStaticContentListItem): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
  }
}
