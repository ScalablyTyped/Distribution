package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteClientService extends StObject
@JSImport("steam-user", "ERemoteClientService")
@js.native
object ERemoteClientService extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteClientService & Double] = js.native
  
  @js.native
  sealed trait ContentCache
    extends StObject
       with ERemoteClientService
  /* 8 */ val ContentCache: typings.steamUser.mod.ERemoteClientService.ContentCache & Double = js.native
  
  @js.native
  sealed trait GameStreaming
    extends StObject
       with ERemoteClientService
  /* 2 */ val GameStreaming: typings.steamUser.mod.ERemoteClientService.GameStreaming & Double = js.native
  
  @js.native
  sealed trait None
    extends StObject
       with ERemoteClientService
  /* 0 */ val None: typings.steamUser.mod.ERemoteClientService.None & Double = js.native
  
  @js.native
  sealed trait RemoteControl
    extends StObject
       with ERemoteClientService
  /* 1 */ val RemoteControl: typings.steamUser.mod.ERemoteClientService.RemoteControl & Double = js.native
  
  @js.native
  sealed trait SiteLicense
    extends StObject
       with ERemoteClientService
  /* 4 */ val SiteLicense: typings.steamUser.mod.ERemoteClientService.SiteLicense & Double = js.native
}
