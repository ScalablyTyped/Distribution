package typings.riotjsDomBindings.mod

import typings.std.DocumentFragment
import typings.std.HTMLCollection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TemplateChunkMeta extends js.Object {
  
  var avoidDOMInjection: Boolean = js.native
  
  var children: HTMLCollection = js.native
  
  var fragment: DocumentFragment = js.native
}
object TemplateChunkMeta {
  
  @scala.inline
  def apply(avoidDOMInjection: Boolean, children: HTMLCollection, fragment: DocumentFragment): TemplateChunkMeta = {
    val __obj = js.Dynamic.literal(avoidDOMInjection = avoidDOMInjection.asInstanceOf[js.Any], children = children.asInstanceOf[js.Any], fragment = fragment.asInstanceOf[js.Any])
    __obj.asInstanceOf[TemplateChunkMeta]
  }
  
  @scala.inline
  implicit class TemplateChunkMetaOps[Self <: TemplateChunkMeta] (val x: Self) extends AnyVal {
    
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
    def setAvoidDOMInjection(value: Boolean): Self = this.set("avoidDOMInjection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: HTMLCollection): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFragment(value: DocumentFragment): Self = this.set("fragment", value.asInstanceOf[js.Any])
  }
}
