package typings.reactInstantsearchCore.anon

import typings.reactInstantsearchCore.mod.Hit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightProperty[TDoc] extends js.Object {
  
  var attribute: String = js.native
  
  var highlightProperty: String = js.native
  
  var hit: Hit[TDoc] = js.native
  
  var postTag: js.UndefOr[String] = js.native
  
  var preTag: js.UndefOr[String] = js.native
}
object HighlightProperty {
  
  @scala.inline
  def apply[TDoc](attribute: String, highlightProperty: String, hit: Hit[TDoc]): HighlightProperty[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], highlightProperty = highlightProperty.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightProperty[TDoc]]
  }
  
  @scala.inline
  implicit class HighlightPropertyOps[Self <: HighlightProperty[_], TDoc] (val x: Self with HighlightProperty[TDoc]) extends AnyVal {
    
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
    def setAttribute(value: String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightProperty(value: String): Self = this.set("highlightProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHit(value: Hit[TDoc]): Self = this.set("hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPostTag(value: String): Self = this.set("postTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostTag: Self = this.set("postTag", js.undefined)
    
    @scala.inline
    def setPreTag(value: String): Self = this.set("preTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePreTag: Self = this.set("preTag", js.undefined)
  }
}
