package typings.pulumiAws.outputMod.wafregional

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RegexMatchSetRegexMatchTuple extends StObject {
  
  /**
    * The part of a web request that you want to search, such as a specified header or a query string.
    */
  var fieldToMatch: RegexMatchSetRegexMatchTupleFieldToMatch
  
  /**
    * The ID of a `WAF Regex Pattern Set`.
    */
  var regexPatternSetId: String
  
  /**
    * Text transformations used to eliminate unusual formatting that attackers use in web requests in an effort to bypass AWS WAF.
    * e.g. `CMD_LINE`, `HTML_ENTITY_DECODE` or `NONE`.
    * See [docs](http://docs.aws.amazon.com/waf/latest/APIReference/API_ByteMatchTuple.html#WAF-Type-ByteMatchTuple-TextTransformation)
    * for all supported values.
    */
  var textTransformation: String
}
object RegexMatchSetRegexMatchTuple {
  
  inline def apply(
    fieldToMatch: RegexMatchSetRegexMatchTupleFieldToMatch,
    regexPatternSetId: String,
    textTransformation: String
  ): RegexMatchSetRegexMatchTuple = {
    val __obj = js.Dynamic.literal(fieldToMatch = fieldToMatch.asInstanceOf[js.Any], regexPatternSetId = regexPatternSetId.asInstanceOf[js.Any], textTransformation = textTransformation.asInstanceOf[js.Any])
    __obj.asInstanceOf[RegexMatchSetRegexMatchTuple]
  }
  
  extension [Self <: RegexMatchSetRegexMatchTuple](x: Self) {
    
    inline def setFieldToMatch(value: RegexMatchSetRegexMatchTupleFieldToMatch): Self = StObject.set(x, "fieldToMatch", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetId(value: String): Self = StObject.set(x, "regexPatternSetId", value.asInstanceOf[js.Any])
    
    inline def setTextTransformation(value: String): Self = StObject.set(x, "textTransformation", value.asInstanceOf[js.Any])
  }
}
