package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * FieldScores...
  */
@js.native
trait IFieldScores extends js.Object {
  /**
    * Cardinality of a column/field divided by the number of rows in the table.
    * If the cardinal ratio is 1, it means that the column is a candidate/primary key.
    */
  var qCardinalRatio: Double = js.native
  /**
    * Field name.
    * One of the field names defined in qFieldPairName.
    */
  var qFieldName: String = js.native
  /**
    * Number of matches between the two fields defined in qFieldPairName divided by the number
    * of values in the field qFieldName.
    * If 0, it means that there are no common values between the two fields defined in qFieldPairName.
    */
  var qRowScore: Double = js.native
  /**
    * Number of distinct matches between the two fields defined in qFieldPairName divided
    * by the number of distinct values in the field qFieldName.
    * If 0, it means that there are no common values between the two fields defined in qFieldPairName.
    */
  var qSymbolScore: Double = js.native
}

object IFieldScores {
  @scala.inline
  def apply(qCardinalRatio: Double, qFieldName: String, qRowScore: Double, qSymbolScore: Double): IFieldScores = {
    val __obj = js.Dynamic.literal(qCardinalRatio = qCardinalRatio.asInstanceOf[js.Any], qFieldName = qFieldName.asInstanceOf[js.Any], qRowScore = qRowScore.asInstanceOf[js.Any], qSymbolScore = qSymbolScore.asInstanceOf[js.Any])
    __obj.asInstanceOf[IFieldScores]
  }
  @scala.inline
  implicit class IFieldScoresOps[Self <: IFieldScores] (val x: Self) extends AnyVal {
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
    def setQCardinalRatio(value: Double): Self = this.set("qCardinalRatio", value.asInstanceOf[js.Any])
    @scala.inline
    def setQFieldName(value: String): Self = this.set("qFieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def setQRowScore(value: Double): Self = this.set("qRowScore", value.asInstanceOf[js.Any])
    @scala.inline
    def setQSymbolScore(value: Double): Self = this.set("qSymbolScore", value.asInstanceOf[js.Any])
  }
  
}

