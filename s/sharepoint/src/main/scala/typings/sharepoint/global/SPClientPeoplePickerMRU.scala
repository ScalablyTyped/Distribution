package typings.sharepoint.global

import typings.sharepoint.anon.Dictname
import typings.sharepoint.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("SPClientPeoplePickerMRU")
@js.native
class SPClientPeoplePickerMRU ()
  extends typings.sharepoint.SPClientPeoplePickerMRU {
  /* CompleteClass */
  override def GetItems(strKey: String): Dictname = js.native
  /* CompleteClass */
  override def ResetCache(): Unit = js.native
  /* CompleteClass */
  override def SetItem[T /* <: Key */](strSearchTerm: String, objEntity: T): Unit = js.native
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
  def GetSPClientPeoplePickerMRU(): typings.sharepoint.SPClientPeoplePickerMRU = js.native
}

