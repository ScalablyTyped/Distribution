package typings.sharepoint.SP.Publishing

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.Publishing.Navigation.NavigationTermSetItem
import typings.sharepoint.SP.StringResult
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
  def getPublishingPage(context: ClientContext, sourceListItem: typings.sharepoint.SP.ListItem[_]): PublishingPage = js.native
}

