package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EPlatformType extends js.Object
@JSImport("steam-client", "EPlatformType")
@js.native
object EPlatformType extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPlatformType with Double] = js.native
  
   // removed "split to Linux64 and Linux32"
  @js.native
  sealed trait Linux extends EPlatformType
  /* 3 */ @js.native
  object Linux extends TopLevel[Linux with Double]
  
  @js.native
  sealed trait Linux32 extends EPlatformType
  /* 6 */ @js.native
  object Linux32 extends TopLevel[Linux32 with Double]
  
  @js.native
  sealed trait Linux64 extends EPlatformType
  /* 3 */ @js.native
  object Linux64 extends TopLevel[Linux64 with Double]
  
  @js.native
  sealed trait Max extends EPlatformType
  /* 6 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait OSX extends EPlatformType
  /* 4 */ @js.native
  object OSX extends TopLevel[OSX with Double]
  
  @js.native
  sealed trait PS3 extends EPlatformType
  /* 5 */ @js.native
  object PS3 extends TopLevel[PS3 with Double]
  
  @js.native
  sealed trait Unknown extends EPlatformType
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  @js.native
  sealed trait Win32 extends EPlatformType
  /* 1 */ @js.native
  object Win32 extends TopLevel[Win32 with Double]
  
  @js.native
  sealed trait Win64 extends EPlatformType
  /* 2 */ @js.native
  object Win64 extends TopLevel[Win64 with Double]
}
