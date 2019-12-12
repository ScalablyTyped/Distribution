package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.All
import typings.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.Linux
import typings.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.None
import typings.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.OSX
import typings.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.PS3
import typings.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.Reserved1
import typings.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.Reserved2
import typings.steamDashClient.steamDashClientMod.ERemoteStoragePlatform.Windows
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ERemoteStoragePlatform extends js.Object

@JSImport("steam-client", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends js.Object {
  @js.native
  sealed trait All extends ERemoteStoragePlatform
  
  @js.native
  sealed trait Linux extends ERemoteStoragePlatform
  
  @js.native
  sealed trait None extends ERemoteStoragePlatform
  
  @js.native
  sealed trait OSX extends ERemoteStoragePlatform
  
  @js.native
  sealed trait PS3 extends ERemoteStoragePlatform
  
   // removed
  @js.native
  sealed trait Reserved1 extends ERemoteStoragePlatform
  
  @js.native
  sealed trait Reserved2 extends ERemoteStoragePlatform
  
  @js.native
  sealed trait Windows extends ERemoteStoragePlatform
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteStoragePlatform with Double] = js.native
  /* -1 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 8 */ @js.native
  object Linux extends TopLevel[Linux with Double]
  
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  /* 2 */ @js.native
  object OSX extends TopLevel[OSX with Double]
  
  /* 4 */ @js.native
  object PS3 extends TopLevel[PS3 with Double]
  
  /* 8 */ @js.native
  object Reserved1 extends TopLevel[Reserved1 with Double]
  
  /* 16 */ @js.native
  object Reserved2 extends TopLevel[Reserved2 with Double]
  
  /* 1 */ @js.native
  object Windows extends TopLevel[Windows with Double]
  
}

