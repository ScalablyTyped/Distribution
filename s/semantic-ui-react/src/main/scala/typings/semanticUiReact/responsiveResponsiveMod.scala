package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object responsiveResponsiveMod {
  
  @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", JSImport.Default)
  @js.native
  class default ()
    extends Component[ResponsiveProps, js.Object, js.Any]
  object default {
    
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyComputer")
    @js.native
    def onlyComputer: ResponsiveWidthShorthand = js.native
    inline def onlyComputer_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyComputer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyLargeScreen")
    @js.native
    def onlyLargeScreen: ResponsiveWidthShorthand = js.native
    inline def onlyLargeScreen_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyLargeScreen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyMobile")
    @js.native
    def onlyMobile: ResponsiveWidthShorthand = js.native
    inline def onlyMobile_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyMobile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyTablet")
    @js.native
    def onlyTablet: ResponsiveWidthShorthand = js.native
    inline def onlyTablet_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyTablet")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyWidescreen")
    @js.native
    def onlyWidescreen: ResponsiveWidthShorthand = js.native
    inline def onlyWidescreen_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyWidescreen")(x.asInstanceOf[js.Any])
  }
  
  type Responsive = Component[ResponsiveProps, js.Object, js.Any]
  
  trait ResponsiveOnUpdateData
    extends StObject
       with ResponsiveProps {
    
    var width: Double
  }
  object ResponsiveOnUpdateData {
    
    inline def apply(width: Double): ResponsiveOnUpdateData = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsiveOnUpdateData]
    }
    
    extension [Self <: ResponsiveOnUpdateData](x: Self) {
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait ResponsiveProps
    extends StObject
       with StrictResponsiveProps
       with /* key */ StringDictionary[js.Any]
  object ResponsiveProps {
    
    inline def apply(): ResponsiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveProps]
    }
  }
  
  trait ResponsiveWidthShorthand extends StObject {
    
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    var minWidth: js.UndefOr[Double | String] = js.undefined
  }
  object ResponsiveWidthShorthand {
    
    inline def apply(): ResponsiveWidthShorthand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveWidthShorthand]
    }
    
    extension [Self <: ResponsiveWidthShorthand](x: Self) {
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
  
  trait StrictResponsiveProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.undefined
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /** Fires callbacks immediately after mount. */
    var fireOnMount: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
      * otherwise, assumes a width of 0.
      */
    var getWidth: js.UndefOr[js.Function0[Double]] = js.undefined
    
    /** The maximum width at which content will be displayed. */
    var maxWidth: js.UndefOr[Double | String] = js.undefined
    
    /** The minimum width at which content will be displayed. */
    var minWidth: js.UndefOr[Double | String] = js.undefined
    
    /**
      * Called on update.
      *
      * @param {SyntheticEvent} event - The React SyntheticEvent object
      * @param {object} data - All props and the event value.
      */
    var onUpdate: js.UndefOr[
        js.Function2[
          /* event */ SyntheticEvent[HTMLElement, Event], 
          /* data */ ResponsiveOnUpdateData, 
          Unit
        ]
      ] = js.undefined
  }
  object StrictResponsiveProps {
    
    inline def apply(): StrictResponsiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictResponsiveProps]
    }
    
    extension [Self <: StrictResponsiveProps](x: Self) {
      
      inline def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      inline def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setFireOnMount(value: Boolean): Self = StObject.set(x, "fireOnMount", value.asInstanceOf[js.Any])
      
      inline def setFireOnMountUndefined: Self = StObject.set(x, "fireOnMount", js.undefined)
      
      inline def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      inline def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      inline def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      inline def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      inline def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      inline def setOnUpdate(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ ResponsiveOnUpdateData) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction2(value))
      
      inline def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
}
