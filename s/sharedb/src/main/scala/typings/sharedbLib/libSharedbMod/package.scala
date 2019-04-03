package typings
package sharedbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object libSharedbMod {
  type Callback = js.Function1[/* err */ Error, js.Any]
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - JSONObject
    - JSONArray
  */
  type JSONValue = _JSONValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  type Path = js.Array[java.lang.String | scala.Double]
}
