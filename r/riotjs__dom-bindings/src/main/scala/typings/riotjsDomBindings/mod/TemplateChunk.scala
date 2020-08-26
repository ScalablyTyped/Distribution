package typings.riotjsDomBindings.mod

import typings.std.DocumentFragment
import typings.std.HTMLCollection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TemplateChunk[Scope, ParentScope] extends js.Object {
  var bindings: js.UndefOr[js.Array[Binding[Scope, ParentScope]]] = js.native
  var bindingsData: js.UndefOr[js.Array[BindingData]] = js.native
  var children: js.UndefOr[HTMLCollection] = js.native
  var dom: js.UndefOr[HTMLElement] = js.native
  var el: js.UndefOr[HTMLElement] = js.native
  var fragment: js.UndefOr[DocumentFragment] = js.native
  var html: js.UndefOr[String | Null] = js.native
  var isTemplateTag: js.UndefOr[Boolean] = js.native
  def createDOM(el: HTMLElement): TemplateChunk[_, _] = js.native
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
  implicit class TemplateChunkOps[Self <: TemplateChunk[_, _], Scope, ParentScope] (val x: Self with (TemplateChunk[Scope, ParentScope])) extends AnyVal {
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
    def setCreateDOM(value: HTMLElement => TemplateChunk[_, _]): Self = this.set("createDOM", js.Any.fromFunction1(value))
    @scala.inline
    def setMount(value: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => TemplateChunk[_, _]): Self = this.set("mount", js.Any.fromFunction4(value))
    @scala.inline
    def setUnmount(value: (Scope, ParentScope, Boolean) => TemplateChunk[_, _]): Self = this.set("unmount", js.Any.fromFunction3(value))
    @scala.inline
    def setUpdate(value: (Scope, ParentScope) => TemplateChunk[_, _]): Self = this.set("update", js.Any.fromFunction2(value))
    @scala.inline
    def setBindingsVarargs(value: (Binding[Scope, ParentScope])*): Self = this.set("bindings", js.Array(value :_*))
    @scala.inline
    def setBindings(value: js.Array[Binding[Scope, ParentScope]]): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
    @scala.inline
    def setBindingsDataVarargs(value: BindingData*): Self = this.set("bindingsData", js.Array(value :_*))
    @scala.inline
    def setBindingsData(value: js.Array[BindingData]): Self = this.set("bindingsData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindingsData: Self = this.set("bindingsData", js.undefined)
    @scala.inline
    def setChildren(value: HTMLCollection): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    @scala.inline
    def setDom(value: HTMLElement): Self = this.set("dom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDom: Self = this.set("dom", js.undefined)
    @scala.inline
    def setEl(value: HTMLElement): Self = this.set("el", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEl: Self = this.set("el", js.undefined)
    @scala.inline
    def setFragment(value: DocumentFragment): Self = this.set("fragment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFragment: Self = this.set("fragment", js.undefined)
    @scala.inline
    def setHtml(value: String): Self = this.set("html", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHtml: Self = this.set("html", js.undefined)
    @scala.inline
    def setHtmlNull: Self = this.set("html", null)
    @scala.inline
    def setIsTemplateTag(value: Boolean): Self = this.set("isTemplateTag", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsTemplateTag: Self = this.set("isTemplateTag", js.undefined)
  }
  
}

