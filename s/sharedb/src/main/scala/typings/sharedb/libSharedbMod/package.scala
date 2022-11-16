package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


type AnyDataObject = StringDictionary[Any]

type BulkRequestData = js.Array[IDString] | (Record[IDString, Any])

type Callback = js.Function1[/* err */ Error, Any]

type CollectionName = String

type DocumentID = String

type IDString = String

type JSONArray = js.Array[JSONValue]

/** 
NOTE: Rewritten from type alias:
{{{
type JSONValue = string | number | boolean | null | sharedb.sharedb/lib/sharedb.JSONObject | sharedb.sharedb/lib/sharedb.JSONArray
}}}
to avoid circular code involving: 
- sharedb.sharedb/lib/sharedb.JSONArray
- sharedb.sharedb/lib/sharedb.JSONValue
*/
type JSONValue = String | Double | Boolean | Null | JSONObject | Any

type Path = js.Array[String | Double]

type ReceivePresenceListener[T] = js.Function2[/* id */ String, /* value */ T, Unit]

type RequestQuery = Any

type VersionNumber = Double
