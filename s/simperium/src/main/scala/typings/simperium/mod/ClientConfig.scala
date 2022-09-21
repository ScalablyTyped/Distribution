package typings.simperium.mod

import typings.std.WebSocket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClientConfig[Buckets] extends StObject {
  
  def ghostStoreProvider[Name /* <: /* keyof Buckets */ String */](
    bucket: Bucket[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      scala.Nothing
    ]
  ): GhostStore[
    /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any
  ]
  
  var heartbeatInterval: Double
  
  def objectStoreProvider[Name /* <: /* keyof Buckets */ String */](
    bucket: Bucket[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      scala.Nothing
    ]
  ): BucketStore[
    /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
    js.Object
  ]
  
  def websocketClientProvider(url: String): WebSocket
}
object ClientConfig {
  
  inline def apply[Buckets](
    ghostStoreProvider: Bucket[
      Any, 
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      scala.Nothing
    ] => GhostStore[
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any
    ],
    heartbeatInterval: Double,
    objectStoreProvider: Bucket[
      Any, 
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
  
  extension [Self <: ClientConfig[?], Buckets](x: Self & ClientConfig[Buckets]) {
    
    inline def setGhostStoreProvider(
      value: Bucket[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
          scala.Nothing
        ] => GhostStore[
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any
        ]
    ): Self = StObject.set(x, "ghostStoreProvider", js.Any.fromFunction1(value))
    
    inline def setHeartbeatInterval(value: Double): Self = StObject.set(x, "heartbeatInterval", value.asInstanceOf[js.Any])
    
    inline def setObjectStoreProvider(
      value: Bucket[
          Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
          scala.Nothing
        ] => BucketStore[
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
          js.Object
        ]
    ): Self = StObject.set(x, "objectStoreProvider", js.Any.fromFunction1(value))
    
    inline def setWebsocketClientProvider(value: String => WebSocket): Self = StObject.set(x, "websocketClientProvider", js.Any.fromFunction1(value))
  }
}
