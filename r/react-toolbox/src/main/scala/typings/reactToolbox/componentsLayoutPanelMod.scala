package typings.reactToolbox

import typings.react.mod.Component
import typings.reactToolbox.mod.ReactToolbox.Props
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsLayoutPanelMod {
  
  @JSImport("react-toolbox/components/layout/Panel", "Panel")
  @js.native
  open class Panel protected ()
    extends Component[PanelProps, js.Object, Any] {
    def this(props: PanelProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: PanelProps, context: Any) = this()
  }
  
  trait PanelProps
    extends StObject
       with Props {
    
    /**
      * You can set it to true in case you are using a pinned Sidebar so it takes an scrolled `div` instead of using the document scroll.
      */
    var bodyScroll: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[PanelTheme] = js.undefined
  }
  object PanelProps {
    
    inline def apply(): PanelProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelProps]
    }
    
    extension [Self <: PanelProps](x: Self) {
      
      inline def setBodyScroll(value: Boolean): Self = StObject.set(x, "bodyScroll", value.asInstanceOf[js.Any])
      
      inline def setBodyScrollUndefined: Self = StObject.set(x, "bodyScroll", js.undefined)
      
      inline def setTheme(value: PanelTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  trait PanelTheme extends StObject {
    
    /**
      * Used in the root class in case the panel has bodyScroll.
      */
    var bodyScroll: js.UndefOr[String] = js.undefined
    
    /**
      * Used as the root class of the panel component.
      */
    var panel: js.UndefOr[String] = js.undefined
  }
  object PanelTheme {
    
    inline def apply(): PanelTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PanelTheme]
    }
    
    extension [Self <: PanelTheme](x: Self) {
      
      inline def setBodyScroll(value: String): Self = StObject.set(x, "bodyScroll", value.asInstanceOf[js.Any])
      
      inline def setBodyScrollUndefined: Self = StObject.set(x, "bodyScroll", js.undefined)
      
      inline def setPanel(value: String): Self = StObject.set(x, "panel", value.asInstanceOf[js.Any])
      
      inline def setPanelUndefined: Self = StObject.set(x, "panel", js.undefined)
    }
  }
}
