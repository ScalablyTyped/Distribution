package typings.salesforceCanvasJsSdk.Sfdc.canvas

import typings.salesforceCanvasJsSdk.salesforceCanvasJsSdkStrings.sfdcDotstreamingapi
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object client {
  
  trait AjaxSettings extends StObject {
    
    val async: js.UndefOr[Boolean] = js.undefined
    
    val client: Client_
    
    val contentType: js.UndefOr[String] = js.undefined
    
    val data: js.UndefOr[String | Null] = js.undefined
    
    val headers: js.UndefOr[Record[String, String]] = js.undefined
    
    val method: js.UndefOr[String] = js.undefined
    
    def success(data: Response[Any]): Unit
  }
  object AjaxSettings {
    
    inline def apply(client: Client_, success: Response[Any] => Unit): AjaxSettings = {
      val __obj = js.Dynamic.literal(client = client.asInstanceOf[js.Any], success = js.Any.fromFunction1(success))
      __obj.asInstanceOf[AjaxSettings]
    }
    
    extension [Self <: AjaxSettings](x: Self) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setClient(value: Client_): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataNull: Self = StObject.set(x, "data", null)
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setHeaders(value: Record[String, String]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setSuccess(value: Response[Any] => Unit): Self = StObject.set(x, "success", js.Any.fromFunction1(value))
    }
  }
  
  trait Event extends StObject {
    
    val name: String
    
    val payload: Any
  }
  object Event {
    
    inline def apply(name: String, payload: Any): Event = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], payload = payload.asInstanceOf[js.Any])
      __obj.asInstanceOf[Event]
    }
    
    extension [Self <: Event](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPayload(value: Any): Self = StObject.set(x, "payload", value.asInstanceOf[js.Any])
    }
  }
  
  trait EventSubscription
    extends StObject
       with EventSubscriptionRef
       with Subscription {
    
    def onData(event: Any): Unit
  }
  object EventSubscription {
    
    inline def apply(name: String, onData: Any => Unit): EventSubscription = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onData = js.Any.fromFunction1(onData))
      __obj.asInstanceOf[EventSubscription]
    }
    
    extension [Self <: EventSubscription](x: Self) {
      
      inline def setOnData(value: Any => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
    }
  }
  
  trait EventSubscriptionRef
    extends StObject
       with _SubscriptionRef {
    
    val name: String
  }
  object EventSubscriptionRef {
    
    inline def apply(name: String): EventSubscriptionRef = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[EventSubscriptionRef]
    }
    
    extension [Self <: EventSubscriptionRef](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Size extends StObject {
    
    val heights: SizeHeights
    
    val widths: SizeWidths
  }
  object Size {
    
    inline def apply(heights: SizeHeights, widths: SizeWidths): Size = {
      val __obj = js.Dynamic.literal(heights = heights.asInstanceOf[js.Any], widths = widths.asInstanceOf[js.Any])
      __obj.asInstanceOf[Size]
    }
    
    extension [Self <: Size](x: Self) {
      
      inline def setHeights(value: SizeHeights): Self = StObject.set(x, "heights", value.asInstanceOf[js.Any])
      
      inline def setWidths(value: SizeWidths): Self = StObject.set(x, "widths", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeHeights extends StObject {
    
    val contentHeight: Double
    
    val pageHeight: Double
    
    val scrollTop: Double
  }
  object SizeHeights {
    
    inline def apply(contentHeight: Double, pageHeight: Double, scrollTop: Double): SizeHeights = {
      val __obj = js.Dynamic.literal(contentHeight = contentHeight.asInstanceOf[js.Any], pageHeight = pageHeight.asInstanceOf[js.Any], scrollTop = scrollTop.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeHeights]
    }
    
    extension [Self <: SizeHeights](x: Self) {
      
      inline def setContentHeight(value: Double): Self = StObject.set(x, "contentHeight", value.asInstanceOf[js.Any])
      
      inline def setPageHeight(value: Double): Self = StObject.set(x, "pageHeight", value.asInstanceOf[js.Any])
      
      inline def setScrollTop(value: Double): Self = StObject.set(x, "scrollTop", value.asInstanceOf[js.Any])
    }
  }
  
  trait SizeWidths extends StObject {
    
    val contentWidth: Double
    
    val pageWidth: Double
    
    val scrollLeft: Double
  }
  object SizeWidths {
    
    inline def apply(contentWidth: Double, pageWidth: Double, scrollLeft: Double): SizeWidths = {
      val __obj = js.Dynamic.literal(contentWidth = contentWidth.asInstanceOf[js.Any], pageWidth = pageWidth.asInstanceOf[js.Any], scrollLeft = scrollLeft.asInstanceOf[js.Any])
      __obj.asInstanceOf[SizeWidths]
    }
    
    extension [Self <: SizeWidths](x: Self) {
      
      inline def setContentWidth(value: Double): Self = StObject.set(x, "contentWidth", value.asInstanceOf[js.Any])
      
      inline def setPageWidth(value: Double): Self = StObject.set(x, "pageWidth", value.asInstanceOf[js.Any])
      
      inline def setScrollLeft(value: Double): Self = StObject.set(x, "scrollLeft", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamSubscription
    extends StObject
       with StreamSubscriptionRef
       with Subscription {
    
    def onComplete(event: Any): Unit
    
    def onData(event: Any): Unit
  }
  object StreamSubscription {
    
    inline def apply(onComplete: Any => Unit, onData: Any => Unit, params: StreamSubscriptionParams): StreamSubscription = {
      val __obj = js.Dynamic.literal(name = "sfdc.streamingapi", onComplete = js.Any.fromFunction1(onComplete), onData = js.Any.fromFunction1(onData), params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSubscription]
    }
    
    extension [Self <: StreamSubscription](x: Self) {
      
      inline def setOnComplete(value: Any => Unit): Self = StObject.set(x, "onComplete", js.Any.fromFunction1(value))
      
      inline def setOnData(value: Any => Unit): Self = StObject.set(x, "onData", js.Any.fromFunction1(value))
    }
  }
  
  trait StreamSubscriptionParams extends StObject {
    
    val topic: String
  }
  object StreamSubscriptionParams {
    
    inline def apply(topic: String): StreamSubscriptionParams = {
      val __obj = js.Dynamic.literal(topic = topic.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSubscriptionParams]
    }
    
    extension [Self <: StreamSubscriptionParams](x: Self) {
      
      inline def setTopic(value: String): Self = StObject.set(x, "topic", value.asInstanceOf[js.Any])
    }
  }
  
  trait StreamSubscriptionRef
    extends StObject
       with _SubscriptionRef {
    
    val name: sfdcDotstreamingapi
    
    val params: StreamSubscriptionParams
  }
  object StreamSubscriptionRef {
    
    inline def apply(params: StreamSubscriptionParams): StreamSubscriptionRef = {
      val __obj = js.Dynamic.literal(name = "sfdc.streamingapi", params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[StreamSubscriptionRef]
    }
    
    extension [Self <: StreamSubscriptionRef](x: Self) {
      
      inline def setName(value: sfdcDotstreamingapi): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setParams(value: StreamSubscriptionParams): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.salesforceCanvasJsSdk.Sfdc.canvas.client.EventSubscription
    - typings.salesforceCanvasJsSdk.Sfdc.canvas.client.StreamSubscription
  */
  trait Subscription extends StObject
  object Subscription {
    
    inline def EventSubscription(name: String, onData: Any => Unit): typings.salesforceCanvasJsSdk.Sfdc.canvas.client.EventSubscription = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], onData = js.Any.fromFunction1(onData))
      __obj.asInstanceOf[typings.salesforceCanvasJsSdk.Sfdc.canvas.client.EventSubscription]
    }
    
    inline def StreamSubscription(onComplete: Any => Unit, onData: Any => Unit, params: StreamSubscriptionParams): typings.salesforceCanvasJsSdk.Sfdc.canvas.client.StreamSubscription = {
      val __obj = js.Dynamic.literal(name = "sfdc.streamingapi", onComplete = js.Any.fromFunction1(onComplete), onData = js.Any.fromFunction1(onData), params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.salesforceCanvasJsSdk.Sfdc.canvas.client.StreamSubscription]
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - java.lang.String
    - typings.salesforceCanvasJsSdk.Sfdc.canvas.client.EventSubscriptionRef
    - typings.salesforceCanvasJsSdk.Sfdc.canvas.client.StreamSubscriptionRef
  */
  type SubscriptionRef = _SubscriptionRef | String
  
  trait Version extends StObject {
    
    val clientVersion: String
    
    val parentVersion: String
  }
  object Version {
    
    inline def apply(clientVersion: String, parentVersion: String): Version = {
      val __obj = js.Dynamic.literal(clientVersion = clientVersion.asInstanceOf[js.Any], parentVersion = parentVersion.asInstanceOf[js.Any])
      __obj.asInstanceOf[Version]
    }
    
    extension [Self <: Version](x: Self) {
      
      inline def setClientVersion(value: String): Self = StObject.set(x, "clientVersion", value.asInstanceOf[js.Any])
      
      inline def setParentVersion(value: String): Self = StObject.set(x, "parentVersion", value.asInstanceOf[js.Any])
    }
  }
  
  trait _SubscriptionRef extends StObject
  object _SubscriptionRef {
    
    inline def EventSubscriptionRef(name: String): typings.salesforceCanvasJsSdk.Sfdc.canvas.client.EventSubscriptionRef = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.salesforceCanvasJsSdk.Sfdc.canvas.client.EventSubscriptionRef]
    }
    
    inline def StreamSubscriptionRef(params: StreamSubscriptionParams): typings.salesforceCanvasJsSdk.Sfdc.canvas.client.StreamSubscriptionRef = {
      val __obj = js.Dynamic.literal(name = "sfdc.streamingapi", params = params.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.salesforceCanvasJsSdk.Sfdc.canvas.client.StreamSubscriptionRef]
    }
  }
}
