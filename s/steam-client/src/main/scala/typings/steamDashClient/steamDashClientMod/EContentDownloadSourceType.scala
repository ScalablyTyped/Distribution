package typings.steamDashClient.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EContentDownloadSourceType extends js.Object

@JSImport("steam-client", "EContentDownloadSourceType")
@js.native
object EContentDownloadSourceType extends js.Object {
  @js.native
  sealed trait CDN extends EContentDownloadSourceType
  
  @js.native
  sealed trait CS extends EContentDownloadSourceType
  
  @js.native
  sealed trait Invalid extends EContentDownloadSourceType
  
  @js.native
  sealed trait LANPeer extends EContentDownloadSourceType
  
  @js.native
  sealed trait LCS extends EContentDownloadSourceType
  
  @js.native
  sealed trait Max extends EContentDownloadSourceType
  
  @js.native
  sealed trait ProxyCache extends EContentDownloadSourceType
  
  /* 2 */ val CDN: typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.CDN with Double = js.native
  /* 1 */ val CS: typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.CS with Double = js.native
  /* 0 */ val Invalid: typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.Invalid with Double = js.native
  /* 5 */ val LANPeer: typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.LANPeer with Double = js.native
  /* 3 */ val LCS: typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.LCS with Double = js.native
  /* 5 */ val Max: typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.Max with Double = js.native
  /* 4 */ val ProxyCache: typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.ProxyCache with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EContentDownloadSourceType with Double] = js.native
}

