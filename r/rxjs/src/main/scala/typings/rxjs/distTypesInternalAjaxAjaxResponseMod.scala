package typings.rxjs

import typings.rxjs.distTypesInternalAjaxTypesMod.AjaxRequest
import typings.rxjs.distTypesInternalAjaxTypesMod.AjaxResponseType
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.Record
import typings.std.XMLHttpRequest
import typings.std.XMLHttpRequestResponseType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesInternalAjaxAjaxResponseMod {
  
  @JSImport("rxjs/dist/types/internal/ajax/AjaxResponse", "AjaxResponse")
  @js.native
  open class AjaxResponse[T] protected () extends StObject {
    /**
      * A normalized response from an AJAX request. To get the data from the response,
      * you will want to read the `response` property.
      *
      * - DO NOT create instances of this class directly.
      * - DO NOT subclass this class.
      *
      * @param originalEvent The original event object from the XHR `onload` event.
      * @param xhr The `XMLHttpRequest` object used to make the request. This is useful for examining status code, etc.
      * @param request The request settings used to make the HTTP request.
      * @param type The type of the event emitted by the {@link ajax} Observable
      */
    def this(
      /**
      * The original event object from the raw XHR event.
      */
    originalEvent: ProgressEvent[EventTarget],
      /**
      * The XMLHttpRequest object used to make the request.
      * NOTE: It is advised not to hold this in memory, as it will retain references to all of it's event handlers
      * and many other things related to the request.
      */
    xhr: XMLHttpRequest,
      /**
      * The request parameters used to make the HTTP request.
      */
    request: AjaxRequest
    ) = this()
    def this(
      /**
      * The original event object from the raw XHR event.
      */
    originalEvent: ProgressEvent[EventTarget],
      /**
      * The XMLHttpRequest object used to make the request.
      * NOTE: It is advised not to hold this in memory, as it will retain references to all of it's event handlers
      * and many other things related to the request.
      */
    xhr: XMLHttpRequest,
      /**
      * The request parameters used to make the HTTP request.
      */
    request: AjaxRequest,
      /**
      * The event type. This can be used to discern between different events
      * if you're using progress events with {@link includeDownloadProgress} or
      * {@link includeUploadProgress} settings in {@link AjaxConfig}.
      *
      * The event type consists of two parts: the {@link AjaxDirection} and the
      * the event type. Merged with `_`, they form the `type` string. The
      * direction can be an `upload` or a `download` direction, while an event can
      * be `loadstart`, `progress` or `load`.
      *
      * `download_load` is the type of event when download has finished and the
      * response is available.
      */
    `type`: AjaxResponseType
    ) = this()
    
    /**
      * The total number of bytes loaded so far. To be used with {@link total} while
      * calculating progress. (You will want to set {@link includeDownloadProgress} or
      * {@link includeDownloadProgress})
      */
    val loaded: Double = js.native
    
    /**
      * The original event object from the raw XHR event.
      */
    val originalEvent: ProgressEvent[EventTarget] = js.native
    
    /**
      * The request parameters used to make the HTTP request.
      */
    val request: AjaxRequest = js.native
    
    /**
      * The response data, if any. Note that this will automatically be converted to the proper type
      */
    val response: T = js.native
    
    /**
      * A dictionary of the response headers.
      */
    val responseHeaders: Record[String, String] = js.native
    
    /**
      * The responseType set on the request. (For example: `""`, `"arraybuffer"`, `"blob"`, `"document"`, `"json"`, or `"text"`)
      * @deprecated There isn't much reason to examine this. It's the same responseType set (or defaulted) on the ajax config.
      * If you really need to examine this value, you can check it on the `request` or the `xhr`. Will be removed in v8.
      */
    val responseType: XMLHttpRequestResponseType = js.native
    
    /** The HTTP status code */
    val status: Double = js.native
    
    /**
      * The total number of bytes to be loaded. To be used with {@link loaded} while
      * calculating progress. (You will want to set {@link includeDownloadProgress} or
      * {@link includeDownloadProgress})
      */
    val total: Double = js.native
    
    /**
      * The event type. This can be used to discern between different events
      * if you're using progress events with {@link includeDownloadProgress} or
      * {@link includeUploadProgress} settings in {@link AjaxConfig}.
      *
      * The event type consists of two parts: the {@link AjaxDirection} and the
      * the event type. Merged with `_`, they form the `type` string. The
      * direction can be an `upload` or a `download` direction, while an event can
      * be `loadstart`, `progress` or `load`.
      *
      * `download_load` is the type of event when download has finished and the
      * response is available.
      */
    val `type`: AjaxResponseType = js.native
    
    /**
      * The XMLHttpRequest object used to make the request.
      * NOTE: It is advised not to hold this in memory, as it will retain references to all of it's event handlers
      * and many other things related to the request.
      */
    val xhr: XMLHttpRequest = js.native
  }
}
