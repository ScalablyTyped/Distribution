package typings.steamClient.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppInfoSection extends StObject
@JSImport("steam-client", "EAppInfoSection")
@js.native
object EAppInfoSection extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppInfoSection & Double] = js.native
  
  @js.native
  sealed trait All
    extends StObject
       with EAppInfoSection
  /* 1 */ val All: typings.steamClient.mod.EAppInfoSection.All & Double = js.native
  
  @js.native
  sealed trait Common
    extends StObject
       with EAppInfoSection
  /* 2 */ val Common: typings.steamClient.mod.EAppInfoSection.Common & Double = js.native
  
  @js.native
  sealed trait Community
    extends StObject
       with EAppInfoSection
  /* 15 */ val Community: typings.steamClient.mod.EAppInfoSection.Community & Double = js.native
  
  @js.native
  sealed trait Config
    extends StObject
       with EAppInfoSection
  /* 4 */ val Config: typings.steamClient.mod.EAppInfoSection.Config & Double = js.native
  
  // removed
  @js.native
  sealed trait DRM
    extends StObject
       with EAppInfoSection
  /* 9 */ val DRM: typings.steamClient.mod.EAppInfoSection.DRM & Double = js.native
  
  // removed
  @js.native
  sealed trait DRM_UNUSED
    extends StObject
       with EAppInfoSection
  /* 9 */ val DRM_UNUSED: typings.steamClient.mod.EAppInfoSection.DRM_UNUSED & Double = js.native
  
  @js.native
  sealed trait Depots
    extends StObject
       with EAppInfoSection
  /* 7 */ val Depots: typings.steamClient.mod.EAppInfoSection.Depots & Double = js.native
  
  @js.native
  sealed trait Extended
    extends StObject
       with EAppInfoSection
  /* 3 */ val Extended: typings.steamClient.mod.EAppInfoSection.Extended & Double = js.native
  
  @js.native
  sealed trait First
    extends StObject
       with EAppInfoSection
  /* 2 */ val First: typings.steamClient.mod.EAppInfoSection.First & Double = js.native
  
  @js.native
  sealed trait Install
    extends StObject
       with EAppInfoSection
  /* 6 */ val Install: typings.steamClient.mod.EAppInfoSection.Install & Double = js.native
  
  @js.native
  sealed trait Items
    extends StObject
       with EAppInfoSection
  /* 12 */ val Items: typings.steamClient.mod.EAppInfoSection.Items & Double = js.native
  
  // removed
  @js.native
  sealed trait ItemsUNUSED
    extends StObject
       with EAppInfoSection
  /* 12 */ val ItemsUNUSED: typings.steamClient.mod.EAppInfoSection.ItemsUNUSED & Double = js.native
  
  @js.native
  sealed trait Max
    extends StObject
       with EAppInfoSection
  /* 17 */ val Max: typings.steamClient.mod.EAppInfoSection.Max & Double = js.native
  
  @js.native
  sealed trait OGG
    extends StObject
       with EAppInfoSection
  /* 11 */ val OGG: typings.steamClient.mod.EAppInfoSection.OGG & Double = js.native
  
  // removed
  @js.native
  sealed trait Policies
    extends StObject
       with EAppInfoSection
  /* 13 */ val Policies: typings.steamClient.mod.EAppInfoSection.Policies & Double = js.native
  
  @js.native
  sealed trait Stats
    extends StObject
       with EAppInfoSection
  /* 5 */ val Stats: typings.steamClient.mod.EAppInfoSection.Stats & Double = js.native
  
  @js.native
  sealed trait Store
    extends StObject
       with EAppInfoSection
  /* 16 */ val Store: typings.steamClient.mod.EAppInfoSection.Store & Double = js.native
  
  @js.native
  sealed trait SysReqs
    extends StObject
       with EAppInfoSection
  /* 14 */ val SysReqs: typings.steamClient.mod.EAppInfoSection.SysReqs & Double = js.native
  
  // removed
  @js.native
  sealed trait UFS
    extends StObject
       with EAppInfoSection
  /* 10 */ val UFS: typings.steamClient.mod.EAppInfoSection.UFS & Double = js.native
  
  @js.native
  sealed trait Unknown
    extends StObject
       with EAppInfoSection
  /* 0 */ val Unknown: typings.steamClient.mod.EAppInfoSection.Unknown & Double = js.native
  
  @js.native
  sealed trait VAC
    extends StObject
       with EAppInfoSection
  /* 8 */ val VAC: typings.steamClient.mod.EAppInfoSection.VAC & Double = js.native
  
  // removed
  @js.native
  sealed trait VAC_UNUSED
    extends StObject
       with EAppInfoSection
  /* 8 */ val VAC_UNUSED: typings.steamClient.mod.EAppInfoSection.VAC_UNUSED & Double = js.native
}
