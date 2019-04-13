package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EContentDownloadSourceType extends js.Object

@JSImport("steam-client", "EContentDownloadSourceType")
@js.native
object EContentDownloadSourceType extends js.Object {
  @js.native
  sealed trait CDN
    extends steamDashClientLib.steamDashClientMod.EContentDownloadSourceType
  
  @js.native
  sealed trait CS
    extends steamDashClientLib.steamDashClientMod.EContentDownloadSourceType
  
  @js.native
  sealed trait Invalid
    extends steamDashClientLib.steamDashClientMod.EContentDownloadSourceType
  
  @js.native
  sealed trait LANPeer
    extends steamDashClientLib.steamDashClientMod.EContentDownloadSourceType
  
  @js.native
  sealed trait LCS
    extends steamDashClientLib.steamDashClientMod.EContentDownloadSourceType
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EContentDownloadSourceType
  
  @js.native
  sealed trait ProxyCache
    extends steamDashClientLib.steamDashClientMod.EContentDownloadSourceType
  
  /* 2 */ val CDN: CDN with scala.Double = js.native
  /* 1 */ val CS: CS with scala.Double = js.native
  /* 0 */ val Invalid: Invalid with scala.Double = js.native
  /* 5 */ val LANPeer: LANPeer with scala.Double = js.native
  /* 3 */ val LCS: LCS with scala.Double = js.native
  /* 5 */ val Max: Max with scala.Double = js.native
  /* 4 */ val ProxyCache: ProxyCache with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[
    steamDashClientLib.steamDashClientMod.EContentDownloadSourceType with scala.Double
  ] = js.native
}

