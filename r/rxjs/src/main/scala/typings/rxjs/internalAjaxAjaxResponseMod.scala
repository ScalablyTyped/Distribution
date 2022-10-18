package typings.rxjs

import typings.rxjs.distTypesInternalAjaxTypesMod.AjaxRequest
import typings.rxjs.distTypesInternalAjaxTypesMod.AjaxResponseType
import typings.std.EventTarget
import typings.std.ProgressEvent
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* from `exports` in `package.json` */
object internalAjaxAjaxResponseMod {
  
  @JSImport("rxjs/internal/ajax/AjaxResponse", "AjaxResponse")
  @js.native
  open class AjaxResponse[T] protected ()
    extends typings.rxjs.distTypesInternalAjaxAjaxResponseMod.AjaxResponse[T] {
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
  }
}
