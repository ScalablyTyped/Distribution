package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Language
  extends StObject
     with _valueSetValue {
  
  /**
    * The <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-lexical-form">lexical representation</a> of an RDF Language Tag.
    */
  var languageTag: LANGTAG
  
  /**
    * Mandatory type "Language".
    */
  var `type`: typings.shexj.shexjStrings.Language
}
object Language {
  
  inline def apply(languageTag: LANGTAG): Language = {
    val __obj = js.Dynamic.literal(languageTag = languageTag.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("Language")
    __obj.asInstanceOf[Language]
  }
  
  extension [Self <: Language](x: Self) {
    
    inline def setLanguageTag(value: LANGTAG): Self = StObject.set(x, "languageTag", value.asInstanceOf[js.Any])
    
    inline def setType(value: typings.shexj.shexjStrings.Language): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
