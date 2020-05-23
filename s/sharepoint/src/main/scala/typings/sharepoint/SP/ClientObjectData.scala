package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientObjectData extends js.Object {
  def get_clientObjectProperties(): js.Any
  def get_methodReturnObjects(): js.Any
  def get_properties(): js.Any
}

object ClientObjectData {
  @scala.inline
  def apply(
    get_clientObjectProperties: () => js.Any,
    get_methodReturnObjects: () => js.Any,
    get_properties: () => js.Any
  ): ClientObjectData = {
    val __obj = js.Dynamic.literal(get_clientObjectProperties = js.Any.fromFunction0(get_clientObjectProperties), get_methodReturnObjects = js.Any.fromFunction0(get_methodReturnObjects), get_properties = js.Any.fromFunction0(get_properties))
    __obj.asInstanceOf[ClientObjectData]
  }
}

