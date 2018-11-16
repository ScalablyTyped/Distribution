package typings
package sharepointLib.SPNs.PublishingNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.SiteServicesAddins")
@js.native
class SiteServicesAddins () extends js.Object

@JSGlobal("SP.Publishing.SiteServicesAddins")
@js.native
object SiteServicesAddins extends js.Object {
  def deletePlugin(context: sharepointLib.SPNs.ClientContext, pluginName: java.lang.String): scala.Unit = js.native
  def deleteSettings(context: sharepointLib.SPNs.ClientContext, addinId: sharepointLib.SPNs.Guid): scala.Unit = js.native
  def getPlugin(context: sharepointLib.SPNs.ClientContext, pluginName: java.lang.String): sharepointLib.SPNs.PublishingNs.AddinPlugin = js.native
  def getSettings(context: sharepointLib.SPNs.ClientContext, addinId: sharepointLib.SPNs.Guid): sharepointLib.SPNs.PublishingNs.AddinSettings = js.native
  def setPlugin(context: sharepointLib.SPNs.ClientContext, addin: sharepointLib.SPNs.PublishingNs.AddinPlugin): scala.Unit = js.native
  def setSettings(context: sharepointLib.SPNs.ClientContext, addin: sharepointLib.SPNs.PublishingNs.AddinSettings): scala.Unit = js.native
}

