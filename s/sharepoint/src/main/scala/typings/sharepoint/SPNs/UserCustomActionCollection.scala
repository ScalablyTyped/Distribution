package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserCustomActionCollection extends ClientObjectCollection[UserCustomAction] {
  def add(): UserCustomAction = js.native
  def clear(): Unit = js.native
  def getById(id: Guid): UserCustomAction = js.native
  def get_item(index: Double): UserCustomAction = js.native
  def itemAt(index: Double): UserCustomAction = js.native
}

