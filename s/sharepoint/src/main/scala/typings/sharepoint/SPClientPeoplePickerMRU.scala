package typings.sharepoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePickerMRU")
@js.native
class SPClientPeoplePickerMRU () extends js.Object {
  def GetItems(strKey: String): Anon_Key = js.native
  def ResetCache(): Unit = js.native
  def SetItem[T /* <: Anon_KeyString */](strSearchTerm: String, objEntity: T): Unit = js.native
}

/* static members */
@JSGlobal("SPClientPeoplePickerMRU")
@js.native
object SPClientPeoplePickerMRU extends js.Object {
   // = 1;
  var MaxPPMRUItems: Double = js.native
   // = 200;
  var PPMRUDomLocalStoreKey: String = js.native
  var PPMRUVersion: Double = js.native
   // = "ClientPeoplePickerMRU";
  def GetSPClientPeoplePickerMRU(): SPClientPeoplePickerMRU = js.native
}

