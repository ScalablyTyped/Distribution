package typings
package sharepointLib.SPNs.PublishingNs.NavigationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SP.Publishing.Navigation.StandardNavigationSettings")
@js.native
class StandardNavigationSettings ()
  extends sharepointLib.SPNs.ClientObject {
  def get_source(): StandardNavigationSource = js.native
  def get_termSetId(): sharepointLib.SPNs.Guid = js.native
  def get_termStoreId(): sharepointLib.SPNs.Guid = js.native
  def set_source(value: StandardNavigationSource): StandardNavigationSource = js.native
  def set_termSetId(value: sharepointLib.SPNs.Guid): sharepointLib.SPNs.Guid = js.native
  def set_termStoreId(value: sharepointLib.SPNs.Guid): sharepointLib.SPNs.Guid = js.native
}

