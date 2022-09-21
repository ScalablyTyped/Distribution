package typings.reactHighlightWords

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ComponentType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("react-highlight-words", JSImport.Default)
  @js.native
  open class default ()
    extends Component[HighlighterProps, js.Object, Any]
  
  trait Chunk extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object Chunk {
    
    inline def apply(end: Double, start: Double): Chunk = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    extension [Self <: Chunk](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindChunks extends StObject {
    
    var autoEscape: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
    
    var searchWords: js.Array[String | js.RegExp]
    
    var textToHighlight: String
  }
  object FindChunks {
    
    inline def apply(searchWords: js.Array[String | js.RegExp], textToHighlight: String): FindChunks = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindChunks]
    }
    
    extension [Self <: FindChunks](x: Self) {
      
      inline def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      inline def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setSanitize(value: /* text */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSearchWords(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      inline def setSearchWordsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "searchWords", js.Array(value*))
      
      inline def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
    }
  }
  
  type Highlighter = Component[HighlighterProps, js.Object, Any]
  
  trait HighlighterProps
    extends StObject
       with /** Allows to pass through any parameter to wrapped component */
  /* index */ StringDictionary[Any] {
    
    /** The class name to be applied to an active match. Use along with activeIndex */
    var activeClassName: js.UndefOr[String] = js.undefined
    
    /** Specify the match index that should be actively highlighted. Use along with activeClassName */
    var activeIndex: js.UndefOr[Double] = js.undefined
    
    /** The inline style to be applied to an active match. Use along with activeIndex */
    var activeStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /** Escape characters in searchWords which are meaningful in regular expressions */
    var autoEscape: js.UndefOr[Boolean] = js.undefined
    
    /** Search should be case sensitive; defaults to false */
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    /** CSS class name applied to the outer/wrapper <span> */
    var className: js.UndefOr[String] = js.undefined
    
    /**
      * Use a custom function to search for matching chunks. This makes it possible to use arbitrary logic
      * when looking for matches. See the default findChunks function in highlight-words-core for signature.
      * Have a look at the custom findChunks example on how to use it.
      */
    var findChunks: js.UndefOr[js.Function1[/* options */ FindChunks, js.Array[Chunk]]] = js.undefined
    
    /** CSS class name applied to highlighted text */
    var highlightClassName: js.UndefOr[String] = js.undefined
    
    /** Inline styles applied to highlighted text */
    var highlightStyle: js.UndefOr[CSSProperties] = js.undefined
    
    /**
      * Type of tag to wrap around highlighted matches; defaults to mark but can also be a React element
      * (class or functional)
      */
    var highlightTag: js.UndefOr[String | ComponentType[Any]] = js.undefined
    
    /**
      * Process each search word and text to highlight before comparing (eg remove accents); signature
      * (text: string): string
      */
    var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
    
    /** Array of search words. The search terms are treated as RegExps unless autoEscape is set. */
    var searchWords: js.Array[String | js.RegExp]
    
    /** Text to highlight matches in */
    var textToHighlight: String
    
    /** CSS class name applied to unhighlighted text */
    var unhighlightClassName: js.UndefOr[String] = js.undefined
    
    /** Inline styles applied to unhighlighted text */
    var unhighlightStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object HighlighterProps {
    
    inline def apply(searchWords: js.Array[String | js.RegExp], textToHighlight: String): HighlighterProps = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlighterProps]
    }
    
    extension [Self <: HighlighterProps](x: Self) {
      
      inline def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      inline def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      inline def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      inline def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      inline def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      inline def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      inline def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      inline def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      inline def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      inline def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setFindChunks(value: /* options */ FindChunks => js.Array[Chunk]): Self = StObject.set(x, "findChunks", js.Any.fromFunction1(value))
      
      inline def setFindChunksUndefined: Self = StObject.set(x, "findChunks", js.undefined)
      
      inline def setHighlightClassName(value: String): Self = StObject.set(x, "highlightClassName", value.asInstanceOf[js.Any])
      
      inline def setHighlightClassNameUndefined: Self = StObject.set(x, "highlightClassName", js.undefined)
      
      inline def setHighlightStyle(value: CSSProperties): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
      
      inline def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
      
      inline def setHighlightTag(value: String | ComponentType[Any]): Self = StObject.set(x, "highlightTag", value.asInstanceOf[js.Any])
      
      inline def setHighlightTagUndefined: Self = StObject.set(x, "highlightTag", js.undefined)
      
      inline def setSanitize(value: /* text */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      inline def setSearchWords(value: js.Array[String | js.RegExp]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      inline def setSearchWordsVarargs(value: (String | js.RegExp)*): Self = StObject.set(x, "searchWords", js.Array(value*))
      
      inline def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
      
      inline def setUnhighlightClassName(value: String): Self = StObject.set(x, "unhighlightClassName", value.asInstanceOf[js.Any])
      
      inline def setUnhighlightClassNameUndefined: Self = StObject.set(x, "unhighlightClassName", js.undefined)
      
      inline def setUnhighlightStyle(value: CSSProperties): Self = StObject.set(x, "unhighlightStyle", value.asInstanceOf[js.Any])
      
      inline def setUnhighlightStyleUndefined: Self = StObject.set(x, "unhighlightStyle", js.undefined)
    }
  }
}
