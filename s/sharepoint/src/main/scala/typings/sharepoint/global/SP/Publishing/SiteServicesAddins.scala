package typings.sharepoint.global.SP.Publishing

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SP.Publishing.SiteServicesAddins")
@js.native
class SiteServicesAddins ()
  extends typings.sharepoint.SP.Publishing.SiteServicesAddins
/* static members */
@JSGlobal("SP.Publishing.SiteServicesAddins")
@js.native
object SiteServicesAddins extends js.Object {
  
  def deletePlugin(context: ClientContext, pluginName: String): Unit = js.native
  
  def deleteSettings(context: ClientContext, addinId: Guid): Unit = js.native
  
  def getPlugin(context: ClientContext, pluginName: String): typings.sharepoint.SP.Publishing.AddinPlugin = js.native
  
  def getSettings(context: ClientContext, addinId: Guid): typings.sharepoint.SP.Publishing.AddinSettings = js.native
  
  def setPlugin(context: ClientContext, addin: typings.sharepoint.SP.Publishing.AddinPlugin): Unit = js.native
  
  def setSettings(context: ClientContext, addin: typings.sharepoint.SP.Publishing.AddinSettings): Unit = js.native
}
