package typings.rcCollapse

import org.scalablytyped.runtime.Instantiable0
import typings.rcCollapse.anon.PartialCollapseState
import typings.rcCollapse.anon.Typeofdefault
import typings.rcCollapse.interfaceMod.CollapseProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-collapse", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rcCollapse.collapseMod.default {
    def this(props: CollapseProps) = this()
  }
  object default {
    
    @JSImport("rc-collapse", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* was `typeof CollapsePanel` */
    @JSImport("rc-collapse", "default.Panel")
    @js.native
    class Panel ()
      extends typings.rcCollapse.collapseMod.default.Panel
    /* was `typeof CollapsePanel` */
    object Panel {
      
      /* static member */
      object defaultProps {
        
        @JSImport("rc-collapse", "default.Panel.defaultProps")
        @js.native
        val ^ : js.Any = js.native
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.forceRender")
        @js.native
        def forceRender: Boolean = js.native
        inline def forceRender_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(x.asInstanceOf[js.Any])
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.headerClass")
        @js.native
        def headerClass: String = js.native
        inline def headerClass_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("headerClass")(x.asInstanceOf[js.Any])
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.isActive")
        @js.native
        def isActive: Boolean = js.native
        inline def isActive_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isActive")(x.asInstanceOf[js.Any])
        
        inline def onItemClick(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onItemClick")().asInstanceOf[Unit]
        
        @JSImport("rc-collapse", "default.Panel.defaultProps.showArrow")
        @js.native
        def showArrow: Boolean = js.native
        inline def showArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showArrow")(x.asInstanceOf[js.Any])
      }
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-collapse", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("rc-collapse", "default.defaultProps.accordion")
      @js.native
      def accordion: Boolean = js.native
      inline def accordion_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("accordion")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-collapse", "default.defaultProps.destroyInactivePanel")
      @js.native
      def destroyInactivePanel: Boolean = js.native
      inline def destroyInactivePanel_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("destroyInactivePanel")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("rc-collapse", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(nextProps: CollapseProps): PartialCollapseState = ^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(nextProps.asInstanceOf[js.Any]).asInstanceOf[PartialCollapseState]
  }
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("rc-collapse", "Panel")
  @js.native
  class Panel ()
    extends typings.rcCollapse.panelMod.default
  @JSImport("rc-collapse", "Panel")
  @js.native
  val Panel: Instantiable0[typings.rcCollapse.panelMod.default] & Typeofdefault = js.native
}
