package typings.sharepoint.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FeatureDefinitionScope extends js.Object

@JSGlobal("SP.FeatureDefinitionScope")
@js.native
object FeatureDefinitionScope extends js.Object {
  @js.native
  sealed trait farm extends FeatureDefinitionScope
  
  @js.native
  sealed trait none extends FeatureDefinitionScope
  
  @js.native
  sealed trait site extends FeatureDefinitionScope
  
  @js.native
  sealed trait web extends FeatureDefinitionScope
  
  /* 1 */ val farm: typings.sharepoint.SPNs.FeatureDefinitionScope.farm with Double = js.native
  /* 0 */ val none: typings.sharepoint.SPNs.FeatureDefinitionScope.none with Double = js.native
  /* 2 */ val site: typings.sharepoint.SPNs.FeatureDefinitionScope.site with Double = js.native
  /* 3 */ val web: typings.sharepoint.SPNs.FeatureDefinitionScope.web with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FeatureDefinitionScope with Double] = js.native
}

