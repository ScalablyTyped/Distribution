package typings
package qlikDashEngineapiLib.EngineAPINs

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
  var qName: java.lang.String
  /**
    * List of tags.
    */
  var qTags: js.Array[java.lang.String]
  /**
    * List of ticks.
    */
  var qTicks: js.Array[INxTickCell]
}

