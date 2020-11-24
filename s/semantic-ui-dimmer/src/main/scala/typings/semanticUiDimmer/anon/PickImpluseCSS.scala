package typings.semanticUiDimmer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'useCSS'> */
@js.native
trait PickImpluseCSS extends js.Object {
  
  var useCSS: Boolean = js.native
}
object PickImpluseCSS {
  
  @scala.inline
  def apply(useCSS: Boolean): PickImpluseCSS = {
    val __obj = js.Dynamic.literal(useCSS = useCSS.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImpluseCSS]
  }
  
  @scala.inline
  implicit class PickImpluseCSSOps[Self <: PickImpluseCSS] (val x: Self) extends AnyVal {
    
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
    def setUseCSS(value: Boolean): Self = this.set("useCSS", value.asInstanceOf[js.Any])
  }
}
