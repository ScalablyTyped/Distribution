package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FolderItem...
  */
trait IFolderItem extends js.Object {
  /**
    * Name of the folder item.
    */
  var qName: String
  /**
    * Type of the folder item.
    */
  var qType: FolderItemType
}

object IFolderItem {
  @scala.inline
  def apply(qName: String, qType: FolderItemType): IFolderItem = {
    val __obj = js.Dynamic.literal(qName = qName, qType = qType)
  
    __obj.asInstanceOf[IFolderItem]
  }
}

