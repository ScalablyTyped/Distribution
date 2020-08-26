package typings.sharepoint

import typings.sharepoint.anon.Dictname
import typings.sharepoint.anon.Key
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SPClientPeoplePickerMRU extends js.Object {
  def GetItems(strKey: String): Dictname = js.native
  def ResetCache(): Unit = js.native
  def SetItem[T /* <: Key */](strSearchTerm: String, objEntity: T): Unit = js.native
}

object SPClientPeoplePickerMRU {
  @scala.inline
  def apply(GetItems: String => Dictname, ResetCache: () => Unit, SetItem: (String, js.Any) => Unit): SPClientPeoplePickerMRU = {
    val __obj = js.Dynamic.literal(GetItems = js.Any.fromFunction1(GetItems), ResetCache = js.Any.fromFunction0(ResetCache), SetItem = js.Any.fromFunction2(SetItem))
    __obj.asInstanceOf[SPClientPeoplePickerMRU]
  }
  @scala.inline
  implicit class SPClientPeoplePickerMRUOps[Self <: SPClientPeoplePickerMRU] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetItems(value: String => Dictname): Self = this.set("GetItems", js.Any.fromFunction1(value))
    @scala.inline
    def setResetCache(value: () => Unit): Self = this.set("ResetCache", js.Any.fromFunction0(value))
    @scala.inline
    def setSetItem(value: (String, js.Any) => Unit): Self = this.set("SetItem", js.Any.fromFunction2(value))
  }
  
}

