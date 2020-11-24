package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OptionsTopBarScrollEdgeAppearance extends js.Object {
  
  var active: Boolean = js.native
  
  var background: js.UndefOr[OptionsTopBarScrollEdgeAppearanceBackground] = js.native
}
object OptionsTopBarScrollEdgeAppearance {
  
  @scala.inline
  def apply(active: Boolean): OptionsTopBarScrollEdgeAppearance = {
    val __obj = js.Dynamic.literal(active = active.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionsTopBarScrollEdgeAppearance]
  }
  
  @scala.inline
  implicit class OptionsTopBarScrollEdgeAppearanceOps[Self <: OptionsTopBarScrollEdgeAppearance] (val x: Self) extends AnyVal {
    
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
    def setActive(value: Boolean): Self = this.set("active", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBackground(value: OptionsTopBarScrollEdgeAppearanceBackground): Self = this.set("background", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackground: Self = this.set("background", js.undefined)
  }
}
