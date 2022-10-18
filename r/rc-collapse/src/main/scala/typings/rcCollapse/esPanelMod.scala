package typings.rcCollapse

import typings.rcCollapse.esInterfaceMod.CollapsePanelProps
import typings.react.mod.Component
import typings.react.mod.KeyboardEvent
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esPanelMod {
  
  @JSImport("rc-collapse/es/Panel", JSImport.Default)
  @js.native
  open class default () extends CollapsePanel
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.forceRender")
      @js.native
      def forceRender: Boolean = js.native
      inline def forceRender_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.headerClass")
      @js.native
      def headerClass: String = js.native
      inline def headerClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.isActive")
      @js.native
      def isActive: Boolean = js.native
      inline def isActive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isActive")(x.asInstanceOf[js.Any])
      
      inline def onItemClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onItemClick")().asInstanceOf[Unit]
      
      @JSImport("rc-collapse/es/Panel", "default.defaultProps.showArrow")
      @js.native
      def showArrow: Boolean = js.native
      inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CollapsePanel extends Component[CollapsePanelProps, Any, Any] {
    
    def handleKeyPress(e: KeyboardEvent[Element]): Unit = js.native
    
    def onItemClick(): Unit = js.native
    
    def renderIcon(): typings.react.mod.global.JSX.Element = js.native
    
    def renderTitle(): typings.react.mod.global.JSX.Element = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MCollapsePanel(nextProps: CollapsePanelProps): Boolean = js.native
  }
}
