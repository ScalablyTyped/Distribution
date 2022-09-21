package typings.storybookComponents.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SourceCodeProps extends StObject {
  
  var code: js.UndefOr[String] = js.undefined
  
  var dark: js.UndefOr[Boolean] = js.undefined
  
  var format: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<(props : react.react.ComponentProps<typeof LazySyntaxHighlighter>): react.react.<global>.JSX.Element>['format'] */ js.Any
  ] = js.undefined
  
  var language: js.UndefOr[String] = js.undefined
}
object SourceCodeProps {
  
  inline def apply(): SourceCodeProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SourceCodeProps]
  }
  
  extension [Self <: SourceCodeProps](x: Self) {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "code", js.undefined)
    
    inline def setDark(value: Boolean): Self = StObject.set(x, "dark", value.asInstanceOf[js.Any])
    
    inline def setDarkUndefined: Self = StObject.set(x, "dark", js.undefined)
    
    inline def setFormat(
      value: /* import warning: importer.ImportType#apply Failed type conversion: react.react.ComponentProps<(props : react.react.ComponentProps<typeof LazySyntaxHighlighter>): react.react.<global>.JSX.Element>['format'] */ js.Any
    ): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
    
    inline def setFormatUndefined: Self = StObject.set(x, "format", js.undefined)
    
    inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
  }
}
