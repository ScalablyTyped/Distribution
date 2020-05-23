package typings.sharepoint.global.SP.Publishing

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ListItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingPage")
@js.native
class PublishingPage ()
  extends typings.sharepoint.SP.Publishing.PublishingPage

/* static members */
@JSGlobal("SP.Publishing.PublishingPage")
@js.native
object PublishingPage extends js.Object {
  def getPublishingPage(context: ClientContext, sourceListItem: ListItem[_]): typings.sharepoint.SP.Publishing.PublishingPage = js.native
}

