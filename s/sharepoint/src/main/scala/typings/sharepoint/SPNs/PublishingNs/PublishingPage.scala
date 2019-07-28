package typings.sharepoint.SPNs.PublishingNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.PublishingNs.NavigationNs.NavigationTermSetItem
import typings.sharepoint.SPNs.StringResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingPage")
@js.native
class PublishingPage () extends ScheduledItem {
  def addFriendlyUrl(friendlyUrlSegment: String, editableParent: NavigationTermSetItem, doAddToNavigation: Boolean): StringResult = js.native
}

/* static members */
@JSGlobal("SP.Publishing.PublishingPage")
@js.native
object PublishingPage extends js.Object {
  def getPublishingPage(context: ClientContext, sourceListItem: typings.sharepoint.SPNs.ListItem[_]): PublishingPage = js.native
}

