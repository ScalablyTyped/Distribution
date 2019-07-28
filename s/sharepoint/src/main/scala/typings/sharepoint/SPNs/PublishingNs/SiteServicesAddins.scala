package typings.sharepoint.SPNs.PublishingNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.SiteServicesAddins")
@js.native
class SiteServicesAddins () extends js.Object

/* static members */
@JSGlobal("SP.Publishing.SiteServicesAddins")
@js.native
object SiteServicesAddins extends js.Object {
  def deletePlugin(context: ClientContext, pluginName: String): Unit = js.native
  def deleteSettings(context: ClientContext, addinId: Guid): Unit = js.native
  def getPlugin(context: ClientContext, pluginName: String): AddinPlugin = js.native
  def getSettings(context: ClientContext, addinId: Guid): AddinSettings = js.native
  def setPlugin(context: ClientContext, addin: AddinPlugin): Unit = js.native
  def setSettings(context: ClientContext, addin: AddinSettings): Unit = js.native
}

