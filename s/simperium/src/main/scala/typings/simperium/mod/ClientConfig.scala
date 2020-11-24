package typings.simperium.mod

import typings.std.WebSocket
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClientConfig[Buckets] extends js.Object {
  
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
  implicit class ClientConfigOps[Self <: ClientConfig[_], Buckets] (val x: Self with ClientConfig[Buckets]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGhostStoreProvider(
      value: Bucket[
          js.Any, 
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any, 
          scala.Nothing
        ] => GhostStore[
          /* import warning: importer.ImportType#apply Failed type conversion: Buckets[Name] */ js.Any
        ]
    ): Self = this.set("ghostStoreProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setHeartbeatInterval(value: Double): Self = this.set("heartbeatInterval", value.asInstanceOf[js.Any])
    
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
    ): Self = this.set("objectStoreProvider", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWebsocketClientProvider(value: String => WebSocket): Self = this.set("websocketClientProvider", js.Any.fromFunction1(value))
  }
}
