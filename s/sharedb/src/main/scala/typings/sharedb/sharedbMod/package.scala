package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
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

type JSONValue = String | Double | Boolean | Null | JSONObject | Any

type ListenerSignature[L] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ E in keyof L ]: (args : ...any): any}
  */ typings.sharedb.sharedbStrings.ListenerSignature & TopLevel[Any]

type Path = js.Array[String | Double]

type ReceivePresenceListener[T] = js.Function2[/* id */ String, /* value */ T, Unit]

type RequestQuery = Any

type VersionNumber = Double
