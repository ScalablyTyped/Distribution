package typings.qlikDashEngineapi.EngineAPI

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
  var qId: String
  /**
    * Name of the stream
    */
  var qName: String
}

object INxStreamListEntry {
  @scala.inline
  def apply(qId: String, qName: String): INxStreamListEntry = {
    val __obj = js.Dynamic.literal(qId = qId, qName = qName)
  
    __obj.asInstanceOf[INxStreamListEntry]
  }
}

