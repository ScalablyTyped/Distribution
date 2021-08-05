package typings.riotjsDomBindings.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Binding[Scope, ParentScope] extends StObject {
  
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): Binding[js.Any, js.Any]
  
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): Binding[js.Any, js.Any]
  
  def update(scope: Scope, parentScope: ParentScope): Binding[js.Any, js.Any]
}
object Binding {
  
  inline def apply[Scope, ParentScope](
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => Binding[js.Any, js.Any],
    unmount: (Scope, ParentScope, Boolean) => Binding[js.Any, js.Any],
    update: (Scope, ParentScope) => Binding[js.Any, js.Any]
  ): Binding[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal(mount = js.Any.fromFunction4(mount), unmount = js.Any.fromFunction3(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[Binding[Scope, ParentScope]]
  }
  
  extension [Self <: Binding[?, ?], Scope, ParentScope](x: Self & (Binding[Scope, ParentScope])) {
    
    inline def setMount(value: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => Binding[js.Any, js.Any]): Self = StObject.set(x, "mount", js.Any.fromFunction4(value))
    
    inline def setUnmount(value: (Scope, ParentScope, Boolean) => Binding[js.Any, js.Any]): Self = StObject.set(x, "unmount", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (Scope, ParentScope) => Binding[js.Any, js.Any]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
