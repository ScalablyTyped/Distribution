package typings.simperium.mod

import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfig[Buckets] extends StObject {
  
  def ghostStoreProvider[Name /* <: /* keyof Buckets */ String */](
    bucket: Bucket[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      scala.Nothing
    ]
  ): GhostStore[
    /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any
  ] = js.native
  
  var heartbeatInterval: Double = js.native
  
  def objectStoreProvider[Name /* <: /* keyof Buckets */ String */](
    bucket: Bucket[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      scala.Nothing
    ]
  ): BucketStore[
    /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
    js.Object
  ] = js.native
  
  def websocketClientProvider(url: String): WebSocket = js.native
}
object ClientConfig {
  
  @scala.inline
  def apply[Buckets](
    ghostStoreProvider: Bucket[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      scala.Nothing
    ] => GhostStore[
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any
    ],
    heartbeatInterval: Double,
    objectStoreProvider: Bucket[
      js.Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      scala.Nothing
    ] => BucketStore[
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      js.Object
    ],
    websocketClientProvider: String => WebSocket
  ): ClientConfig[Buckets] = {
    val __obj = js.Dynamic.literal(ghostStoreProvider = js.Any.fromFunction1(ghostStoreProvider), heartbeatInterval = heartbeatInterval.asInstanceOf[js.Any], objectStoreProvider = js.Any.fromFunction1(objectStoreProvider), websocketClientProvider = js.Any.fromFunction1(websocketClientProvider))
    __obj.asInstanceOf[ClientConfig[Buckets]]
  }
  
  @scala.inline
  implicit class ClientConfigMutableBuilder[Self <: ClientConfig[_], Buckets] (val x: Self with ClientConfig[Buckets]) extends AnyVal {
    
    @scala.inline
    def setGhostStoreProvider(
      value: Bucket[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
          scala.Nothing
        ] => GhostStore[
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any
        ]
    ): Self = StObject.set(x, "ghostStoreProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectStoreProvider(
      value: Bucket[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
          scala.Nothing
        ] => BucketStore[
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
          js.Object
        ]
    ): Self = StObject.set(x, "objectStoreProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWebsocketClientProvider(value: String => WebSocket): Self = StObject.set(x, "websocketClientProvider", js.Any.fromFunction1(value))
  }
}
