package typings.rdflib.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Incomplete extends StObject {
  
  var incomplete: js.Array[scala.Nothing]
  
  var language: Any
  
  var listMapping: Any
  
  var parent: Any
  
  var parentObject: Null
  
  var prefixes: Any
  
  var subject: Any
  
  var terms: Any
  
  var vocabulary: Any
}
object Incomplete {
  
  inline def apply(
    incomplete: js.Array[scala.Nothing],
    language: Any,
    listMapping: Any,
    parent: Any,
    parentObject: Null,
    prefixes: Any,
    subject: Any,
    terms: Any,
    vocabulary: Any
  ): Incomplete = {
    val __obj = js.Dynamic.literal(incomplete = incomplete.asInstanceOf[js.Any], language = language.asInstanceOf[js.Any], listMapping = listMapping.asInstanceOf[js.Any], parent = parent.asInstanceOf[js.Any], parentObject = parentObject.asInstanceOf[js.Any], prefixes = prefixes.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], terms = terms.asInstanceOf[js.Any], vocabulary = vocabulary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Incomplete]
  }
  
  extension [Self <: Incomplete](x: Self) {
    
    inline def setIncomplete(value: js.Array[scala.Nothing]): Self = StObject.set(x, "incomplete", value.asInstanceOf[js.Any])
    
    inline def setIncompleteVarargs(value: scala.Nothing*): Self = StObject.set(x, "incomplete", js.Array(value*))
    
    inline def setLanguage(value: Any): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
    
    inline def setListMapping(value: Any): Self = StObject.set(x, "listMapping", value.asInstanceOf[js.Any])
    
    inline def setParent(value: Any): Self = StObject.set(x, "parent", value.asInstanceOf[js.Any])
    
    inline def setParentObject(value: Null): Self = StObject.set(x, "parentObject", value.asInstanceOf[js.Any])
    
    inline def setPrefixes(value: Any): Self = StObject.set(x, "prefixes", value.asInstanceOf[js.Any])
    
    inline def setSubject(value: Any): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
    
    inline def setTerms(value: Any): Self = StObject.set(x, "terms", value.asInstanceOf[js.Any])
    
    inline def setVocabulary(value: Any): Self = StObject.set(x, "vocabulary", value.asInstanceOf[js.Any])
  }
}
