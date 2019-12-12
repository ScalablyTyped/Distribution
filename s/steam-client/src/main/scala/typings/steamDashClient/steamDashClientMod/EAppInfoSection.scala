package typings.steamDashClient.steamDashClientMod

import org.scalablytyped.runtime.TopLevel
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.All
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Common
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Community
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Config
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.DRM
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.DRM_UNUSED
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Depots
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Extended
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.First
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Install
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Items
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.ItemsUNUSED
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Max
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.OGG
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Policies
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Stats
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Store
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.SysReqs
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.UFS
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.Unknown
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.VAC
import typings.steamDashClient.steamDashClientMod.EAppInfoSection.VAC_UNUSED
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAppInfoSection extends js.Object

@JSImport("steam-client", "EAppInfoSection")
@js.native
object EAppInfoSection extends js.Object {
  @js.native
  sealed trait All extends EAppInfoSection
  
  @js.native
  sealed trait Common extends EAppInfoSection
  
  @js.native
  sealed trait Community extends EAppInfoSection
  
  @js.native
  sealed trait Config extends EAppInfoSection
  
   // removed
  @js.native
  sealed trait DRM extends EAppInfoSection
  
   // removed
  @js.native
  sealed trait DRM_UNUSED extends EAppInfoSection
  
  @js.native
  sealed trait Depots extends EAppInfoSection
  
  @js.native
  sealed trait Extended extends EAppInfoSection
  
  @js.native
  sealed trait First extends EAppInfoSection
  
  @js.native
  sealed trait Install extends EAppInfoSection
  
   // removed
  @js.native
  sealed trait Items extends EAppInfoSection
  
   // removed
  @js.native
  sealed trait ItemsUNUSED extends EAppInfoSection
  
  @js.native
  sealed trait Max extends EAppInfoSection
  
  @js.native
  sealed trait OGG extends EAppInfoSection
  
  @js.native
  sealed trait Policies extends EAppInfoSection
  
  @js.native
  sealed trait Stats extends EAppInfoSection
  
  @js.native
  sealed trait Store extends EAppInfoSection
  
  @js.native
  sealed trait SysReqs extends EAppInfoSection
  
  @js.native
  sealed trait UFS extends EAppInfoSection
  
  @js.native
  sealed trait Unknown extends EAppInfoSection
  
   // removed
  @js.native
  sealed trait VAC extends EAppInfoSection
  
   // removed
  @js.native
  sealed trait VAC_UNUSED extends EAppInfoSection
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppInfoSection with Double] = js.native
  /* 1 */ @js.native
  object All extends TopLevel[All with Double]
  
  /* 2 */ @js.native
  object Common extends TopLevel[Common with Double]
  
  /* 15 */ @js.native
  object Community extends TopLevel[Community with Double]
  
  /* 4 */ @js.native
  object Config extends TopLevel[Config with Double]
  
  /* 9 */ @js.native
  object DRM extends TopLevel[DRM with Double]
  
  /* 9 */ @js.native
  object DRM_UNUSED extends TopLevel[DRM_UNUSED with Double]
  
  /* 7 */ @js.native
  object Depots extends TopLevel[Depots with Double]
  
  /* 3 */ @js.native
  object Extended extends TopLevel[Extended with Double]
  
  /* 2 */ @js.native
  object First extends TopLevel[First with Double]
  
  /* 6 */ @js.native
  object Install extends TopLevel[Install with Double]
  
  /* 12 */ @js.native
  object Items extends TopLevel[Items with Double]
  
  /* 12 */ @js.native
  object ItemsUNUSED extends TopLevel[ItemsUNUSED with Double]
  
  /* 17 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  /* 11 */ @js.native
  object OGG extends TopLevel[OGG with Double]
  
  /* 13 */ @js.native
  object Policies extends TopLevel[Policies with Double]
  
  /* 5 */ @js.native
  object Stats extends TopLevel[Stats with Double]
  
  /* 16 */ @js.native
  object Store extends TopLevel[Store with Double]
  
  /* 14 */ @js.native
  object SysReqs extends TopLevel[SysReqs with Double]
  
  /* 10 */ @js.native
  object UFS extends TopLevel[UFS with Double]
  
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
  /* 8 */ @js.native
  object VAC extends TopLevel[VAC with Double]
  
  /* 8 */ @js.native
  object VAC_UNUSED extends TopLevel[VAC_UNUSED with Double]
  
}

