package typings.simplecrawler

import typings.simplecrawler.anon.ActualDataSize
import typings.simplecrawler.simplecrawlerNumbers.`0`
import typings.simplecrawler.simplecrawlerNumbers.`1`
import typings.std.Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object queueMod {
  
  @JSImport("simplecrawler/queue", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with FetchQueue
  
  @js.native
  trait FetchQueue
    extends StObject
       with Array[
          /* import warning: DefaultedTypeArguments.enterTsTypeRef applyOrElse newTParams next no default parameter for T */ Any
        ] {
    
    def add(queueItem: QueueItem): Unit = js.native
    def add(queueItem: QueueItem, force: Boolean): Unit = js.native
    def add(
      queueItem: QueueItem,
      force: Boolean,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
    def add(
      queueItem: QueueItem,
      force: Unit,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
    
    def avg(statisticName: String): Unit = js.native
    def avg(
      statisticName: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* average */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def countItems(comparator: js.Object): Unit = js.native
    def countItems(
      comparator: js.Object,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* count */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def defrost(filename: String): Unit = js.native
    def defrost(filename: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def exists(url: String, callback: js.Function2[/* error */ js.Error | Null, /* exists */ `0` | `1`, Unit]): Unit = js.native
    
    def filterItems(comparator: js.Object): Unit = js.native
    def filterItems(
      comparator: js.Object,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* items */ js.UndefOr[js.Array[QueueItem]], Unit]
    ): Unit = js.native
    
    def freeze(filename: String): Unit = js.native
    def freeze(filename: String, callback: js.Function1[/* error */ js.UndefOr[js.Error], Unit]): Unit = js.native
    
    def get(index: Double): Unit = js.native
    def get(
      index: Double,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
    
    def getLength(): Unit = js.native
    def getLength(callback: js.Function2[/* error */ js.UndefOr[js.Error], /* length */ js.UndefOr[Double], Unit]): Unit = js.native
    
    def max(statisticName: String): Unit = js.native
    def max(
      statisticName: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* maximum */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def min(statisticName: String): Unit = js.native
    def min(
      statisticName: String,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* minimum */ js.UndefOr[Double], Unit]
    ): Unit = js.native
    
    def oldestUnfetchedItem(): Unit = js.native
    def oldestUnfetchedItem(
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
    
    def update(id: Double, updates: js.Object): Unit = js.native
    def update(
      id: Double,
      updates: js.Object,
      callback: js.Function2[/* error */ js.UndefOr[js.Error], /* queueItem */ js.UndefOr[QueueItem], Unit]
    ): Unit = js.native
  }
  
  trait QueueItem extends StObject {
    
    var depth: Double
    
    var fetched: Boolean
    
    var host: String
    
    var id: Double
    
    var path: String
    
    var port: Double
    
    var protocol: String
    
    var referrer: String
    
    var stateData: ActualDataSize
    
    var status: QueueItemStatus
    
    var uriPath: String
    
    var url: String
  }
  object QueueItem {
    
    inline def apply(
      depth: Double,
      fetched: Boolean,
      host: String,
      id: Double,
      path: String,
      port: Double,
      protocol: String,
      referrer: String,
      stateData: ActualDataSize,
      status: QueueItemStatus,
      uriPath: String,
      url: String
    ): QueueItem = {
      val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], fetched = fetched.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any], referrer = referrer.asInstanceOf[js.Any], stateData = stateData.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], uriPath = uriPath.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueueItem]
    }
    
    extension [Self <: QueueItem](x: Self) {
      
      inline def setDepth(value: Double): Self = StObject.set(x, "depth", value.asInstanceOf[js.Any])
      
      inline def setFetched(value: Boolean): Self = StObject.set(x, "fetched", value.asInstanceOf[js.Any])
      
      inline def setHost(value: String): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setPort(value: Double): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setProtocol(value: String): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setStateData(value: ActualDataSize): Self = StObject.set(x, "stateData", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: QueueItemStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      inline def setUriPath(value: String): Self = StObject.set(x, "uriPath", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.simplecrawler.simplecrawlerStrings.queued
    - typings.simplecrawler.simplecrawlerStrings.spooled
    - typings.simplecrawler.simplecrawlerStrings.headers
    - typings.simplecrawler.simplecrawlerStrings.downloaded
    - typings.simplecrawler.simplecrawlerStrings.redirected
    - typings.simplecrawler.simplecrawlerStrings.notfound
    - typings.simplecrawler.simplecrawlerStrings.failed
  */
  trait QueueItemStatus extends StObject
  object QueueItemStatus {
    
    inline def downloaded: typings.simplecrawler.simplecrawlerStrings.downloaded = "downloaded".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.downloaded]
    
    inline def failed: typings.simplecrawler.simplecrawlerStrings.failed = "failed".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.failed]
    
    inline def headers: typings.simplecrawler.simplecrawlerStrings.headers = "headers".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.headers]
    
    inline def notfound: typings.simplecrawler.simplecrawlerStrings.notfound = "notfound".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.notfound]
    
    inline def queued: typings.simplecrawler.simplecrawlerStrings.queued = "queued".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.queued]
    
    inline def redirected: typings.simplecrawler.simplecrawlerStrings.redirected = "redirected".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.redirected]
    
    inline def spooled: typings.simplecrawler.simplecrawlerStrings.spooled = "spooled".asInstanceOf[typings.simplecrawler.simplecrawlerStrings.spooled]
  }
}
