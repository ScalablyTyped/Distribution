package typings.sharepoint

import typings.sharepoint.anon.Dictname
import typings.sharepoint.anon.Key
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SPClientPeoplePickerMRU extends StObject {
  
  def GetItems(strKey: String): Dictname
  
  def ResetCache(): Unit
  
  def SetItem[T /* <: Key */](strSearchTerm: String, objEntity: T): Unit
}
object SPClientPeoplePickerMRU {
  
  @scala.inline
  def apply(GetItems: String => Dictname, ResetCache: () => Unit, SetItem: (String, js.Any) => Unit): SPClientPeoplePickerMRU = {
    val __obj = js.Dynamic.literal(GetItems = js.Any.fromFunction1(GetItems), ResetCache = js.Any.fromFunction0(ResetCache), SetItem = js.Any.fromFunction2(SetItem))
    __obj.asInstanceOf[SPClientPeoplePickerMRU]
  }
  
  @scala.inline
  implicit class SPClientPeoplePickerMRUMutableBuilder[Self <: SPClientPeoplePickerMRU] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGetItems(value: String => Dictname): Self = StObject.set(x, "GetItems", js.Any.fromFunction1(value))
    
    @scala.inline
    def setResetCache(value: () => Unit): Self = StObject.set(x, "ResetCache", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetItem(value: (String, js.Any) => Unit): Self = StObject.set(x, "SetItem", js.Any.fromFunction2(value))
  }
}
