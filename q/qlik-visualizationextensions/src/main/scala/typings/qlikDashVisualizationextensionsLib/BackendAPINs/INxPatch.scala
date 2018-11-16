package typings
package qlikDashVisualizationextensionsLib.BackendAPINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait INxPatch extends js.Object {
  /**
           * Operation to perform.
           * One of:
           *       # Add
           *       # Remove
           *       # Replace
           */
  var qOp: PatchType
  /**
           * Path to the property to add, remove or replace.
           * String
           */
  var qPath: java.lang.String
  /**
           * This parameter is not used in a remove operation. Corresponds to the value of the
           * property to add or to the new value of the property to update.
           * Examples: "false", "2", "\"New title\""
           * String
           */
  var qValue: java.lang.String
}

