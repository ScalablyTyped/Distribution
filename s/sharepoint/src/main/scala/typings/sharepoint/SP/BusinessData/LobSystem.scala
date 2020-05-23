package typings.sharepoint.SP.BusinessData

import typings.sharepoint.SP.BusinessData.Collections.LobSystemInstanceCollection
import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LobSystem extends ClientObject {
  def getLobSystemInstances(): LobSystemInstanceCollection = js.native
  def get_name(): String = js.native
}

