package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCollection extends ClientObjectCollection[Group] {
  def add(parameters: GroupCreationInformation): Group = js.native
  def getById(id: Double): Group = js.native
  def getByName(name: String): Group = js.native
  def get_item(index: Double): Group = js.native
  def itemAt(index: Double): Group = js.native
  def remove(group: Group): Unit = js.native
  def removeById(id: Double): Unit = js.native
  def removeByLoginName(loginName: String): Unit = js.native
}

