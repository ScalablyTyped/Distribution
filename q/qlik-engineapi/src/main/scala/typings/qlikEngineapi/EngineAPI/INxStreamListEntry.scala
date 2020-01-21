package typings.qlikEngineapi.EngineAPI

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
    val __obj = js.Dynamic.literal(qId = qId.asInstanceOf[js.Any], qName = qName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxStreamListEntry]
  }
}

