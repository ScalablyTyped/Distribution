package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * SerachFieldMatch...
  */
trait ISerachFieldMatch extends StObject {
  
  /**
    * Position of the field in the list of fields, starting from 0.
    * The list of fields is defined in qResults/qFieldNames and contains the search associations.
    */
  var qField: Double
  
  /**
    * Number of search hits in the field.
    * The number of values in qValues and the value of qNoOfMatches are equal if qMaxNbrFieldMatches is -1.
    */
  var qNoOfMatches: Double
  
  /**
    * Positions of the search terms, starting from 0.
    */
  var qTerms: js.Array[Double]
  
  /**
    * Positions of the matching values in the search results.
    * The maximum number of values in this list is defined by qMaxNbrFieldMatches.
    */
  var qValues: js.Array[Double]
}
object ISerachFieldMatch {
  
  inline def apply(qField: Double, qNoOfMatches: Double, qTerms: js.Array[Double], qValues: js.Array[Double]): ISerachFieldMatch = {
    val __obj = js.Dynamic.literal(qField = qField.asInstanceOf[js.Any], qNoOfMatches = qNoOfMatches.asInstanceOf[js.Any], qTerms = qTerms.asInstanceOf[js.Any], qValues = qValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISerachFieldMatch]
  }
  
  extension [Self <: ISerachFieldMatch](x: Self) {
    
    inline def setQField(value: Double): Self = StObject.set(x, "qField", value.asInstanceOf[js.Any])
    
    inline def setQNoOfMatches(value: Double): Self = StObject.set(x, "qNoOfMatches", value.asInstanceOf[js.Any])
    
    inline def setQTerms(value: js.Array[Double]): Self = StObject.set(x, "qTerms", value.asInstanceOf[js.Any])
    
    inline def setQTermsVarargs(value: Double*): Self = StObject.set(x, "qTerms", js.Array(value*))
    
    inline def setQValues(value: js.Array[Double]): Self = StObject.set(x, "qValues", value.asInstanceOf[js.Any])
    
    inline def setQValuesVarargs(value: Double*): Self = StObject.set(x, "qValues", js.Array(value*))
  }
}
