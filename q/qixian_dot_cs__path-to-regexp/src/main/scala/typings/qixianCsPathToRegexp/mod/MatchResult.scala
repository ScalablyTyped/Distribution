package typings.qixianCsPathToRegexp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MatchResult[P /* <: js.Object */] extends Match_[P] {
  var index: Double = js.native
  var params: P = js.native
  var path: String = js.native
}

object MatchResult {
  @scala.inline
  def apply[/* <: js.Object */ P](index: Double, params: P, path: String): MatchResult[P] = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
    __obj.asInstanceOf[MatchResult[P]]
  }
  @scala.inline
  implicit class MatchResultOps[Self <: MatchResult[_], /* <: js.Object */ P] (val x: Self with MatchResult[P]) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setParams(value: P): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def setPath(value: String): Self = this.set("path", value.asInstanceOf[js.Any])
  }
  
}

