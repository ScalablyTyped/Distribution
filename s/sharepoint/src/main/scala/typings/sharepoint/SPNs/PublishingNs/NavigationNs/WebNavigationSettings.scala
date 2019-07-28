package typings.sharepoint.SPNs.PublishingNs.NavigationNs

import typings.sharepoint.SPNs.ClientContext
import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.TaxonomyNs.TaxonomySession
import typings.sharepoint.SPNs.Web
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.WebNavigationSettings")
@js.native
class WebNavigationSettings protected () extends ClientObject {
  def this(context: ClientContext, web: Web) = this()
  def get_addNewPagesToNavigation(): Boolean = js.native
  def get_createFriendlyUrlsForNewPages(): Boolean = js.native
  def get_currentNavigation(): StandardNavigationSettings = js.native
  def get_globalNavigation(): StandardNavigationSettings = js.native
  def resetToDefaults(): Unit = js.native
  def set_addNewPagesToNavigation(value: Boolean): Boolean = js.native
  def set_createFriendlyUrlsForNewPages(value: Boolean): Boolean = js.native
  def update(taxonomySession: TaxonomySession): Unit = js.native
}

