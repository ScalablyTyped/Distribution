package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupCollection extends ClientObjectCollection[Group] {
  def add(parameters: GroupCreationInformation): Group = js.native
  def getById(id: scala.Double): Group = js.native
  def getByName(name: java.lang.String): Group = js.native
  def get_item(index: scala.Double): Group = js.native
  def itemAt(index: scala.Double): Group = js.native
  def remove(group: Group): scala.Unit = js.native
  def removeById(id: scala.Double): scala.Unit = js.native
  def removeByLoginName(loginName: java.lang.String): scala.Unit = js.native
}

