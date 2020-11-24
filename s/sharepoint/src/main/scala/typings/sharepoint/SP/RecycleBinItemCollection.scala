package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RecycleBinItemCollection extends ClientObjectCollection[RecycleBinItem] {
  
  def deleteAll(): Unit = js.native
  
  def getById(id: Guid): RecycleBinItem = js.native
  
  def get_item(index: Double): RecycleBinItem = js.native
  
  def itemAt(index: Double): RecycleBinItem = js.native
  
  def restoreAll(): Unit = js.native
}
