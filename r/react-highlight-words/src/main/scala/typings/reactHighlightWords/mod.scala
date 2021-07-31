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
  class default ()
    extends Component[HighlighterProps, js.Object, js.Any]
  
  trait Chunk extends StObject {
    
    var end: Double
    
    var start: Double
  }
  object Chunk {
    
    @scala.inline
    def apply(end: Double, start: Double): Chunk = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[Chunk]
    }
    
    @scala.inline
    implicit class ChunkMutableBuilder[Self <: Chunk] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait FindChunks extends StObject {
    
    var autoEscape: js.UndefOr[Boolean] = js.undefined
    
    var caseSensitive: js.UndefOr[Boolean] = js.undefined
    
    var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
    
    var searchWords: js.Array[String]
    
    var textToHighlight: String
  }
  object FindChunks {
    
    @scala.inline
    def apply(searchWords: js.Array[String], textToHighlight: String): FindChunks = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[FindChunks]
    }
    
    @scala.inline
    implicit class FindChunksMutableBuilder[Self <: FindChunks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setSanitize(value: /* text */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      @scala.inline
      def setSearchWords(value: js.Array[String]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchWordsVarargs(value: String*): Self = StObject.set(x, "searchWords", js.Array(value :_*))
      
      @scala.inline
      def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
    }
  }
  
  type Highlighter = Component[HighlighterProps, js.Object, js.Any]
  
  trait HighlighterProps
    extends StObject
       with /** Allows to pass through any parameter to wrapped component */
  /* index */ StringDictionary[js.Any] {
    
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
    var highlightTag: js.UndefOr[String | ComponentType[js.Any]] = js.undefined
    
    /**
      * Process each search word and text to highlight before comparing (eg remove accents); signature
      * (text: string): string
      */
    var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.undefined
    
    /** Array of search words. The search terms are treated as RegExps unless autoEscape is set. */
    var searchWords: js.Array[String]
    
    /** Text to highlight matches in */
    var textToHighlight: String
    
    /** CSS class name applied to unhighlighted text */
    var unhighlightClassName: js.UndefOr[String] = js.undefined
    
    /** Inline styles applied to unhighlighted text */
    var unhighlightStyle: js.UndefOr[CSSProperties] = js.undefined
  }
  object HighlighterProps {
    
    @scala.inline
    def apply(searchWords: js.Array[String], textToHighlight: String): HighlighterProps = {
      val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
      __obj.asInstanceOf[HighlighterProps]
    }
    
    @scala.inline
    implicit class HighlighterPropsMutableBuilder[Self <: HighlighterProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setActiveClassName(value: String): Self = StObject.set(x, "activeClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveClassNameUndefined: Self = StObject.set(x, "activeClassName", js.undefined)
      
      @scala.inline
      def setActiveIndex(value: Double): Self = StObject.set(x, "activeIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveIndexUndefined: Self = StObject.set(x, "activeIndex", js.undefined)
      
      @scala.inline
      def setActiveStyle(value: CSSProperties): Self = StObject.set(x, "activeStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setActiveStyleUndefined: Self = StObject.set(x, "activeStyle", js.undefined)
      
      @scala.inline
      def setAutoEscape(value: Boolean): Self = StObject.set(x, "autoEscape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoEscapeUndefined: Self = StObject.set(x, "autoEscape", js.undefined)
      
      @scala.inline
      def setCaseSensitive(value: Boolean): Self = StObject.set(x, "caseSensitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCaseSensitiveUndefined: Self = StObject.set(x, "caseSensitive", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setFindChunks(value: /* options */ FindChunks => js.Array[Chunk]): Self = StObject.set(x, "findChunks", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFindChunksUndefined: Self = StObject.set(x, "findChunks", js.undefined)
      
      @scala.inline
      def setHighlightClassName(value: String): Self = StObject.set(x, "highlightClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightClassNameUndefined: Self = StObject.set(x, "highlightClassName", js.undefined)
      
      @scala.inline
      def setHighlightStyle(value: CSSProperties): Self = StObject.set(x, "highlightStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightStyleUndefined: Self = StObject.set(x, "highlightStyle", js.undefined)
      
      @scala.inline
      def setHighlightTag(value: String | ComponentType[js.Any]): Self = StObject.set(x, "highlightTag", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighlightTagUndefined: Self = StObject.set(x, "highlightTag", js.undefined)
      
      @scala.inline
      def setSanitize(value: /* text */ String => String): Self = StObject.set(x, "sanitize", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
      
      @scala.inline
      def setSearchWords(value: js.Array[String]): Self = StObject.set(x, "searchWords", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSearchWordsVarargs(value: String*): Self = StObject.set(x, "searchWords", js.Array(value :_*))
      
      @scala.inline
      def setTextToHighlight(value: String): Self = StObject.set(x, "textToHighlight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhighlightClassName(value: String): Self = StObject.set(x, "unhighlightClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhighlightClassNameUndefined: Self = StObject.set(x, "unhighlightClassName", js.undefined)
      
      @scala.inline
      def setUnhighlightStyle(value: CSSProperties): Self = StObject.set(x, "unhighlightStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnhighlightStyleUndefined: Self = StObject.set(x, "unhighlightStyle", js.undefined)
    }
  }
}
