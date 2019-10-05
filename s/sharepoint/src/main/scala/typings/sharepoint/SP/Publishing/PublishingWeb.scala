package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingWeb")
@js.native
class PublishingWeb () extends ClientObject {
  def addPublishingPage(pageInformation: PublishingPageInformation): PublishingPage = js.native
  def get_web(): Web = js.native
}

/* static members */
@JSGlobal("SP.Publishing.PublishingWeb")
@js.native
object PublishingWeb extends js.Object {
  def getPublishingWeb(context: ClientContext, web: Web): PublishingWeb = js.native
}

