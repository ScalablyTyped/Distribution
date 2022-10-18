package typings.reactToolbox

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ReactNode
import typings.reactToolbox.reactToolboxStrings.bottom
import typings.reactToolbox.reactToolboxStrings.horizontal
import typings.reactToolbox.reactToolboxStrings.left
import typings.reactToolbox.reactToolboxStrings.right
import typings.reactToolbox.reactToolboxStrings.top
import typings.reactToolbox.reactToolboxStrings.vertical
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsTooltipMod {
  
  @JSImport("react-toolbox/components/tooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[P](
    component: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify React.ReactType */ Any
  ): TooltippedComponentClass[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(component.asInstanceOf[js.Any]).asInstanceOf[TooltippedComponentClass[P]]
  
  inline def tooltipFactory[P](): tooltipHOC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltipFactory")().asInstanceOf[tooltipHOC[P]]
  inline def tooltipFactory[P](options: TooltipOptions): tooltipHOC[P] = ^.asInstanceOf[js.Dynamic].applyDynamic("tooltipFactory")(options.asInstanceOf[js.Any]).asInstanceOf[tooltipHOC[P]]
  
  @js.native
  trait TooltipComponent[P, S] extends Component[P, S, Any] {
    
    @JSName("props")
    var props_TooltipComponent: P & TooltipProps = js.native
  }
  
  trait TooltipOptions extends StObject {
    
    var className: js.UndefOr[String] = js.undefined
    
    var delay: js.UndefOr[Double] = js.undefined
    
    var hideOnClick: js.UndefOr[Boolean] = js.undefined
    
    var passthrough: js.UndefOr[Boolean] = js.undefined
    
    var position: js.UndefOr[bottom | horizontal | left | right | top | vertical] = js.undefined
    
    var showOnClick: js.UndefOr[Boolean] = js.undefined
  }
  object TooltipOptions {
    
    inline def apply(): TooltipOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipOptions]
    }
    
    extension [Self <: TooltipOptions](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setHideOnClick(value: Boolean): Self = StObject.set(x, "hideOnClick", value.asInstanceOf[js.Any])
      
      inline def setHideOnClickUndefined: Self = StObject.set(x, "hideOnClick", js.undefined)
      
      inline def setPassthrough(value: Boolean): Self = StObject.set(x, "passthrough", value.asInstanceOf[js.Any])
      
      inline def setPassthroughUndefined: Self = StObject.set(x, "passthrough", js.undefined)
      
      inline def setPosition(value: bottom | horizontal | left | right | top | vertical): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setShowOnClick(value: Boolean): Self = StObject.set(x, "showOnClick", value.asInstanceOf[js.Any])
      
      inline def setShowOnClickUndefined: Self = StObject.set(x, "showOnClick", js.undefined)
    }
  }
  
  trait TooltipProps
    extends StObject
       with /**
    * Additional properties passed to Radio container.
    */
  /* key */ StringDictionary[Any] {
    
    /**
      * Additional class added to composed component.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Callback to be invoked when Component is clicked.
      */
    var onClick: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the mouse enters the Component.
      */
    var onMouseEnter: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Callback called when the mouse leaves the Component.
      */
    var onMouseLeave: js.UndefOr[js.Function] = js.undefined
    
    /**
      * Classnames object defining the component style.
      */
    var theme: js.UndefOr[TooltipTheme] = js.undefined
    
    /**
      * The text (or node) used for the tooltip.
      */
    var tooltip: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * Amount of time in miliseconds spent before the tooltip is visible.
      * @default 0
      */
    var tooltipDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, the Tooltip hides after a click in the host component.
      * @default true
      */
    var tooltipHideOnClick: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tooltip position.
      * @default "vertical"
      */
    var tooltipPosition: js.UndefOr[bottom | top | left | right | horizontal | vertical] = js.undefined
    
    /**
      * Determines the tooltip should be toggled when clicked. This is useful for mobile where there is no mouse enter.
      * @default false
      */
    var tooltipShowOnClick: js.UndefOr[Boolean] = js.undefined
  }
  object TooltipProps {
    
    inline def apply(): TooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipProps]
    }
    
    extension [Self <: TooltipProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setOnClick(value: js.Function): Self = StObject.set(x, "onClick", value.asInstanceOf[js.Any])
      
      inline def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
      
      inline def setOnMouseEnter(value: js.Function): Self = StObject.set(x, "onMouseEnter", value.asInstanceOf[js.Any])
      
      inline def setOnMouseEnterUndefined: Self = StObject.set(x, "onMouseEnter", js.undefined)
      
      inline def setOnMouseLeave(value: js.Function): Self = StObject.set(x, "onMouseLeave", value.asInstanceOf[js.Any])
      
      inline def setOnMouseLeaveUndefined: Self = StObject.set(x, "onMouseLeave", js.undefined)
      
      inline def setTheme(value: TooltipTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
      
      inline def setTooltip(value: ReactNode): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipDelay(value: Double): Self = StObject.set(x, "tooltipDelay", value.asInstanceOf[js.Any])
      
      inline def setTooltipDelayUndefined: Self = StObject.set(x, "tooltipDelay", js.undefined)
      
      inline def setTooltipHideOnClick(value: Boolean): Self = StObject.set(x, "tooltipHideOnClick", value.asInstanceOf[js.Any])
      
      inline def setTooltipHideOnClickUndefined: Self = StObject.set(x, "tooltipHideOnClick", js.undefined)
      
      inline def setTooltipPosition(value: bottom | top | left | right | horizontal | vertical): Self = StObject.set(x, "tooltipPosition", value.asInstanceOf[js.Any])
      
      inline def setTooltipPositionUndefined: Self = StObject.set(x, "tooltipPosition", js.undefined)
      
      inline def setTooltipShowOnClick(value: Boolean): Self = StObject.set(x, "tooltipShowOnClick", value.asInstanceOf[js.Any])
      
      inline def setTooltipShowOnClickUndefined: Self = StObject.set(x, "tooltipShowOnClick", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
    }
  }
  
  trait TooltipTheme extends StObject {
    
    /**
      * Added to the tooltip element.
      */
    var tooltip: js.UndefOr[String] = js.undefined
    
    /**
      * Added to the root when the tooltip is active.
      */
    var tooltipActive: js.UndefOr[String] = js.undefined
    
    /**
      * Wrapper for the root element used to position the tooltip.
      */
    var tooltipWrapper: js.UndefOr[String] = js.undefined
  }
  object TooltipTheme {
    
    inline def apply(): TooltipTheme = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TooltipTheme]
    }
    
    extension [Self <: TooltipTheme](x: Self) {
      
      inline def setTooltip(value: String): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      inline def setTooltipActive(value: String): Self = StObject.set(x, "tooltipActive", value.asInstanceOf[js.Any])
      
      inline def setTooltipActiveUndefined: Self = StObject.set(x, "tooltipActive", js.undefined)
      
      inline def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      inline def setTooltipWrapper(value: String): Self = StObject.set(x, "tooltipWrapper", value.asInstanceOf[js.Any])
      
      inline def setTooltipWrapperUndefined: Self = StObject.set(x, "tooltipWrapper", js.undefined)
    }
  }
  
  @js.native
  trait TooltippedComponentClass[P]
    extends StObject
       with TooltipProps
       with Instantiable0[TooltipComponent[P, Any]]
       with Instantiable1[/* props */ P, TooltipComponent[P, Any]]
       with Instantiable2[(/* props */ P) | (/* props */ Unit), /* context */ Any, TooltipComponent[P, Any]]
  
  type tooltipHOC[P] = js.Function1[
    /* componentClass */ ComponentClass[P, ComponentState], 
    TooltippedComponentClass[P]
  ]
}
