package typings.sipJs.distGrammarMod

import typings.sipJs.sipJsStrings.`class`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IClassExpectation extends Expectation {
  
  var ignoreCase: Boolean = js.native
  
  var inverted: Boolean = js.native
  
  var parts: IClassParts = js.native
  
  var `type`: `class` = js.native
}
object IClassExpectation {
  
  @scala.inline
  def apply(ignoreCase: Boolean, inverted: Boolean, parts: IClassParts, `type`: `class`): IClassExpectation = {
    val __obj = js.Dynamic.literal(ignoreCase = ignoreCase.asInstanceOf[js.Any], inverted = inverted.asInstanceOf[js.Any], parts = parts.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[IClassExpectation]
  }
  
  @scala.inline
  implicit class IClassExpectationOps[Self <: IClassExpectation] (val x: Self) extends AnyVal {
    
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
    def setIgnoreCase(value: Boolean): Self = this.set("ignoreCase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInverted(value: Boolean): Self = this.set("inverted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParts(value: IClassParts): Self = this.set("parts", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: `class`): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
