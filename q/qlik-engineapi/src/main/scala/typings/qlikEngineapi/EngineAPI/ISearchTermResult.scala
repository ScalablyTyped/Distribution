package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchTermResult...
  */
@js.native
trait ISearchTermResult extends js.Object {
  /**
    * Element number of the associated value.
    */
  var qElemNumber: Double = js.native
  /**
    * List of ranges.
    * For example, if the user searches the term read and the associative value is Reading,
    * then the corresponding range would be Read in Reading.
    */
  var qRanges: js.Array[ISearchCharRange] = js.native
  /**
    * Text of the associated value.
    */
  var qText: String = js.native
}

object ISearchTermResult {
  @scala.inline
  def apply(qElemNumber: Double, qRanges: js.Array[ISearchCharRange], qText: String): ISearchTermResult = {
    val __obj = js.Dynamic.literal(qElemNumber = qElemNumber.asInstanceOf[js.Any], qRanges = qRanges.asInstanceOf[js.Any], qText = qText.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchTermResult]
  }
  @scala.inline
  implicit class ISearchTermResultOps[Self <: ISearchTermResult] (val x: Self) extends AnyVal {
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
    def setQElemNumber(value: Double): Self = this.set("qElemNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def setQRangesVarargs(value: ISearchCharRange*): Self = this.set("qRanges", js.Array(value :_*))
    @scala.inline
    def setQRanges(value: js.Array[ISearchCharRange]): Self = this.set("qRanges", value.asInstanceOf[js.Any])
    @scala.inline
    def setQText(value: String): Self = this.set("qText", value.asInstanceOf[js.Any])
  }
  
}

