package typings.sharepoint.SPNs.PublishingNs.NavigationNs

import typings.sharepoint.SPNs.ClientObject
import typings.sharepoint.SPNs.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.StandardNavigationSettings")
@js.native
class StandardNavigationSettings () extends ClientObject {
  def get_source(): StandardNavigationSource = js.native
  def get_termSetId(): Guid = js.native
  def get_termStoreId(): Guid = js.native
  def set_source(value: StandardNavigationSource): StandardNavigationSource = js.native
  def set_termSetId(value: Guid): Guid = js.native
  def set_termStoreId(value: Guid): Guid = js.native
}

