package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ObjectPathProperty")
@js.native
class ObjectPathProperty protected ()
  extends typings.sharepoint.SP.ObjectPath {
  def this(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    parent: typings.sharepoint.SP.ObjectPath,
    propertyName: String
  ) = this()
  /* CompleteClass */
  override def setPendingReplace(): Unit = js.native
}

