package typings.storybookComponents.propDefMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JsDocTags extends js.Object {
  var params: js.UndefOr[js.Array[JsDocParam]] = js.native
  var returns: js.UndefOr[JsDocReturns] = js.native
}

object JsDocTags {
  @scala.inline
  def apply(): JsDocTags = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JsDocTags]
  }
  @scala.inline
  implicit class JsDocTagsOps[Self <: JsDocTags] (val x: Self) extends AnyVal {
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
    def setParamsVarargs(value: JsDocParam*): Self = this.set("params", js.Array(value :_*))
    @scala.inline
    def setParams(value: js.Array[JsDocParam]): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setReturns(value: JsDocReturns): Self = this.set("returns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReturns: Self = this.set("returns", js.undefined)
  }
  
}

