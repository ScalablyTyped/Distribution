package typings.reactSplitPane

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined std.Partial<react-split-pane.react-split-pane.SplitPaneState> */
  trait PartialSplitPaneState extends StObject {
    
    var active: js.UndefOr[Boolean] = js.undefined
    
    var resized: js.UndefOr[Boolean] = js.undefined
  }
  object PartialSplitPaneState {
    
    inline def apply(): PartialSplitPaneState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSplitPaneState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialSplitPaneState] (val x: Self) extends AnyVal {
      
      inline def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      inline def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      inline def setResized(value: Boolean): Self = StObject.set(x, "resized", value.asInstanceOf[js.Any])
      
      inline def setResizedUndefined: Self = StObject.set(x, "resized", js.undefined)
    }
  }
}
