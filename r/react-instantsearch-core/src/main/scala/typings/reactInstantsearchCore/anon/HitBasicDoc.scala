package typings.reactInstantsearchCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.reactInstantsearchCore.mod.BasicDoc
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined react-instantsearch-core.react-instantsearch-core.Hit<react-instantsearch-core.react-instantsearch-core.BasicDoc> */
trait HitBasicDoc
  extends StObject
     with /* k */ StringDictionary[String] {
  
  /**
    * Contains the searchable attributes within the document and shows which part of the
    * attribute was matched by the search terms.  Note that if the index has defined
    * any searchable attributes, this object will only contain those keys and others
    * will not exist.
    */
  var _highlightResult: typings.reactInstantsearchCore.mod.HighlightResult[BasicDoc]
  
  var objectID: String
}
object HitBasicDoc {
  
  inline def apply(_highlightResult: typings.reactInstantsearchCore.mod.HighlightResult[BasicDoc], objectID: String): HitBasicDoc = {
    val __obj = js.Dynamic.literal(_highlightResult = _highlightResult.asInstanceOf[js.Any], objectID = objectID.asInstanceOf[js.Any])
    __obj.asInstanceOf[HitBasicDoc]
  }
  
  extension [Self <: HitBasicDoc](x: Self) {
    
    inline def setObjectID(value: String): Self = StObject.set(x, "objectID", value.asInstanceOf[js.Any])
    
    inline def set_highlightResult(value: typings.reactInstantsearchCore.mod.HighlightResult[BasicDoc]): Self = StObject.set(x, "_highlightResult", value.asInstanceOf[js.Any])
  }
}
