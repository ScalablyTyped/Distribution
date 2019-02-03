package typings
package sharepointLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePickerMRU")
@js.native
class SPClientPeoplePickerMRU () extends js.Object {
  def GetItems(strKey: java.lang.String): Anon_Key = js.native
  def ResetCache(): scala.Unit = js.native
  def SetItem[T /* <: Anon_KeyString */](strSearchTerm: java.lang.String, objEntity: T): scala.Unit = js.native
}

/* static members */
@JSGlobal("SPClientPeoplePickerMRU")
@js.native
object SPClientPeoplePickerMRU extends js.Object {
   // = 1;
  var MaxPPMRUItems: scala.Double = js.native
   // = 200;
  var PPMRUDomLocalStoreKey: java.lang.String = js.native
  var PPMRUVersion: scala.Double = js.native
   // = "ClientPeoplePickerMRU";
  def GetSPClientPeoplePickerMRU(): sharepointLib.SPClientPeoplePickerMRU = js.native
}

