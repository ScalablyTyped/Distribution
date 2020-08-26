package typings.selectize.Selectize

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchResult extends js.Object {
  var id: String = js.native
  var score: Double = js.native
}

object ISearchResult {
  @scala.inline
  def apply(id: String, score: Double): ISearchResult = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], score = score.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchResult]
  }
  @scala.inline
  implicit class ISearchResultOps[Self <: ISearchResult] (val x: Self) extends AnyVal {
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
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setScore(value: Double): Self = this.set("score", value.asInstanceOf[js.Any])
  }
  
}

