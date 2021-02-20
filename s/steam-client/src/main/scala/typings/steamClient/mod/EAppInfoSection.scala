package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppInfoSection extends StObject
@JSImport("steam-client", "EAppInfoSection")
@js.native
object EAppInfoSection extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppInfoSection with Double] = js.native
  
  @js.native
  sealed trait All extends EAppInfoSection
  /* 1 */ val All: typings.steamClient.mod.EAppInfoSection.All with Double = js.native
  
  @js.native
  sealed trait Common extends EAppInfoSection
  /* 2 */ val Common: typings.steamClient.mod.EAppInfoSection.Common with Double = js.native
  
  @js.native
  sealed trait Community extends EAppInfoSection
  /* 15 */ val Community: typings.steamClient.mod.EAppInfoSection.Community with Double = js.native
  
  @js.native
  sealed trait Config extends EAppInfoSection
  /* 4 */ val Config: typings.steamClient.mod.EAppInfoSection.Config with Double = js.native
  
  // removed
  @js.native
  sealed trait DRM extends EAppInfoSection
  /* 9 */ val DRM: typings.steamClient.mod.EAppInfoSection.DRM with Double = js.native
  
  // removed
  @js.native
  sealed trait DRM_UNUSED extends EAppInfoSection
  /* 9 */ val DRM_UNUSED: typings.steamClient.mod.EAppInfoSection.DRM_UNUSED with Double = js.native
  
  @js.native
  sealed trait Depots extends EAppInfoSection
  /* 7 */ val Depots: typings.steamClient.mod.EAppInfoSection.Depots with Double = js.native
  
  @js.native
  sealed trait Extended extends EAppInfoSection
  /* 3 */ val Extended: typings.steamClient.mod.EAppInfoSection.Extended with Double = js.native
  
  @js.native
  sealed trait First extends EAppInfoSection
  /* 2 */ val First: typings.steamClient.mod.EAppInfoSection.First with Double = js.native
  
  @js.native
  sealed trait Install extends EAppInfoSection
  /* 6 */ val Install: typings.steamClient.mod.EAppInfoSection.Install with Double = js.native
  
  @js.native
  sealed trait Items extends EAppInfoSection
  /* 12 */ val Items: typings.steamClient.mod.EAppInfoSection.Items with Double = js.native
  
  // removed
  @js.native
  sealed trait ItemsUNUSED extends EAppInfoSection
  /* 12 */ val ItemsUNUSED: typings.steamClient.mod.EAppInfoSection.ItemsUNUSED with Double = js.native
  
  @js.native
  sealed trait Max extends EAppInfoSection
  /* 17 */ val Max: typings.steamClient.mod.EAppInfoSection.Max with Double = js.native
  
  @js.native
  sealed trait OGG extends EAppInfoSection
  /* 11 */ val OGG: typings.steamClient.mod.EAppInfoSection.OGG with Double = js.native
  
  // removed
  @js.native
  sealed trait Policies extends EAppInfoSection
  /* 13 */ val Policies: typings.steamClient.mod.EAppInfoSection.Policies with Double = js.native
  
  @js.native
  sealed trait Stats extends EAppInfoSection
  /* 5 */ val Stats: typings.steamClient.mod.EAppInfoSection.Stats with Double = js.native
  
  @js.native
  sealed trait Store extends EAppInfoSection
  /* 16 */ val Store: typings.steamClient.mod.EAppInfoSection.Store with Double = js.native
  
  @js.native
  sealed trait SysReqs extends EAppInfoSection
  /* 14 */ val SysReqs: typings.steamClient.mod.EAppInfoSection.SysReqs with Double = js.native
  
  // removed
  @js.native
  sealed trait UFS extends EAppInfoSection
  /* 10 */ val UFS: typings.steamClient.mod.EAppInfoSection.UFS with Double = js.native
  
  @js.native
  sealed trait Unknown extends EAppInfoSection
  /* 0 */ val Unknown: typings.steamClient.mod.EAppInfoSection.Unknown with Double = js.native
  
  @js.native
  sealed trait VAC extends EAppInfoSection
  /* 8 */ val VAC: typings.steamClient.mod.EAppInfoSection.VAC with Double = js.native
  
  // removed
  @js.native
  sealed trait VAC_UNUSED extends EAppInfoSection
  /* 8 */ val VAC_UNUSED: typings.steamClient.mod.EAppInfoSection.VAC_UNUSED with Double = js.native
}
