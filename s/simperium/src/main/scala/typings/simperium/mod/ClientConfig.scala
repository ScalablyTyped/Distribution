package typings.simperium.mod

import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ClientConfig[Buckets] extends js.Object {
  var heartbeatInterval: Double
  def ghostStoreProvider[Name /* <: /* keyof Buckets */ String */](
    bucket: Bucket[
      Name, 
      /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
      scala.Nothing
    ]
  ): GhostStore[
    /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any
  ]
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
}

