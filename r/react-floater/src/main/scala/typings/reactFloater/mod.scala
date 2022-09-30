package typings.reactFloater

import typings.react.mod.global.JSX.Element
import typings.reactFloater.typesMod.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    inline def apply(props: Props): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("react-floater", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    object defaultProps {
      
      @JSImport("react-floater", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("react-floater", "default.defaultProps.autoOpen")
      @js.native
      def autoOpen: Boolean = js.native
      inline def autoOpen_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoOpen")(x.asInstanceOf[js.Any])
      
      @JSImport("react-floater", "default.defaultProps.debug")
      @js.native
      def debug: Boolean = js.native
      inline def debug_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("debug")(x.asInstanceOf[js.Any])
      
      @JSImport("react-floater", "default.defaultProps.disableFlip")
      @js.native
      def disableFlip: Boolean = js.native
      inline def disableFlip_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableFlip")(x.asInstanceOf[js.Any])
      
      @JSImport("react-floater", "default.defaultProps.disableHoverToClick")
      @js.native
      def disableHoverToClick: Boolean = js.native
      inline def disableHoverToClick_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disableHoverToClick")(x.asInstanceOf[js.Any])
      
      @JSImport("react-floater", "default.defaultProps.event")
      @js.native
      def event: String = js.native
      
      @JSImport("react-floater", "default.defaultProps.eventDelay")
      @js.native
      def eventDelay: Double = js.native
      inline def eventDelay_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("eventDelay")(x.asInstanceOf[js.Any])
      
      inline def event_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("event")(x.asInstanceOf[js.Any])
      
      @JSImport("react-floater", "default.defaultProps.hideArrow")
      @js.native
      def hideArrow: Boolean = js.native
      inline def hideArrow_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("hideArrow")(x.asInstanceOf[js.Any])
      
      @JSImport("react-floater", "default.defaultProps.offset")
      @js.native
      def offset: Double = js.native
      inline def offset_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("offset")(x.asInstanceOf[js.Any])
      
      @JSImport("react-floater", "default.defaultProps.placement")
      @js.native
      def placement: String = js.native
      inline def placement_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("placement")(x.asInstanceOf[js.Any])
      
      @JSImport("react-floater", "default.defaultProps.showCloseButton")
      @js.native
      def showCloseButton: Boolean = js.native
      inline def showCloseButton_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("showCloseButton")(x.asInstanceOf[js.Any])
    }
  }
}
