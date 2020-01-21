package typings.qlikEngineapi

import typings.qlikEngineapi.EngineAPI.IBNFDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonQBnfDefs extends js.Object {
  var qBnfDefs: IBNFDef
  var qBnfHash: String
}

object AnonQBnfDefs {
  @scala.inline
  def apply(qBnfDefs: IBNFDef, qBnfHash: String): AnonQBnfDefs = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonQBnfDefs]
  }
}

