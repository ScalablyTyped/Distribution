package typings.riotjsDomBindings.mod

import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Binding[Scope, ParentScope] extends StObject {
  
  def mount(el: HTMLElement, scope: Scope): Binding[Scope, ParentScope] = js.native
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope): Binding[Scope, ParentScope] = js.native
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): Binding[Scope, ParentScope] = js.native
  def mount(el: HTMLElement, scope: Scope, parentScope: Unit, meta: TemplateChunkMeta): Binding[Scope, ParentScope] = js.native
  
  def unmount(scope: Scope): Binding[Scope, ParentScope] = js.native
  def unmount(scope: Scope, parentScope: ParentScope): Binding[Scope, ParentScope] = js.native
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): Binding[Scope, ParentScope] = js.native
  def unmount(scope: Scope, parentScope: Unit, mustRemoveRoot: Boolean): Binding[Scope, ParentScope] = js.native
  
  def update(scope: Scope): Binding[Scope, ParentScope] = js.native
  def update(scope: Scope, parentScope: ParentScope): Binding[Scope, ParentScope] = js.native
}
