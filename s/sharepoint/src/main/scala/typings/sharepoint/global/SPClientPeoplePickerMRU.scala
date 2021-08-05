package typings.sharepoint.global

import typings.sharepoint.anon.Dictname
import typings.sharepoint.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("SPClientPeoplePickerMRU")
@js.native
class SPClientPeoplePickerMRU ()
  extends StObject
     with typings.sharepoint.SPClientPeoplePickerMRU {
  
  /* CompleteClass */
  override def GetItems(strKey: String): Dictname = js.native
  
  /* CompleteClass */
  override def ResetCache(): Unit = js.native
  
  /* CompleteClass */
  override def SetItem[T /* <: Key */](strSearchTerm: String, objEntity: T): Unit = js.native
}
object SPClientPeoplePickerMRU {
  
  @JSGlobal("SPClientPeoplePickerMRU")
  @js.native
  val ^ : js.Any = js.native
  
  // = "ClientPeoplePickerMRU";
  /* static member */
  inline def GetSPClientPeoplePickerMRU(): typings.sharepoint.SPClientPeoplePickerMRU = ^.asInstanceOf[js.Dynamic].applyDynamic("GetSPClientPeoplePickerMRU")().asInstanceOf[typings.sharepoint.SPClientPeoplePickerMRU]
  
  // = 1;
  /* static member */
  @JSGlobal("SPClientPeoplePickerMRU.MaxPPMRUItems")
  @js.native
  def MaxPPMRUItems: Double = js.native
  inline def MaxPPMRUItems_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("MaxPPMRUItems")(x.asInstanceOf[js.Any])
  
  // = 200;
  /* static member */
  @JSGlobal("SPClientPeoplePickerMRU.PPMRUDomLocalStoreKey")
  @js.native
  def PPMRUDomLocalStoreKey: String = js.native
  inline def PPMRUDomLocalStoreKey_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PPMRUDomLocalStoreKey")(x.asInstanceOf[js.Any])
  
  /* static member */
  @JSGlobal("SPClientPeoplePickerMRU.PPMRUVersion")
  @js.native
  def PPMRUVersion: Double = js.native
  inline def PPMRUVersion_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("PPMRUVersion")(x.asInstanceOf[js.Any])
}
