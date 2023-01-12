package typings.reactNativeHighlightWords

import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextProps
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-native-highlight-words", JSImport.Default)
  @js.native
  open class default ()
    extends Component[HighlighterProps, js.Object, Any]
  
  type Highlighter = Component[HighlighterProps, js.Object, Any]
  
  trait HighlighterProps
    extends StObject
       with TextProps {
    
    var autoEscape: js.UndefOr[Boolean] = js.undefined
    
    var highlightStyle: js.UndefOr[StyleProp[TextStyle]] = js.undefined
    
    var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
    
    var searchWords: js.Array[String]
    
    var textToHighlight: String
  }
  object HighlighterProps {
    
    inline def apply(searchWords: js.Array[String], textToHighlight: String): HighlighterProps = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlighterProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HighlighterProps] (val x: Self) extends AnyVal {
      
      inline def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      inline def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      inline def setHighlightStyle(value: StyleProp[TextStyle]): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
      
      inline def setHighlightStyleNull: Self = StObject.set(x, "highlightStyle", null)
      
      inline def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
      
      inline def setSanitize(value: /* text */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSearchWords(value: js.Array[String]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      inline def setSearchWordsVarargs(value: String*): Self = StObject.set(x, "searchWords", js.Array(value*))
      
      inline def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
    }
  }
}
