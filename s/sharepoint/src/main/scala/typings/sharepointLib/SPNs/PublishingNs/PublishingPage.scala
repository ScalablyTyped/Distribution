package typings
package sharepointLib.SPNs.PublishingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.PublishingPage")
@js.native
class PublishingPage () extends ScheduledItem {
  def addFriendlyUrl(
    friendlyUrlSegment: java.lang.String,
    editableParent: sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTermSetItem,
    doAddToNavigation: scala.Boolean
  ): sharepointLib.SPNs.StringResult = js.native
}

@JSGlobal("SP.Publishing.PublishingPage")
@js.native
object PublishingPage extends js.Object {
  def getPublishingPage(context: sharepointLib.SPNs.ClientContext, sourceListItem: sharepointLib.SPNs.ListItem[_]): sharepointLib.SPNs.PublishingNs.PublishingPage = js.native
}

