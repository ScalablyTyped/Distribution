package typings
package reactDashJsonDashViewLib.reactDashJsonDashViewMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnSelectProps extends js.Object {
  /**
    * The name of the currently selected entry.
    */
  var name: java.lang.String | scala.Null
  /**
    * List of keys representing the scopes above the selected entry.
    */
  var namespace: js.Array[java.lang.String | scala.Null]
  /**
    * The type of the value. For "number" type, it will be replaced with the more
    * accurate types: "float", "integer", or "nan".
    */
  var `type`: java.lang.String
  /**
    * The value of the currently selected entry.
    */
  var value: js.Object | java.lang.String | scala.Double | scala.Boolean | scala.Null
}

