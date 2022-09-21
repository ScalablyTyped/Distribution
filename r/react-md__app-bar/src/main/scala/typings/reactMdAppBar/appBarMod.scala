package typings.reactMdAppBar

import typings.react.mod.ElementType
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.HTMLAttributes
import typings.react.mod.RefAttributes
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object appBarMod {
  
  @JSImport("@react-md/app-bar/types/AppBar", "AppBar")
  @js.native
  val AppBar: ForwardRefExoticComponent[AppBarProps & RefAttributes[HTMLDivElement]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdAppBar.reactMdAppBarStrings.none
    - typings.reactMdAppBar.reactMdAppBarStrings.normal
    - typings.reactMdAppBar.reactMdAppBarStrings.prominent
    - typings.reactMdAppBar.reactMdAppBarStrings.dense
    - typings.reactMdAppBar.reactMdAppBarStrings.`prominent-dense`
  */
  trait AppBarHeight extends StObject
  object AppBarHeight {
    
    inline def dense: typings.reactMdAppBar.reactMdAppBarStrings.dense = "dense".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.dense]
    
    inline def none: typings.reactMdAppBar.reactMdAppBarStrings.none = "none".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.none]
    
    inline def normal: typings.reactMdAppBar.reactMdAppBarStrings.normal = "normal".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.normal]
    
    inline def prominent: typings.reactMdAppBar.reactMdAppBarStrings.prominent = "prominent".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.prominent]
    
    inline def `prominent-dense`: typings.reactMdAppBar.reactMdAppBarStrings.`prominent-dense` = "prominent-dense".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.`prominent-dense`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdAppBar.reactMdAppBarStrings.top
    - typings.reactMdAppBar.reactMdAppBarStrings.bottom
  */
  trait AppBarPosition extends StObject
  object AppBarPosition {
    
    inline def bottom: typings.reactMdAppBar.reactMdAppBarStrings.bottom = "bottom".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.bottom]
    
    inline def top: typings.reactMdAppBar.reactMdAppBarStrings.top = "top".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.top]
  }
  
  trait AppBarProps
    extends StObject
       with HTMLAttributes[HTMLDivElement] {
    
    /**
      * The component for the `AppBar` to render as. This should normally either
      * just be the default `"header"` or a `"div"` component.
      *
      * It is generally recommended to not provide other React components for this
      * prop even though it is possible since it leads to bad practice and props
      * might not get passed as one would expect.
      */
    var component: js.UndefOr[ElementType[Any]] = js.undefined
    
    /**
      * Boolean if the `AppBar` should be fixed to the top or bottom of the page.
      */
    var fixed: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Boolean if the fixed `AppBar` should gain elevation. This is recommended to
      * stay enabled unless you manually apply a border to help separate the
      * `AppBar` from other content.
      */
    var fixedElevation: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The position within the page to "fix" the `AppBar` when the `fixed` prop is
      * enabled.
      */
    var fixedPosition: js.UndefOr[AppBarPosition] = js.undefined
    
    /**
      * Boolean if the content of the `AppBar` should be allowed to wrap. When this
      * is omitted, it will be considered true for `"none"`, `"prominent"` and
      * `"prominent-dense"` heights
      */
    var flexWrap: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The height to use for the app bar. See the `AppBarHeight` type for more
      * information.
      */
    var height: js.UndefOr[AppBarHeight] = js.undefined
    
    /**
      * Boolean if the `AppBarNav`, `AppBarTitle`, and `AppBarActions` should
      * inherit the color that for the provided `theme`. If this value is
      * `undefined`, the color will only be inherited when the theme is set to
      * `primary` or `secondary`. However if this value is a boolean, it will be
      * used instead. So if you set this to `false` and set the `theme` to
      * `"primary"`, the defined primary text color will not be inherited.
      */
    var inheritColor: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The theme to apply to the `AppBar`.
      */
    var theme: js.UndefOr[AppBarTheme] = js.undefined
  }
  object AppBarProps {
    
    inline def apply(): AppBarProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AppBarProps]
    }
    
    extension [Self <: AppBarProps](x: Self) {
      
      inline def setComponent(value: ElementType[Any]): Self = StObject.set(x, "component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "component", js.undefined)
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFixedElevation(value: Boolean): Self = StObject.set(x, "fixedElevation", value.asInstanceOf[js.Any])
      
      inline def setFixedElevationUndefined: Self = StObject.set(x, "fixedElevation", js.undefined)
      
      inline def setFixedPosition(value: AppBarPosition): Self = StObject.set(x, "fixedPosition", value.asInstanceOf[js.Any])
      
      inline def setFixedPositionUndefined: Self = StObject.set(x, "fixedPosition", js.undefined)
      
      inline def setFixedUndefined: Self = StObject.set(x, "fixed", js.undefined)
      
      inline def setFlexWrap(value: Boolean): Self = StObject.set(x, "flexWrap", value.asInstanceOf[js.Any])
      
      inline def setFlexWrapUndefined: Self = StObject.set(x, "flexWrap", js.undefined)
      
      inline def setHeight(value: AppBarHeight): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setInheritColor(value: Boolean): Self = StObject.set(x, "inheritColor", value.asInstanceOf[js.Any])
      
      inline def setInheritColorUndefined: Self = StObject.set(x, "inheritColor", js.undefined)
      
      inline def setTheme(value: AppBarTheme): Self = StObject.set(x, "theme", value.asInstanceOf[js.Any])
      
      inline def setThemeUndefined: Self = StObject.set(x, "theme", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactMdAppBar.reactMdAppBarStrings.clear
    - typings.reactMdAppBar.reactMdAppBarStrings.primary
    - typings.reactMdAppBar.reactMdAppBarStrings.secondary
    - typings.reactMdAppBar.reactMdAppBarStrings.default
  */
  trait AppBarTheme extends StObject
  object AppBarTheme {
    
    inline def default: typings.reactMdAppBar.reactMdAppBarStrings.default = "default".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.default]
    
    inline def clear: typings.reactMdAppBar.reactMdAppBarStrings.clear = "clear".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.clear]
    
    inline def primary: typings.reactMdAppBar.reactMdAppBarStrings.primary = "primary".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.primary]
    
    inline def secondary: typings.reactMdAppBar.reactMdAppBarStrings.secondary = "secondary".asInstanceOf[typings.reactMdAppBar.reactMdAppBarStrings.secondary]
  }
}
