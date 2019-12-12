package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.CDN
import typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.CS
import typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.Invalid
import typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.LANPeer
import typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.LCS
import typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.Max
import typings.steamDashClient.steamDashClientMod.EContentDownloadSourceType.ProxyCache
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EContentDownloadSourceType with Double] = js.native
  /* 2 */ @js.native
  object CDN extends TopLevel[CDN with Double]
  
  /* 1 */ @js.native
  object CS extends TopLevel[CS with Double]
  
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  /* 5 */ @js.native
  object LANPeer extends TopLevel[LANPeer with Double]
  
  /* 3 */ @js.native
  object LCS extends TopLevel[LCS with Double]
  
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 4 */ @js.native
  object ProxyCache extends TopLevel[ProxyCache with Double]
  
}

