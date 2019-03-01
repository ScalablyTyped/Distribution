package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IMeasureListDef
  */
trait IMeasureListDef extends js.Object {
  var qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.measure
}

object IMeasureListDef {
  @scala.inline
  def apply(qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.measure): IMeasureListDef = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qType")(qType)
    __obj.asInstanceOf[IMeasureListDef]
  }
}

