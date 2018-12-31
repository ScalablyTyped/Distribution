package typings
package qlikDashEngineapiLib.EngineAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * NxPatch...
  */
trait INxPatch extends js.Object {
  /**
    * Operation to perform.
    */
  var qOp: NxPatchOpType
  /**
    * Path to the property to add, remove or replace.
    */
  var qPath: java.lang.String
  /**
    * This parameter is not used in a remove operation.
    * Corresponds to the value of the property to add or to the new value of the property to update.
    *
    * Examples: "false", "2", "\"New title\""
    */
  var qValue: java.lang.String
}

