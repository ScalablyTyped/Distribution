package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IBNFDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait QBnfDefs extends js.Object {
  var qBnfDefs: IBNFDef = js.native
  var qBnfHash: String = js.native
}

object QBnfDefs {
  @scala.inline
  def apply(qBnfDefs: IBNFDef, qBnfHash: String): QBnfDefs = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[QBnfDefs]
  }
  @scala.inline
  implicit class QBnfDefsOps[Self <: QBnfDefs] (val x: Self) extends AnyVal {
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
    def setQBnfDefs(value: IBNFDef): Self = this.set("qBnfDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setQBnfHash(value: String): Self = this.set("qBnfHash", value.asInstanceOf[js.Any])
  }
  
}

