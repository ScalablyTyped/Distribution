package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientActionSetStaticProperty")
@js.native
class ClientActionSetStaticProperty protected ()
  extends typings.sharepoint.SP.ClientAction {
  def this(
    context: typings.sharepoint.SP.ClientRuntimeContext,
    typeId: String,
    propName: String,
    propValue: js.Any
  ) = this()
  /* CompleteClass */
  override def get_id(): Double = js.native
  /* CompleteClass */
  override def get_name(): String = js.native
  /* CompleteClass */
  override def get_path(): typings.sharepoint.SP.ObjectPath = js.native
}

