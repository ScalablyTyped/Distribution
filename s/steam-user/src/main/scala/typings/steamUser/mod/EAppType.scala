package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppType extends StObject
@JSImport("steam-user", "EAppType")
@js.native
object EAppType extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppType & Double] = js.native
  
  @js.native
  sealed trait Application
    extends StObject
       with EAppType
  /* 2 */ val Application: typings.steamUser.mod.EAppType.Application & Double = js.native
  
  @js.native
  sealed trait Beta
    extends StObject
       with EAppType
  /* 65536 */ val Beta: typings.steamUser.mod.EAppType.Beta & Double = js.native
  
  @js.native
  sealed trait Comic
    extends StObject
       with EAppType
  /* 32768 */ val Comic: typings.steamUser.mod.EAppType.Comic & Double = js.native
  
  @js.native
  sealed trait Config
    extends StObject
       with EAppType
  /* 256 */ val Config: typings.steamUser.mod.EAppType.Config & Double = js.native
  
  @js.native
  sealed trait DLC
    extends StObject
       with EAppType
  /* 32 */ val DLC: typings.steamUser.mod.EAppType.DLC & Double = js.native
  
  @js.native
  sealed trait Demo
    extends StObject
       with EAppType
  /* 8 */ val Demo: typings.steamUser.mod.EAppType.Demo & Double = js.native
  
  @js.native
  sealed trait DepotOnly
    extends StObject
       with EAppType
  /* -2147483648 */ val DepotOnly: typings.steamUser.mod.EAppType.DepotOnly & Double = js.native
  
  @js.native
  sealed trait Deprected
    extends StObject
       with EAppType
  /* 16 */ val Deprected: typings.steamUser.mod.EAppType.Deprected & Double = js.native
  
  @js.native
  sealed trait Driver
    extends StObject
       with EAppType
  /* 128 */ val Driver: typings.steamUser.mod.EAppType.Driver & Double = js.native
  
  @js.native
  sealed trait Franchise
    extends StObject
       with EAppType
  /* 1024 */ val Franchise: typings.steamUser.mod.EAppType.Franchise & Double = js.native
  
  @js.native
  sealed trait Game
    extends StObject
       with EAppType
  /* 1 */ val Game: typings.steamUser.mod.EAppType.Game & Double = js.native
  
  @js.native
  sealed trait Guide
    extends StObject
       with EAppType
  /* 64 */ val Guide: typings.steamUser.mod.EAppType.Guide & Double = js.native
  
  @js.native
  sealed trait Hardware
    extends StObject
       with EAppType
  /* 512 */ val Hardware: typings.steamUser.mod.EAppType.Hardware & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EAppType
  /* 0 */ val Invalid: typings.steamUser.mod.EAppType.Invalid & Double = js.native
  
  @js.native
  sealed trait Music
    extends StObject
       with EAppType
  /* 8192 */ val Music: typings.steamUser.mod.EAppType.Music & Double = js.native
  
  @js.native
  sealed trait Plugin
    extends StObject
       with EAppType
  /* 4096 */ val Plugin: typings.steamUser.mod.EAppType.Plugin & Double = js.native
  
  @js.native
  sealed trait Series
    extends StObject
       with EAppType
  /* 16384 */ val Series: typings.steamUser.mod.EAppType.Series & Double = js.native
  
  @js.native
  sealed trait Shortcut
    extends StObject
       with EAppType
  /* 1073741824 */ val Shortcut: typings.steamUser.mod.EAppType.Shortcut & Double = js.native
  
  @js.native
  sealed trait Tool
    extends StObject
       with EAppType
  /* 4 */ val Tool: typings.steamUser.mod.EAppType.Tool & Double = js.native
  
  @js.native
  sealed trait Video
    extends StObject
       with EAppType
  /* 2048 */ val Video: typings.steamUser.mod.EAppType.Video & Double = js.native
}
