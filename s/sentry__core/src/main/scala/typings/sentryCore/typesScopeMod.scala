package typings.sentryCore

import org.scalablytyped.runtime.StringDictionary
import typings.sentryTypes.typesAttachmentMod.Attachment
import typings.sentryTypes.typesBreadcrumbMod.Breadcrumb
import typings.sentryTypes.typesContextMod.Contexts
import typings.sentryTypes.typesEventMod.Event
import typings.sentryTypes.typesEventMod.EventHint
import typings.sentryTypes.typesEventprocessorMod.EventProcessor
import typings.sentryTypes.typesExtraMod.Extras
import typings.sentryTypes.typesMiscMod.Primitive
import typings.sentryTypes.typesSessionMod.RequestSession
import typings.sentryTypes.typesSessionMod.Session
import typings.sentryTypes.typesSeverityMod.Severity
import typings.sentryTypes.typesSeverityMod.SeverityLevel
import typings.sentryTypes.typesSpanMod.Span
import typings.sentryTypes.typesUserMod.User
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesScopeMod {
  
  @JSImport("@sentry/core/types/scope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/core/types/scope", "Scope")
  @js.native
  open class Scope ()
    extends StObject
       with typings.sentryTypes.typesScopeMod.Scope {
    
    /**
      * Applies fingerprint from the scope to the event if there's one,
      * uses message if there's one instead or get rid of empty fingerprint
      */
    /* private */ var _applyFingerprint: Any = js.native
    
    /** Attachments */
    /* protected */ var _attachments: js.Array[Attachment] = js.native
    
    /** Array of breadcrumbs. */
    /* protected */ var _breadcrumbs: js.Array[Breadcrumb] = js.native
    
    /** Contexts */
    /* protected */ var _contexts: Contexts = js.native
    
    /** Callback list that will be called after {@link applyToEvent}. */
    /* protected */ var _eventProcessors: js.Array[EventProcessor] = js.native
    
    /** Extra */
    /* protected */ var _extra: Extras = js.native
    
    /** Fingerprint */
    /* protected */ var _fingerprint: js.UndefOr[js.Array[String]] = js.native
    
    /** Severity */
    /* protected */ var _level: js.UndefOr[Severity | SeverityLevel] = js.native
    
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Null, hint: EventHint): PromiseLike[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Null, hint: EventHint, index: Double): PromiseLike[Event | Null] = js.native
    /**
      * This will be called after {@link applyToEvent} is finished.
      */
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Event, hint: EventHint): PromiseLike[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Event, hint: EventHint, index: Double): PromiseLike[Event | Null] = js.native
    
    /**
      * This will be called on every set call.
      */
    /* protected */ def _notifyScopeListeners(): Unit = js.native
    
    /** Flag if notifying is happening. */
    /* protected */ var _notifyingListeners: Boolean = js.native
    
    /** Request Mode Session Status */
    /* protected */ var _requestSession: js.UndefOr[RequestSession] = js.native
    
    /** Callback for client to receive scope changes. */
    /* protected */ var _scopeListeners: js.Array[js.Function1[/* scope */ this.type, Unit]] = js.native
    
    /**
      * A place to stash data which is needed at some point in the SDK's event processing pipeline but which shouldn't get
      * sent to Sentry
      */
    /* protected */ var _sdkProcessingMetadata: StringDictionary[Any] = js.native
    
    /** Session */
    /* protected */ var _session: js.UndefOr[Session] = js.native
    
    /** Span */
    /* protected */ var _span: js.UndefOr[Span] = js.native
    
    /** Tags */
    /* protected */ var _tags: StringDictionary[Primitive] = js.native
    
    /** Transaction Name */
    /* protected */ var _transactionName: js.UndefOr[String] = js.native
    
    /** User */
    /* protected */ var _user: User = js.native
    
    /**
      * Add internal on change listener. Used for sub SDKs that need to store the scope.
      * @hidden
      */
    def addScopeListener(callback: js.Function1[/* scope */ this.type, Unit]): Unit = js.native
    
    /**
      * Applies data from the scope to the event and runs all event processors on it.
      *
      * @param event Event
      * @param hint Object containing additional information about the original exception, for use by the event processors.
      * @hidden
      */
    def applyToEvent(event: Event): PromiseLike[Event | Null] = js.native
    def applyToEvent(event: Event, hint: EventHint): PromiseLike[Event | Null] = js.native
  }
  /* static members */
  object Scope {
    
    @JSImport("@sentry/core/types/scope", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: Scope): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[Scope]
  }
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
