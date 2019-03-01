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
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qBnfDefs")(qBnfDefs)
    __obj.updateDynamic("qBnfHash")(qBnfHash)
    __obj.asInstanceOf[IBNFDefResult]
  }
}

