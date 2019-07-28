package typings.steamDashClient.steamDashClientMod

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
  
  /* 65 */ val ACS: typings.steamDashClient.steamDashClientMod.EServerType.ACS with Double = js.native
  /* 3 */ val AM: typings.steamDashClient.steamDashClientMod.EServerType.AM with Double = js.native
  /* 14 */ val ASBOBSOLETE: typings.steamDashClient.steamDashClientMod.EServerType.ASBOBSOLETE with Double = js.native
  /* 6 */ val ATS: typings.steamDashClient.steamDashClientMod.EServerType.ATS with Double = js.native
  /* 88 */ val AccountScore: typings.steamDashClient.steamDashClientMod.EServerType.AccountScore with Double = js.native
  /* 26 */ val AppInformation: typings.steamDashClient.steamDashClientMod.EServerType.AppInformation with Double = js.native
  /* 94 */ val Auth: typings.steamDashClient.steamDashClientMod.EServerType.Auth with Double = js.native
  /* 56 */ val BRP: typings.steamDashClient.steamDashClientMod.EServerType.BRP with Double = js.native
  /* 4 */ val BS: typings.steamDashClient.steamDashClientMod.EServerType.BS with Double = js.native
  /* 2 */ val BUM: typings.steamDashClient.steamDashClientMod.EServerType.BUM with Double = js.native
  /* 2 */ val BUMOBOSOLETE: typings.steamDashClient.steamDashClientMod.EServerType.BUMOBOSOLETE with Double = js.native
  /* 49 */ val Backpack: typings.steamDashClient.steamDashClientMod.EServerType.Backpack with Double = js.native
  /* 16 */ val BootstrapOBSOLETE: typings.steamDashClient.steamDashClientMod.EServerType.BootstrapOBSOLETE with Double = js.native
  /* 9 */ val BoxMonitor: typings.steamDashClient.steamDashClientMod.EServerType.BoxMonitor with Double = js.native
  /* 86 */ val BroadcastChat: typings.steamDashClient.steamDashClientMod.EServerType.BroadcastChat with Double = js.native
  /* 83 */ val BroadcastDirectory: typings.steamDashClient.steamDashClientMod.EServerType.BroadcastDirectory with Double = js.native
  /* 82 */ val BroadcastRelay: typings.steamDashClient.steamDashClientMod.EServerType.BroadcastRelay with Double = js.native
  /* 32 */ val CCS: typings.steamDashClient.steamDashClientMod.EServerType.CCS with Double = js.native
  /* 7 */ val CM: typings.steamDashClient.steamDashClientMod.EServerType.CM with Double = js.native
  /* 53 */ val CRE: typings.steamDashClient.steamDashClientMod.EServerType.CRE with Double = js.native
  /* 36 */ val CS: typings.steamDashClient.steamDashClientMod.EServerType.CS with Double = js.native
  /* 15 */ val Client: typings.steamDashClient.steamDashClientMod.EServerType.Client with Double = js.native
  /* 24 */ val Community: typings.steamDashClient.steamDashClientMod.EServerType.Community with Double = js.native
  /* 13 */ val Console: typings.steamDashClient.steamDashClientMod.EServerType.Console with Double = js.native
  /* 33 */ val DFS: typings.steamDashClient.steamDashClientMod.EServerType.DFS with Double = js.native
  /* 17 */ val DP: typings.steamDashClient.steamDashClientMod.EServerType.DP with Double = js.native
  /* 11 */ val DRMS: typings.steamDashClient.steamDashClientMod.EServerType.DRMS with Double = js.native
  /* 24 */ val DSS: typings.steamDashClient.steamDashClientMod.EServerType.DSS with Double = js.native
  /* 73 */ val DepotWebContent: typings.steamDashClient.steamDashClientMod.EServerType.DepotWebContent with Double = js.native
  /* 29 */ val EPM: typings.steamDashClient.steamDashClientMod.EServerType.EPM with Double = js.native
  /* 29 */ val EPMOBSOLETE: typings.steamDashClient.steamDashClientMod.EServerType.EPMOBSOLETE with Double = js.native
  /* 72 */ val ES: typings.steamDashClient.steamDashClientMod.EServerType.ES with Double = js.native
  /* 48 */ val Econ: typings.steamDashClient.steamDashClientMod.EServerType.Econ with Double = js.native
  /* 92 */ val EmailDelivery: typings.steamDashClient.steamDashClientMod.EServerType.EmailDelivery with Double = js.native
  /* 74 */ val ExternalConfig: typings.steamDashClient.steamDashClientMod.EServerType.ExternalConfig with Double = js.native
  /* 68 */ val ExternalMonitor: typings.steamDashClient.steamDashClientMod.EServerType.ExternalMonitor with Double = js.native
  /* 8 */ val FBS: typings.steamDashClient.steamDashClientMod.EServerType.FBS with Double = js.native
  /* 9 */ val FG: typings.steamDashClient.steamDashClientMod.EServerType.FG with Double = js.native
  /* 47 */ val FS: typings.steamDashClient.steamDashClientMod.EServerType.FS with Double = js.native
  /* 28 */ val FTS: typings.steamDashClient.steamDashClientMod.EServerType.FTS with Double = js.native
  /* 0 */ val First: typings.steamDashClient.steamDashClientMod.EServerType.First with Double = js.native
  /* 37 */ val GC: typings.steamDashClient.steamDashClientMod.EServerType.GC with Double = js.native
  /* 57 */ val GCH: typings.steamDashClient.steamDashClientMod.EServerType.GCH with Double = js.native
  /* 1 */ val GM: typings.steamDashClient.steamDashClientMod.EServerType.GM with Double = js.native
  /* 43 */ val GMS: typings.steamDashClient.steamDashClientMod.EServerType.GMS with Double = js.native
  /* 75 */ val GameNotifications: typings.steamDashClient.steamDashClientMod.EServerType.GameNotifications with Double = js.native
  /* 96 */ val HLTVRelay: typings.steamDashClient.steamDashClientMod.EServerType.HLTVRelay with Double = js.native
  /* 12 */ val HubOBSOLETE: typings.steamDashClient.steamDashClientMod.EServerType.HubOBSOLETE with Double = js.native
  /* 31 */ val IS: typings.steamDashClient.steamDashClientMod.EServerType.IS with Double = js.native
  /* -1 */ val Invalid: typings.steamDashClient.steamDashClientMod.EServerType.Invalid with Double = js.native
  /* 93 */ val InventoryManagement: typings.steamDashClient.steamDashClientMod.EServerType.InventoryManagement with Double = js.native
  /* 44 */ val KGS: typings.steamDashClient.steamDashClientMod.EServerType.KGS with Double = js.native
  /* 34 */ val LBS: typings.steamDashClient.steamDashClientMod.EServerType.LBS with Double = js.native
  /* 78 */ val Localization: typings.steamDashClient.steamDashClientMod.EServerType.Localization with Double = js.native
  /* 90 */ val LogRequest: typings.steamDashClient.steamDashClientMod.EServerType.LogRequest with Double = js.native
  /* 91 */ val LogWorker: typings.steamDashClient.steamDashClientMod.EServerType.LogWorker with Double = js.native
  /* 61 */ val Logsink: typings.steamDashClient.steamDashClientMod.EServerType.Logsink with Double = js.native
  /* 35 */ val MDS: typings.steamDashClient.steamDashClientMod.EServerType.MDS with Double = js.native
  /* 42 */ val MMS: typings.steamDashClient.steamDashClientMod.EServerType.MMS with Double = js.native
  /* 58 */ val MPAS: typings.steamDashClient.steamDashClientMod.EServerType.MPAS with Double = js.native
  /* 62 */ val Market: typings.steamDashClient.steamDashClientMod.EServerType.Market with Double = js.native
  /* 76 */ val MarketRepl: typings.steamDashClient.steamDashClientMod.EServerType.MarketRepl with Double = js.native
  /* 77 */ val MarketSearch: typings.steamDashClient.steamDashClientMod.EServerType.MarketSearch with Double = js.native
  /* 97 */ val Max: typings.steamDashClient.steamDashClientMod.EServerType.Max with Double = js.native
  /* 52 */ val MoneyStats: typings.steamDashClient.steamDashClientMod.EServerType.MoneyStats with Double = js.native
  /* 38 */ val NS: typings.steamDashClient.steamDashClientMod.EServerType.NS with Double = js.native
  /* 39 */ val OGS: typings.steamDashClient.steamDashClientMod.EServerType.OGS with Double = js.native
  /* 25 */ val P2PRelayOBSOLETE: typings.steamDashClient.steamDashClientMod.EServerType.P2PRelayOBSOLETE with Double = js.native
  /* 14 */ val PICS: typings.steamDashClient.steamDashClientMod.EServerType.PICS with Double = js.native
  /* 66 */ val PNP: typings.steamDashClient.steamDashClientMod.EServerType.PNP with Double = js.native
  /* 30 */ val PS: typings.steamDashClient.steamDashClientMod.EServerType.PS with Double = js.native
  /* 69 */ val Parental: typings.steamDashClient.steamDashClientMod.EServerType.Parental with Double = js.native
  /* 71 */ val Partner: typings.steamDashClient.steamDashClientMod.EServerType.Partner with Double = js.native
  /* 70 */ val PartnerUpload: typings.steamDashClient.steamDashClientMod.EServerType.PartnerUpload with Double = js.native
  /* 87 */ val Phone: typings.steamDashClient.steamDashClientMod.EServerType.Phone with Double = js.native
  /* 80 */ val PublicTest: typings.steamDashClient.steamDashClientMod.EServerType.PublicTest with Double = js.native
  /* 63 */ val Quest: typings.steamDashClient.steamDashClientMod.EServerType.Quest with Double = js.native
  /* 46 */ val RM: typings.steamDashClient.steamDashClientMod.EServerType.RM with Double = js.native
  /* 20 */ val SLC: typings.steamDashClient.steamDashClientMod.EServerType.SLC with Double = js.native
  /* 19 */ val SM: typings.steamDashClient.steamDashClientMod.EServerType.SM with Double = js.native
  /* 10 */ val SS: typings.steamDashClient.steamDashClientMod.EServerType.SS with Double = js.native
  /* 60 */ val Secrets: typings.steamDashClient.steamDashClientMod.EServerType.Secrets with Double = js.native
  /* 0 */ val Shell: typings.steamDashClient.steamDashClientMod.EServerType.Shell with Double = js.native
  /* 81 */ val SolrMgr: typings.steamDashClient.steamDashClientMod.EServerType.SolrMgr with Double = js.native
  /* 27 */ val Spare: typings.steamDashClient.steamDashClientMod.EServerType.Spare with Double = js.native
  /* 79 */ val Steam2Emulator: typings.steamDashClient.steamDashClientMod.EServerType.Steam2Emulator with Double = js.native
  /* 51 */ val Store: typings.steamDashClient.steamDashClientMod.EServerType.Store with Double = js.native
  /* 95 */ val StoreCatalog: typings.steamDashClient.steamDashClientMod.EServerType.StoreCatalog with Double = js.native
  /* 51 */ val StoreFeature: typings.steamDashClient.steamDashClientMod.EServerType.StoreFeature with Double = js.native
  /* 89 */ val Support: typings.steamDashClient.steamDashClientMod.EServerType.Support with Double = js.native
  /* 67 */ val TaxForm: typings.steamDashClient.steamDashClientMod.EServerType.TaxForm with Double = js.native
  /* 59 */ val Trade: typings.steamDashClient.steamDashClientMod.EServerType.Trade with Double = js.native
  /* 85 */ val TradeOffer: typings.steamDashClient.steamDashClientMod.EServerType.TradeOffer with Double = js.native
  /* 45 */ val UCM: typings.steamDashClient.steamDashClientMod.EServerType.UCM with Double = js.native
  /* 41 */ val UDS: typings.steamDashClient.steamDashClientMod.EServerType.UDS with Double = js.native
  /* 21 */ val UFS: typings.steamDashClient.steamDashClientMod.EServerType.UFS with Double = js.native
  /* 50 */ val UGS: typings.steamDashClient.steamDashClientMod.EServerType.UGS with Double = js.native
  /* 54 */ val UMQ: typings.steamDashClient.steamDashClientMod.EServerType.UMQ with Double = js.native
  /* 23 */ val Util: typings.steamDashClient.steamDashClientMod.EServerType.Util with Double = js.native
  /* 5 */ val VS: typings.steamDashClient.steamDashClientMod.EServerType.VS with Double = js.native
  /* 84 */ val VideoManager: typings.steamDashClient.steamDashClientMod.EServerType.VideoManager with Double = js.native
  /* 64 */ val WDS: typings.steamDashClient.steamDashClientMod.EServerType.WDS with Double = js.native
  /* 18 */ val WG: typings.steamDashClient.steamDashClientMod.EServerType.WG with Double = js.native
  /* 40 */ val WebAPI: typings.steamDashClient.steamDashClientMod.EServerType.WebAPI with Double = js.native
  /* 55 */ val Workshop: typings.steamDashClient.steamDashClientMod.EServerType.Workshop with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EServerType with Double] = js.native
}

