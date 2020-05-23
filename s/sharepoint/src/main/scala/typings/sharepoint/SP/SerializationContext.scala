package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SerializationContext extends js.Object {
  def addClientObject(obj: ClientObject): Unit
  def addObjectPath(path: ObjectPath): Unit
}

object SerializationContext {
  @scala.inline
  def apply(addClientObject: ClientObject => Unit, addObjectPath: ObjectPath => Unit): SerializationContext = {
    val __obj = js.Dynamic.literal(addClientObject = js.Any.fromFunction1(addClientObject), addObjectPath = js.Any.fromFunction1(addObjectPath))
    __obj.asInstanceOf[SerializationContext]
  }
}

