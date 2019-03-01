package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qName: java.lang.String
  /**
    * Type of the folder item.
    */
  var qType: FolderItemType
}

object IFolderItem {
  @scala.inline
  def apply(qName: java.lang.String, qType: FolderItemType): IFolderItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qName")(qName)
    __obj.updateDynamic("qType")(qType)
    __obj.asInstanceOf[IFolderItem]
  }
}

