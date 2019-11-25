package typings.qlikDashEngineapi.EngineAPI

import typings.qlikDashEngineapi.qlikDashEngineapiStrings.measure
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * IMeasureListDef
  */
trait IMeasureListDef extends js.Object {
  var qType: measure
}

object IMeasureListDef {
  @scala.inline
  def apply(qType: measure): IMeasureListDef = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IMeasureListDef]
  }
}

