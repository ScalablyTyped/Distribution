package typings.reactRemoveScrollBar

import typings.react.mod.FC
import typings.reactRemoveScrollBar.distEs5UtilsMod.GapMode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distEs5ComponentMod {
  
  @JSImport("react-remove-scroll-bar/dist/es5/component", "RemoveScrollBar")
  @js.native
  val RemoveScrollBar: FC[BodyScroll] = js.native
  
  trait BodyScroll extends StObject {
    
    var gapMode: js.UndefOr[GapMode] = js.undefined
    
    var noImportant: js.UndefOr[Boolean] = js.undefined
    
    var noRelative: js.UndefOr[Boolean] = js.undefined
  }
  object BodyScroll {
    
    inline def apply(): BodyScroll = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BodyScroll]
    }
    
    extension [Self <: BodyScroll](x: Self) {
      
      inline def setGapMode(value: GapMode): Self = StObject.set(x, "gapMode", value.asInstanceOf[js.Any])
      
      inline def setGapModeUndefined: Self = StObject.set(x, "gapMode", js.undefined)
      
      inline def setNoImportant(value: Boolean): Self = StObject.set(x, "noImportant", value.asInstanceOf[js.Any])
      
      inline def setNoImportantUndefined: Self = StObject.set(x, "noImportant", js.undefined)
      
      inline def setNoRelative(value: Boolean): Self = StObject.set(x, "noRelative", value.asInstanceOf[js.Any])
      
      inline def setNoRelativeUndefined: Self = StObject.set(x, "noRelative", js.undefined)
    }
  }
}
