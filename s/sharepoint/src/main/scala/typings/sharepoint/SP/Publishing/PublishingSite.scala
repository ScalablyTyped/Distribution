package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingSite")
@js.native
class PublishingSite () extends ClientObject

/* static members */
@JSGlobal("SP.Publishing.PublishingSite")
@js.native
object PublishingSite extends js.Object {
  def createPageLayout(context: ClientContext, parameters: PageLayoutCreationInformation): Unit = js.native
}

