package typings.semanticUiReact

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.SyntheticEvent
import typings.std.Event
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    @scala.inline
    def onlyComputer_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyComputer")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyLargeScreen")
    @js.native
    def onlyLargeScreen: ResponsiveWidthShorthand = js.native
    @scala.inline
    def onlyLargeScreen_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyLargeScreen")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyMobile")
    @js.native
    def onlyMobile: ResponsiveWidthShorthand = js.native
    @scala.inline
    def onlyMobile_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyMobile")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyTablet")
    @js.native
    def onlyTablet: ResponsiveWidthShorthand = js.native
    @scala.inline
    def onlyTablet_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyTablet")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("semantic-ui-react/dist/commonjs/addons/Responsive/Responsive", "default.onlyWidescreen")
    @js.native
    def onlyWidescreen: ResponsiveWidthShorthand = js.native
    @scala.inline
    def onlyWidescreen_=(x: ResponsiveWidthShorthand): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onlyWidescreen")(x.asInstanceOf[js.Any])
  }
  
  type Responsive = Component[ResponsiveProps, js.Object, js.Any]
  
  @js.native
  trait ResponsiveOnUpdateData extends ResponsiveProps {
    
    var width: Double = js.native
  }
  object ResponsiveOnUpdateData {
    
    @scala.inline
    def apply(width: Double): ResponsiveOnUpdateData = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResponsiveOnUpdateData]
    }
    
    @scala.inline
    implicit class ResponsiveOnUpdateDataMutableBuilder[Self <: ResponsiveOnUpdateData] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait ResponsiveProps
    extends StrictResponsiveProps
       with /* key */ StringDictionary[js.Any]
  object ResponsiveProps {
    
    @scala.inline
    def apply(): ResponsiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveProps]
    }
  }
  
  @js.native
  trait ResponsiveWidthShorthand extends StObject {
    
    var maxWidth: js.UndefOr[Double | String] = js.native
    
    var minWidth: js.UndefOr[Double | String] = js.native
  }
  object ResponsiveWidthShorthand {
    
    @scala.inline
    def apply(): ResponsiveWidthShorthand = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ResponsiveWidthShorthand]
    }
    
    @scala.inline
    implicit class ResponsiveWidthShorthandMutableBuilder[Self <: ResponsiveWidthShorthand] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
    }
  }
  
  @js.native
  trait StrictResponsiveProps extends StObject {
    
    /** An element type to render as (string or function). */
    var as: js.UndefOr[js.Any] = js.native
    
    /** Primary content. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /** Fires callbacks immediately after mount. */
    var fireOnMount: js.UndefOr[Boolean] = js.native
    
    /**
      * Called to get width of screen. Defaults to using `window.innerWidth` when in a browser;
      * otherwise, assumes a width of 0.
      */
    var getWidth: js.UndefOr[js.Function0[Double]] = js.native
    
    /** The maximum width at which content will be displayed. */
    var maxWidth: js.UndefOr[Double | String] = js.native
    
    /** The minimum width at which content will be displayed. */
    var minWidth: js.UndefOr[Double | String] = js.native
    
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
      ] = js.native
  }
  object StrictResponsiveProps {
    
    @scala.inline
    def apply(): StrictResponsiveProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StrictResponsiveProps]
    }
    
    @scala.inline
    implicit class StrictResponsivePropsMutableBuilder[Self <: StrictResponsiveProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAs(value: js.Any): Self = StObject.set(x, "as", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsUndefined: Self = StObject.set(x, "as", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setFireOnMount(value: Boolean): Self = StObject.set(x, "fireOnMount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFireOnMountUndefined: Self = StObject.set(x, "fireOnMount", js.undefined)
      
      @scala.inline
      def setGetWidth(value: () => Double): Self = StObject.set(x, "getWidth", js.Any.fromFunction0(value))
      
      @scala.inline
      def setGetWidthUndefined: Self = StObject.set(x, "getWidth", js.undefined)
      
      @scala.inline
      def setMaxWidth(value: Double | String): Self = StObject.set(x, "maxWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxWidthUndefined: Self = StObject.set(x, "maxWidth", js.undefined)
      
      @scala.inline
      def setMinWidth(value: Double | String): Self = StObject.set(x, "minWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinWidthUndefined: Self = StObject.set(x, "minWidth", js.undefined)
      
      @scala.inline
      def setOnUpdate(value: (/* event */ SyntheticEvent[HTMLElement, Event], /* data */ ResponsiveOnUpdateData) => Unit): Self = StObject.set(x, "onUpdate", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnUpdateUndefined: Self = StObject.set(x, "onUpdate", js.undefined)
    }
  }
}
