package typings.semanticUiDimmer.anon

import typings.semanticUiDimmer.semanticUiDimmerStrings.auto
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<semantic-ui-dimmer.SemanticUI.DimmerSettings._Impl, 'opacity'> */
@js.native
trait PickImplopacity extends js.Object {
  
  var opacity: auto | Double = js.native
}
object PickImplopacity {
  
  @scala.inline
  def apply(opacity: auto | Double): PickImplopacity = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[PickImplopacity]
  }
  
  @scala.inline
  implicit class PickImplopacityOps[Self <: PickImplopacity] (val x: Self) extends AnyVal {
    
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
    def setOpacity(value: auto | Double): Self = this.set("opacity", value.asInstanceOf[js.Any])
  }
}
