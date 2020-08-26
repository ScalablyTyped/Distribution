package typings.sharepoint.SP.UI.ApplicationPages

import typings.microsoftAjax.Sys.EventArgs
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line: interface-name
@js.native
trait ISelectorComponent extends js.Object {
  def get_callback(): js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] = js.native
  def get_componentType(): SelectorType = js.native
  def get_scopeKey(): String = js.native
  def get_selectedEntities(): js.Any = js.native
  def removeEntity(ent: ResolveEntity): Unit = js.native
  def revertTo(ent: ResolveEntity): Unit = js.native
  def setEntity(ent: ResolveEntity): Unit = js.native
  def set_callback(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Unit = js.native
  def set_selectedEntities(value: js.Any): Unit = js.native
}

object ISelectorComponent {
  @scala.inline
  def apply(
    get_callback: () => js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit],
    get_componentType: () => SelectorType,
    get_scopeKey: () => String,
    get_selectedEntities: () => js.Any,
    removeEntity: ResolveEntity => Unit,
    revertTo: ResolveEntity => Unit,
    setEntity: ResolveEntity => Unit,
    set_callback: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit,
    set_selectedEntities: js.Any => Unit
  ): ISelectorComponent = {
    val __obj = js.Dynamic.literal(get_callback = js.Any.fromFunction0(get_callback), get_componentType = js.Any.fromFunction0(get_componentType), get_scopeKey = js.Any.fromFunction0(get_scopeKey), get_selectedEntities = js.Any.fromFunction0(get_selectedEntities), removeEntity = js.Any.fromFunction1(removeEntity), revertTo = js.Any.fromFunction1(revertTo), setEntity = js.Any.fromFunction1(setEntity), set_callback = js.Any.fromFunction1(set_callback), set_selectedEntities = js.Any.fromFunction1(set_selectedEntities))
    __obj.asInstanceOf[ISelectorComponent]
  }
  @scala.inline
  implicit class ISelectorComponentOps[Self <: ISelectorComponent] (val x: Self) extends AnyVal {
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
    def setGet_callback(value: () => js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit]): Self = this.set("get_callback", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_componentType(value: () => SelectorType): Self = this.set("get_componentType", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_scopeKey(value: () => String): Self = this.set("get_scopeKey", js.Any.fromFunction0(value))
    @scala.inline
    def setGet_selectedEntities(value: () => js.Any): Self = this.set("get_selectedEntities", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveEntity(value: ResolveEntity => Unit): Self = this.set("removeEntity", js.Any.fromFunction1(value))
    @scala.inline
    def setRevertTo(value: ResolveEntity => Unit): Self = this.set("revertTo", js.Any.fromFunction1(value))
    @scala.inline
    def setSetEntity(value: ResolveEntity => Unit): Self = this.set("setEntity", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_callback(value: js.Function2[/* sender */ js.Any, /* e */ EventArgs, Unit] => Unit): Self = this.set("set_callback", js.Any.fromFunction1(value))
    @scala.inline
    def setSet_selectedEntities(value: js.Any => Unit): Self = this.set("set_selectedEntities", js.Any.fromFunction1(value))
  }
  
}

