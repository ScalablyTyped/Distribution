package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserCollection extends ClientObjectCollection[User] {
  def add(parameters: UserCreationInformation): User = js.native
  def addUser(user: User): User = js.native
  def getByEmail(emailAddress: String): User = js.native
  def getById(id: Double): User = js.native
  def getByLoginName(loginName: String): User = js.native
  def get_item(index: Double): User = js.native
  def itemAt(index: Double): User = js.native
  def remove(user: User): Unit = js.native
  def removeById(id: Double): Unit = js.native
  def removeByLoginName(loginName: String): Unit = js.native
}

