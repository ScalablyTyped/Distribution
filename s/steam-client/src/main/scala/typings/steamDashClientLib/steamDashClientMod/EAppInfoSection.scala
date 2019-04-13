package typings
package steamDashClientLib.steamDashClientMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait EAppInfoSection extends js.Object

@JSImport("steam-client", "EAppInfoSection")
@js.native
object EAppInfoSection extends js.Object {
  @js.native
  sealed trait All
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Common
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Community
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Config
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
   // removed
  @js.native
  sealed trait DRM
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
   // removed
  @js.native
  sealed trait DRM_UNUSED
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Depots
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Extended
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait First
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Install
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
   // removed
  @js.native
  sealed trait Items
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
   // removed
  @js.native
  sealed trait ItemsUNUSED
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Max
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait OGG
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Policies
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Stats
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Store
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait SysReqs
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait UFS
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  @js.native
  sealed trait Unknown
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
   // removed
  @js.native
  sealed trait VAC
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
   // removed
  @js.native
  sealed trait VAC_UNUSED
    extends steamDashClientLib.steamDashClientMod.EAppInfoSection
  
  /* 1 */ val All: All with scala.Double = js.native
  /* 2 */ val Common: Common with scala.Double = js.native
  /* 15 */ val Community: Community with scala.Double = js.native
  /* 4 */ val Config: Config with scala.Double = js.native
  /* 9 */ val DRM: DRM with scala.Double = js.native
  /* 9 */ val DRM_UNUSED: DRM_UNUSED with scala.Double = js.native
  /* 7 */ val Depots: Depots with scala.Double = js.native
  /* 3 */ val Extended: Extended with scala.Double = js.native
  /* 2 */ val First: First with scala.Double = js.native
  /* 6 */ val Install: Install with scala.Double = js.native
  /* 12 */ val Items: Items with scala.Double = js.native
  /* 12 */ val ItemsUNUSED: ItemsUNUSED with scala.Double = js.native
  /* 17 */ val Max: Max with scala.Double = js.native
  /* 11 */ val OGG: OGG with scala.Double = js.native
  /* 13 */ val Policies: Policies with scala.Double = js.native
  /* 5 */ val Stats: Stats with scala.Double = js.native
  /* 16 */ val Store: Store with scala.Double = js.native
  /* 14 */ val SysReqs: SysReqs with scala.Double = js.native
  /* 10 */ val UFS: UFS with scala.Double = js.native
  /* 0 */ val Unknown: Unknown with scala.Double = js.native
  /* 8 */ val VAC: VAC with scala.Double = js.native
  /* 8 */ val VAC_UNUSED: VAC_UNUSED with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[steamDashClientLib.steamDashClientMod.EAppInfoSection with scala.Double] = js.native
}

