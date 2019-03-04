package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qName: java.lang.String
  /**
    * List of tags
    */
  var qTags: js.Array[java.lang.String]
}

object INxMatchingFieldInfo {
  @scala.inline
  def apply(qName: java.lang.String, qTags: js.Array[java.lang.String]): INxMatchingFieldInfo = {
    val __obj = js.Dynamic.literal(qName = qName, qTags = qTags)
  
    __obj.asInstanceOf[INxMatchingFieldInfo]
  }
}

