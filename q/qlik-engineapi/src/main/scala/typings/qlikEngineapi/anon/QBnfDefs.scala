package typings.qlikEngineapi.anon

import typings.qlikEngineapi.EngineAPI.IBNFDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QBnfDefs extends js.Object {
  var qBnfDefs: IBNFDef
  var qBnfHash: String
}

object QBnfDefs {
  @scala.inline
  def apply(qBnfDefs: IBNFDef, qBnfHash: String): QBnfDefs = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
    __obj.asInstanceOf[QBnfDefs]
  }
}

