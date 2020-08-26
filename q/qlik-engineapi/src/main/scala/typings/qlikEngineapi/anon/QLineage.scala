package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QLineage extends js.Object {
  var qLineage: js.Array[QDiscriminator] = js.native
}

object QLineage {
  @scala.inline
  def apply(qLineage: js.Array[QDiscriminator]): QLineage = {
    val __obj = js.Dynamic.literal(qLineage = qLineage.asInstanceOf[js.Any])
    __obj.asInstanceOf[QLineage]
  }
  @scala.inline
  implicit class QLineageOps[Self <: QLineage] (val x: Self) extends AnyVal {
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
    def setQLineageVarargs(value: QDiscriminator*): Self = this.set("qLineage", js.Array(value :_*))
    @scala.inline
    def setQLineage(value: js.Array[QDiscriminator]): Self = this.set("qLineage", value.asInstanceOf[js.Any])
  }
  
}

