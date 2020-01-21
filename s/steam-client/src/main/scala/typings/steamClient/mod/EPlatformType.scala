package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EPlatformType extends js.Object

@JSImport("steam-client", "EPlatformType")
@js.native
object EPlatformType extends js.Object {
   // removed "split to Linux64 and Linux32"
  @js.native
  sealed trait Linux extends EPlatformType
  
  @js.native
  sealed trait Linux32 extends EPlatformType
  
  @js.native
  sealed trait Linux64 extends EPlatformType
  
  @js.native
  sealed trait Max extends EPlatformType
  
  @js.native
  sealed trait OSX extends EPlatformType
  
  @js.native
  sealed trait PS3 extends EPlatformType
  
  @js.native
  sealed trait Unknown extends EPlatformType
  
  @js.native
  sealed trait Win32 extends EPlatformType
  
  @js.native
  sealed trait Win64 extends EPlatformType
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EPlatformType with Double] = js.native
  /* 3 */ @js.native
  object Linux extends TopLevel[Linux with Double]
  
  /* 6 */ @js.native
  object Linux32 extends TopLevel[Linux32 with Double]
  
  /* 3 */ @js.native
  object Linux64 extends TopLevel[Linux64 with Double]
  
  /* 6 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 4 */ @js.native
  object OSX extends TopLevel[OSX with Double]
  
  /* 5 */ @js.native
  object PS3 extends TopLevel[PS3 with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  /* 1 */ @js.native
  object Win32 extends TopLevel[Win32 with Double]
  
  /* 2 */ @js.native
  object Win64 extends TopLevel[Win64 with Double]
  
}

