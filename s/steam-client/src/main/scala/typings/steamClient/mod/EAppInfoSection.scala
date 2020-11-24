package typings.steamClient.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EAppInfoSection extends js.Object
@JSImport("steam-client", "EAppInfoSection")
@js.native
object EAppInfoSection extends js.Object {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[EAppInfoSection with Double] = js.native
  
  @js.native
  sealed trait All extends EAppInfoSection
  /* 1 */ @js.native
  object All extends TopLevel[All with Double]
  
  @js.native
  sealed trait Common extends EAppInfoSection
  /* 2 */ @js.native
  object Common extends TopLevel[Common with Double]
  
  @js.native
  sealed trait Community extends EAppInfoSection
  /* 15 */ @js.native
  object Community extends TopLevel[Community with Double]
  
  @js.native
  sealed trait Config extends EAppInfoSection
  /* 4 */ @js.native
  object Config extends TopLevel[Config with Double]
  
   // removed
  @js.native
  sealed trait DRM extends EAppInfoSection
  /* 9 */ @js.native
  object DRM extends TopLevel[DRM with Double]
  
   // removed
  @js.native
  sealed trait DRM_UNUSED extends EAppInfoSection
  /* 9 */ @js.native
  object DRM_UNUSED extends TopLevel[DRM_UNUSED with Double]
  
  @js.native
  sealed trait Depots extends EAppInfoSection
  /* 7 */ @js.native
  object Depots extends TopLevel[Depots with Double]
  
  @js.native
  sealed trait Extended extends EAppInfoSection
  /* 3 */ @js.native
  object Extended extends TopLevel[Extended with Double]
  
  @js.native
  sealed trait First extends EAppInfoSection
  /* 2 */ @js.native
  object First extends TopLevel[First with Double]
  
  @js.native
  sealed trait Install extends EAppInfoSection
  /* 6 */ @js.native
  object Install extends TopLevel[Install with Double]
  
   // removed
  @js.native
  sealed trait Items extends EAppInfoSection
  /* 12 */ @js.native
  object Items extends TopLevel[Items with Double]
  
   // removed
  @js.native
  sealed trait ItemsUNUSED extends EAppInfoSection
  /* 12 */ @js.native
  object ItemsUNUSED extends TopLevel[ItemsUNUSED with Double]
  
  @js.native
  sealed trait Max extends EAppInfoSection
  /* 17 */ @js.native
  object Max extends TopLevel[Max with Double]
  
  @js.native
  sealed trait OGG extends EAppInfoSection
  /* 11 */ @js.native
  object OGG extends TopLevel[OGG with Double]
  
  @js.native
  sealed trait Policies extends EAppInfoSection
  /* 13 */ @js.native
  object Policies extends TopLevel[Policies with Double]
  
  @js.native
  sealed trait Stats extends EAppInfoSection
  /* 5 */ @js.native
  object Stats extends TopLevel[Stats with Double]
  
  @js.native
  sealed trait Store extends EAppInfoSection
  /* 16 */ @js.native
  object Store extends TopLevel[Store with Double]
  
  @js.native
  sealed trait SysReqs extends EAppInfoSection
  /* 14 */ @js.native
  object SysReqs extends TopLevel[SysReqs with Double]
  
  @js.native
  sealed trait UFS extends EAppInfoSection
  /* 10 */ @js.native
  object UFS extends TopLevel[UFS with Double]
  
  @js.native
  sealed trait Unknown extends EAppInfoSection
  /* 0 */ @js.native
  object Unknown extends TopLevel[Unknown with Double]
  
   // removed
  @js.native
  sealed trait VAC extends EAppInfoSection
  /* 8 */ @js.native
  object VAC extends TopLevel[VAC with Double]
  
   // removed
  @js.native
  sealed trait VAC_UNUSED extends EAppInfoSection
  /* 8 */ @js.native
  object VAC_UNUSED extends TopLevel[VAC_UNUSED with Double]
}
