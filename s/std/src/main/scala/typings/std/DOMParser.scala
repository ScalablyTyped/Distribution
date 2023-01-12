package typings.std

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Provides the ability to parse XML or HTML source code from a string into a DOM Document. */
trait DOMParser extends StObject {
  
  /**
    * Parses string using either the HTML or XML parser, according to type, and returns the resulting Document. type can be "text/html" (which will invoke the HTML parser), or any of "text/xml", "application/xml", "application/xhtml+xml", or "image/svg+xml" (which will invoke the XML parser).
    *
    * For the XML parser, if string cannot be parsed, then the returned Document will contain elements describing the resulting error.
    *
    * Note that script elements are not evaluated during parsing, and the resulting document's encoding will always be UTF-8.
    *
    * Values other than the above for type will cause a TypeError exception to be thrown.
    */
  /* standard dom */
  def parseFromString(string: java.lang.String, `type`: DOMParserSupportedType): Document
}
object DOMParser {
  
  inline def apply(parseFromString: (java.lang.String, DOMParserSupportedType) => Document): DOMParser = {
    val __obj = js.Dynamic.literal(parseFromString = js.Any.fromFunction2(parseFromString))
    __obj.asInstanceOf[DOMParser]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DOMParser] (val x: Self) extends AnyVal {
    
    inline def setParseFromString(value: (java.lang.String, DOMParserSupportedType) => Document): Self = StObject.set(x, "parseFromString", js.Any.fromFunction2(value))
  }
}
