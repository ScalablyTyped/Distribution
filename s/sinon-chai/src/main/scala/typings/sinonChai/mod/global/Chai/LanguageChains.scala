package typings.sinonChai.mod.global.Chai

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LanguageChains extends js.Object {
  
  var always: Assertion = js.native
}
object LanguageChains {
  
  @scala.inline
  def apply(always: Assertion): LanguageChains = {
    val __obj = js.Dynamic.literal(always = always.asInstanceOf[js.Any])
    __obj.asInstanceOf[LanguageChains]
  }
  
  @scala.inline
  implicit class LanguageChainsOps[Self <: LanguageChains] (val x: Self) extends AnyVal {
    
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
    def setAlways(value: Assertion): Self = this.set("always", value.asInstanceOf[js.Any])
  }
}
