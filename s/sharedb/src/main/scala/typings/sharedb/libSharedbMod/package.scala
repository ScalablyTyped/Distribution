package typings.sharedb

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
    - typings.sharedb.libSharedbMod.JSONObject
    - typings.sharedb.libSharedbMod.JSONArray
  */
  type JSONValue = _JSONValue | String | Double | Boolean | Null
  type Path = js.Array[String | Double]
}
