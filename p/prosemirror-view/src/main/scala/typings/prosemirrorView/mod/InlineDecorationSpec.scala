package typings.prosemirrorView.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InlineDecorationSpec extends js.Object {
  
  /**
    * Determines how the right side of the decoration is mapped.
    */
  var inclusiveEnd: js.UndefOr[Boolean | Null] = js.native
  
  /**
    * Determines how the left side of the decoration is
    * [mapped](#transform.Position_Mapping) when content is
    * inserted directly at that position. By default, the decoration
    * won't include the new content, but you can set this to `true`
    * to make it inclusive.
    */
  var inclusiveStart: js.UndefOr[Boolean | Null] = js.native
}
object InlineDecorationSpec {
  
  @scala.inline
  def apply(): InlineDecorationSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InlineDecorationSpec]
  }
  
  @scala.inline
  implicit class InlineDecorationSpecOps[Self <: InlineDecorationSpec] (val x: Self) extends AnyVal {
    
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
    def setInclusiveEnd(value: Boolean): Self = this.set("inclusiveEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusiveEnd: Self = this.set("inclusiveEnd", js.undefined)
    
    @scala.inline
    def setInclusiveEndNull: Self = this.set("inclusiveEnd", null)
    
    @scala.inline
    def setInclusiveStart(value: Boolean): Self = this.set("inclusiveStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInclusiveStart: Self = this.set("inclusiveStart", js.undefined)
    
    @scala.inline
    def setInclusiveStartNull: Self = this.set("inclusiveStart", null)
  }
}
