package typings.reactHighlightWords.mod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.CSSProperties
import typings.react.mod.ComponentType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlighterProps
  extends /** Allows to pass through any parameter to wrapped component */
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
  var highlightTag: js.UndefOr[String | ComponentType[_]] = js.undefined
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
  def apply(
    searchWords: js.Array[String],
    textToHighlight: String,
    StringDictionary: /** Allows to pass through any parameter to wrapped component */
  /* index */ StringDictionary[js.Any] = null,
    activeClassName: String = null,
    activeIndex: Int | Double = null,
    activeStyle: CSSProperties = null,
    autoEscape: js.UndefOr[Boolean] = js.undefined,
    caseSensitive: js.UndefOr[Boolean] = js.undefined,
    className: String = null,
    findChunks: /* options */ FindChunks => js.Array[Chunk] = null,
    highlightClassName: String = null,
    highlightStyle: CSSProperties = null,
    highlightTag: String | ComponentType[_] = null,
    sanitize: /* text */ String => String = null,
    unhighlightClassName: String = null,
    unhighlightStyle: CSSProperties = null
  ): HighlighterProps = {
    val __obj = js.Dynamic.literal(searchWords = searchWords.asInstanceOf[js.Any], textToHighlight = textToHighlight.asInstanceOf[js.Any])
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (activeClassName != null) __obj.updateDynamic("activeClassName")(activeClassName.asInstanceOf[js.Any])
    if (activeIndex != null) __obj.updateDynamic("activeIndex")(activeIndex.asInstanceOf[js.Any])
    if (activeStyle != null) __obj.updateDynamic("activeStyle")(activeStyle.asInstanceOf[js.Any])
    if (!js.isUndefined(autoEscape)) __obj.updateDynamic("autoEscape")(autoEscape.asInstanceOf[js.Any])
    if (!js.isUndefined(caseSensitive)) __obj.updateDynamic("caseSensitive")(caseSensitive.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (findChunks != null) __obj.updateDynamic("findChunks")(js.Any.fromFunction1(findChunks))
    if (highlightClassName != null) __obj.updateDynamic("highlightClassName")(highlightClassName.asInstanceOf[js.Any])
    if (highlightStyle != null) __obj.updateDynamic("highlightStyle")(highlightStyle.asInstanceOf[js.Any])
    if (highlightTag != null) __obj.updateDynamic("highlightTag")(highlightTag.asInstanceOf[js.Any])
    if (sanitize != null) __obj.updateDynamic("sanitize")(js.Any.fromFunction1(sanitize))
    if (unhighlightClassName != null) __obj.updateDynamic("unhighlightClassName")(unhighlightClassName.asInstanceOf[js.Any])
    if (unhighlightStyle != null) __obj.updateDynamic("unhighlightStyle")(unhighlightStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlighterProps]
  }
}

