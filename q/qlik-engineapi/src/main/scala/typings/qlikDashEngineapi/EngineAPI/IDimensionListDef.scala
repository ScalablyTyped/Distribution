package typings.qlikDashEngineapi.EngineAPI

import typings.qlikDashEngineapi.qlikDashEngineapiStrings.dimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the lists of dimensions.
  */
trait IDimensionListDef extends js.Object {
  /**
    * Data type JSON
    */
  var qData: js.Any
  /**
    * Type of the list
    */
  var qType: dimension
}

object IDimensionListDef {
  @scala.inline
  def apply(qData: js.Any, qType: dimension): IDimensionListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IDimensionListDef]
  }
}

