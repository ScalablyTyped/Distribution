package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Note: This struct is deprecated (not recommended to use).
  */
trait INxStreamListEntry extends js.Object {
  /**
    * Identifier of the stream
    */
  var qId: java.lang.String
  /**
    * Name of the stream
    */
  var qName: java.lang.String
}

object INxStreamListEntry {
  @scala.inline
  def apply(qId: java.lang.String, qName: java.lang.String): INxStreamListEntry = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("qId")(qId)
    __obj.updateDynamic("qName")(qName)
    __obj.asInstanceOf[INxStreamListEntry]
  }
}

