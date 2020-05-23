package typings.sharepoint

import typings.sharepoint.anon.Dictname
import typings.sharepoint.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SPClientPeoplePickerMRU extends js.Object {
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
}

