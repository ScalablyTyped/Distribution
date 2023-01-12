package typings.remarkable.libMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * Convert "\n" in paragraphs into <br>.
    */
  var breaks: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Highlighter function. Should return escaped HTML, or "" if the source
    * string is not changed.
    */
  var highlight: js.UndefOr[js.Function2[/* str */ String, /* lang */ String, String]] = js.undefined
  
  /**
    * Enable HTML tags in source.
    */
  var html: js.UndefOr[Boolean] = js.undefined
  
  /**
    * CSS language prefix for fenced blocks.
    */
  var langPrefix: js.UndefOr[String] = js.undefined
  
  /**
    * Set target to open link in
    */
  var linkTarget: js.UndefOr[String] = js.undefined
  
  /**
    * Autoconvert URL-like text to links.
    */
  var linkify: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Double + single quotes replacement pairs, when typographer enabled,
    * and smartquotes on. Set doubles to "«»" for Russian, "„“" for German.
    */
  var quotes: js.UndefOr[String] = js.undefined
  
  /**
    * Enable some language-neutral replacement + quotes beautification.
    */
  var typographer: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Use "/" to close single tags (<br />).
    */
  var xhtmlOut: js.UndefOr[Boolean] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setBreaks(value: Boolean): Self = StObject.set(x, "breaks", value.asInstanceOf[js.Any])
    
    inline def setBreaksUndefined: Self = StObject.set(x, "breaks", js.undefined)
    
    inline def setHighlight(value: (/* str */ String, /* lang */ String) => String): Self = StObject.set(x, "highlight", js.Any.fromFunction2(value))
    
    inline def setHighlightUndefined: Self = StObject.set(x, "highlight", js.undefined)
    
    inline def setHtml(value: Boolean): Self = StObject.set(x, "html", value.asInstanceOf[js.Any])
    
    inline def setHtmlUndefined: Self = StObject.set(x, "html", js.undefined)
    
    inline def setLangPrefix(value: String): Self = StObject.set(x, "langPrefix", value.asInstanceOf[js.Any])
    
    inline def setLangPrefixUndefined: Self = StObject.set(x, "langPrefix", js.undefined)
    
    inline def setLinkTarget(value: String): Self = StObject.set(x, "linkTarget", value.asInstanceOf[js.Any])
    
    inline def setLinkTargetUndefined: Self = StObject.set(x, "linkTarget", js.undefined)
    
    inline def setLinkify(value: Boolean): Self = StObject.set(x, "linkify", value.asInstanceOf[js.Any])
    
    inline def setLinkifyUndefined: Self = StObject.set(x, "linkify", js.undefined)
    
    inline def setQuotes(value: String): Self = StObject.set(x, "quotes", value.asInstanceOf[js.Any])
    
    inline def setQuotesUndefined: Self = StObject.set(x, "quotes", js.undefined)
    
    inline def setTypographer(value: Boolean): Self = StObject.set(x, "typographer", value.asInstanceOf[js.Any])
    
    inline def setTypographerUndefined: Self = StObject.set(x, "typographer", js.undefined)
    
    inline def setXhtmlOut(value: Boolean): Self = StObject.set(x, "xhtmlOut", value.asInstanceOf[js.Any])
    
    inline def setXhtmlOutUndefined: Self = StObject.set(x, "xhtmlOut", js.undefined)
  }
}
