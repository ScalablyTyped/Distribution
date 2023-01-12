package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ObjectLiteral extends StObject {
  
  /**
    * The <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-language-tag">language tag</a> of an RDF Literal.
    */
  var language: js.UndefOr[STRING] = js.undefined
  
  /**
    * The <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-datatype">datatype</a> of an RDF Literal.
    */
  var `type`: js.UndefOr[STRING] = js.undefined
  
  /**
    * The <a href="https://www.w3.org/TR/rdf11-concepts/#dfn-lexical-form">lexical form</a> of an RDF Literal.
    */
  var value: STRING
}
object ObjectLiteral {
  
  inline def apply(value: STRING): ObjectLiteral = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectLiteral]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ObjectLiteral] (val x: Self) extends AnyVal {
    
    inline def setLanguage(value: STRING): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setLanguageUndefined: Self = StObject.set(x, "language", js.undefined)
    
    inline def setType(value: STRING): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setValue(value: STRING): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
