package typings.reactSyntaxHighlighter

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-syntax-highlighter", JSImport.Default)
  @js.native
  class default ()
    extends typings.reactSyntaxHighlighter.esmDefaultHighlightMod.default
  
  @JSImport("react-syntax-highlighter", "Light")
  @js.native
  class Light ()
    extends typings.reactSyntaxHighlighter.esmLightMod.default
  /* static members */
  object Light {
    
    @JSImport("react-syntax-highlighter", "Light")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("react-syntax-highlighter", "LightAsync")
  @js.native
  class LightAsync ()
    extends typings.reactSyntaxHighlighter.esmLightAsyncMod.default
  /* static members */
  object LightAsync {
    
    @JSImport("react-syntax-highlighter", "LightAsync")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("react-syntax-highlighter", "Prism")
  @js.native
  class Prism ()
    extends typings.reactSyntaxHighlighter.esmPrismMod.default
  
  @JSImport("react-syntax-highlighter", "PrismAsync")
  @js.native
  class PrismAsync ()
    extends typings.reactSyntaxHighlighter.esmPrismAsyncMod.default
  
  @JSImport("react-syntax-highlighter", "PrismAsyncLight")
  @js.native
  class PrismAsyncLight ()
    extends typings.reactSyntaxHighlighter.esmPrismAsyncLightMod.default
  /* static members */
  object PrismAsyncLight {
    
    @JSImport("react-syntax-highlighter", "PrismAsyncLight")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  @JSImport("react-syntax-highlighter", "PrismLight")
  @js.native
  class PrismLight ()
    extends typings.reactSyntaxHighlighter.esmPrismLightMod.default
  /* static members */
  object PrismLight {
    
    @JSImport("react-syntax-highlighter", "PrismLight")
    @js.native
    val ^ : js.Any = js.native
    
    inline def registerLanguage(name: String, func: js.Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("registerLanguage")(name.asInstanceOf[js.Any], func.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait SyntaxHighlighterProps
    extends StObject
       with /* spread */ StringDictionary[js.Any] {
    
    var codeTagProps: js.UndefOr[HTMLProps[HTMLElement]] = js.undefined
    
    var customStyle: js.UndefOr[js.Any] = js.undefined
    
    var language: js.UndefOr[String] = js.undefined
    
    var lineNumberStyle: js.UndefOr[js.Any] = js.undefined
    
    var lineProps: js.UndefOr[lineTagPropsFunction | HTMLProps[HTMLElement]] = js.undefined
    
    var showLineNumbers: js.UndefOr[Boolean] = js.undefined
    
    var startingLineNumber: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[js.Any] = js.undefined
    
    var useInlineStyles: js.UndefOr[Boolean] = js.undefined
  }
  object SyntaxHighlighterProps {
    
    inline def apply(): SyntaxHighlighterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyntaxHighlighterProps]
    }
    
    extension [Self <: SyntaxHighlighterProps](x: Self) {
      
      inline def setCodeTagProps(value: HTMLProps[HTMLElement]): Self = StObject.set(x, "codeTagProps", value.asInstanceOf[js.Any])
      
      inline def setCodeTagPropsUndefined: Self = StObject.set(x, "codeTagProps", js.undefined)
      
      inline def setCustomStyle(value: js.Any): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
      
      inline def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      inline def setLineNumberStyle(value: js.Any): Self = StObject.set(x, "lineNumberStyle", value.asInstanceOf[js.Any])
      
      inline def setLineNumberStyleUndefined: Self = StObject.set(x, "lineNumberStyle", js.undefined)
      
      inline def setLineProps(value: lineTagPropsFunction | HTMLProps[HTMLElement]): Self = StObject.set(x, "lineProps", value.asInstanceOf[js.Any])
      
      inline def setLinePropsFunction1(value: /* lineNumber */ Double => HTMLProps[HTMLElement]): Self = StObject.set(x, "lineProps", js.Any.fromFunction1(value))
      
      inline def setLinePropsUndefined: Self = StObject.set(x, "lineProps", js.undefined)
      
      inline def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
      
      inline def setShowLineNumbersUndefined: Self = StObject.set(x, "showLineNumbers", js.undefined)
      
      inline def setStartingLineNumber(value: Double): Self = StObject.set(x, "startingLineNumber", value.asInstanceOf[js.Any])
      
      inline def setStartingLineNumberUndefined: Self = StObject.set(x, "startingLineNumber", js.undefined)
      
      inline def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setUseInlineStyles(value: Boolean): Self = StObject.set(x, "useInlineStyles", value.asInstanceOf[js.Any])
      
      inline def setUseInlineStylesUndefined: Self = StObject.set(x, "useInlineStyles", js.undefined)
    }
  }
}
