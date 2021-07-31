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
    
    @scala.inline
    def apply(): PartialSplitPaneState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialSplitPaneState]
    }
    
    @scala.inline
    implicit class PartialSplitPaneStateMutableBuilder[Self <: PartialSplitPaneState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActive(value: Boolean): Self = StObject.set(x, "active", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveUndefined: Self = StObject.set(x, "active", js.undefined)
      
      @scala.inline
      def setResized(value: Boolean): Self = StObject.set(x, "resized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizedUndefined: Self = StObject.set(x, "resized", js.undefined)
    }
  }
}
