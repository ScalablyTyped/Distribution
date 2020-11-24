package typings.reactFoundation.anon

import typings.propTypes.mod.Requireable
import typings.propTypes.mod.Validator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AlignX extends js.Object {
  
  var alignX: Requireable[_] = js.native
  
  var alignY: Requireable[_] = js.native
  
  var breakpoint: Validator[_] = js.native
  
  var centerAlign: Requireable[_] = js.native
  
  var flexChild: Requireable[_] = js.native
  
  var flexContainer: Requireable[_] = js.native
  
  var flexDirCol: Requireable[_] = js.native
  
  var flexDirColRev: Requireable[_] = js.native
  
  var flexDirRow: Requireable[_] = js.native
  
  var flexDirRowRev: Requireable[_] = js.native
  
  var flexOrder: Requireable[_] = js.native
  
  var flexOrderLarge: Requireable[_] = js.native
  
  var flexOrderMedium: Requireable[_] = js.native
  
  var flexOrderSmall: Requireable[_] = js.native
  
  var float: Requireable[_] = js.native
  
  var hideFor: Requireable[_] = js.native
  
  var hideOnlyFor: Requireable[_] = js.native
  
  var isClearfix: Requireable[_] = js.native
  
  var isHidden: Requireable[_] = js.native
  
  var isInvisible: Requireable[_] = js.native
  
  var selfAlignX: Requireable[_] = js.native
  
  var selfAlignY: Requireable[_] = js.native
  
  var showFor: Requireable[_] = js.native
  
  var showForLandscape: Requireable[_] = js.native
  
  var showForPortrait: Requireable[_] = js.native
  
  var showForSr: Requireable[_] = js.native
  
  var showOnFocus: Requireable[_] = js.native
  
  var showOnlyFor: Requireable[_] = js.native
}
object AlignX {
  
  @scala.inline
  def apply(
    alignX: Requireable[_],
    alignY: Requireable[_],
    breakpoint: Validator[_],
    centerAlign: Requireable[_],
    flexChild: Requireable[_],
    flexContainer: Requireable[_],
    flexDirCol: Requireable[_],
    flexDirColRev: Requireable[_],
    flexDirRow: Requireable[_],
    flexDirRowRev: Requireable[_],
    flexOrder: Requireable[_],
    flexOrderLarge: Requireable[_],
    flexOrderMedium: Requireable[_],
    flexOrderSmall: Requireable[_],
    float: Requireable[_],
    hideFor: Requireable[_],
    hideOnlyFor: Requireable[_],
    isClearfix: Requireable[_],
    isHidden: Requireable[_],
    isInvisible: Requireable[_],
    selfAlignX: Requireable[_],
    selfAlignY: Requireable[_],
    showFor: Requireable[_],
    showForLandscape: Requireable[_],
    showForPortrait: Requireable[_],
    showForSr: Requireable[_],
    showOnFocus: Requireable[_],
    showOnlyFor: Requireable[_]
  ): AlignX = {
    val __obj = js.Dynamic.literal(alignX = alignX.asInstanceOf[js.Any], alignY = alignY.asInstanceOf[js.Any], breakpoint = breakpoint.asInstanceOf[js.Any], centerAlign = centerAlign.asInstanceOf[js.Any], flexChild = flexChild.asInstanceOf[js.Any], flexContainer = flexContainer.asInstanceOf[js.Any], flexDirCol = flexDirCol.asInstanceOf[js.Any], flexDirColRev = flexDirColRev.asInstanceOf[js.Any], flexDirRow = flexDirRow.asInstanceOf[js.Any], flexDirRowRev = flexDirRowRev.asInstanceOf[js.Any], flexOrder = flexOrder.asInstanceOf[js.Any], flexOrderLarge = flexOrderLarge.asInstanceOf[js.Any], flexOrderMedium = flexOrderMedium.asInstanceOf[js.Any], flexOrderSmall = flexOrderSmall.asInstanceOf[js.Any], float = float.asInstanceOf[js.Any], hideFor = hideFor.asInstanceOf[js.Any], hideOnlyFor = hideOnlyFor.asInstanceOf[js.Any], isClearfix = isClearfix.asInstanceOf[js.Any], isHidden = isHidden.asInstanceOf[js.Any], isInvisible = isInvisible.asInstanceOf[js.Any], selfAlignX = selfAlignX.asInstanceOf[js.Any], selfAlignY = selfAlignY.asInstanceOf[js.Any], showFor = showFor.asInstanceOf[js.Any], showForLandscape = showForLandscape.asInstanceOf[js.Any], showForPortrait = showForPortrait.asInstanceOf[js.Any], showForSr = showForSr.asInstanceOf[js.Any], showOnFocus = showOnFocus.asInstanceOf[js.Any], showOnlyFor = showOnlyFor.asInstanceOf[js.Any])
    __obj.asInstanceOf[AlignX]
  }
  
  @scala.inline
  implicit class AlignXOps[Self <: AlignX] (val x: Self) extends AnyVal {
    
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
    def setAlignX(value: Requireable[_]): Self = this.set("alignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAlignY(value: Requireable[_]): Self = this.set("alignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBreakpoint(value: Validator[_]): Self = this.set("breakpoint", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCenterAlign(value: Requireable[_]): Self = this.set("centerAlign", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexChild(value: Requireable[_]): Self = this.set("flexChild", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexContainer(value: Requireable[_]): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirCol(value: Requireable[_]): Self = this.set("flexDirCol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirColRev(value: Requireable[_]): Self = this.set("flexDirColRev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirRow(value: Requireable[_]): Self = this.set("flexDirRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexDirRowRev(value: Requireable[_]): Self = this.set("flexDirRowRev", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexOrder(value: Requireable[_]): Self = this.set("flexOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexOrderLarge(value: Requireable[_]): Self = this.set("flexOrderLarge", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexOrderMedium(value: Requireable[_]): Self = this.set("flexOrderMedium", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlexOrderSmall(value: Requireable[_]): Self = this.set("flexOrderSmall", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFloat(value: Requireable[_]): Self = this.set("float", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideFor(value: Requireable[_]): Self = this.set("hideFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideOnlyFor(value: Requireable[_]): Self = this.set("hideOnlyFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsClearfix(value: Requireable[_]): Self = this.set("isClearfix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHidden(value: Requireable[_]): Self = this.set("isHidden", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsInvisible(value: Requireable[_]): Self = this.set("isInvisible", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfAlignX(value: Requireable[_]): Self = this.set("selfAlignX", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelfAlignY(value: Requireable[_]): Self = this.set("selfAlignY", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowFor(value: Requireable[_]): Self = this.set("showFor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowForLandscape(value: Requireable[_]): Self = this.set("showForLandscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowForPortrait(value: Requireable[_]): Self = this.set("showForPortrait", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowForSr(value: Requireable[_]): Self = this.set("showForSr", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnFocus(value: Requireable[_]): Self = this.set("showOnFocus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowOnlyFor(value: Requireable[_]): Self = this.set("showOnlyFor", value.asInstanceOf[js.Any])
  }
}
