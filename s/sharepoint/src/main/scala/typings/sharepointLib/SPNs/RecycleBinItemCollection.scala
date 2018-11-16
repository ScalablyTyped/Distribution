package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecycleBinItemCollection extends ClientObjectCollection[RecycleBinItem] {
  def deleteAll(): scala.Unit = js.native
  def getById(id: Guid): RecycleBinItem = js.native
  def get_item(index: scala.Double): RecycleBinItem = js.native
  def itemAt(index: scala.Double): RecycleBinItem = js.native
  def restoreAll(): scala.Unit = js.native
}

