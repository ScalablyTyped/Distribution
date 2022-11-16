package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** 
NOTE: Rewritten from type alias:
{{{
type JSONObject = {[name: string] : sharedb.sharedb/lib/sharedb.JSONValue}
}}}
to avoid circular code involving: 
- sharedb.sharedb/lib/sharedb.JSONArray
- sharedb.sharedb/lib/sharedb.JSONObject
- sharedb.sharedb/lib/sharedb.JSONValue
*/
trait JSONObject
  extends StObject
     with /* name */ StringDictionary[JSONValue]
object JSONObject {
  
  inline def apply(): JSONObject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[JSONObject]
  }
}
