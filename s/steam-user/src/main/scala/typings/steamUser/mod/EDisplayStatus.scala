package typings.steamUser.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EDisplayStatus extends StObject
@JSImport("steam-user", "EDisplayStatus")
@js.native
object EDisplayStatus extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EDisplayStatus & Double] = js.native
  
  @js.native
  sealed trait AvailForFree
    extends StObject
       with EDisplayStatus
  /* 28 */ val AvailForFree: typings.steamUser.mod.EDisplayStatus.AvailForFree & Double = js.native
  
  @js.native
  sealed trait AvailGuestPass
    extends StObject
       with EDisplayStatus
  /* 30 */ val AvailGuestPass: typings.steamUser.mod.EDisplayStatus.AvailGuestPass & Double = js.native
  
  @js.native
  sealed trait AvailToBorrow
    extends StObject
       with EDisplayStatus
  /* 29 */ val AvailToBorrow: typings.steamUser.mod.EDisplayStatus.AvailToBorrow & Double = js.native
  
  @js.native
  sealed trait BorrowerLocked
    extends StObject
       with EDisplayStatus
  /* 17 */ val BorrowerLocked: typings.steamUser.mod.EDisplayStatus.BorrowerLocked & Double = js.native
  
  @js.native
  sealed trait DownloadDisabled
    extends StObject
       with EDisplayStatus
  /* 25 */ val DownloadDisabled: typings.steamUser.mod.EDisplayStatus.DownloadDisabled & Double = js.native
  
  @js.native
  sealed trait DownloadPaused
    extends StObject
       with EDisplayStatus
  /* 22 */ val DownloadPaused: typings.steamUser.mod.EDisplayStatus.DownloadPaused & Double = js.native
  
  @js.native
  sealed trait DownloadQueued
    extends StObject
       with EDisplayStatus
  /* 23 */ val DownloadQueued: typings.steamUser.mod.EDisplayStatus.DownloadQueued & Double = js.native
  
  @js.native
  sealed trait DownloadRequired
    extends StObject
       with EDisplayStatus
  /* 24 */ val DownloadRequired: typings.steamUser.mod.EDisplayStatus.DownloadRequired & Double = js.native
  
  @js.native
  sealed trait Downloading
    extends StObject
       with EDisplayStatus
  /* 7 */ val Downloading: typings.steamUser.mod.EDisplayStatus.Downloading & Double = js.native
  
  @js.native
  sealed trait Installing
    extends StObject
       with EDisplayStatus
  /* 3 */ val Installing: typings.steamUser.mod.EDisplayStatus.Installing & Double = js.native
  
  @js.native
  sealed trait Invalid
    extends StObject
       with EDisplayStatus
  /* 0 */ val Invalid: typings.steamUser.mod.EDisplayStatus.Invalid & Double = js.native
  
  @js.native
  sealed trait InvalidPlatform
    extends StObject
       with EDisplayStatus
  /* 14 */ val InvalidPlatform: typings.steamUser.mod.EDisplayStatus.InvalidPlatform & Double = js.native
  
  @js.native
  sealed trait Launching
    extends StObject
       with EDisplayStatus
  /* 1 */ val Launching: typings.steamUser.mod.EDisplayStatus.Launching & Double = js.native
  
  @js.native
  sealed trait LicenseExpired
    extends StObject
       with EDisplayStatus
  /* 27 */ val LicenseExpired: typings.steamUser.mod.EDisplayStatus.LicenseExpired & Double = js.native
  
  @js.native
  sealed trait LicensePending
    extends StObject
       with EDisplayStatus
  /* 26 */ val LicensePending: typings.steamUser.mod.EDisplayStatus.LicensePending & Double = js.native
  
  @js.native
  sealed trait ParentalBlocked
    extends StObject
       with EDisplayStatus
  /* 15 */ val ParentalBlocked: typings.steamUser.mod.EDisplayStatus.ParentalBlocked & Double = js.native
  
  @js.native
  sealed trait PreloadComplete
    extends StObject
       with EDisplayStatus
  /* 16 */ val PreloadComplete: typings.steamUser.mod.EDisplayStatus.PreloadComplete & Double = js.native
  
  @js.native
  sealed trait PreloadOnly
    extends StObject
       with EDisplayStatus
  /* 16 */ val PreloadOnly: typings.steamUser.mod.EDisplayStatus.PreloadOnly & Double = js.native
  
  @js.native
  sealed trait PresaleOnly
    extends StObject
       with EDisplayStatus
  /* 13 */ val PresaleOnly: typings.steamUser.mod.EDisplayStatus.PresaleOnly & Double = js.native
  
  @js.native
  sealed trait Purchase
    extends StObject
       with EDisplayStatus
  /* 31 */ val Purchase: typings.steamUser.mod.EDisplayStatus.Purchase & Double = js.native
  
  @js.native
  sealed trait ReadyToInstall
    extends StObject
       with EDisplayStatus
  /* 9 */ val ReadyToInstall: typings.steamUser.mod.EDisplayStatus.ReadyToInstall & Double = js.native
  
  @js.native
  sealed trait ReadyToLaunch
    extends StObject
       with EDisplayStatus
  /* 11 */ val ReadyToLaunch: typings.steamUser.mod.EDisplayStatus.ReadyToLaunch & Double = js.native
  
  @js.native
  sealed trait ReadyToPreload
    extends StObject
       with EDisplayStatus
  /* 10 */ val ReadyToPreload: typings.steamUser.mod.EDisplayStatus.ReadyToPreload & Double = js.native
  
  @js.native
  sealed trait RegionRestricted
    extends StObject
       with EDisplayStatus
  /* 12 */ val RegionRestricted: typings.steamUser.mod.EDisplayStatus.RegionRestricted & Double = js.native
  
  @js.native
  sealed trait Running
    extends StObject
       with EDisplayStatus
  /* 4 */ val Running: typings.steamUser.mod.EDisplayStatus.Running & Double = js.native
  
  @js.native
  sealed trait Synchronizing
    extends StObject
       with EDisplayStatus
  /* 8 */ val Synchronizing: typings.steamUser.mod.EDisplayStatus.Synchronizing & Double = js.native
  
  @js.native
  sealed trait Uninstalling
    extends StObject
       with EDisplayStatus
  /* 2 */ val Uninstalling: typings.steamUser.mod.EDisplayStatus.Uninstalling & Double = js.native
  
  @js.native
  sealed trait UpdateDisabled
    extends StObject
       with EDisplayStatus
  /* 21 */ val UpdateDisabled: typings.steamUser.mod.EDisplayStatus.UpdateDisabled & Double = js.native
  
  @js.native
  sealed trait UpdatePaused
    extends StObject
       with EDisplayStatus
  /* 18 */ val UpdatePaused: typings.steamUser.mod.EDisplayStatus.UpdatePaused & Double = js.native
  
  @js.native
  sealed trait UpdateQueued
    extends StObject
       with EDisplayStatus
  /* 19 */ val UpdateQueued: typings.steamUser.mod.EDisplayStatus.UpdateQueued & Double = js.native
  
  @js.native
  sealed trait UpdateRequired
    extends StObject
       with EDisplayStatus
  /* 20 */ val UpdateRequired: typings.steamUser.mod.EDisplayStatus.UpdateRequired & Double = js.native
  
  @js.native
  sealed trait Updating
    extends StObject
       with EDisplayStatus
  /* 6 */ val Updating: typings.steamUser.mod.EDisplayStatus.Updating & Double = js.native
  
  @js.native
  sealed trait Validating
    extends StObject
       with EDisplayStatus
  /* 5 */ val Validating: typings.steamUser.mod.EDisplayStatus.Validating & Double = js.native
}
