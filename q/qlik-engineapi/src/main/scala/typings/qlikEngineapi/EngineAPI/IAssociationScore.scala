package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * AssociationScore...
  */
@js.native
trait IAssociationScore extends js.Object {
  /**
    * Association information about the field FieldName1 defined in qFieldPairName.
    */
  var qField1Scores: IFieldScores = js.native
  /**
    * Association information about the field FieldName2 defined in qFieldPairName.
    */
  var qField2Scores: IFieldScores = js.native
  /**
    * Pair of fields.
    * <FieldName1> / <FieldName2>
    * Where:
    * <FieldName1> is a field in the table 1 (defined in qTable1)
    * <FieldName2> is a field in the table 2 (defined in qTable2)
    * If the field is a synthetic key, the name of the field is preceded by [Synthetic key]:.
    */
  var qFieldPairName: String = js.native
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
  var qScoreSummary: Double = js.native
}

object IAssociationScore {
  @scala.inline
  def apply(
    qField1Scores: IFieldScores,
    qField2Scores: IFieldScores,
    qFieldPairName: String,
    qScoreSummary: Double
  ): IAssociationScore = {
    val __obj = js.Dynamic.literal(qField1Scores = qField1Scores.asInstanceOf[js.Any], qField2Scores = qField2Scores.asInstanceOf[js.Any], qFieldPairName = qFieldPairName.asInstanceOf[js.Any], qScoreSummary = qScoreSummary.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAssociationScore]
  }
  @scala.inline
  implicit class IAssociationScoreOps[Self <: IAssociationScore] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQField1Scores(value: IFieldScores): Self = this.set("qField1Scores", value.asInstanceOf[js.Any])
    @scala.inline
    def setQField2Scores(value: IFieldScores): Self = this.set("qField2Scores", value.asInstanceOf[js.Any])
    @scala.inline
    def setQFieldPairName(value: String): Self = this.set("qFieldPairName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQScoreSummary(value: Double): Self = this.set("qScoreSummary", value.asInstanceOf[js.Any])
  }
  
}

