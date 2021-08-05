package typings.rcDrawer

import typings.rcDrawer.anon.Open
import typings.rcDrawer.anon.PrevPropsIDrawerProps
import typings.rcDrawer.idrawerproptypesMod.IDrawerProps
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("rc-drawer", JSImport.Default)
  @js.native
  class default protected ()
    extends typings.rcDrawer.drawerWrapperMod.default {
    def this(props: IDrawerProps) = this()
  }
  object default {
    
    @JSImport("rc-drawer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    object defaultProps {
      
      @JSImport("rc-drawer", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      inline def afterVisibleChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("afterVisibleChange")().asInstanceOf[Unit]
      
      @JSImport("rc-drawer", "default.defaultProps.className")
      @js.native
      def className: String = js.native
      inline def className_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("className")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.defaultOpen")
      @js.native
      def defaultOpen: Boolean = js.native
      inline def defaultOpen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.duration")
      @js.native
      def duration: String = js.native
      inline def duration_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("duration")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.ease")
      @js.native
      def ease: String = js.native
      inline def ease_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("ease")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.forceRender")
      @js.native
      def forceRender: Boolean = js.native
      inline def forceRender_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("forceRender")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.getContainer")
      @js.native
      def getContainer: String = js.native
      inline def getContainer_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getContainer")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.handler")
      @js.native
      def handler: Element = js.native
      inline def handler_=(x: Element): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("handler")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.keyboard")
      @js.native
      def keyboard: Boolean = js.native
      inline def keyboard_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("keyboard")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.level")
      @js.native
      def level: String = js.native
      inline def level_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("level")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.maskClosable")
      @js.native
      def maskClosable: Boolean = js.native
      inline def maskClosable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(x.asInstanceOf[js.Any])
      
      inline def onChange(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onChange")().asInstanceOf[Unit]
      
      @JSImport("rc-drawer", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.showMask")
      @js.native
      def showMask: Boolean = js.native
      inline def showMask_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showMask")(x.asInstanceOf[js.Any])
      
      @JSImport("rc-drawer", "default.defaultProps.wrapperClassName")
      @js.native
      def wrapperClassName: String = js.native
      inline def wrapperClassName_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("wrapperClassName")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    inline def getDerivedStateFromProps(props: IDrawerProps, hasPrevProps: PrevPropsIDrawerProps): Open = (^.asInstanceOf[js.Dynamic].applyDynamic("getDerivedStateFromProps")(props.asInstanceOf[js.Any], hasPrevProps.asInstanceOf[js.Any])).asInstanceOf[Open]
  }
}
