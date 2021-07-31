package typings.sentryHub

import org.scalablytyped.runtime.StringDictionary
import typings.sentryHub.sessionMod.Session
import typings.sentryTypes.breadcrumbMod.Breadcrumb
import typings.sentryTypes.contextMod.Contexts
import typings.sentryTypes.eventMod.Event
import typings.sentryTypes.eventMod.EventHint
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.extraMod.Extras
import typings.sentryTypes.severityMod.Severity
import typings.sentryTypes.spanMod.Span
import typings.sentryTypes.userMod.User
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object scopeMod {
  
  @JSImport("@sentry/hub/dist/scope", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/hub/dist/scope", "Scope")
  @js.native
  class Scope ()
    extends StObject
       with typings.sentryTypes.scopeMod.Scope {
    
    /**
      * Applies fingerprint from the scope to the event if there's one,
      * uses message if there's one instead or get rid of empty fingerprint
      */
    var _applyFingerprint: js.Any = js.native
    
    /** Array of breadcrumbs. */
    var _breadcrumbs: js.Array[Breadcrumb] = js.native
    
    /** Contexts */
    var _contexts: Contexts = js.native
    
    /** Callback list that will be called after {@link applyToEvent}. */
    var _eventProcessors: js.Array[EventProcessor] = js.native
    
    /** Extra */
    var _extra: Extras = js.native
    
    /** Fingerprint */
    var _fingerprint: js.UndefOr[js.Array[String]] = js.native
    
    /** Severity */
    var _level: js.UndefOr[Severity] = js.native
    
    /**
      * This will be called after {@link applyToEvent} is finished.
      */
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor]): js.Thenable[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Null, hint: Unit, index: Double): js.Thenable[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Null, hint: EventHint): js.Thenable[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Null, hint: EventHint, index: Double): js.Thenable[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Event): js.Thenable[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Event, hint: Unit, index: Double): js.Thenable[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Event, hint: EventHint): js.Thenable[Event | Null] = js.native
    /* protected */ def _notifyEventProcessors(processors: js.Array[EventProcessor], event: Event, hint: EventHint, index: Double): js.Thenable[Event | Null] = js.native
    
    /**
      * This will be called on every set call.
      */
    /* protected */ def _notifyScopeListeners(): Unit = js.native
    
    /** Flag if notifiying is happening. */
    var _notifyingListeners: Boolean = js.native
    
    /** Callback for client to receive scope changes. */
    var _scopeListeners: js.Array[js.Function1[/* scope */ this.type, Unit]] = js.native
    
    /** Session */
    var _session: js.UndefOr[Session] = js.native
    
    /** Span */
    var _span: js.UndefOr[Span] = js.native
    
    /** Tags */
    var _tags: StringDictionary[String] = js.native
    
    /** Transaction Name */
    var _transactionName: js.UndefOr[String] = js.native
    
    /** User */
    var _user: User = js.native
    
    /**
      * Add internal on change listener. Used for sub SDKs that need to store the scope.
      * @hidden
      */
    def addScopeListener(callback: js.Function1[/* scope */ this.type, Unit]): Unit = js.native
    
    /**
      * Applies the current context and fingerprint to the event.
      * Note that breadcrumbs will be added by the client.
      * Also if the event has already breadcrumbs on it, we do not merge them.
      * @param event Event
      * @param hint May contain additional informartion about the original exception.
      * @hidden
      */
    def applyToEvent(event: Event): js.Thenable[Event | Null] = js.native
    def applyToEvent(event: Event, hint: EventHint): js.Thenable[Event | Null] = js.native
    
    def setSession(session: Session): this.type = js.native
    
    /**
      * Can be removed in major version.
      * @deprecated in favor of {@link this.setTransactionName}
      */
    def setTransaction(): this.type = js.native
    def setTransaction(name: String): this.type = js.native
  }
  /* static members */
  object Scope {
    
    @JSImport("@sentry/hub/dist/scope", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    @scala.inline
    def clone(scope: Scope): Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[Scope]
  }
  
  @scala.inline
  def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
}
