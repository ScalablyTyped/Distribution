package typings.sharepoint.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientObjectList")
@js.native
class ClientObjectList[T] protected () extends ClientObjectCollection[T] {
  def this(context: ClientRuntimeContext, objectPath: ObjectPath, childItemType: js.Any) = this()
}

