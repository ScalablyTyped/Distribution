package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EServerType extends js.Object

@JSImport("steam-client", "EServerType")
@js.native
object EServerType extends js.Object {
  @js.native
  sealed trait ACS extends EServerType
  
  @js.native
  sealed trait AM extends EServerType
  
   // removed
  @js.native
  sealed trait ASBOBSOLETE extends EServerType
  
  @js.native
  sealed trait ATS extends EServerType
  
  @js.native
  sealed trait AccountScore extends EServerType
  
  @js.native
  sealed trait AppInformation extends EServerType
  
  @js.native
  sealed trait Auth extends EServerType
  
  @js.native
  sealed trait BRP extends EServerType
  
  @js.native
  sealed trait BS extends EServerType
  
   // removed
  @js.native
  sealed trait BUM extends EServerType
  
   // removed
  @js.native
  sealed trait BUMOBOSOLETE extends EServerType
  
  @js.native
  sealed trait Backpack extends EServerType
  
   // removed,
  @js.native
  sealed trait BootstrapOBSOLETE extends EServerType
  
  @js.native
  sealed trait BoxMonitor extends EServerType
  
  @js.native
  sealed trait BroadcastChat extends EServerType
  
  @js.native
  sealed trait BroadcastDirectory extends EServerType
  
  @js.native
  sealed trait BroadcastRelay extends EServerType
  
  @js.native
  sealed trait CCS extends EServerType
  
  @js.native
  sealed trait CM extends EServerType
  
  @js.native
  sealed trait CRE extends EServerType
  
  @js.native
  sealed trait CS extends EServerType
  
  @js.native
  sealed trait Client extends EServerType
  
  @js.native
  sealed trait Community extends EServerType
  
  @js.native
  sealed trait Console extends EServerType
  
  @js.native
  sealed trait DFS extends EServerType
  
  @js.native
  sealed trait DP extends EServerType
  
  @js.native
  sealed trait DRMS extends EServerType
  
   // removed "renamed to Community"
  @js.native
  sealed trait DSS extends EServerType
  
  @js.native
  sealed trait DepotWebContent extends EServerType
  
   // removed
  @js.native
  sealed trait EPM extends EServerType
  
   // removed
  @js.native
  sealed trait EPMOBSOLETE extends EServerType
  
  @js.native
  sealed trait ES extends EServerType
  
  @js.native
  sealed trait Econ extends EServerType
  
  @js.native
  sealed trait EmailDelivery extends EServerType
  
  @js.native
  sealed trait ExternalConfig extends EServerType
  
  @js.native
  sealed trait ExternalMonitor extends EServerType
  
  @js.native
  sealed trait FBS extends EServerType
  
   // removed "renamed to BoxMonitor"
  @js.native
  sealed trait FG extends EServerType
  
  @js.native
  sealed trait FS extends EServerType
  
  @js.native
  sealed trait FTS extends EServerType
  
  @js.native
  sealed trait First extends EServerType
  
  @js.native
  sealed trait GC extends EServerType
  
  @js.native
  sealed trait GCH extends EServerType
  
  @js.native
  sealed trait GM extends EServerType
  
  @js.native
  sealed trait GMS extends EServerType
  
  @js.native
  sealed trait GameNotifications extends EServerType
  
  @js.native
  sealed trait HLTVRelay extends EServerType
  
   // removed
  @js.native
  sealed trait HubOBSOLETE extends EServerType
  
  @js.native
  sealed trait IS extends EServerType
  
  @js.native
  sealed trait Invalid extends EServerType
  
  @js.native
  sealed trait InventoryManagement extends EServerType
  
  @js.native
  sealed trait KGS extends EServerType
  
  @js.native
  sealed trait LBS extends EServerType
  
  @js.native
  sealed trait Localization extends EServerType
  
  @js.native
  sealed trait LogRequest extends EServerType
  
  @js.native
  sealed trait LogWorker extends EServerType
  
  @js.native
  sealed trait Logsink extends EServerType
  
  @js.native
  sealed trait MDS extends EServerType
  
  @js.native
  sealed trait MMS extends EServerType
  
  @js.native
  sealed trait MPAS extends EServerType
  
  @js.native
  sealed trait Market extends EServerType
  
  @js.native
  sealed trait MarketRepl extends EServerType
  
  @js.native
  sealed trait MarketSearch extends EServerType
  
  @js.native
  sealed trait Max extends EServerType
  
  @js.native
  sealed trait MoneyStats extends EServerType
  
  @js.native
  sealed trait NS extends EServerType
  
  @js.native
  sealed trait OGS extends EServerType
  
   // removed
  @js.native
  sealed trait P2PRelayOBSOLETE extends EServerType
  
  @js.native
  sealed trait PICS extends EServerType
  
  @js.native
  sealed trait PNP extends EServerType
  
  @js.native
  sealed trait PS extends EServerType
  
  @js.native
  sealed trait Parental extends EServerType
  
  @js.native
  sealed trait Partner extends EServerType
  
  @js.native
  sealed trait PartnerUpload extends EServerType
  
  @js.native
  sealed trait Phone extends EServerType
  
  @js.native
  sealed trait PublicTest extends EServerType
  
  @js.native
  sealed trait Quest extends EServerType
  
  @js.native
  sealed trait RM extends EServerType
  
  @js.native
  sealed trait SLC extends EServerType
  
  @js.native
  sealed trait SM extends EServerType
  
  @js.native
  sealed trait SS extends EServerType
  
  @js.native
  sealed trait Secrets extends EServerType
  
  @js.native
  sealed trait Shell extends EServerType
  
  @js.native
  sealed trait SolrMgr extends EServerType
  
  @js.native
  sealed trait Spare extends EServerType
  
  @js.native
  sealed trait Steam2Emulator extends EServerType
  
   // removed "renamed to StoreFeature"
  @js.native
  sealed trait Store extends EServerType
  
  @js.native
  sealed trait StoreCatalog extends EServerType
  
  @js.native
  sealed trait StoreFeature extends EServerType
  
  @js.native
  sealed trait Support extends EServerType
  
  @js.native
  sealed trait TaxForm extends EServerType
  
  @js.native
  sealed trait Trade extends EServerType
  
  @js.native
  sealed trait TradeOffer extends EServerType
  
  @js.native
  sealed trait UCM extends EServerType
  
  @js.native
  sealed trait UDS extends EServerType
  
  @js.native
  sealed trait UFS extends EServerType
  
  @js.native
  sealed trait UGS extends EServerType
  
  @js.native
  sealed trait UMQ extends EServerType
  
  @js.native
  sealed trait Util extends EServerType
  
  @js.native
  sealed trait VS extends EServerType
  
  @js.native
  sealed trait VideoManager extends EServerType
  
  @js.native
  sealed trait WDS extends EServerType
  
  @js.native
  sealed trait WG extends EServerType
  
  @js.native
  sealed trait WebAPI extends EServerType
  
  @js.native
  sealed trait Workshop extends EServerType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerType with Double] = js.native
  /* 65 */ @js.native
  object ACS extends TopLevel[ACS with Double]
  
  /* 3 */ @js.native
  object AM extends TopLevel[AM with Double]
  
  /* 14 */ @js.native
  object ASBOBSOLETE extends TopLevel[ASBOBSOLETE with Double]
  
  /* 6 */ @js.native
  object ATS extends TopLevel[ATS with Double]
  
  /* 88 */ @js.native
  object AccountScore extends TopLevel[AccountScore with Double]
  
  /* 26 */ @js.native
  object AppInformation extends TopLevel[AppInformation with Double]
  
  /* 94 */ @js.native
  object Auth extends TopLevel[Auth with Double]
  
  /* 56 */ @js.native
  object BRP extends TopLevel[BRP with Double]
  
  /* 4 */ @js.native
  object BS extends TopLevel[BS with Double]
  
  /* 2 */ @js.native
  object BUM extends TopLevel[BUM with Double]
  
  /* 2 */ @js.native
  object BUMOBOSOLETE extends TopLevel[BUMOBOSOLETE with Double]
  
  /* 49 */ @js.native
  object Backpack extends TopLevel[Backpack with Double]
  
  /* 16 */ @js.native
  object BootstrapOBSOLETE extends TopLevel[BootstrapOBSOLETE with Double]
  
  /* 9 */ @js.native
  object BoxMonitor extends TopLevel[BoxMonitor with Double]
  
  /* 86 */ @js.native
  object BroadcastChat extends TopLevel[BroadcastChat with Double]
  
  /* 83 */ @js.native
  object BroadcastDirectory extends TopLevel[BroadcastDirectory with Double]
  
  /* 82 */ @js.native
  object BroadcastRelay extends TopLevel[BroadcastRelay with Double]
  
  /* 32 */ @js.native
  object CCS extends TopLevel[CCS with Double]
  
  /* 7 */ @js.native
  object CM extends TopLevel[CM with Double]
  
  /* 53 */ @js.native
  object CRE extends TopLevel[CRE with Double]
  
  /* 36 */ @js.native
  object CS extends TopLevel[CS with Double]
  
  /* 15 */ @js.native
  object Client extends TopLevel[Client with Double]
  
  /* 24 */ @js.native
  object Community extends TopLevel[Community with Double]
  
  /* 13 */ @js.native
  object Console extends TopLevel[Console with Double]
  
  /* 33 */ @js.native
  object DFS extends TopLevel[DFS with Double]
  
  /* 17 */ @js.native
  object DP extends TopLevel[DP with Double]
  
  /* 11 */ @js.native
  object DRMS extends TopLevel[DRMS with Double]
  
  /* 24 */ @js.native
  object DSS extends TopLevel[DSS with Double]
  
  /* 73 */ @js.native
  object DepotWebContent extends TopLevel[DepotWebContent with Double]
  
  /* 29 */ @js.native
  object EPM extends TopLevel[EPM with Double]
  
  /* 29 */ @js.native
  object EPMOBSOLETE extends TopLevel[EPMOBSOLETE with Double]
  
  /* 72 */ @js.native
  object ES extends TopLevel[ES with Double]
  
  /* 48 */ @js.native
  object Econ extends TopLevel[Econ with Double]
  
  /* 92 */ @js.native
  object EmailDelivery extends TopLevel[EmailDelivery with Double]
  
  /* 74 */ @js.native
  object ExternalConfig extends TopLevel[ExternalConfig with Double]
  
  /* 68 */ @js.native
  object ExternalMonitor extends TopLevel[ExternalMonitor with Double]
  
  /* 8 */ @js.native
  object FBS extends TopLevel[FBS with Double]
  
  /* 9 */ @js.native
  object FG extends TopLevel[FG with Double]
  
  /* 47 */ @js.native
  object FS extends TopLevel[FS with Double]
  
  /* 28 */ @js.native
  object FTS extends TopLevel[FTS with Double]
  
  /* 0 */ @js.native
  object First extends TopLevel[First with Double]
  
  /* 37 */ @js.native
  object GC extends TopLevel[GC with Double]
  
  /* 57 */ @js.native
  object GCH extends TopLevel[GCH with Double]
  
  /* 1 */ @js.native
  object GM extends TopLevel[GM with Double]
  
  /* 43 */ @js.native
  object GMS extends TopLevel[GMS with Double]
  
  /* 75 */ @js.native
  object GameNotifications extends TopLevel[GameNotifications with Double]
  
  /* 96 */ @js.native
  object HLTVRelay extends TopLevel[HLTVRelay with Double]
  
  /* 12 */ @js.native
  object HubOBSOLETE extends TopLevel[HubOBSOLETE with Double]
  
  /* 31 */ @js.native
  object IS extends TopLevel[IS with Double]
  
  /* -1 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 93 */ @js.native
  object InventoryManagement extends TopLevel[InventoryManagement with Double]
  
  /* 44 */ @js.native
  object KGS extends TopLevel[KGS with Double]
  
  /* 34 */ @js.native
  object LBS extends TopLevel[LBS with Double]
  
  /* 78 */ @js.native
  object Localization extends TopLevel[Localization with Double]
  
  /* 90 */ @js.native
  object LogRequest extends TopLevel[LogRequest with Double]
  
  /* 91 */ @js.native
  object LogWorker extends TopLevel[LogWorker with Double]
  
  /* 61 */ @js.native
  object Logsink extends TopLevel[Logsink with Double]
  
  /* 35 */ @js.native
  object MDS extends TopLevel[MDS with Double]
  
  /* 42 */ @js.native
  object MMS extends TopLevel[MMS with Double]
  
  /* 58 */ @js.native
  object MPAS extends TopLevel[MPAS with Double]
  
  /* 62 */ @js.native
  object Market extends TopLevel[Market with Double]
  
  /* 76 */ @js.native
  object MarketRepl extends TopLevel[MarketRepl with Double]
  
  /* 77 */ @js.native
  object MarketSearch extends TopLevel[MarketSearch with Double]
  
  /* 97 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 52 */ @js.native
  object MoneyStats extends TopLevel[MoneyStats with Double]
  
  /* 38 */ @js.native
  object NS extends TopLevel[NS with Double]
  
  /* 39 */ @js.native
  object OGS extends TopLevel[OGS with Double]
  
  /* 25 */ @js.native
  object P2PRelayOBSOLETE extends TopLevel[P2PRelayOBSOLETE with Double]
  
  /* 14 */ @js.native
  object PICS extends TopLevel[PICS with Double]
  
  /* 66 */ @js.native
  object PNP extends TopLevel[PNP with Double]
  
  /* 30 */ @js.native
  object PS extends TopLevel[PS with Double]
  
  /* 69 */ @js.native
  object Parental extends TopLevel[Parental with Double]
  
  /* 71 */ @js.native
  object Partner extends TopLevel[Partner with Double]
  
  /* 70 */ @js.native
  object PartnerUpload extends TopLevel[PartnerUpload with Double]
  
  /* 87 */ @js.native
  object Phone extends TopLevel[Phone with Double]
  
  /* 80 */ @js.native
  object PublicTest extends TopLevel[PublicTest with Double]
  
  /* 63 */ @js.native
  object Quest extends TopLevel[Quest with Double]
  
  /* 46 */ @js.native
  object RM extends TopLevel[RM with Double]
  
  /* 20 */ @js.native
  object SLC extends TopLevel[SLC with Double]
  
  /* 19 */ @js.native
  object SM extends TopLevel[SM with Double]
  
  /* 10 */ @js.native
  object SS extends TopLevel[SS with Double]
  
  /* 60 */ @js.native
  object Secrets extends TopLevel[Secrets with Double]
  
  /* 0 */ @js.native
  object Shell extends TopLevel[Shell with Double]
  
  /* 81 */ @js.native
  object SolrMgr extends TopLevel[SolrMgr with Double]
  
  /* 27 */ @js.native
  object Spare extends TopLevel[Spare with Double]
  
  /* 79 */ @js.native
  object Steam2Emulator extends TopLevel[Steam2Emulator with Double]
  
  /* 51 */ @js.native
  object Store extends TopLevel[Store with Double]
  
  /* 95 */ @js.native
  object StoreCatalog extends TopLevel[StoreCatalog with Double]
  
  /* 51 */ @js.native
  object StoreFeature extends TopLevel[StoreFeature with Double]
  
  /* 89 */ @js.native
  object Support extends TopLevel[Support with Double]
  
  /* 67 */ @js.native
  object TaxForm extends TopLevel[TaxForm with Double]
  
  /* 59 */ @js.native
  object Trade extends TopLevel[Trade with Double]
  
  /* 85 */ @js.native
  object TradeOffer extends TopLevel[TradeOffer with Double]
  
  /* 45 */ @js.native
  object UCM extends TopLevel[UCM with Double]
  
  /* 41 */ @js.native
  object UDS extends TopLevel[UDS with Double]
  
  /* 21 */ @js.native
  object UFS extends TopLevel[UFS with Double]
  
  /* 50 */ @js.native
  object UGS extends TopLevel[UGS with Double]
  
  /* 54 */ @js.native
  object UMQ extends TopLevel[UMQ with Double]
  
  /* 23 */ @js.native
  object Util extends TopLevel[Util with Double]
  
  /* 5 */ @js.native
  object VS extends TopLevel[VS with Double]
  
  /* 84 */ @js.native
  object VideoManager extends TopLevel[VideoManager with Double]
  
  /* 64 */ @js.native
  object WDS extends TopLevel[WDS with Double]
  
  /* 18 */ @js.native
  object WG extends TopLevel[WG with Double]
  
  /* 40 */ @js.native
  object WebAPI extends TopLevel[WebAPI with Double]
  
  /* 55 */ @js.native
  object Workshop extends TopLevel[Workshop with Double]
  
}

