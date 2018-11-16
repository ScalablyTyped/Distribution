package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserCollection extends ClientObjectCollection[User] {
  def add(parameters: UserCreationInformation): User = js.native
  def addUser(user: User): User = js.native
  def getByEmail(emailAddress: java.lang.String): User = js.native
  def getById(id: scala.Double): User = js.native
  def getByLoginName(loginName: java.lang.String): User = js.native
  def get_item(index: scala.Double): User = js.native
  def itemAt(index: scala.Double): User = js.native
  def remove(user: User): scala.Unit = js.native
  def removeById(id: scala.Double): scala.Unit = js.native
  def removeByLoginName(loginName: java.lang.String): scala.Unit = js.native
}

