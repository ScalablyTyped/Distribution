package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.NavigationTermSetView")
@js.native
class NavigationTermSetView protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext, web: sharepointLib.SPNs.Web, siteMapProviderName: java.lang.String) = this()
  def getCopy(): NavigationTermSetView = js.native
  def get_excludeDeprecatedTerms(): scala.Boolean = js.native
  def get_excludeTermsByPermissions(): scala.Boolean = js.native
  def get_excludeTermsByProvider(): scala.Boolean = js.native
  def get_serverRelativeSiteUrl(): java.lang.String = js.native
  def get_serverRelativeWebUrl(): java.lang.String = js.native
  def get_siteMapProviderName(): java.lang.String = js.native
  def get_webId(): sharepointLib.SPNs.Guid = js.native
  def get_webTitle(): java.lang.String = js.native
  def set_excludeDeprecatedTerms(value: scala.Boolean): scala.Boolean = js.native
  def set_excludeTermsByPermissions(value: scala.Boolean): scala.Boolean = js.native
  def set_excludeTermsByProvider(value: scala.Boolean): scala.Boolean = js.native
  def set_siteMapProviderName(value: java.lang.String): java.lang.String = js.native
}

@JSGlobal("SP.Publishing.Navigation.NavigationTermSetView")
@js.native
object NavigationTermSetView extends js.Object {
  def createEmptyInstance(context: sharepointLib.SPNs.ClientContext): sharepointLib.SPNs.PublishingNs.NavigationNs.NavigationTermSetView = js.native
}

