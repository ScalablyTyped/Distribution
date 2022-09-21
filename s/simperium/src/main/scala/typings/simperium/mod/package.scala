package typings.simperium.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.simperium.anon.Authorize
import typings.simperium.mod.^
import typings.std.NonNullable
import typings.std.Partial
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def default[Buckets](appID: String, token: String): Client[Buckets] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(appID.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Client[Buckets]]
inline def default[Buckets](appID: String, token: String, clientConfig: Partial[ClientConfig[Buckets]]): Client[Buckets] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(appID.asInstanceOf[js.Any], token.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[Client[Buckets]]

inline def Auth(appId: String, apiKey: String): Authorize = (^.asInstanceOf[js.Dynamic].applyDynamic("Auth")(appId.asInstanceOf[js.Any], apiKey.asInstanceOf[js.Any])).asInstanceOf[Authorize]

inline def createClient[Buckets](appID: String, token: String): Client[Buckets] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(appID.asInstanceOf[js.Any], token.asInstanceOf[js.Any])).asInstanceOf[Client[Buckets]]
inline def createClient[Buckets](appID: String, token: String, clientConfig: Partial[ClientConfig[Buckets]]): Client[Buckets] = (^.asInstanceOf[js.Dynamic].applyDynamic("createClient")(appID.asInstanceOf[js.Any], token.asInstanceOf[js.Any], clientConfig.asInstanceOf[js.Any])).asInstanceOf[Client[Buckets]]

type ChangeVersion = String

type DMPDiff = String

type EntitiesCallback[T, E] = js.Function2[/* error */ NonNullable[E] | Null, /* entities */ js.UndefOr[js.Array[T]], Unit]

type EntityCallback[T, E] = js.Function2[/* error */ NonNullable[E] | Null, /* entity */ js.UndefOr[T], Unit]

type EntityId = String

type Heartbeat = CustomEventEmitter[HeartbeatEvent]

type JSONDiff[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
{[ K in keyof T ]:? simperium.simperium.DiffOp<T[K]>}
  */ typings.simperium.simperiumStrings.JSONDiff & TopLevel[T]

type LocalQueue[T] = CustomEventEmitter[LocalQueueEvent[T]]

type SimperiumEvent = StringDictionary[js.Function1[/* repeated */ Any, Unit]]
