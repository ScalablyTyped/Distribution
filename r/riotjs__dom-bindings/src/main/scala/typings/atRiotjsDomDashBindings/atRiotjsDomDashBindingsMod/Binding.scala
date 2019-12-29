package typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Binding[Scope, ParentScope] extends js.Object {
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): Binding[_, _]
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): Binding[_, _]
  def update(scope: Scope, parentScope: ParentScope): Binding[_, _]
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
}

