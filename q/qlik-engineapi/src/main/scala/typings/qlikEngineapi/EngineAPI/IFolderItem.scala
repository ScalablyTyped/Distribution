package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FolderItem...
  */
@js.native
trait IFolderItem extends js.Object {
  
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
  implicit class IFolderItemOps[Self <: IFolderItem] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setQName(value: String): Self = this.set("qName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQType(value: FolderItemType): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
}
