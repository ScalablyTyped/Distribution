package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * ContentLibraryList...
  */
trait IContentLibraryList extends StObject {
  
  /**
    * Information about the content library.
    */
  var qItems: IContentLibraryListItem
}
object IContentLibraryList {
  
  @scala.inline
  def apply(qItems: IContentLibraryListItem): IContentLibraryList = {
    val __obj = js.Dynamic.literal(qItems = qItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContentLibraryList]
  }
  
  @scala.inline
  implicit class IContentLibraryListMutableBuilder[Self <: IContentLibraryList] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQItems(value: IContentLibraryListItem): Self = StObject.set(x, "qItems", value.asInstanceOf[js.Any])
  }
}
