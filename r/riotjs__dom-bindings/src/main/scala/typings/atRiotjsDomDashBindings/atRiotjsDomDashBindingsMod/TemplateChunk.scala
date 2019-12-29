package typings.atRiotjsDomDashBindings.atRiotjsDomDashBindingsMod

import typings.std.DocumentFragment
import typings.std.HTMLCollection
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TemplateChunk[Scope, ParentScope] extends js.Object {
  var bindings: js.UndefOr[js.Array[Binding[Scope, ParentScope]]] = js.undefined
  var bindingsData: js.UndefOr[js.Array[BindingData]] = js.undefined
  var children: js.UndefOr[HTMLCollection] = js.undefined
  var dom: js.UndefOr[HTMLElement] = js.undefined
  var el: js.UndefOr[HTMLElement] = js.undefined
  var fragment: js.UndefOr[DocumentFragment] = js.undefined
  var html: js.UndefOr[String | Null] = js.undefined
  var isTemplateTag: js.UndefOr[Boolean] = js.undefined
  def createDOM(el: HTMLElement): TemplateChunk[_, _]
  def mount(el: HTMLElement, scope: Scope, parentScope: ParentScope, meta: TemplateChunkMeta): TemplateChunk[_, _]
  def unmount(scope: Scope, parentScope: ParentScope, mustRemoveRoot: Boolean): TemplateChunk[_, _]
  def update(scope: Scope, parentScope: ParentScope): TemplateChunk[_, _]
}

object TemplateChunk {
  @scala.inline
  def apply[Scope, ParentScope](
    createDOM: HTMLElement => TemplateChunk[_, _],
    mount: (HTMLElement, Scope, ParentScope, TemplateChunkMeta) => TemplateChunk[_, _],
    unmount: (Scope, ParentScope, Boolean) => TemplateChunk[_, _],
    update: (Scope, ParentScope) => TemplateChunk[_, _],
    bindings: js.Array[Binding[Scope, ParentScope]] = null,
    bindingsData: js.Array[BindingData] = null,
    children: HTMLCollection = null,
    dom: HTMLElement = null,
    el: HTMLElement = null,
    fragment: DocumentFragment = null,
    html: String = null,
    isTemplateTag: js.UndefOr[Boolean] = js.undefined
  ): TemplateChunk[Scope, ParentScope] = {
    val __obj = js.Dynamic.literal(createDOM = js.Any.fromFunction1(createDOM), mount = js.Any.fromFunction4(mount), unmount = js.Any.fromFunction3(unmount), update = js.Any.fromFunction2(update))
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (bindingsData != null) __obj.updateDynamic("bindingsData")(bindingsData.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (dom != null) __obj.updateDynamic("dom")(dom.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (fragment != null) __obj.updateDynamic("fragment")(fragment.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(isTemplateTag)) __obj.updateDynamic("isTemplateTag")(isTemplateTag.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChunk[Scope, ParentScope]]
  }
}

