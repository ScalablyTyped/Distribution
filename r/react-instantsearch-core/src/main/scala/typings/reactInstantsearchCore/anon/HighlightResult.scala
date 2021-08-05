package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HighlightResult[TDoc] extends StObject {
  
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: typings.reactInstantsearchCore.mod.HighlightResult[TDoc]
  
  var objectID: String
}
object HighlightResult {
  
  inline def apply[TDoc](_highlightResult: typings.reactInstantsearchCore.mod.HighlightResult[TDoc], objectID: String): HighlightResult[TDoc] = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[HighlightResult[TDoc]]
  }
  
  extension [Self <: HighlightResult[?], TDoc](x: Self & HighlightResult[TDoc]) {
    
    inline def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    inline def set_highlightResult(value: typings.reactInstantsearchCore.mod.HighlightResult[TDoc]): Self = StObject.set(x, "_highlightResult", value.asInstanceOf[js.Any])
  }
}
