package typings.sharepoint.global.SP

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.ClientUtility")
@js.native
class ClientUtility ()
  extends typings.sharepoint.SP.ClientUtility

/* static members */
@JSGlobal("SP.ClientUtility")
@js.native
object ClientUtility extends js.Object {
  def getOrCreateObjectPathForConstructor(context: typings.sharepoint.SP.ClientRuntimeContext, typeId: String, args: js.Array[_]): typings.sharepoint.SP.ObjectPath = js.native
  def urlPathEncodeForXmlHttpRequest(url: String): String = js.native
}

