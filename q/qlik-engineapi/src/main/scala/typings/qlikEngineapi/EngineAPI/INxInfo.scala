package typings.qlikEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxInfo...
  */
@js.native
trait INxInfo extends js.Object {
  /**
    * Identifier of the object.
    * If the chosen identifier is already in use, the engine automatically sets another one.
    * This parameter is optional. If an identifier is not set, the engine automatically sets one.
    */
  var qId: js.UndefOr[String] = js.native
  /**
    * Type of the object.
    * >> This parameter is mandatory.
    */
  var qType: String = js.native
}

object INxInfo {
  @scala.inline
  def apply(qType: String): INxInfo = {
    val __obj = js.Dynamic.literal(qType = qType.asInstanceOf[js.Any])
    __obj.asInstanceOf[INxInfo]
  }
  @scala.inline
  implicit class INxInfoOps[Self <: INxInfo] (val x: Self) extends AnyVal {
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
    def setQType(value: String): Self = this.set("qType", value.asInstanceOf[js.Any])
    @scala.inline
    def setQId(value: String): Self = this.set("qId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQId: Self = this.set("qId", js.undefined)
  }
  
}

