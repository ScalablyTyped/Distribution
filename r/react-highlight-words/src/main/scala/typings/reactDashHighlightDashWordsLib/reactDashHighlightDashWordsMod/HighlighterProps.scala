package typings
package reactDashHighlightDashWordsLib.reactDashHighlightDashWordsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HighlighterProps extends js.Object {
  /** The class name to be applied to an active match. Use along with activeIndex */
  var activeClassName: js.UndefOr[java.lang.String] = js.undefined
  /** Specify the match index that should be actively highlighted. Use along with activeClassName */
  var activeIndex: js.UndefOr[java.lang.String] = js.undefined
  /** The inline style to be applied to an active match. Use along with activeIndex */
  var activeStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /** Escape characters in searchWords which are meaningful in regular expressions */
  var autoEscape: js.UndefOr[scala.Boolean] = js.undefined
  /** Search should be case sensitive; defaults to false */
  var caseSensitive: js.UndefOr[scala.Boolean] = js.undefined
  /** CSS class name applied to the outer/wrapper <span> */
  var className: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Use a custom function to search for matching chunks. This makes it possible to use arbitrary logic
    * when looking for matches. See the default findChunks function in highlight-words-core for signature.
    * Have a look at the custom findChunks example on how to use it.
    */
  var findChunks: js.UndefOr[js.Function1[/* options */ FindChunks, js.Array[Chunk]]] = js.undefined
  /** CSS class name applied to highlighted text */
  var highlightClassName: js.UndefOr[java.lang.String] = js.undefined
  /** Inline styles applied to highlighted text */
  var highlightStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
  /**
    * Type of tag to wrap around highlighted matches; defaults to mark but can also be a React element
    * (class or functional)
    */
  var highlightTag: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Process each search word and text to highlight before comparing (eg remove accents); signature
    * (text: string): string
    */
  var sanitize: js.UndefOr[js.Function1[/* text */ java.lang.String, java.lang.String]] = js.undefined
  /** Array of search words. The search terms are treated as RegExps unless autoEscape is set. */
  var searchWords: js.Array[java.lang.String]
  /** Text to highlight matches in */
  var textToHighlight: java.lang.String
  /** CSS class name applied to unhighlighted text */
  var unhighlightClassName: js.UndefOr[java.lang.String] = js.undefined
  /** Inline styles applied to unhighlighted text */
  var unhighlightStyle: js.UndefOr[reactLib.reactMod.ReactNs.CSSProperties] = js.undefined
}

