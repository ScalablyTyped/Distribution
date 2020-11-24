package typings.reactInstantsearchCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IsRefined extends js.Object {
  
  var isRefined: Boolean = js.native
  
  var label: String = js.native
  
  var noRefinement: Boolean = js.native
  
  var value: String = js.native
}
object IsRefined {
  
  @scala.inline
  def apply(isRefined: Boolean, label: String, noRefinement: Boolean, value: String): IsRefined = {
    val __obj = js.Dynamic.literal(isRefined = isRefined.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], noRefinement = noRefinement.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IsRefined]
  }
  
  @scala.inline
  implicit class IsRefinedOps[Self <: IsRefined] (val x: Self) extends AnyVal {
    
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
    def setIsRefined(value: Boolean): Self = this.set("isRefined", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoRefinement(value: Boolean): Self = this.set("noRefinement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
  }
}
