package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SearchGroupItemMatch...
  */
trait ISearchGroupItemMatch extends StObject {
  
  /**
    * Property of the search group item.
    * For example, if the user requests SearchObjects with SearchObjectOptions.qAttributes = [],
    * then the outputted qAttributes will be empty.
    *
    * Otherwise, if SearchObjectOptions.qAttributes = [qProperty],
    * SearchGroupItemMatch.qAttributes = [qProperty, qMetaDef/title]
    * if the match has been found in the title of the item.
    *
    * For dimension values, the returned qProperty will be *.
    */
  var qAttributes: js.Array[ISearchAttribute]
  
  /**
    * List of ranges.
    * For example, if the search terms are Price and Make, and the search group item value is Make by Price vs Mileage,
    * then there are two ranges: one for Price and one for Make.
    */
  var qRanges: js.Array[ISearchCharRange]
  
  /**
    * Search match value.
    * Value of the search group item.
    * If the match is found in a field, it corresponds to the value of the field.
    * If the match is found in a generic object property, it corresponds to the property value.
    */
  var qText: String
}
object ISearchGroupItemMatch {
  
  inline def apply(qAttributes: js.Array[ISearchAttribute], qRanges: js.Array[ISearchCharRange], qText: String): ISearchGroupItemMatch = {
    val __obj = js.Dynamic.literal(qAttributes = qAttributes.asInstanceOf[js.Any], qRanges = qRanges.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchGroupItemMatch]
  }
  
  extension [Self <: ISearchGroupItemMatch](x: Self) {
    
    inline def setQAttributes(value: js.Array[ISearchAttribute]): Self = StObject.set(x, "qAttributes", value.asInstanceOf[js.Any])
    
    inline def setQAttributesVarargs(value: ISearchAttribute*): Self = StObject.set(x, "qAttributes", js.Array(value :_*))
    
    inline def setQRanges(value: js.Array[ISearchCharRange]): Self = StObject.set(x, "qRanges", value.asInstanceOf[js.Any])
    
    inline def setQRangesVarargs(value: ISearchCharRange*): Self = StObject.set(x, "qRanges", js.Array(value :_*))
    
    inline def setQText(value: String): Self = StObject.set(x, "qText", value.asInstanceOf[js.Any])
  }
}
