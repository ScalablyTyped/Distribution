package typings.ractive.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BaseParseOpts extends StObject {
  
  /** The number of lines of template above and below a line with an error to include in the error message. */
  var contextLines: js.UndefOr[Double] = js.undefined
  
  /** Whether or not to produce a map of expression string -> function when parsing the template. */
  var csp: js.UndefOr[Boolean] = js.undefined
  
  /** The regular mustache delimiters - defaults to {{ }}. */
  var delimiters: js.UndefOr[ParseDelimiters] = js.undefined
  
  /** Preserve space around standalone sections. This only applies with preserveWhitespace enabled, and allows selective consumption of whitespace around sections using a trailing `-` in the opening section tag. */
  var preserveStandaloneSections: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to collapse consecutive whitespace into a single space. */
  var preserveWhitespace: js.UndefOr[Boolean] = js.undefined
  
  /** Whether or not to remove certain elements and event attributes from the parsed template. */
  var sanitize: js.UndefOr[Boolean | SanitizeOpts] = js.undefined
  
  /** The static mustache delimiters - defaults to [[ ]]. */
  var staticDelimiters: js.UndefOr[ParseDelimiters] = js.undefined
  
  /** The static triple mustache delimiters - defaults to [[[ ]]]. */
  var staticTripleDelimiters: js.UndefOr[ParseDelimiters] = js.undefined
  
  /** Whether or not to remove HTML comments from the template. Defaults to true. */
  var stripComments: js.UndefOr[Boolean] = js.undefined
  
  /** The triple mustache delimiters - defaults to {{{ }}}. */
  var tripleDelimiters: js.UndefOr[ParseDelimiters] = js.undefined
}
object BaseParseOpts {
  
  inline def apply(): BaseParseOpts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BaseParseOpts]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: BaseParseOpts] (val x: Self) extends AnyVal {
    
    inline def setContextLines(value: Double): Self = StObject.set(x, "contextLines", value.asInstanceOf[js.Any])
    
    inline def setContextLinesUndefined: Self = StObject.set(x, "contextLines", js.undefined)
    
    inline def setCsp(value: Boolean): Self = StObject.set(x, "csp", value.asInstanceOf[js.Any])
    
    inline def setCspUndefined: Self = StObject.set(x, "csp", js.undefined)
    
    inline def setDelimiters(value: ParseDelimiters): Self = StObject.set(x, "delimiters", value.asInstanceOf[js.Any])
    
    inline def setDelimitersUndefined: Self = StObject.set(x, "delimiters", js.undefined)
    
    inline def setPreserveStandaloneSections(value: Boolean): Self = StObject.set(x, "preserveStandaloneSections", value.asInstanceOf[js.Any])
    
    inline def setPreserveStandaloneSectionsUndefined: Self = StObject.set(x, "preserveStandaloneSections", js.undefined)
    
    inline def setPreserveWhitespace(value: Boolean): Self = StObject.set(x, "preserveWhitespace", value.asInstanceOf[js.Any])
    
    inline def setPreserveWhitespaceUndefined: Self = StObject.set(x, "preserveWhitespace", js.undefined)
    
    inline def setSanitize(value: Boolean | SanitizeOpts): Self = StObject.set(x, "sanitize", value.asInstanceOf[js.Any])
    
    inline def setSanitizeUndefined: Self = StObject.set(x, "sanitize", js.undefined)
    
    inline def setStaticDelimiters(value: ParseDelimiters): Self = StObject.set(x, "staticDelimiters", value.asInstanceOf[js.Any])
    
    inline def setStaticDelimitersUndefined: Self = StObject.set(x, "staticDelimiters", js.undefined)
    
    inline def setStaticTripleDelimiters(value: ParseDelimiters): Self = StObject.set(x, "staticTripleDelimiters", value.asInstanceOf[js.Any])
    
    inline def setStaticTripleDelimitersUndefined: Self = StObject.set(x, "staticTripleDelimiters", js.undefined)
    
    inline def setStripComments(value: Boolean): Self = StObject.set(x, "stripComments", value.asInstanceOf[js.Any])
    
    inline def setStripCommentsUndefined: Self = StObject.set(x, "stripComments", js.undefined)
    
    inline def setTripleDelimiters(value: ParseDelimiters): Self = StObject.set(x, "tripleDelimiters", value.asInstanceOf[js.Any])
    
    inline def setTripleDelimitersUndefined: Self = StObject.set(x, "tripleDelimiters", js.undefined)
  }
}
