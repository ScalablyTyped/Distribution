package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IBNFDefResult
  */
@js.native
trait IBNFDefResult extends js.Object {
  /**
    * Description of the scripting language grammar.
    */
  var qBnfDefs: js.Array[IBNFDef] = js.native
  /**
    * A string hash of the BNF definition.
    */
  var qBnfHash: String = js.native
}

object IBNFDefResult {
  @scala.inline
  def apply(qBnfDefs: js.Array[IBNFDef], qBnfHash: String): IBNFDefResult = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[IBNFDefResult]
  }
  @scala.inline
  implicit class IBNFDefResultOps[Self <: IBNFDefResult] (val x: Self) extends AnyVal {
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
    def setQBnfDefsVarargs(value: IBNFDef*): Self = this.set("qBnfDefs", js.Array(value :_*))
    @scala.inline
    def setQBnfDefs(value: js.Array[IBNFDef]): Self = this.set("qBnfDefs", value.asInstanceOf[js.Any])
    @scala.inline
    def setQBnfHash(value: String): Self = this.set("qBnfHash", value.asInstanceOf[js.Any])
  }
  
}

