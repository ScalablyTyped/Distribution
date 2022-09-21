package typings.riotjsDomBindings.mod

import typings.std.DocumentFragment
import typings.std.HTMLCollection
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateChunk[Scope, ParentScope] extends StObject {
  
  var bindings: js.UndefOr[js.Array[Binding[Scope, ParentScope]]] = js.native
  
  var bindingsData: js.UndefOr[js.Array[BindingData[Scope]]] = js.native
  
  var children: js.UndefOr[HTMLCollection] = js.native
  
  def createDOM(el: HTMLElement): TemplateChunk[Any, Any] = js.native
  
  var dom: js.UndefOr[HTMLElement] = js.native
  
  var el: js.UndefOr[HTMLElement] = js.native
  
  var fragment: js.UndefOr[DocumentFragment] = js.native
  
  var html: js.UndefOr[String | Null] = js.native
  
  var isTemplateTag: js.UndefOr[Boolean] = js.native
  
  def mount(el: HTMLElement, scope: Scope): TemplateChunk[Any, Any] = js.native
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope): TemplateChunk[Any, Any] = js.native
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): TemplateChunk[Any, Any] = js.native
  def mount(el: HTMLElement, scope: Scope, parentScope: Unit, meta: TemplateChunkMeta): TemplateChunk[Any, Any] = js.native
  
  def unmount(scope: Scope): TemplateChunk[Any, Any] = js.native
  def unmount(scope: Scope, parentScope: ParentScope): TemplateChunk[Any, Any] = js.native
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): TemplateChunk[Any, Any] = js.native
  def unmount(scope: Scope, parentScope: Unit, mustRemoveRoot: Boolean): TemplateChunk[Any, Any] = js.native
  
  def update(scope: Scope): TemplateChunk[Any, Any] = js.native
  def update(scope: Scope, parentScope: ParentScope): TemplateChunk[Any, Any] = js.native
}
