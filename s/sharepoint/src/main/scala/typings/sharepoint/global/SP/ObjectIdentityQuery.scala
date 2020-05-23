package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ObjectIdentityQuery")
@js.native
class ObjectIdentityQuery protected ()
  extends typings.sharepoint.SP.ClientAction {
  def this(objectPath: typings.sharepoint.SP.ObjectPath) = this()
  /* CompleteClass */
  override def get_id(): Double = js.native
  /* CompleteClass */
  override def get_name(): String = js.native
  /* CompleteClass */
  override def get_path(): typings.sharepoint.SP.ObjectPath = js.native
}

