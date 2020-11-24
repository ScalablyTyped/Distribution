package typings.storybookAddonA11y.highlightToggleMod

import typings.axeCore.mod.NodeResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ToggleProps extends js.Object {
  
  var elementsToHighlight: js.Array[NodeResult] = js.native
  
  var toggleId: js.UndefOr[String] = js.native
}
object ToggleProps {
  
  @scala.inline
  def apply(elementsToHighlight: js.Array[NodeResult]): ToggleProps = {
    val __obj = js.Dynamic.literal(elementsToHighlight = elementsToHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[ToggleProps]
  }
  
  @scala.inline
  implicit class TogglePropsOps[Self <: ToggleProps] (val x: Self) extends AnyVal {
    
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
    def setElementsToHighlightVarargs(value: NodeResult*): Self = this.set("elementsToHighlight", js.Array(value :_*))
    
    @scala.inline
    def setElementsToHighlight(value: js.Array[NodeResult]): Self = this.set("elementsToHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToggleId(value: String): Self = this.set("toggleId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteToggleId: Self = this.set("toggleId", js.undefined)
  }
}
