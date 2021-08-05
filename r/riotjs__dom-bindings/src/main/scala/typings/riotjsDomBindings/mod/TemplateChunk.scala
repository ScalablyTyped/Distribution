package typings.riotjsDomBindings.mod

import typings.std.DocumentFragment
import typings.std.HTMLCollection
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TemplateChunk[Scope, ParentScope] extends StObject {
  
  var bindings: js.UndefOr[js.Array[Binding[Scope, ParentScope]]] = js.undefined
  
  var bindingsData: js.UndefOr[js.Array[BindingData]] = js.undefined
  
  var children: js.UndefOr[HTMLCollection] = js.undefined
  
  def createDOM(el: HTMLElement): TemplateChunk[js.Any, js.Any]
  
  var dom: js.UndefOr[HTMLElement] = js.undefined
  
  var el: js.UndefOr[HTMLElement] = js.undefined
  
  var fragment: js.UndefOr[DocumentFragment] = js.undefined
  
  var html: js.UndefOr[String | Null] = js.undefined
  
  var isTemplateTag: js.UndefOr[Boolean] = js.undefined
  
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): TemplateChunk[js.Any, js.Any]
  
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): TemplateChunk[js.Any, js.Any]
  
  def update(scope: Scope, parentScope: ParentScope): TemplateChunk[js.Any, js.Any]
}
object TemplateChunk {
  
  inline def apply[Scope, ParentScope](
    createDOM: HTMLElement => TemplateChunk[js.Any, js.Any],
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => TemplateChunk[js.Any, js.Any],
    unmount: (Scope, ParentScope, Boolean) => TemplateChunk[js.Any, js.Any],
    update: (Scope, ParentScope) => TemplateChunk[js.Any, js.Any]
  ): TemplateChunk[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal(createDOM = js.Any.fromFunction1(createDOM), mount = js.Any.fromFunction4(mount), unmount = js.Any.fromFunction3(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[TemplateChunk[Scope, ParentScope]]
  }
  
  extension [Self <: TemplateChunk[?, ?], Scope, ParentScope](x: Self & (TemplateChunk[Scope, ParentScope])) {
    
    inline def setBindings(value: js.Array[Binding[Scope, ParentScope]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    inline def setBindingsData(value: js.Array[BindingData]): Self = StObject.set(x, "bindingsData", value.asInstanceOf[js.Any])
    
    inline def setBindingsDataUndefined: Self = StObject.set(x, "bindingsData", js.undefined)
    
    inline def setBindingsDataVarargs(value: BindingData*): Self = StObject.set(x, "bindingsData", js.Array(value :_*))
    
    inline def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    inline def setBindingsVarargs(value: (Binding[Scope, ParentScope])*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    inline def setChildren(value: HTMLCollection): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setCreateDOM(value: HTMLElement => TemplateChunk[js.Any, js.Any]): Self = StObject.set(x, "createDOM", js.Any.fromFunction1(value))
    
    inline def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    inline def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    inline def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    inline def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    inline def setFragment(value: DocumentFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    inline def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    inline def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlNull: Self = StObject.set(x, "html", null)
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setIsTemplateTag(value: Boolean): Self = StObject.set(x, "isTemplateTag", value.asInstanceOf[js.Any])
    
    inline def setIsTemplateTagUndefined: Self = StObject.set(x, "isTemplateTag", js.undefined)
    
    inline def setMount(value: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => TemplateChunk[js.Any, js.Any]): Self = StObject.set(x, "mount", js.Any.fromFunction4(value))
    
    inline def setUnmount(value: (Scope, ParentScope, Boolean) => TemplateChunk[js.Any, js.Any]): Self = StObject.set(x, "unmount", js.Any.fromFunction3(value))
    
    inline def setUpdate(value: (Scope, ParentScope) => TemplateChunk[js.Any, js.Any]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
