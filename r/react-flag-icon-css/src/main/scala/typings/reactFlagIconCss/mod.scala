package typings.reactFlagIconCss

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.StringDictionary
import typings.csstype.mod.Properties
import typings.csstype.mod.PropertiesHyphen
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactFlagIconCss.anon.ReadonlyFlagIconOptions
import typings.reactFlagIconCss.reactFlagIconCssNumbers.`0`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-flag-icon-css", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(react: js.Any): Instantiable0[FlagIcon] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(react.asInstanceOf[js.Any]).asInstanceOf[Instantiable0[FlagIcon]]
  inline def default(react: js.Any, opts: ReadonlyFlagIconOptions): Instantiable0[FlagIcon] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(react.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[FlagIcon]]
  
  inline def CustomFlagIconFactory(react: js.Any): Instantiable0[FlagIcon] = ^.asInstanceOf[js.Dynamic].applyDynamic("CustomFlagIconFactory")(react.asInstanceOf[js.Any]).asInstanceOf[Instantiable0[FlagIcon]]
  inline def CustomFlagIconFactory(react: js.Any, opts: ReadonlyFlagIconOptions): Instantiable0[FlagIcon] = (^.asInstanceOf[js.Dynamic].applyDynamic("CustomFlagIconFactory")(react.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Instantiable0[FlagIcon]]
  
  @JSImport("react-flag-icon-css", "FlagIcon")
  @js.native
  class FlagIcon protected ()
    extends PureComponent[FlagIconProps, js.Object, js.Any] {
    def this(props: FlagIconProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: FlagIconProps, context: js.Any) = this()
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFlagIconCss.reactFlagIconCssStrings.horizontal
    - typings.reactFlagIconCss.reactFlagIconCssStrings.vertical
  */
  trait FlagIconFlip extends StObject
  object FlagIconFlip {
    
    inline def horizontal: typings.reactFlagIconCss.reactFlagIconCssStrings.horizontal = "horizontal".asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssStrings.horizontal]
    
    inline def vertical: typings.reactFlagIconCss.reactFlagIconCssStrings.vertical = "vertical".asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssStrings.vertical]
  }
  
  trait FlagIconOptions extends StObject {
    
    /**
      * An object literal whose keys are your custom codes.
      */
    var customCodes: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Set this if useCssModules is true and a) you want to apply styles to FlagIcon
      * using .theme-base and/or b) you are using custom flags.
      */
    var themeStyles: js.UndefOr[StringDictionary[(Properties[String | `0`]) & (PropertiesHyphen[String | `0`])]] = js.undefined
    
    /**
      * Use CSS modules styles (your module bundler must be correctly setup).
      */
    var useCssModules: js.UndefOr[Boolean] = js.undefined
  }
  object FlagIconOptions {
    
    inline def apply(): FlagIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FlagIconOptions]
    }
    
    extension [Self <: FlagIconOptions](x: Self) {
      
      inline def setCustomCodes(value: StringDictionary[String]): Self = StObject.set(x, "customCodes", value.asInstanceOf[js.Any])
      
      inline def setCustomCodesUndefined: Self = StObject.set(x, "customCodes", js.undefined)
      
      inline def setThemeStyles(value: StringDictionary[(Properties[String | `0`]) & (PropertiesHyphen[String | `0`])]): Self = StObject.set(x, "themeStyles", value.asInstanceOf[js.Any])
      
      inline def setThemeStylesUndefined: Self = StObject.set(x, "themeStyles", js.undefined)
      
      inline def setUseCssModules(value: Boolean): Self = StObject.set(x, "useCssModules", value.asInstanceOf[js.Any])
      
      inline def setUseCssModulesUndefined: Self = StObject.set(x, "useCssModules", js.undefined)
    }
  }
  
  trait FlagIconProps extends StObject {
    
    var Component: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * This is always appended as-is to class in the HTML.
      */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * ISO 3166-1-alpha-2 code.
      */
    var code: String
    
    var flip: js.UndefOr[FlagIconFlip] = js.undefined
    
    var rotate: js.UndefOr[FlagIconRotate] = js.undefined
    
    var size: js.UndefOr[FlagIconSize] = js.undefined
    
    /**
      *     Uses the 1x1 image if true.
      */
    var squared: js.UndefOr[Boolean] = js.undefined
    
    /**
      * This is mapped to a CSS module and appended to class in the HTML.
      */
    var styleName: js.UndefOr[String] = js.undefined
  }
  object FlagIconProps {
    
    inline def apply(code: String): FlagIconProps = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
      __obj.asInstanceOf[FlagIconProps]
    }
    
    extension [Self <: FlagIconProps](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setComponent(value: String): Self = StObject.set(x, "Component", value.asInstanceOf[js.Any])
      
      inline def setComponentUndefined: Self = StObject.set(x, "Component", js.undefined)
      
      inline def setFlip(value: FlagIconFlip): Self = StObject.set(x, "flip", value.asInstanceOf[js.Any])
      
      inline def setFlipUndefined: Self = StObject.set(x, "flip", js.undefined)
      
      inline def setRotate(value: FlagIconRotate): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setSize(value: FlagIconSize): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setSquared(value: Boolean): Self = StObject.set(x, "squared", value.asInstanceOf[js.Any])
      
      inline def setSquaredUndefined: Self = StObject.set(x, "squared", js.undefined)
      
      inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
      
      inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFlagIconCss.reactFlagIconCssNumbers.`30`
    - typings.reactFlagIconCss.reactFlagIconCssNumbers.`60`
    - typings.reactFlagIconCss.reactFlagIconCssNumbers.`90`
    - typings.reactFlagIconCss.reactFlagIconCssNumbers.`180`
    - typings.reactFlagIconCss.reactFlagIconCssNumbers.`270`
  */
  trait FlagIconRotate extends StObject
  object FlagIconRotate {
    
    inline def `180`: typings.reactFlagIconCss.reactFlagIconCssNumbers.`180` = 180.asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssNumbers.`180`]
    
    inline def `270`: typings.reactFlagIconCss.reactFlagIconCssNumbers.`270` = 270.asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssNumbers.`270`]
    
    inline def `30`: typings.reactFlagIconCss.reactFlagIconCssNumbers.`30` = 30.asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssNumbers.`30`]
    
    inline def `60`: typings.reactFlagIconCss.reactFlagIconCssNumbers.`60` = 60.asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssNumbers.`60`]
    
    inline def `90`: typings.reactFlagIconCss.reactFlagIconCssNumbers.`90` = 90.asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssNumbers.`90`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.reactFlagIconCss.reactFlagIconCssStrings.lg
    - typings.reactFlagIconCss.reactFlagIconCssStrings.`2x`
    - typings.reactFlagIconCss.reactFlagIconCssStrings.`3x`
    - typings.reactFlagIconCss.reactFlagIconCssStrings.`4x`
    - typings.reactFlagIconCss.reactFlagIconCssStrings.`5x`
  */
  trait FlagIconSize extends StObject
  object FlagIconSize {
    
    inline def `2x`: typings.reactFlagIconCss.reactFlagIconCssStrings.`2x` = "2x".asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssStrings.`2x`]
    
    inline def `3x`: typings.reactFlagIconCss.reactFlagIconCssStrings.`3x` = "3x".asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssStrings.`3x`]
    
    inline def `4x`: typings.reactFlagIconCss.reactFlagIconCssStrings.`4x` = "4x".asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssStrings.`4x`]
    
    inline def `5x`: typings.reactFlagIconCss.reactFlagIconCssStrings.`5x` = "5x".asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssStrings.`5x`]
    
    inline def lg: typings.reactFlagIconCss.reactFlagIconCssStrings.lg = "lg".asInstanceOf[typings.reactFlagIconCss.reactFlagIconCssStrings.lg]
  }
}
