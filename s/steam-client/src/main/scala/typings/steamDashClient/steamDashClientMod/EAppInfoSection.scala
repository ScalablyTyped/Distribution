package typings.steamDashClient.steamDashClientMod

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
  
  /* 1 */ val All: typings.steamDashClient.steamDashClientMod.EAppInfoSection.All with Double = js.native
  /* 2 */ val Common: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Common with Double = js.native
  /* 15 */ val Community: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Community with Double = js.native
  /* 4 */ val Config: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Config with Double = js.native
  /* 9 */ val DRM: typings.steamDashClient.steamDashClientMod.EAppInfoSection.DRM with Double = js.native
  /* 9 */ val DRM_UNUSED: typings.steamDashClient.steamDashClientMod.EAppInfoSection.DRM_UNUSED with Double = js.native
  /* 7 */ val Depots: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Depots with Double = js.native
  /* 3 */ val Extended: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Extended with Double = js.native
  /* 2 */ val First: typings.steamDashClient.steamDashClientMod.EAppInfoSection.First with Double = js.native
  /* 6 */ val Install: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Install with Double = js.native
  /* 12 */ val Items: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Items with Double = js.native
  /* 12 */ val ItemsUNUSED: typings.steamDashClient.steamDashClientMod.EAppInfoSection.ItemsUNUSED with Double = js.native
  /* 17 */ val Max: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Max with Double = js.native
  /* 11 */ val OGG: typings.steamDashClient.steamDashClientMod.EAppInfoSection.OGG with Double = js.native
  /* 13 */ val Policies: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Policies with Double = js.native
  /* 5 */ val Stats: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Stats with Double = js.native
  /* 16 */ val Store: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Store with Double = js.native
  /* 14 */ val SysReqs: typings.steamDashClient.steamDashClientMod.EAppInfoSection.SysReqs with Double = js.native
  /* 10 */ val UFS: typings.steamDashClient.steamDashClientMod.EAppInfoSection.UFS with Double = js.native
  /* 0 */ val Unknown: typings.steamDashClient.steamDashClientMod.EAppInfoSection.Unknown with Double = js.native
  /* 8 */ val VAC: typings.steamDashClient.steamDashClientMod.EAppInfoSection.VAC with Double = js.native
  /* 8 */ val VAC_UNUSED: typings.steamDashClient.steamDashClientMod.EAppInfoSection.VAC_UNUSED with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppInfoSection with Double] = js.native
}

