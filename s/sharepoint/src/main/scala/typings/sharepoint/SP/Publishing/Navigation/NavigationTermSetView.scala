package typings.sharepoint.SP.Publishing.Navigation

import typings.sharepoint.SP.ClientContext
import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import typings.sharepoint.SP.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.NavigationTermSetView")
@js.native
class NavigationTermSetView protected () extends ClientObject {
  def this(context: ClientContext, web: Web, siteMapProviderName: String) = this()
  def getCopy(): NavigationTermSetView = js.native
  def get_excludeDeprecatedTerms(): Boolean = js.native
  def get_excludeTermsByPermissions(): Boolean = js.native
  def get_excludeTermsByProvider(): Boolean = js.native
  def get_serverRelativeSiteUrl(): String = js.native
  def get_serverRelativeWebUrl(): String = js.native
  def get_siteMapProviderName(): String = js.native
  def get_webId(): Guid = js.native
  def get_webTitle(): String = js.native
  def set_excludeDeprecatedTerms(value: Boolean): Boolean = js.native
  def set_excludeTermsByPermissions(value: Boolean): Boolean = js.native
  def set_excludeTermsByProvider(value: Boolean): Boolean = js.native
  def set_siteMapProviderName(value: String): String = js.native
}

/* static members */
@JSGlobal("SP.Publishing.Navigation.NavigationTermSetView")
@js.native
object NavigationTermSetView extends js.Object {
  def createEmptyInstance(context: ClientContext): NavigationTermSetView = js.native
}

