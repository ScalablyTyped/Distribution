package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.WebNavigationSettings")
@js.native
class WebNavigationSettings protected ()
  extends sharepointLib.SPNs.ClientObject {
  def this(context: sharepointLib.SPNs.ClientContext, web: sharepointLib.SPNs.Web) = this()
  def get_addNewPagesToNavigation(): scala.Boolean = js.native
  def get_createFriendlyUrlsForNewPages(): scala.Boolean = js.native
  def get_currentNavigation(): StandardNavigationSettings = js.native
  def get_globalNavigation(): StandardNavigationSettings = js.native
  def resetToDefaults(): scala.Unit = js.native
  def set_addNewPagesToNavigation(value: scala.Boolean): scala.Boolean = js.native
  def set_createFriendlyUrlsForNewPages(value: scala.Boolean): scala.Boolean = js.native
  def update(taxonomySession: sharepointLib.SPNs.TaxonomyNs.TaxonomySession): scala.Unit = js.native
}

