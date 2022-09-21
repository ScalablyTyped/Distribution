package typings.shexj.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait stringFacets extends StObject {
  
  /**
    * Optional flags for the regular expression in {@link pattern}.
    */
  var flags: js.UndefOr[STRING] = js.undefined
  
  /**
    * Expected length of the lexical form of an RDF Term.
    */
  var length: js.UndefOr[INTEGER] = js.undefined
  
  /**
    * Expected maximum length of the lexical form of an RDF Term.
    */
  var maxlength: js.UndefOr[INTEGER] = js.undefined
  
  /**
    * Expected minimum length of the lexical form of an RDF Term.
    */
  var minlength: js.UndefOr[INTEGER] = js.undefined
  
  /**
    * Regular expression which the lexical forn of an RDF Term must match.
    */
  var pattern: js.UndefOr[STRING] = js.undefined
}
object stringFacets {
  
  inline def apply(): stringFacets = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[stringFacets]
  }
  
  extension [Self <: stringFacets](x: Self) {
    
    inline def setFlags(value: STRING): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    
    inline def setFlagsUndefined: Self = StObject.set(x, "flags", js.undefined)
    
    inline def setLength(value: INTEGER): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    
    inline def setMaxlength(value: INTEGER): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
    
    inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
    
    inline def setMinlength(value: INTEGER): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
    
    inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
    
    inline def setPattern(value: STRING): Self = StObject.set(x, "pattern", value.asInstanceOf[js.Any])
    
    inline def setPatternUndefined: Self = StObject.set(x, "pattern", js.undefined)
  }
}
