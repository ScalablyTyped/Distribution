package typings.storybookComponents.anon

import typings.react.mod.HTMLProps
import typings.react.mod.ReactNode
import typings.std.HTMLElement
import typings.storybookComponents.mod.SyntaxHighlighterFormatTypes
import typings.storybookComponents.mod.SyntaxHighlighterRendererProps
import typings.storybookComponents.mod.lineTagPropsFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @storybook/components.@storybook/components.SyntaxHighlighterBaseProps & @storybook/components.@storybook/components.SyntaxHighlighterCustomProps & {  children :react.react.ReactNode | undefined} */
trait SyntaxHighlighterBaseProp extends StObject {
  
  var bordered: js.UndefOr[Boolean] = js.undefined
  
  var children: js.UndefOr[ReactNode] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var codeTagProps: js.UndefOr[HTMLProps[HTMLElement]] = js.undefined
  
  var copyable: js.UndefOr[Boolean] = js.undefined
  
  var customStyle: js.UndefOr[Any] = js.undefined
  
  var format: js.UndefOr[SyntaxHighlighterFormatTypes] = js.undefined
  
  var formatter: js.UndefOr[
    js.Function2[/* type */ SyntaxHighlighterFormatTypes, /* source */ String, String]
  ] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
  
  var lineNumberStyle: js.UndefOr[Any] = js.undefined
  
  var lineProps: js.UndefOr[lineTagPropsFunction | HTMLProps[HTMLElement]] = js.undefined
  
  var padded: js.UndefOr[Boolean] = js.undefined
  
  var renderer: js.UndefOr[js.Function1[/* props */ SyntaxHighlighterRendererProps, ReactNode]] = js.undefined
  
  var showLineNumbers: js.UndefOr[Boolean] = js.undefined
  
  var startingLineNumber: js.UndefOr[Double] = js.undefined
  
  var style: js.UndefOr[Any] = js.undefined
  
  var useInlineStyles: js.UndefOr[Boolean] = js.undefined
}
object SyntaxHighlighterBaseProp {
  
  inline def apply(): SyntaxHighlighterBaseProp = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxHighlighterBaseProp]
  }
  
  extension [Self <: SyntaxHighlighterBaseProp](x: Self) {
    
    inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
    
    inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCodeTagProps(value: HTMLProps[HTMLElement]): Self = StObject.set(x, "codeTagProps", value.asInstanceOf[js.Any])
    
    inline def setCodeTagPropsUndefined: Self = StObject.set(x, "codeTagProps", js.undefined)
    
    inline def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
    
    inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
    
    inline def setCustomStyle(value: Any): Self = StObject.set(x, "customStyle", value.asInstanceOf[js.Any])
    
    inline def setCustomStyleUndefined: Self = StObject.set(x, "customStyle", js.undefined)
    
    inline def setFormat(value: SyntaxHighlighterFormatTypes): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatter(value: (/* type */ SyntaxHighlighterFormatTypes, /* source */ String) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setLineNumberStyle(value: Any): Self = StObject.set(x, "lineNumberStyle", value.asInstanceOf[js.Any])
    
    inline def setLineNumberStyleUndefined: Self = StObject.set(x, "lineNumberStyle", js.undefined)
    
    inline def setLineProps(value: lineTagPropsFunction | HTMLProps[HTMLElement]): Self = StObject.set(x, "lineProps", value.asInstanceOf[js.Any])
    
    inline def setLinePropsFunction1(value: /* lineNumber */ Double => HTMLProps[HTMLElement]): Self = StObject.set(x, "lineProps", js.Any.fromFunction1(value))
    
    inline def setLinePropsUndefined: Self = StObject.set(x, "lineProps", js.undefined)
    
    inline def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
    
    inline def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
    
    inline def setRenderer(value: /* props */ SyntaxHighlighterRendererProps => ReactNode): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
    
    inline def setShowLineNumbers(value: Boolean): Self = StObject.set(x, "showLineNumbers", value.asInstanceOf[js.Any])
    
    inline def setShowLineNumbersUndefined: Self = StObject.set(x, "showLineNumbers", js.undefined)
    
    inline def setStartingLineNumber(value: Double): Self = StObject.set(x, "startingLineNumber", value.asInstanceOf[js.Any])
    
    inline def setStartingLineNumberUndefined: Self = StObject.set(x, "startingLineNumber", js.undefined)
    
    inline def setStyle(value: Any): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    
    inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    
    inline def setUseInlineStyles(value: Boolean): Self = StObject.set(x, "useInlineStyles", value.asInstanceOf[js.Any])
    
    inline def setUseInlineStylesUndefined: Self = StObject.set(x, "useInlineStyles", js.undefined)
  }
}
