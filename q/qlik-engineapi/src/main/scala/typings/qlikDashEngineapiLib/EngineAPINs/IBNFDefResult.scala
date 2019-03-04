package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qBnfHash: java.lang.String
}

object IBNFDefResult {
  @scala.inline
  def apply(qBnfDefs: js.Array[IBNFDef], qBnfHash: java.lang.String): IBNFDefResult = {
    val __obj = js.Dynamic.literal(qBnfDefs = qBnfDefs, qBnfHash = qBnfHash)
  
    __obj.asInstanceOf[IBNFDefResult]
  }
}

