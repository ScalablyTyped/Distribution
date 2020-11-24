package typings.sharedb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object sharedbMod {
  
  type Callback = js.Function1[/* err */ typings.sharedb.sharedbMod.Error, js.Any]
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - scala.Double
    - scala.Boolean
    - scala.Null
    - typings.sharedb.sharedbMod.JSONObject
    - typings.sharedb.sharedbMod.JSONArray
  */
  type JSONValue = typings.sharedb.sharedbMod._JSONValue | java.lang.String | scala.Double | scala.Boolean | scala.Null
  
  type Path = js.Array[java.lang.String | scala.Double]
}
