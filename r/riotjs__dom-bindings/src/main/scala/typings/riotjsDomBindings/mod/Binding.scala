package typings.riotjsDomBindings.mod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Binding[Scope, ParentScope] extends js.Object {
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): Binding[_, _] = js.native
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): Binding[_, _] = js.native
  def update(scope: Scope, parentScope: ParentScope): Binding[_, _] = js.native
}

object Binding {
  @scala.inline
  def apply[Scope, ParentScope](
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => Binding[_, _],
    unmount: (Scope, ParentScope, Boolean) => Binding[_, _],
    update: (Scope, ParentScope) => Binding[_, _]
  ): Binding[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction4(mount), unmount = js.Any.fromFunction3(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Binding[Scope, ParentScope]]
  }
  @scala.inline
  implicit class BindingOps[Self <: Binding[_, _], Scope, ParentScope] (val x: Self with (Binding[Scope, ParentScope])) extends AnyVal {
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
    def setMount(value: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => Binding[_, _]): Self = this.set("mount", js.Any.fromFunction4(value))
    @scala.inline
    def setUnmount(value: (Scope, ParentScope, Boolean) => Binding[_, _]): Self = this.set("unmount", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdate(value: (Scope, ParentScope) => Binding[_, _]): Self = this.set("update", js.Any.fromFunction2(value))
  }
  
}

