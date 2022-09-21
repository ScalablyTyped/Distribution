package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EContentDownloadSourceType extends StObject
@JSImport("steam-user", "EContentDownloadSourceType")
@js.native
object EContentDownloadSourceType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EContentDownloadSourceType & Double] = js.native
  
  @js.native
  sealed trait CDN
    extends StObject
       with EContentDownloadSourceType
  /* 2 */ val CDN: typings.steamUser.mod.EContentDownloadSourceType.CDN & Double = js.native
  
  @js.native
  sealed trait CS
    extends StObject
       with EContentDownloadSourceType
  /* 1 */ val CS: typings.steamUser.mod.EContentDownloadSourceType.CS & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EContentDownloadSourceType
  /* 0 */ val Invalid: typings.steamUser.mod.EContentDownloadSourceType.Invalid & Double = js.native
  
  @js.native
  sealed trait LANCache
    extends StObject
       with EContentDownloadSourceType
  /* 9 */ val LANCache: typings.steamUser.mod.EContentDownloadSourceType.LANCache & Double = js.native
  
  @js.native
  sealed trait LANPeer
    extends StObject
       with EContentDownloadSourceType
  /* 5 */ val LANPeer: typings.steamUser.mod.EContentDownloadSourceType.LANPeer & Double = js.native
  
  @js.native
  sealed trait LCS
    extends StObject
       with EContentDownloadSourceType
  /* 3 */ val LCS: typings.steamUser.mod.EContentDownloadSourceType.LCS & Double = js.native
  
  @js.native
  sealed trait OpenCache
    extends StObject
       with EContentDownloadSourceType
  /* 8 */ val OpenCache: typings.steamUser.mod.EContentDownloadSourceType.OpenCache & Double = js.native
  
  @js.native
  sealed trait ProxyCache
    extends StObject
       with EContentDownloadSourceType
  /* 4 */ val ProxyCache: typings.steamUser.mod.EContentDownloadSourceType.ProxyCache & Double = js.native
  
  @js.native
  sealed trait SLS
    extends StObject
       with EContentDownloadSourceType
  /* 6 */ val SLS: typings.steamUser.mod.EContentDownloadSourceType.SLS & Double = js.native
  
  @js.native
  sealed trait SteamCache
    extends StObject
       with EContentDownloadSourceType
  /* 7 */ val SteamCache: typings.steamUser.mod.EContentDownloadSourceType.SteamCache & Double = js.native
}
