package typings.reactSyntaxHighlighter

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.HTMLProps
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    
    @JSImport("react-syntax-highlighter", "Light.registerLanguage")
    @js.native
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  @JSImport("react-syntax-highlighter", "LightAsync")
  @js.native
  class LightAsync ()
    extends typings.reactSyntaxHighlighter.esmLightAsyncMod.default
  /* static members */
  object LightAsync {
    
    @JSImport("react-syntax-highlighter", "LightAsync.registerLanguage")
    @js.native
    def registerLanguage(name: String, func: js.Any): Unit = js.native
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
    
    @JSImport("react-syntax-highlighter", "PrismAsyncLight.registerLanguage")
    @js.native
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  @JSImport("react-syntax-highlighter", "PrismLight")
  @js.native
  class PrismLight ()
    extends typings.reactSyntaxHighlighter.esmPrismLightMod.default
  /* static members */
  object PrismLight {
    
    @JSImport("react-syntax-highlighter", "PrismLight.registerLanguage")
    @js.native
    def registerLanguage(name: String, func: js.Any): Unit = js.native
  }
  
  @js.native
  trait SyntaxHighlighterProps
    extends /* spread */ StringDictionary[js.Any] {
    
    var codeTagProps: js.UndefOr[HTMLProps[HTMLElement]] = js.native
    
    var customStyle: js.UndefOr[js.Any] = js.native
    
    var language: js.UndefOr[String] = js.native
    
    var lineNumberStyle: js.UndefOr[js.Any] = js.native
    
    var lineProps: js.UndefOr[lineTagPropsFunction | HTMLProps[HTMLElement]] = js.native
    
    var showLineNumbers: js.UndefOr[Boolean] = js.native
    
    var startingLineNumber: js.UndefOr[Double] = js.native
    
    var style: js.UndefOr[js.Any] = js.native
    
    var useInlineStyles: js.UndefOr[Boolean] = js.native
  }
  object SyntaxHighlighterProps {
    
    @scala.inline
    def apply(): SyntaxHighlighterProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SyntaxHighlighterProps]
    }
    
    @scala.inline
    implicit class SyntaxHighlighterPropsMutableBuilder[Self <: SyntaxHighlighterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCodeTagProps(value: HTMLProps[HTMLElement]): Self = StObject.set(x, "codeTagProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeTagPropsUndefined: Self = StObject.set(x, "codeTagProps", js.undefined)
      
      @scala.inline
      def setCustomStyle(value: js.Any): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
      
      @scala.inline
      def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
      
      @scala.inline
      def setLineNumberStyle(value: js.Any): Self = StObject.set(x, "lineNumberStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineNumberStyleUndefined: Self = StObject.set(x, "lineNumberStyle", js.undefined)
      
      @scala.inline
      def setLineProps(value: lineTagPropsFunction | HTMLProps[HTMLElement]): Self = StObject.set(x, "lineProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLinePropsFunction1(value: /* lineNumber */ Double => HTMLProps[HTMLElement]): Self = StObject.set(x, "lineProps", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLinePropsUndefined: Self = StObject.set(x, "lineProps", js.undefined)
      
      @scala.inline
      def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowLineNumbersUndefined: Self = StObject.set(x, "showLineNumbers", js.undefined)
      
      @scala.inline
      def setStartingLineNumber(value: Double): Self = StObject.set(x, "startingLineNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingLineNumberUndefined: Self = StObject.set(x, "startingLineNumber", js.undefined)
      
      @scala.inline
      def setStyle(value: js.Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setUseInlineStyles(value: Boolean): Self = StObject.set(x, "useInlineStyles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseInlineStylesUndefined: Self = StObject.set(x, "useInlineStyles", js.undefined)
    }
  }
}
