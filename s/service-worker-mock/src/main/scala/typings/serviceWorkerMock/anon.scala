package typings.serviceWorkerMock

import typings.serviceWorkerMock.serviceWorkerMockStrings.fetch
import typings.serviceWorkerMock.serviceWorkerMockStrings.message
import typings.serviceWorkerMock.serviceWorkerMockStrings.notificationclick
import typings.serviceWorkerMock.serviceWorkerMockStrings.notificationclose
import typings.serviceWorkerMock.serviceWorkerMockStrings.push
import typings.std.EventTarget
import typings.std.MessageEventSource
import typings.std.MessagePort
import typings.std.Notification
import typings.std.Partial
import typings.std.Request
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(name: fetch, request: String): js.Promise[Unit] = js.native
    def apply(name: fetch, request: Request): js.Promise[Unit] = js.native
    def apply(name: message, args: PartialMessageEventany): js.Promise[Unit] = js.native
    def apply(name: notificationclick, args: Notification): js.Promise[Unit] = js.native
    def apply(name: notificationclose, args: Notification): js.Promise[Unit] = js.native
    def apply(
      name: push,
      args: Partial[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PushEvent */ _
        ]
    ): js.Promise[Unit] = js.native
    def apply(
      `type`: /* keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ServiceWorkerGlobalScopeEventMap * / any */ String
    ): js.Promise[Unit] = js.native
  }
  
  /* Inlined std.Partial<std.MessageEvent<any>> */
  @js.native
  trait PartialMessageEventany extends StObject {
    
    var AT_TARGET: js.UndefOr[Double] = js.native
    
    var BUBBLING_PHASE: js.UndefOr[Double] = js.native
    
    var CAPTURING_PHASE: js.UndefOr[Double] = js.native
    
    var NONE: js.UndefOr[Double] = js.native
    
    var bubbles: js.UndefOr[Boolean] = js.native
    
    var cancelBubble: js.UndefOr[Boolean] = js.native
    
    var cancelable: js.UndefOr[Boolean] = js.native
    
    var composed: js.UndefOr[Boolean] = js.native
    
    var composedPath: js.UndefOr[js.Function0[js.Array[EventTarget]]] = js.native
    
    var currentTarget: js.UndefOr[EventTarget | Null] = js.native
    
    var data: js.UndefOr[js.Any] = js.native
    
    var defaultPrevented: js.UndefOr[Boolean] = js.native
    
    var eventPhase: js.UndefOr[Double] = js.native
    
    var initEvent: js.UndefOr[js.Function1[/* type */ String, Unit]] = js.native
    
    var isTrusted: js.UndefOr[Boolean] = js.native
    
    var lastEventId: js.UndefOr[String] = js.native
    
    var origin: js.UndefOr[String] = js.native
    
    var ports: js.UndefOr[js.Array[MessagePort]] = js.native
    
    var preventDefault: js.UndefOr[js.Function0[Unit]] = js.native
    
    var returnValue: js.UndefOr[Boolean] = js.native
    
    var source: js.UndefOr[MessageEventSource | Null] = js.native
    
    var srcElement: js.UndefOr[EventTarget | Null] = js.native
    
    var stopImmediatePropagation: js.UndefOr[js.Function0[Unit]] = js.native
    
    var stopPropagation: js.UndefOr[js.Function0[Unit]] = js.native
    
    var target: js.UndefOr[EventTarget | Null] = js.native
    
    var timeStamp: js.UndefOr[Double] = js.native
    
    var `type`: js.UndefOr[String] = js.native
  }
  object PartialMessageEventany {
    
    @scala.inline
    def apply(): PartialMessageEventany = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialMessageEventany]
    }
    
    @scala.inline
    implicit class PartialMessageEventanyMutableBuilder[Self <: PartialMessageEventany] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAT_TARGET(value: Double): Self = StObject.set(x, "AT_TARGET", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAT_TARGETUndefined: Self = StObject.set(x, "AT_TARGET", js.undefined)
      
      @scala.inline
      def setBUBBLING_PHASE(value: Double): Self = StObject.set(x, "BUBBLING_PHASE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBUBBLING_PHASEUndefined: Self = StObject.set(x, "BUBBLING_PHASE", js.undefined)
      
      @scala.inline
      def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
      
      @scala.inline
      def setCAPTURING_PHASE(value: Double): Self = StObject.set(x, "CAPTURING_PHASE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCAPTURING_PHASEUndefined: Self = StObject.set(x, "CAPTURING_PHASE", js.undefined)
      
      @scala.inline
      def setCancelBubble(value: Boolean): Self = StObject.set(x, "cancelBubble", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelBubbleUndefined: Self = StObject.set(x, "cancelBubble", js.undefined)
      
      @scala.inline
      def setCancelable(value: Boolean): Self = StObject.set(x, "cancelable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCancelableUndefined: Self = StObject.set(x, "cancelable", js.undefined)
      
      @scala.inline
      def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComposedPath(value: () => js.Array[EventTarget]): Self = StObject.set(x, "composedPath", js.Any.fromFunction0(value))
      
      @scala.inline
      def setComposedPathUndefined: Self = StObject.set(x, "composedPath", js.undefined)
      
      @scala.inline
      def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
      
      @scala.inline
      def setCurrentTarget(value: EventTarget): Self = StObject.set(x, "currentTarget", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTargetNull: Self = StObject.set(x, "currentTarget", null)
      
      @scala.inline
      def setCurrentTargetUndefined: Self = StObject.set(x, "currentTarget", js.undefined)
      
      @scala.inline
      def setData(value: js.Any): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      @scala.inline
      def setDefaultPrevented(value: Boolean): Self = StObject.set(x, "defaultPrevented", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultPreventedUndefined: Self = StObject.set(x, "defaultPrevented", js.undefined)
      
      @scala.inline
      def setEventPhase(value: Double): Self = StObject.set(x, "eventPhase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventPhaseUndefined: Self = StObject.set(x, "eventPhase", js.undefined)
      
      @scala.inline
      def setInitEvent(value: /* type */ String => Unit): Self = StObject.set(x, "initEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInitEventUndefined: Self = StObject.set(x, "initEvent", js.undefined)
      
      @scala.inline
      def setIsTrusted(value: Boolean): Self = StObject.set(x, "isTrusted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsTrustedUndefined: Self = StObject.set(x, "isTrusted", js.undefined)
      
      @scala.inline
      def setLastEventId(value: String): Self = StObject.set(x, "lastEventId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastEventIdUndefined: Self = StObject.set(x, "lastEventId", js.undefined)
      
      @scala.inline
      def setNONE(value: Double): Self = StObject.set(x, "NONE", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNONEUndefined: Self = StObject.set(x, "NONE", js.undefined)
      
      @scala.inline
      def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOriginUndefined: Self = StObject.set(x, "origin", js.undefined)
      
      @scala.inline
      def setPorts(value: js.Array[MessagePort]): Self = StObject.set(x, "ports", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPortsUndefined: Self = StObject.set(x, "ports", js.undefined)
      
      @scala.inline
      def setPortsVarargs(value: MessagePort*): Self = StObject.set(x, "ports", js.Array(value :_*))
      
      @scala.inline
      def setPreventDefault(value: () => Unit): Self = StObject.set(x, "preventDefault", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPreventDefaultUndefined: Self = StObject.set(x, "preventDefault", js.undefined)
      
      @scala.inline
      def setReturnValue(value: Boolean): Self = StObject.set(x, "returnValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReturnValueUndefined: Self = StObject.set(x, "returnValue", js.undefined)
      
      @scala.inline
      def setSource(value: MessageEventSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceNull: Self = StObject.set(x, "source", null)
      
      @scala.inline
      def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
      
      @scala.inline
      def setSrcElement(value: EventTarget): Self = StObject.set(x, "srcElement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSrcElementNull: Self = StObject.set(x, "srcElement", null)
      
      @scala.inline
      def setSrcElementUndefined: Self = StObject.set(x, "srcElement", js.undefined)
      
      @scala.inline
      def setStopImmediatePropagation(value: () => Unit): Self = StObject.set(x, "stopImmediatePropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopImmediatePropagationUndefined: Self = StObject.set(x, "stopImmediatePropagation", js.undefined)
      
      @scala.inline
      def setStopPropagation(value: () => Unit): Self = StObject.set(x, "stopPropagation", js.Any.fromFunction0(value))
      
      @scala.inline
      def setStopPropagationUndefined: Self = StObject.set(x, "stopPropagation", js.undefined)
      
      @scala.inline
      def setTarget(value: EventTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetNull: Self = StObject.set(x, "target", null)
      
      @scala.inline
      def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
      
      @scala.inline
      def setTimeStamp(value: Double): Self = StObject.set(x, "timeStamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeStampUndefined: Self = StObject.set(x, "timeStamp", js.undefined)
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
