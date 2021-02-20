package typings.riotjsDomBindings.mod

import typings.std.DocumentFragment
import typings.std.HTMLCollection
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateChunk[Scope, ParentScope] extends StObject {
  
  var bindings: js.UndefOr[js.Array[Binding[Scope, ParentScope]]] = js.native
  
  var bindingsData: js.UndefOr[js.Array[BindingData]] = js.native
  
  var children: js.UndefOr[HTMLCollection] = js.native
  
  def createDOM(el: HTMLElement): TemplateChunk[_, _] = js.native
  
  var dom: js.UndefOr[HTMLElement] = js.native
  
  var el: js.UndefOr[HTMLElement] = js.native
  
  var fragment: js.UndefOr[DocumentFragment] = js.native
  
  var html: js.UndefOr[String | Null] = js.native
  
  var isTemplateTag: js.UndefOr[Boolean] = js.native
  
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): TemplateChunk[_, _] = js.native
  
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): TemplateChunk[_, _] = js.native
  
  def update(scope: Scope, parentScope: ParentScope): TemplateChunk[_, _] = js.native
}
object TemplateChunk {
  
  @scala.inline
  def apply[Scope, ParentScope](
    createDOM: HTMLElement => TemplateChunk[_, _],
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => TemplateChunk[_, _],
    unmount: (Scope, ParentScope, Boolean) => TemplateChunk[_, _],
    update: (Scope, ParentScope) => TemplateChunk[_, _]
  ): TemplateChunk[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal(createDOM = js.Any.fromFunction1(createDOM), mount = js.Any.fromFunction4(mount), unmount = js.Any.fromFunction3(unmount), update = js.Any.fromFunction2(update))
    __obj.asInstanceOf[TemplateChunk[Scope, ParentScope]]
  }
  
  @scala.inline
  implicit class TemplateChunkMutableBuilder[Self <: TemplateChunk[_, _], Scope, ParentScope] (val x: Self with (TemplateChunk[Scope, ParentScope])) extends AnyVal {
    
    @scala.inline
    def setBindings(value: js.Array[Binding[Scope, ParentScope]]): Self = StObject.set(x, "bindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsData(value: js.Array[BindingData]): Self = StObject.set(x, "bindingsData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBindingsDataUndefined: Self = StObject.set(x, "bindingsData", js.undefined)
    
    @scala.inline
    def setBindingsDataVarargs(value: BindingData*): Self = StObject.set(x, "bindingsData", js.Array(value :_*))
    
    @scala.inline
    def setBindingsUndefined: Self = StObject.set(x, "bindings", js.undefined)
    
    @scala.inline
    def setBindingsVarargs(value: (Binding[Scope, ParentScope])*): Self = StObject.set(x, "bindings", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: HTMLCollection): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    @scala.inline
    def setCreateDOM(value: HTMLElement => TemplateChunk[_, _]): Self = StObject.set(x, "createDOM", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDom(value: HTMLElement): Self = StObject.set(x, "dom", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDomUndefined: Self = StObject.set(x, "dom", js.undefined)
    
    @scala.inline
    def setEl(value: HTMLElement): Self = StObject.set(x, "el", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setElUndefined: Self = StObject.set(x, "el", js.undefined)
    
    @scala.inline
    def setFragment(value: DocumentFragment): Self = StObject.set(x, "fragment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragmentUndefined: Self = StObject.set(x, "fragment", js.undefined)
    
    @scala.inline
    def setHtml(value: String): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHtmlNull: Self = StObject.set(x, "html", null)
    
    @scala.inline
    def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    @scala.inline
    def setIsTemplateTag(value: Boolean): Self = StObject.set(x, "isTemplateTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTemplateTagUndefined: Self = StObject.set(x, "isTemplateTag", js.undefined)
    
    @scala.inline
    def setMount(value: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => TemplateChunk[_, _]): Self = StObject.set(x, "mount", js.Any.fromFunction4(value))
    
    @scala.inline
    def setUnmount(value: (Scope, ParentScope, Boolean) => TemplateChunk[_, _]): Self = StObject.set(x, "unmount", js.Any.fromFunction3(value))
    
    @scala.inline
    def setUpdate(value: (Scope, ParentScope) => TemplateChunk[_, _]): Self = StObject.set(x, "update", js.Any.fromFunction2(value))
  }
}
