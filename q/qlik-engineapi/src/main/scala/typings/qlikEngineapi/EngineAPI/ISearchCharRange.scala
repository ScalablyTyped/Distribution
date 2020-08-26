package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SearchCharRange...
  */
@js.native
trait ISearchCharRange extends js.Object {
  /**
    * Length of the match in the search result.
    */
  var qCharCount: Double = js.native
  /**
    * Starting position of the match in the search result, starting from 0.
    */
  var qCharPos: Double = js.native
  /**
    * Position of the term in the list of search terms, starting from 0.
    */
  var qTerm: Double = js.native
}

object ISearchCharRange {
  @scala.inline
  def apply(qCharCount: Double, qCharPos: Double, qTerm: Double): ISearchCharRange = {
    val __obj = js.Dynamic.literal(qCharCount = qCharCount.asInstanceOf[js.Any], qCharPos = qCharPos.asInstanceOf[js.Any], qTerm = qTerm.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchCharRange]
  }
  @scala.inline
  implicit class ISearchCharRangeOps[Self <: ISearchCharRange] (val x: Self) extends AnyVal {
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
    def setQCharCount(value: Double): Self = this.set("qCharCount", value.asInstanceOf[js.Any])
    @scala.inline
    def setQCharPos(value: Double): Self = this.set("qCharPos", value.asInstanceOf[js.Any])
    @scala.inline
    def setQTerm(value: Double): Self = this.set("qTerm", value.asInstanceOf[js.Any])
  }
  
}

