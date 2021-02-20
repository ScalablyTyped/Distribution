package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPlatformType extends StObject
@JSImport("steam-client", "EPlatformType")
@js.native
object EPlatformType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPlatformType with Double] = js.native
  
  @js.native
  sealed trait Linux extends EPlatformType
  /* 3 */ val Linux: typings.steamClient.mod.EPlatformType.Linux with Double = js.native
  
  @js.native
  sealed trait Linux32 extends EPlatformType
  /* 6 */ val Linux32: typings.steamClient.mod.EPlatformType.Linux32 with Double = js.native
  
  // removed "split to Linux64 and Linux32"
  @js.native
  sealed trait Linux64 extends EPlatformType
  /* 3 */ val Linux64: typings.steamClient.mod.EPlatformType.Linux64 with Double = js.native
  
  @js.native
  sealed trait Max extends EPlatformType
  /* 6 */ val Max: typings.steamClient.mod.EPlatformType.Max with Double = js.native
  
  @js.native
  sealed trait OSX extends EPlatformType
  /* 4 */ val OSX: typings.steamClient.mod.EPlatformType.OSX with Double = js.native
  
  @js.native
  sealed trait PS3 extends EPlatformType
  /* 5 */ val PS3: typings.steamClient.mod.EPlatformType.PS3 with Double = js.native
  
  @js.native
  sealed trait Unknown extends EPlatformType
  /* 0 */ val Unknown: typings.steamClient.mod.EPlatformType.Unknown with Double = js.native
  
  @js.native
  sealed trait Win32 extends EPlatformType
  /* 1 */ val Win32: typings.steamClient.mod.EPlatformType.Win32 with Double = js.native
  
  @js.native
  sealed trait Win64 extends EPlatformType
  /* 2 */ val Win64: typings.steamClient.mod.EPlatformType.Win64 with Double = js.native
}
