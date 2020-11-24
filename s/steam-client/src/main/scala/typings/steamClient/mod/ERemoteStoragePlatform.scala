package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ERemoteStoragePlatform extends js.Object
@JSImport("steam-client", "ERemoteStoragePlatform")
@js.native
object ERemoteStoragePlatform extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ERemoteStoragePlatform with Double] = js.native
  
  @js.native
  sealed trait All extends ERemoteStoragePlatform
  /* -1 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Linux extends ERemoteStoragePlatform
  /* 8 */ @js.native
  object Linux extends TopLevel[Linux with Double]
  
  @js.native
  sealed trait None extends ERemoteStoragePlatform
  /* 0 */ @js.native
  object None extends TopLevel[None with Double]
  
  @js.native
  sealed trait OSX extends ERemoteStoragePlatform
  /* 2 */ @js.native
  object OSX extends TopLevel[OSX with Double]
  
  @js.native
  sealed trait PS3 extends ERemoteStoragePlatform
  /* 4 */ @js.native
  object PS3 extends TopLevel[PS3 with Double]
  
   // removed
  @js.native
  sealed trait Reserved1 extends ERemoteStoragePlatform
  /* 8 */ @js.native
  object Reserved1 extends TopLevel[Reserved1 with Double]
  
  @js.native
  sealed trait Reserved2 extends ERemoteStoragePlatform
  /* 16 */ @js.native
  object Reserved2 extends TopLevel[Reserved2 with Double]
  
  @js.native
  sealed trait Windows extends ERemoteStoragePlatform
  /* 1 */ @js.native
  object Windows extends TopLevel[Windows with Double]
}
