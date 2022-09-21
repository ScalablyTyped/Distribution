package typings.reactRemoveScrollBar

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object utilsMod {
  
  @JSImport("react-remove-scroll-bar/dist/es5/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getGapWidth(): GapOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("getGapWidth")().asInstanceOf[GapOffset]
  inline def getGapWidth(gapMode: GapMode): GapOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("getGapWidth")(gapMode.asInstanceOf[js.Any]).asInstanceOf[GapOffset]
  
  object zeroGap {
    
    @JSImport("react-remove-scroll-bar/dist/es5/utils", "zeroGap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("react-remove-scroll-bar/dist/es5/utils", "zeroGap.gap")
    @js.native
    def gap: Double = js.native
    inline def gap_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gap")(x.asInstanceOf[js.Any])
    
    @JSImport("react-remove-scroll-bar/dist/es5/utils", "zeroGap.left")
    @js.native
    def left: Double = js.native
    inline def left_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @JSImport("react-remove-scroll-bar/dist/es5/utils", "zeroGap.right")
    @js.native
    def right: Double = js.native
    inline def right_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    
    @JSImport("react-remove-scroll-bar/dist/es5/utils", "zeroGap.top")
    @js.native
    def top: Double = js.native
    inline def top_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("top")(x.asInstanceOf[js.Any])
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactRemoveScrollBar.reactRemoveScrollBarStrings.padding
    - typings.reactRemoveScrollBar.reactRemoveScrollBarStrings.margin
  */
  trait GapMode extends StObject
  object GapMode {
    
    inline def margin: typings.reactRemoveScrollBar.reactRemoveScrollBarStrings.margin = "margin".asInstanceOf[typings.reactRemoveScrollBar.reactRemoveScrollBarStrings.margin]
    
    inline def padding: typings.reactRemoveScrollBar.reactRemoveScrollBarStrings.padding = "padding".asInstanceOf[typings.reactRemoveScrollBar.reactRemoveScrollBarStrings.padding]
  }
  
  trait GapOffset extends StObject {
    
    var gap: Double
    
    var left: Double
    
    var right: Double
    
    var top: Double
  }
  object GapOffset {
    
    inline def apply(gap: Double, left: Double, right: Double, top: Double): GapOffset = {
      val __obj = js.Dynamic.literal(gap = gap.asInstanceOf[js.Any], left = left.asInstanceOf[js.Any], right = right.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[GapOffset]
    }
    
    extension [Self <: GapOffset](x: Self) {
      
      inline def setGap(value: Double): Self = StObject.set(x, "gap", value.asInstanceOf[js.Any])
      
      inline def setLeft(value: Double): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setRight(value: Double): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
