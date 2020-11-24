package typings.realmNetworkTransport

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object mod {
  
  type AbortSignal = js.Any
  
  type ErrorCallback = js.Function1[/* err */ typings.std.Error, scala.Unit]
  
  type Fetch = js.Function2[
    /* input */ typings.realmNetworkTransport.mod.FetchRequestInfo, 
    /* init */ js.UndefOr[typings.realmNetworkTransport.mod.FetchRequestInit], 
    js.Promise[typings.realmNetworkTransport.mod.FetchResponse]
  ]
  
  type FetchBodyInit = js.Any
  
  type FetchHeadersInit = typings.realmNetworkTransport.mod.FetchHeaders | js.Array[js.Array[java.lang.String]] | (typings.std.Record[java.lang.String, java.lang.String])
  
  type FetchRequestInfo = typings.realmNetworkTransport.mod.FetchRequest | java.lang.String
  
  type Headers = org.scalablytyped.runtime.StringDictionary[java.lang.String]
  
  type SuccessCallback = js.Function1[/* response */ typings.realmNetworkTransport.mod.Response, scala.Unit]
}
