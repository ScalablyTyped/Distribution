package typings.storybookComponents.mod

import typings.react.mod.ReactNode
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.storybookComponents.mod.SyntaxHighlighterCustomProps because var conflicts: language. Inlined copyable, bordered, padded, format, formatter, className, renderer */ trait SyntaxHighlighterProps
  extends StObject
     with SyntaxHighlighterBaseProps {
  
  var bordered: js.UndefOr[Boolean] = js.undefined
  
  var className: js.UndefOr[String] = js.undefined
  
  var copyable: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[SyntaxHighlighterFormatTypes] = js.undefined
  
  var formatter: js.UndefOr[
    js.Function2[/* type */ SyntaxHighlighterFormatTypes, /* source */ String, String]
  ] = js.undefined
  
  var padded: js.UndefOr[Boolean] = js.undefined
  
  var renderer: js.UndefOr[js.Function1[/* props */ SyntaxHighlighterRendererProps, ReactNode]] = js.undefined
}
object SyntaxHighlighterProps {
  
  inline def apply(): SyntaxHighlighterProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyntaxHighlighterProps]
  }
  
  extension [Self <: SyntaxHighlighterProps](x: Self) {
    
    inline def setBordered(value: Boolean): Self = StObject.set(x, "bordered", value.asInstanceOf[js.Any])
    
    inline def setBorderedUndefined: Self = StObject.set(x, "bordered", js.undefined)
    
    inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    inline def setCopyable(value: Boolean): Self = StObject.set(x, "copyable", value.asInstanceOf[js.Any])
    
    inline def setCopyableUndefined: Self = StObject.set(x, "copyable", js.undefined)
    
    inline def setFormat(value: SyntaxHighlighterFormatTypes): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setFormatter(value: (/* type */ SyntaxHighlighterFormatTypes, /* source */ String) => String): Self = StObject.set(x, "formatter", js.Any.fromFunction2(value))
    
    inline def setFormatterUndefined: Self = StObject.set(x, "formatter", js.undefined)
    
    inline def setPadded(value: Boolean): Self = StObject.set(x, "padded", value.asInstanceOf[js.Any])
    
    inline def setPaddedUndefined: Self = StObject.set(x, "padded", js.undefined)
    
    inline def setRenderer(value: /* props */ SyntaxHighlighterRendererProps => ReactNode): Self = StObject.set(x, "renderer", js.Any.fromFunction1(value))
    
    inline def setRendererUndefined: Self = StObject.set(x, "renderer", js.undefined)
  }
}
