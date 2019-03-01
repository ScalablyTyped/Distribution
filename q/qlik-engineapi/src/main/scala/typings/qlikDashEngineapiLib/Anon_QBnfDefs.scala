package typings
package qlikDashEngineapiLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_QBnfDefs extends js.Object {
  var qBnfDefs: qlikDashEngineapiLib.EngineAPINs.IBNFDef
  var qBnfHash: java.lang.String
}

object Anon_QBnfDefs {
  @scala.inline
  def apply(qBnfDefs: qlikDashEngineapiLib.EngineAPINs.IBNFDef, qBnfHash: java.lang.String): Anon_QBnfDefs = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qBnfDefs")(qBnfDefs)
    __obj.updateDynamic("qBnfHash")(qBnfHash)
    __obj.asInstanceOf[Anon_QBnfDefs]
  }
}

