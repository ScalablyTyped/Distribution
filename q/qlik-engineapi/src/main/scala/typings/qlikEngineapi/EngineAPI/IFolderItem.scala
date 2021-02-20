package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FolderItem...
  */
@js.native
trait IFolderItem extends StObject {
  
  /**
    * Name of the folder item.
    */
  var qName: String = js.native
  
  /**
    * Type of the folder item.
    */
  var qType: FolderItemType = js.native
}
object IFolderItem {
  
  @scala.inline
  def apply(qName: String, qType: FolderItemType): IFolderItem = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFolderItem]
  }
  
  @scala.inline
  implicit class IFolderItemMutableBuilder[Self <: IFolderItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQName(value: String): Self = StObject.set(x, "qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: FolderItemType): Self = StObject.set(x, "qType", value.asInstanceOf[js.Any])
  }
}
