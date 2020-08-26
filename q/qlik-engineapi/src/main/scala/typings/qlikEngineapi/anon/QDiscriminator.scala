package typings.qlikEngineapi.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QDiscriminator extends js.Object {
  var qDiscriminator: String = js.native
}

object QDiscriminator {
  @scala.inline
  def apply(qDiscriminator: String): QDiscriminator = {
    val __obj = js.Dynamic.literal(qDiscriminator = qDiscriminator.asInstanceOf[js.Any])
    __obj.asInstanceOf[QDiscriminator]
  }
  @scala.inline
  implicit class QDiscriminatorOps[Self <: QDiscriminator] (val x: Self) extends AnyVal {
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
    def setQDiscriminator(value: String): Self = this.set("qDiscriminator", value.asInstanceOf[js.Any])
  }
  
}

