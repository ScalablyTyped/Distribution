package typings.qlikEngineapi.EngineAPI

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * FieldScores...
  */
trait IFieldScores extends StObject {
  
  /**
    * Cardinality of a column/field divided by the number of rows in the table.
    * If the cardinal ratio is 1, it means that the column is a candidate/primary key.
    */
  var qCardinalRatio: Double
  
  /**
    * Field name.
    * One of the field names defined in qFieldPairName.
    */
  var qFieldName: String
  
  /**
    * Number of matches between the two fields defined in qFieldPairName divided by the number
    * of values in the field qFieldName.
    * If 0, it means that there are no common values between the two fields defined in qFieldPairName.
    */
  var qRowScore: Double
  
  /**
    * Number of distinct matches between the two fields defined in qFieldPairName divided
    * by the number of distinct values in the field qFieldName.
    * If 0, it means that there are no common values between the two fields defined in qFieldPairName.
    */
  var qSymbolScore: Double
}
object IFieldScores {
  
  @scala.inline
  def apply(qCardinalRatio: Double, qFieldName: String, qRowScore: Double, qSymbolScore: Double): IFieldScores = {
    val __obj = js.Dynamic.literal(qCardinalRatio = qCardinalRatio.asInstanceOf[js.Any], qFieldName = qFieldName.asInstanceOf[js.Any], qRowScore = qRowScore.asInstanceOf[js.Any], qSymbolScore = qSymbolScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldScores]
  }
  
  @scala.inline
  implicit class IFieldScoresMutableBuilder[Self <: IFieldScores] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setQCardinalRatio(value: Double): Self = StObject.set(x, "qCardinalRatio", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQFieldName(value: String): Self = StObject.set(x, "qFieldName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQRowScore(value: Double): Self = StObject.set(x, "qRowScore", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQSymbolScore(value: Double): Self = StObject.set(x, "qSymbolScore", value.asInstanceOf[js.Any])
  }
}
