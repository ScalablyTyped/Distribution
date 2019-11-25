package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxMatchingFieldInfo...
  */
trait INxMatchingFieldInfo extends js.Object {
  /**
    * Name of the field
    */
  var qName: String
  /**
    * List of tags
    */
  var qTags: js.Array[String]
}

object INxMatchingFieldInfo {
  @scala.inline
  def apply(qName: String, qTags: js.Array[String]): INxMatchingFieldInfo = {
    val __obj = js.Dynamic.literal(qName = qName.asInstanceOf[js.Any], qTags = qTags.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[INxMatchingFieldInfo]
  }
}

