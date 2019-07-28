package typings.sharepoint.SPNs.BusinessDataNs

import typings.sharepoint.SPNs.BusinessDataNs.CollectionsNs.LobSystemInstanceCollection
import typings.sharepoint.SPNs.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.BusinessData.LobSystem")
@js.native
class LobSystem () extends ClientObject {
  def getLobSystemInstances(): LobSystemInstanceCollection = js.native
  def get_name(): String = js.native
}

