package typings.sentryHub

import typings.sentryHub.anon.OmitSessionContextstarted
import typings.sentryHub.interfacesMod.Carrier
import typings.sentryHub.interfacesMod.DomainAsCarrier
import typings.sentryTypes.clientMod.Client
import typings.sentryTypes.eventprocessorMod.EventProcessor
import typings.sentryTypes.optionsMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@sentry/hub", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@sentry/hub", "Hub")
  @js.native
  /**
    * Creates a new instance of the hub, will push one {@link Layer} into the
    * internal stack on creation.
    *
    * @param client bound to the hub.
    * @param scope bound to the hub.
    * @param version number, higher number means higher priority.
    */
  class Hub ()
    extends typings.sentryHub.hubMod.Hub {
    def this(client: Client[Options]) = this()
    def this(client: Unit, scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Client[Options], scope: typings.sentryHub.scopeMod.Scope) = this()
    def this(client: Unit, scope: Unit, _version: Double) = this()
    def this(client: Unit, scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
    def this(client: Client[Options], scope: Unit, _version: Double) = this()
    def this(client: Client[Options], scope: typings.sentryHub.scopeMod.Scope, _version: Double) = this()
  }
  
  @JSImport("@sentry/hub", "Scope")
  @js.native
  class Scope ()
    extends typings.sentryHub.scopeMod.Scope
  /* static members */
  object Scope {
    
    @JSImport("@sentry/hub", "Scope")
    @js.native
    val ^ : js.Any = js.native
    
    inline def clone(scope: typings.sentryHub.scopeMod.Scope): typings.sentryHub.scopeMod.Scope = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(scope.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.scopeMod.Scope]
  }
  
  @JSImport("@sentry/hub", "Session")
  @js.native
  class Session ()
    extends typings.sentryHub.sessionMod.Session {
    def this(context: OmitSessionContextstarted) = this()
  }
  
  inline def addGlobalEventProcessor(callback: EventProcessor): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("addGlobalEventProcessor")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def getActiveDomain(): js.UndefOr[DomainAsCarrier] = ^.asInstanceOf[js.Dynamic].applyDynamic("getActiveDomain")().asInstanceOf[js.UndefOr[DomainAsCarrier]]
  
  inline def getCurrentHub(): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getCurrentHub")().asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def getHubFromCarrier(carrier: Carrier): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("getHubFromCarrier")(carrier.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def getMainCarrier(): Carrier = ^.asInstanceOf[js.Dynamic].applyDynamic("getMainCarrier")().asInstanceOf[Carrier]
  
  inline def makeMain(hub: typings.sentryHub.hubMod.Hub): typings.sentryHub.hubMod.Hub = ^.asInstanceOf[js.Dynamic].applyDynamic("makeMain")(hub.asInstanceOf[js.Any]).asInstanceOf[typings.sentryHub.hubMod.Hub]
  
  inline def setHubOnCarrier(carrier: Carrier, hub: typings.sentryHub.hubMod.Hub): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setHubOnCarrier")(carrier.asInstanceOf[js.Any], hub.asInstanceOf[js.Any])).asInstanceOf[Boolean]
}
