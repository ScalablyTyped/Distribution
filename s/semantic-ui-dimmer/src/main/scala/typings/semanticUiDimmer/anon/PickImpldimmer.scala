package typings.semanticUiDimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.Dimmer.SelectorSettings._Impl, 'dimmer'> */
@js.native
trait PickImpldimmer extends js.Object {
  
  var dimmer: String = js.native
}
object PickImpldimmer {
  
  @scala.inline
  def apply(dimmer: String): PickImpldimmer = {
    val __obj = js.Dynamic.literal(dimmer = dimmer.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpldimmer]
  }
  
  @scala.inline
  implicit class PickImpldimmerOps[Self <: PickImpldimmer] (val x: Self) extends AnyVal {
    
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
    def setDimmer(value: String): Self = this.set("dimmer", value.asInstanceOf[js.Any])
  }
}
