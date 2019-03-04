package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.dimension
}

object IDimensionListDef {
  @scala.inline
  def apply(qData: js.Any, qType: qlikDashEngineapiLib.qlikDashEngineapiLibStrings.dimension): IDimensionListDef = {
    val __obj = js.Dynamic.literal(qData = qData, qType = qType)
  
    __obj.asInstanceOf[IDimensionListDef]
  }
}

