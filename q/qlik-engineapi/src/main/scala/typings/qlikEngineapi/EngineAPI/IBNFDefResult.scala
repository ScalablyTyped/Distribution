package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IBNFDefResult
  */
trait IBNFDefResult extends js.Object {
  /**
    * Description of the scripting language grammar.
    */
  var qBnfDefs: js.Array[IBNFDef]
  /**
    * A string hash of the BNF definition.
    */
  var qBnfHash: String
}

object IBNFDefResult {
  @scala.inline
  def apply(qBnfDefs: js.Array[IBNFDef], qBnfHash: String): IBNFDefResult = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs.asInstanceOf[js.Any], qBnfHash = qBnfHash.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IBNFDefResult]
  }
}

