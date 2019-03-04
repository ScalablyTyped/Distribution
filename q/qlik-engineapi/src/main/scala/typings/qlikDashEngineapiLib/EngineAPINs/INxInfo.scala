package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxInfo...
  */
trait INxInfo extends js.Object {
  /**
    * Identifier of the object.
    * If the chosen identifier is already in use, the engine automatically sets another one.
    * This parameter is optional. If an identifier is not set, the engine automatically sets one.
    */
  var qId: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Type of the object.
    * >> This parameter is mandatory.
    */
  var qType: java.lang.String
}

object INxInfo {
  @scala.inline
  def apply(qType: java.lang.String, qId: java.lang.String = null): INxInfo = {
    val __obj = js.Dynamic.literal(qType = qType)
    if (qId != null) __obj.updateDynamic("qId")(qId)
    __obj.asInstanceOf[INxInfo]
  }
}

