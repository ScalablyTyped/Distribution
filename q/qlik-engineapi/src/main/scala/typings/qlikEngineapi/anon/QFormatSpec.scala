package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IDataRecord
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QFormatSpec extends js.Object {
  var qFormatSpec: String = js.native
  var qPreview: js.Array[IDataRecord] = js.native
}

object QFormatSpec {
  @scala.inline
  def apply(qFormatSpec: String, qPreview: js.Array[IDataRecord]): QFormatSpec = {
    val __obj = js.Dynamic.literal(qFormatSpec = qFormatSpec.asInstanceOf[js.Any], qPreview = qPreview.asInstanceOf[js.Any])
    __obj.asInstanceOf[QFormatSpec]
  }
  @scala.inline
  implicit class QFormatSpecOps[Self <: QFormatSpec] (val x: Self) extends AnyVal {
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
    def setQFormatSpec(value: String): Self = this.set("qFormatSpec", value.asInstanceOf[js.Any])
    @scala.inline
    def setQPreviewVarargs(value: IDataRecord*): Self = this.set("qPreview", js.Array(value :_*))
    @scala.inline
    def setQPreview(value: js.Array[IDataRecord]): Self = this.set("qPreview", value.asInstanceOf[js.Any])
  }
  
}

