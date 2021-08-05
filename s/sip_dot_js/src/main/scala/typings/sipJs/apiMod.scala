package typings.sipJs

import typings.sipJs.anon.PartialUserAgentOptions
import typings.sipJs.coreMod.URI
import typings.sipJs.inviteMod.IncomingInviteRequest
import typings.sipJs.inviterOptionsMod.InviterOptions
import typings.sipJs.messagerOptionsMod.MessagerOptions
import typings.sipJs.methodsByeMod.IncomingByeRequest
import typings.sipJs.methodsInfoMod.IncomingInfoRequest
import typings.sipJs.methodsMessageMod.IncomingMessageRequest
import typings.sipJs.notifyMod.IncomingNotifyRequest
import typings.sipJs.publisherOptionsMod.PublisherOptions
import typings.sipJs.referMod.IncomingReferRequest
import typings.sipJs.registererOptionsMod.RegistererOptions
import typings.sipJs.sessionOptionsMod.SessionOptions
import typings.sipJs.subscriberOptionsMod.SubscriberOptions
import typings.sipJs.subscriptionOptionsMod.SubscriptionOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object apiMod {
  
  @JSImport("sip.js/lib/api", "Bye")
  @js.native
  class Bye protected ()
    extends typings.sipJs.byeMod.Bye {
    /** @internal */
    def this(incomingByeRequest: IncomingByeRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "ContentTypeUnsupportedError")
  @js.native
  class ContentTypeUnsupportedError ()
    extends typings.sipJs.exceptionsMod.ContentTypeUnsupportedError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "EmitterImpl")
  @js.native
  class EmitterImpl[T] ()
    extends typings.sipJs.emitterMod.EmitterImpl[T]
  
  @JSImport("sip.js/lib/api", "Info")
  @js.native
  class Info protected ()
    extends typings.sipJs.infoMod.Info {
    /** @internal */
    def this(incomingInfoRequest: IncomingInfoRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Invitation")
  @js.native
  class Invitation protected ()
    extends typings.sipJs.invitationMod.Invitation {
    /** @internal */
    def this(userAgent: typings.sipJs.userAgentMod.UserAgent, incomingInviteRequest: IncomingInviteRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Inviter")
  @js.native
  class Inviter protected ()
    extends typings.sipJs.inviterMod.Inviter {
    /**
      * Constructs a new instance of the `Inviter` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param options - Options bucket. See {@link InviterOptions} for details.
      */
    def this(userAgent: typings.sipJs.userAgentMod.UserAgent, targetURI: URI) = this()
    def this(userAgent: typings.sipJs.userAgentMod.UserAgent, targetURI: URI, options: InviterOptions) = this()
  }
  
  @JSImport("sip.js/lib/api", "Message")
  @js.native
  class Message protected ()
    extends typings.sipJs.messageMod.Message {
    /** @internal */
    def this(incomingMessageRequest: IncomingMessageRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Messager")
  @js.native
  class Messager protected ()
    extends typings.sipJs.messagerMod.Messager {
    /**
      * Constructs a new instance of the `Messager` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param content - Content for the body of the message.
      * @param contentType - Content type of the body of the message.
      * @param options - Options bucket. See {@link MessagerOptions} for details.
      */
    def this(userAgent: typings.sipJs.userAgentMod.UserAgent, targetURI: URI, content: String) = this()
    def this(
      userAgent: typings.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: String
    ) = this()
    def this(
      userAgent: typings.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: String,
      options: MessagerOptions
    ) = this()
    def this(
      userAgent: typings.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      content: String,
      contentType: Unit,
      options: MessagerOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Notification")
  @js.native
  class Notification protected ()
    extends typings.sipJs.notificationMod.Notification {
    /** @internal */
    def this(incomingNotifyRequest: IncomingNotifyRequest) = this()
  }
  
  @JSImport("sip.js/lib/api", "Publisher")
  @js.native
  class Publisher protected ()
    extends typings.sipJs.publisherMod.Publisher {
    /**
      * Constructs a new instance of the `Publisher` class.
      *
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - Request URI identifying the target of the message.
      * @param eventType - The event type identifying the published document.
      * @param options - Options bucket. See {@link PublisherOptions} for details.
      */
    def this(userAgent: typings.sipJs.userAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
    def this(
      userAgent: typings.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      eventType: String,
      options: PublisherOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "PublisherState")
  @js.native
  object PublisherState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.publisherStateMod.PublisherState & String] = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.publisherStateMod.PublisherState.Initial & String = js.native
    
    /* "Published" */ val Published: typings.sipJs.publisherStateMod.PublisherState.Published & String = js.native
    
    /* "Terminated" */ val Terminated: typings.sipJs.publisherStateMod.PublisherState.Terminated & String = js.native
    
    /* "Unpublished" */ val Unpublished: typings.sipJs.publisherStateMod.PublisherState.Unpublished & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "Referral")
  @js.native
  class Referral protected ()
    extends typings.sipJs.referralMod.Referral {
    /** @internal */
    def this(incomingReferRequest: IncomingReferRequest, session: typings.sipJs.sessionMod.Session) = this()
  }
  
  @JSImport("sip.js/lib/api", "Registerer")
  @js.native
  class Registerer protected ()
    extends typings.sipJs.registererMod.Registerer {
    /**
      * Constructs a new instance of the `Registerer` class.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param options - Options bucket. See {@link RegistererOptions} for details.
      */
    def this(userAgent: typings.sipJs.userAgentMod.UserAgent) = this()
    def this(userAgent: typings.sipJs.userAgentMod.UserAgent, options: RegistererOptions) = this()
  }
  /* static members */
  object Registerer {
    
    @JSImport("sip.js/lib/api", "Registerer")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("sip.js/lib/api", "Registerer.defaultExpires")
    @js.native
    val defaultExpires: js.Any = js.native
    
    /** Default registerer options. */
    @JSImport("sip.js/lib/api", "Registerer.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    inline def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    @JSImport("sip.js/lib/api", "Registerer.newUUID")
    @js.native
    def newUUID: js.Any = js.native
    inline def newUUID_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("newUUID")(x.asInstanceOf[js.Any])
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/api", "Registerer.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: js.Any = js.native
    inline def stripUndefinedProperties_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/api", "RegistererState")
  @js.native
  object RegistererState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.registererStateMod.RegistererState & String] = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.registererStateMod.RegistererState.Initial & String = js.native
    
    /* "Registered" */ val Registered: typings.sipJs.registererStateMod.RegistererState.Registered & String = js.native
    
    /* "Terminated" */ val Terminated: typings.sipJs.registererStateMod.RegistererState.Terminated & String = js.native
    
    /* "Unregistered" */ val Unregistered: typings.sipJs.registererStateMod.RegistererState.Unregistered & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "RequestPendingError")
  @js.native
  /** @internal */
  class RequestPendingError ()
    extends typings.sipJs.exceptionsMod.RequestPendingError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "SIPExtension")
  @js.native
  object SIPExtension extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.userAgentOptionsMod.SIPExtension & String] = js.native
    
    /* "Required" */ val Required: typings.sipJs.userAgentOptionsMod.SIPExtension.Required & String = js.native
    
    /* "Supported" */ val Supported: typings.sipJs.userAgentOptionsMod.SIPExtension.Supported & String = js.native
    
    /* "Unsupported" */ val Unsupported: typings.sipJs.userAgentOptionsMod.SIPExtension.Unsupported & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "Session")
  @js.native
  abstract class Session protected ()
    extends typings.sipJs.sessionMod.Session {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    /* protected */ def this(userAgent: typings.sipJs.userAgentMod.UserAgent) = this()
    /* protected */ def this(userAgent: typings.sipJs.userAgentMod.UserAgent, options: SessionOptions) = this()
  }
  
  @JSImport("sip.js/lib/api", "SessionDescriptionHandlerError")
  @js.native
  class SessionDescriptionHandlerError ()
    extends typings.sipJs.exceptionsMod.SessionDescriptionHandlerError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "SessionState")
  @js.native
  object SessionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.sessionStateMod.SessionState & String] = js.native
    
    /* "Established" */ val Established: typings.sipJs.sessionStateMod.SessionState.Established & String = js.native
    
    /* "Establishing" */ val Establishing: typings.sipJs.sessionStateMod.SessionState.Establishing & String = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.sessionStateMod.SessionState.Initial & String = js.native
    
    /* "Terminated" */ val Terminated: typings.sipJs.sessionStateMod.SessionState.Terminated & String = js.native
    
    /* "Terminating" */ val Terminating: typings.sipJs.sessionStateMod.SessionState.Terminating & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "SessionTerminatedError")
  @js.native
  class SessionTerminatedError ()
    extends typings.sipJs.exceptionsMod.SessionTerminatedError
  
  @JSImport("sip.js/lib/api", "StateTransitionError")
  @js.native
  class StateTransitionError ()
    extends typings.sipJs.exceptionsMod.StateTransitionError {
    def this(message: String) = this()
  }
  
  @JSImport("sip.js/lib/api", "Subscriber")
  @js.native
  class Subscriber protected ()
    extends typings.sipJs.subscriberMod.Subscriber {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @param targetURI - The request URI identifying the subscribed event.
      * @param eventType - The event type identifying the subscribed event.
      * @param options - Options bucket. See {@link SubscriberOptions} for details.
      */
    def this(userAgent: typings.sipJs.userAgentMod.UserAgent, targetURI: URI, eventType: String) = this()
    def this(
      userAgent: typings.sipJs.userAgentMod.UserAgent,
      targetURI: URI,
      eventType: String,
      options: SubscriberOptions
    ) = this()
  }
  
  @JSImport("sip.js/lib/api", "Subscription")
  @js.native
  abstract class Subscription protected ()
    extends typings.sipJs.subscriptionMod.Subscription {
    /**
      * Constructor.
      * @param userAgent - User agent. See {@link UserAgent} for details.
      * @internal
      */
    /* protected */ def this(userAgent: typings.sipJs.userAgentMod.UserAgent) = this()
    /* protected */ def this(userAgent: typings.sipJs.userAgentMod.UserAgent, options: SubscriptionOptions) = this()
  }
  
  @JSImport("sip.js/lib/api", "SubscriptionState")
  @js.native
  object SubscriptionState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.subscriptionStateMod.SubscriptionState & String] = js.native
    
    /* "Initial" */ val Initial: typings.sipJs.subscriptionStateMod.SubscriptionState.Initial & String = js.native
    
    /* "NotifyWait" */ val NotifyWait: typings.sipJs.subscriptionStateMod.SubscriptionState.NotifyWait & String = js.native
    
    /* "Subscribed" */ val Subscribed: typings.sipJs.subscriptionStateMod.SubscriptionState.Subscribed & String = js.native
    
    /* "Terminated" */ val Terminated: typings.sipJs.subscriptionStateMod.SubscriptionState.Terminated & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "TransportState")
  @js.native
  object TransportState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.transportStateMod.TransportState & String] = js.native
    
    /* "Connected" */ val Connected: typings.sipJs.transportStateMod.TransportState.Connected & String = js.native
    
    /* "Connecting" */ val Connecting: typings.sipJs.transportStateMod.TransportState.Connecting & String = js.native
    
    /* "Disconnected" */ val Disconnected: typings.sipJs.transportStateMod.TransportState.Disconnected & String = js.native
    
    /* "Disconnecting" */ val Disconnecting: typings.sipJs.transportStateMod.TransportState.Disconnecting & String = js.native
  }
  
  @JSImport("sip.js/lib/api", "UserAgent")
  @js.native
  /**
    * Constructs a new instance of the `UserAgent` class.
    * @param options - Options bucket. See {@link UserAgentOptions} for details.
    */
  class UserAgent ()
    extends typings.sipJs.userAgentMod.UserAgent {
    def this(options: PartialUserAgentOptions) = this()
  }
  /* static members */
  object UserAgent {
    
    @JSImport("sip.js/lib/api", "UserAgent")
    @js.native
    val ^ : js.Any = js.native
    
    /** Default user agent options. */
    @JSImport("sip.js/lib/api", "UserAgent.defaultOptions")
    @js.native
    def defaultOptions: js.Any = js.native
    inline def defaultOptions_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultOptions")(x.asInstanceOf[js.Any])
    
    /**
      * Create a URI instance from a string.
      * @param uri - The string to parse.
      *
      * @example
      * ```ts
      * const uri = UserAgent.makeURI("sip:edgar@example.com");
      * ```
      */
    inline def makeURI(uri: String): js.UndefOr[URI] = ^.asInstanceOf[js.Dynamic].applyDynamic("makeURI")(uri.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[URI]]
    
    /**
      * Strip properties with undefined values from options.
      * This is a work around while waiting for missing vs undefined to be addressed (or not)...
      * https://github.com/Microsoft/TypeScript/issues/13195
      * @param options - Options to reduce
      */
    @JSImport("sip.js/lib/api", "UserAgent.stripUndefinedProperties")
    @js.native
    def stripUndefinedProperties: js.Any = js.native
    inline def stripUndefinedProperties_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stripUndefinedProperties")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("sip.js/lib/api", "UserAgentState")
  @js.native
  object UserAgentState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.sipJs.userAgentStateMod.UserAgentState & String] = js.native
    
    /* "Started" */ val Started: typings.sipJs.userAgentStateMod.UserAgentState.Started & String = js.native
    
    /* "Stopped" */ val Stopped: typings.sipJs.userAgentStateMod.UserAgentState.Stopped & String = js.native
  }
}
