package typings.sharepoint.SP.Publishing.Navigation

import typings.sharepoint.SP.ClientObject
import typings.sharepoint.SP.Guid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StandardNavigationSettings extends ClientObject {
  def get_source(): StandardNavigationSource = js.native
  def get_termSetId(): Guid = js.native
  def get_termStoreId(): Guid = js.native
  def set_source(value: StandardNavigationSource): StandardNavigationSource = js.native
  def set_termSetId(value: Guid): Guid = js.native
  def set_termStoreId(value: Guid): Guid = js.native
}

