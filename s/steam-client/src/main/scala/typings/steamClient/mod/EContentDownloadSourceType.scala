package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EContentDownloadSourceType extends js.Object
@JSImport("steam-client", "EContentDownloadSourceType")
@js.native
object EContentDownloadSourceType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EContentDownloadSourceType with Double] = js.native
  
  @js.native
  sealed trait CDN extends EContentDownloadSourceType
  /* 2 */ @js.native
  object CDN extends TopLevel[CDN with Double]
  
  @js.native
  sealed trait CS extends EContentDownloadSourceType
  /* 1 */ @js.native
  object CS extends TopLevel[CS with Double]
  
  @js.native
  sealed trait Invalid extends EContentDownloadSourceType
  /* 0 */ @js.native
  object Invalid extends TopLevel[Invalid with Double]
  
  @js.native
  sealed trait LANPeer extends EContentDownloadSourceType
  /* 5 */ @js.native
  object LANPeer extends TopLevel[LANPeer with Double]
  
  @js.native
  sealed trait LCS extends EContentDownloadSourceType
  /* 3 */ @js.native
  object LCS extends TopLevel[LCS with Double]
  
  @js.native
  sealed trait Max extends EContentDownloadSourceType
  /* 5 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait ProxyCache extends EContentDownloadSourceType
  /* 4 */ @js.native
  object ProxyCache extends TopLevel[ProxyCache with Double]
}
