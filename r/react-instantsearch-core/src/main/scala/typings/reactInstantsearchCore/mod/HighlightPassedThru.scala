package typings.reactInstantsearchCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlightPassedThru[TDoc] extends js.Object {
  
  var attribute: String = js.native
  
  var highlightProperty: js.UndefOr[String] = js.native
  
  var hit: Hit[TDoc] = js.native
}
object HighlightPassedThru {
  
  @scala.inline
  def apply[TDoc](attribute: String, hit: Hit[TDoc]): HighlightPassedThru[TDoc] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], hit = hit.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightPassedThru[TDoc]]
  }
  
  @scala.inline
  implicit class HighlightPassedThruOps[Self <: HighlightPassedThru[_], TDoc] (val x: Self with HighlightPassedThru[TDoc]) extends AnyVal {
    
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
    def setHit(value: Hit[TDoc]): Self = this.set("hit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightProperty(value: String): Self = this.set("highlightProperty", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightProperty: Self = this.set("highlightProperty", js.undefined)
  }
}
