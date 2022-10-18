package typings.reactRemoveScrollBar

import typings.react.mod.FC
import typings.reactRemoveScrollBar.distEs5ComponentMod.BodyScroll
import typings.reactRemoveScrollBar.distEs5UtilsMod.GapMode
import typings.reactRemoveScrollBar.distEs5UtilsMod.GapOffset
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-remove-scroll-bar", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("react-remove-scroll-bar", "RemoveScrollBar")
  @js.native
  val RemoveScrollBar: FC[BodyScroll] = js.native
  
  @JSImport("react-remove-scroll-bar", "fullWidthClassName")
  @js.native
  val fullWidthClassName: /* "width-before-scroll-bar" */ String = js.native
  
  inline def getGapWidth(): GapOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("getGapWidth")().asInstanceOf[GapOffset]
  inline def getGapWidth(gapMode: GapMode): GapOffset = ^.asInstanceOf[js.Dynamic].applyDynamic("getGapWidth")(gapMode.asInstanceOf[js.Any]).asInstanceOf[GapOffset]
  
  @JSImport("react-remove-scroll-bar", "noScrollbarsClassName")
  @js.native
  val noScrollbarsClassName: /* "with-scroll-bars-hidden" */ String = js.native
  
  @JSImport("react-remove-scroll-bar", "removedBarSizeVariable")
  @js.native
  val removedBarSizeVariable: /* "--removed-body-scroll-bar-size" */ String = js.native
  
  @JSImport("react-remove-scroll-bar", "zeroRightClassName")
  @js.native
  val zeroRightClassName: /* "right-scroll-bar-position" */ String = js.native
}
