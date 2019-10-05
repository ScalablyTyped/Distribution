package typings.qlikDashEngineapi.EngineAPI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Container for the dynamic properties of an attribute expression.
  */
trait INxAxisTicks extends js.Object {
  /**
    * Name of the derived definition.
    */
  var qName: String
  /**
    * List of tags.
    */
  var qTags: js.Array[String]
  /**
    * List of ticks.
    */
  var qTicks: js.Array[INxTickCell]
}

object INxAxisTicks {
  @scala.inline
  def apply(qName: String, qTags: js.Array[String], qTicks: js.Array[INxTickCell]): INxAxisTicks = {
    val __obj = js.Dynamic.literal(qName = qName, qTags = qTags, qTicks = qTicks)
  
    __obj.asInstanceOf[INxAxisTicks]
  }
}

