package typings.reactDndTouchBackend

import typings.reactDndTouchBackend.anon.PartialTouchBackendOption
import typings.reactDndTouchBackend.interfacesMod.AngleRange
import typings.reactDndTouchBackend.interfacesMod.TouchBackendContext
import typings.reactDndTouchBackend.interfacesMod.TouchBackendOptions
import typings.std.Document
import typings.std.HTMLElement
import typings.std.Node
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optionsReaderMod {
  
  @JSImport("react-dnd-touch-backend/dist/OptionsReader", "OptionsReader")
  @js.native
  open class OptionsReader protected ()
    extends StObject
       with TouchBackendOptions {
    def this(args: PartialTouchBackendOption, context: TouchBackendContext) = this()
    
    /* private */ var args: Any = js.native
    
    /* private */ var context: Any = js.native
    
    /* CompleteClass */
    var delay: Double = js.native
    
    /* CompleteClass */
    var delayMouseStart: Double = js.native
    @JSName("delayMouseStart")
    def delayMouseStart_MOptionsReader: Double = js.native
    
    /* CompleteClass */
    var delayTouchStart: Double = js.native
    @JSName("delayTouchStart")
    def delayTouchStart_MOptionsReader: Double = js.native
    
    @JSName("delay")
    def delay_MOptionsReader: Double = js.native
    
    def document: js.UndefOr[Document] = js.native
    
    /* CompleteClass */
    var enableHoverOutsideTarget: Boolean = js.native
    @JSName("enableHoverOutsideTarget")
    def enableHoverOutsideTarget_MOptionsReader: Boolean = js.native
    
    /* CompleteClass */
    var enableKeyboardEvents: Boolean = js.native
    @JSName("enableKeyboardEvents")
    def enableKeyboardEvents_MOptionsReader: Boolean = js.native
    
    /* CompleteClass */
    var enableMouseEvents: Boolean = js.native
    @JSName("enableMouseEvents")
    def enableMouseEvents_MOptionsReader: Boolean = js.native
    
    /* CompleteClass */
    var enableTouchEvents: Boolean = js.native
    @JSName("enableTouchEvents")
    def enableTouchEvents_MOptionsReader: Boolean = js.native
    
    @JSName("getDropTargetElementsAtPoint")
    def getDropTargetElementsAtPoint_MOptionsReader: js.UndefOr[
        js.Function3[
          /* x */ Double, 
          /* y */ Double, 
          /* elements */ js.Array[HTMLElement], 
          js.Array[HTMLElement]
        ]
      ] = js.native
    
    /* CompleteClass */
    var ignoreContextMenu: Boolean = js.native
    @JSName("ignoreContextMenu")
    def ignoreContextMenu_MOptionsReader: Boolean = js.native
    
    @JSName("rootElement")
    def rootElement_MOptionsReader: js.UndefOr[Node] = js.native
    
    @JSName("scrollAngleRanges")
    def scrollAngleRanges_MOptionsReader: js.UndefOr[js.Array[AngleRange]] = js.native
    
    /* CompleteClass */
    var touchSlop: Double = js.native
    @JSName("touchSlop")
    def touchSlop_MOptionsReader: Double = js.native
    
    def window: js.UndefOr[Window] = js.native
  }
}
