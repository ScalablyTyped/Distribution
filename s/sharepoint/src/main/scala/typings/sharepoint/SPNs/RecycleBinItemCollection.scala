package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecycleBinItemCollection extends ClientObjectCollection[RecycleBinItem] {
  def deleteAll(): Unit = js.native
  def getById(id: Guid): RecycleBinItem = js.native
  def get_item(index: Double): RecycleBinItem = js.native
  def itemAt(index: Double): RecycleBinItem = js.native
  def restoreAll(): Unit = js.native
}

