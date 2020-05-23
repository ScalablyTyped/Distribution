package typings.sharepoint.SP.Publishing.Navigation

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Taxonomy.TaxonomySession
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WebNavigationSettings extends ClientObject {
  def get_addNewPagesToNavigation(): Boolean = js.native
  def get_createFriendlyUrlsForNewPages(): Boolean = js.native
  def get_currentNavigation(): StandardNavigationSettings = js.native
  def get_globalNavigation(): StandardNavigationSettings = js.native
  def resetToDefaults(): Unit = js.native
  def set_addNewPagesToNavigation(value: Boolean): Boolean = js.native
  def set_createFriendlyUrlsForNewPages(value: Boolean): Boolean = js.native
  def update(taxonomySession: TaxonomySession): Unit = js.native
}

