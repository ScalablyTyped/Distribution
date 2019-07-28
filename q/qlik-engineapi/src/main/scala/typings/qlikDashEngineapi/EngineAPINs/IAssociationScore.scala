package typings.qlikDashEngineapi.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AssociationScore...
  */
trait IAssociationScore extends js.Object {
  /**
    * Association information about the field FieldName1 defined in qFieldPairName.
    */
  var qField1Scores: IFieldScores
  /**
    * Association information about the field FieldName2 defined in qFieldPairName.
    */
  var qField2Scores: IFieldScores
  /**
    * Pair of fields.
    * <FieldName1> / <FieldName2>
    * Where:
    * <FieldName1> is a field in the table 1 (defined in qTable1)
    * <FieldName2> is a field in the table 2 (defined in qTable2)
    * If the field is a synthetic key, the name of the field is preceded by [Synthetic key]:.
    */
  var qFieldPairName: String
  /**
    * Flag used to interpret calculated scores.
    * One of the following values or sum of values that apply:
    *
    *  0: The cardinal ratio cannot be zero but the symbol score and the row score can be zero.
    * -1: The fields do not have the same type.
    * -2: The number of rows of the field FieldName1 is zero.
    * -4: The number of distinct values of the field FieldName1 is zero.
    * -8: The number of rows of the field FieldName2 is zero.
    * -16: The number of distinct values of the field FieldName2 is zero.
    *
    * Example:
    * The number of rows of the field FieldName1 is zero, and the number of distinct values
    * of the field FieldName2 is zero, then qScoreSummary is -18.
    */
  var qScoreSummary: Double
}

object IAssociationScore {
  @scala.inline
  def apply(
    qField1Scores: IFieldScores,
    qField2Scores: IFieldScores,
    qFieldPairName: String,
    qScoreSummary: Double
  ): IAssociationScore = {
    val __obj = js.Dynamic.literal(qField1Scores = qField1Scores, qField2Scores = qField2Scores, qFieldPairName = qFieldPairName, qScoreSummary = qScoreSummary)
  
    __obj.asInstanceOf[IAssociationScore]
  }
}

