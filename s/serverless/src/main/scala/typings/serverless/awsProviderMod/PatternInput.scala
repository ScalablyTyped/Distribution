package typings.serverless.awsProviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PatternInput extends js.Object {
  var detail: Detail = js.native
  var `detail-type`: js.Array[String] = js.native
  var source: js.Array[String] = js.native
}

object PatternInput {
  @scala.inline
  def apply(detail: Detail, `detail-type`: js.Array[String], source: js.Array[String]): PatternInput = {
    val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PatternInput]
  }
  @scala.inline
  implicit class PatternInputOps[Self <: PatternInput] (val x: Self) extends AnyVal {
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
    def setDetail(value: Detail): Self = this.set("detail", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDetail-typeVarargs`(value: String*): Self = this.set("detail-type", js.Array(value :_*))
    @scala.inline
    def `setDetail-type`(value: js.Array[String]): Self = this.set("detail-type", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceVarargs(value: String*): Self = this.set("source", js.Array(value :_*))
    @scala.inline
    def setSource(value: js.Array[String]): Self = this.set("source", value.asInstanceOf[js.Any])
  }
  
}

