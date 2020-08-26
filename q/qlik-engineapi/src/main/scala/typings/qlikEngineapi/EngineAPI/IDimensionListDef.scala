package typings.qlikEngineapi.EngineAPI

import typings.qlikEngineapi.qlikEngineapiStrings.dimension
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Defines the lists of dimensions.
  */
@js.native
trait IDimensionListDef extends js.Object {
  /**
    * Data type JSON
    */
  var qData: js.Any = js.native
  /**
    * Type of the list
    */
  var qType: dimension = js.native
}

object IDimensionListDef {
  @scala.inline
  def apply(qData: js.Any, qType: dimension): IDimensionListDef = {
    val __obj = js.Dynamic.literal(qData = qData.asInstanceOf[js.Any], qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IDimensionListDef]
  }
  @scala.inline
  implicit class IDimensionListDefOps[Self <: IDimensionListDef] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setQData(value: js.Any): Self = this.set("qData", value.asInstanceOf[js.Any])
    @scala.inline
    def setQType(value: dimension): Self = this.set("qType", value.asInstanceOf[js.Any])
  }
  
}

