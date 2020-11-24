package typings.reactHighlightWords.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HighlighterProps
  extends /** Allows to pass through any parameter to wrapped component */
/* index */ StringDictionary[js.Any] {
  
  /** The class name to be applied to an active match. Use along with activeIndex */
  var activeClassName: js.UndefOr[String] = js.native
  
  /** Specify the match index that should be actively highlighted. Use along with activeClassName */
  var activeIndex: js.UndefOr[Double] = js.native
  
  /** The inline style to be applied to an active match. Use along with activeIndex */
  var activeStyle: js.UndefOr[CSSProperties] = js.native
  
  /** Escape characters in searchWords which are meaningful in regular expressions */
  var autoEscape: js.UndefOr[Boolean] = js.native
  
  /** Search should be case sensitive; defaults to false */
  var caseSensitive: js.UndefOr[Boolean] = js.native
  
  /** CSS class name applied to the outer/wrapper <span> */
  var className: js.UndefOr[String] = js.native
  
  /**
    * Use a custom function to search for matching chunks. This makes it possible to use arbitrary logic
    * when looking for matches. See the default findChunks function in highlight-words-core for signature.
    * Have a look at the custom findChunks example on how to use it.
    */
  var findChunks: js.UndefOr[js.Function1[/* options */ FindChunks, js.Array[Chunk]]] = js.native
  
  /** CSS class name applied to highlighted text */
  var highlightClassName: js.UndefOr[String] = js.native
  
  /** Inline styles applied to highlighted text */
  var highlightStyle: js.UndefOr[CSSProperties] = js.native
  
  /**
    * Type of tag to wrap around highlighted matches; defaults to mark but can also be a React element
    * (class or functional)
    */
  var highlightTag: js.UndefOr[String | ComponentType[_]] = js.native
  
  /**
    * Process each search word and text to highlight before comparing (eg remove accents); signature
    * (text: string): string
    */
  var sanitize: js.UndefOr[js.Function1[/* text */ String, String]] = js.native
  
  /** Array of search words. The search terms are treated as RegExps unless autoEscape is set. */
  var searchWords: js.Array[String] = js.native
  
  /** Text to highlight matches in */
  var textToHighlight: String = js.native
  
  /** CSS class name applied to unhighlighted text */
  var unhighlightClassName: js.UndefOr[String] = js.native
  
  /** Inline styles applied to unhighlighted text */
  var unhighlightStyle: js.UndefOr[CSSProperties] = js.native
}
object HighlighterProps {
  
  @scala.inline
  def apply(searchWords: js.Array[String], textToHighlight: String): HighlighterProps = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlighterProps]
  }
  
  @scala.inline
  implicit class HighlighterPropsOps[Self <: HighlighterProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSearchWordsVarargs(value: String*): Self = this.set("searchWords", js.Array(value :_*))
    
    @scala.inline
    def setSearchWords(value: js.Array[String]): Self = this.set("searchWords", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextToHighlight(value: String): Self = this.set("textToHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActiveClassName(value: String): Self = this.set("activeClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveClassName: Self = this.set("activeClassName", js.undefined)
    
    @scala.inline
    def setActiveIndex(value: Double): Self = this.set("activeIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveIndex: Self = this.set("activeIndex", js.undefined)
    
    @scala.inline
    def setActiveStyle(value: CSSProperties): Self = this.set("activeStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActiveStyle: Self = this.set("activeStyle", js.undefined)
    
    @scala.inline
    def setAutoEscape(value: Boolean): Self = this.set("autoEscape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoEscape: Self = this.set("autoEscape", js.undefined)
    
    @scala.inline
    def setCaseSensitive(value: Boolean): Self = this.set("caseSensitive", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCaseSensitive: Self = this.set("caseSensitive", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setFindChunks(value: /* options */ FindChunks => js.Array[Chunk]): Self = this.set("findChunks", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteFindChunks: Self = this.set("findChunks", js.undefined)
    
    @scala.inline
    def setHighlightClassName(value: String): Self = this.set("highlightClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightClassName: Self = this.set("highlightClassName", js.undefined)
    
    @scala.inline
    def setHighlightStyle(value: CSSProperties): Self = this.set("highlightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightStyle: Self = this.set("highlightStyle", js.undefined)
    
    @scala.inline
    def setHighlightTag(value: String | ComponentType[_]): Self = this.set("highlightTag", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHighlightTag: Self = this.set("highlightTag", js.undefined)
    
    @scala.inline
    def setSanitize(value: /* text */ String => String): Self = this.set("sanitize", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteSanitize: Self = this.set("sanitize", js.undefined)
    
    @scala.inline
    def setUnhighlightClassName(value: String): Self = this.set("unhighlightClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnhighlightClassName: Self = this.set("unhighlightClassName", js.undefined)
    
    @scala.inline
    def setUnhighlightStyle(value: CSSProperties): Self = this.set("unhighlightStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUnhighlightStyle: Self = this.set("unhighlightStyle", js.undefined)
  }
}
