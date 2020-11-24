package typings.reactSelect.menuMod

import typings.react.mod.Ref
import typings.reactSelect.reactSelectStrings.auto
import typings.reactSelect.reactSelectStrings.bottom
import typings.reactSelect.reactSelectStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PlacementArgs extends js.Object {
  
  var isFixedPosition: Boolean = js.native
  
  var maxHeight: Double = js.native
  
  var menuEl: Ref[_] = js.native
  
  var minHeight: Double = js.native
  
  var placement: bottom | top | auto = js.native
  
  var shouldScroll: Boolean = js.native
}
object PlacementArgs {
  
  @scala.inline
  def apply(
    isFixedPosition: Boolean,
    maxHeight: Double,
    minHeight: Double,
    placement: bottom | top | auto,
    shouldScroll: Boolean
  ): PlacementArgs = {
    val __obj = js.Dynamic.literal(isFixedPosition = isFixedPosition.asInstanceOf[js.Any], maxHeight = maxHeight.asInstanceOf[js.Any], minHeight = minHeight.asInstanceOf[js.Any], placement = placement.asInstanceOf[js.Any], shouldScroll = shouldScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlacementArgs]
  }
  
  @scala.inline
  implicit class PlacementArgsOps[Self <: PlacementArgs] (val x: Self) extends AnyVal {
    
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
    def setIsFixedPosition(value: Boolean): Self = this.set("isFixedPosition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxHeight(value: Double): Self = this.set("maxHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMinHeight(value: Double): Self = this.set("minHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlacement(value: bottom | top | auto): Self = this.set("placement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShouldScroll(value: Boolean): Self = this.set("shouldScroll", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuElFunction1(value: /* instance */ _ | Null => Unit): Self = this.set("menuEl", js.Any.fromFunction1(value))
    
    @scala.inline
    def setMenuEl(value: Ref[_]): Self = this.set("menuEl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuElNull: Self = this.set("menuEl", null)
  }
}
