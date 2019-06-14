package typings
package sharepointLib.SPNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FeatureDefinitionScope extends js.Object

@JSGlobal("SP.FeatureDefinitionScope")
@js.native
object FeatureDefinitionScope extends js.Object {
  @js.native
  sealed trait farm
    extends sharepointLib.SPNs.FeatureDefinitionScope
  
  @js.native
  sealed trait none
    extends sharepointLib.SPNs.FeatureDefinitionScope
  
  @js.native
  sealed trait site
    extends sharepointLib.SPNs.FeatureDefinitionScope
  
  @js.native
  sealed trait web
    extends sharepointLib.SPNs.FeatureDefinitionScope
  
  /* 1 */ val farm: farm with scala.Double = js.native
  /* 0 */ val none: none with scala.Double = js.native
  /* 2 */ val site: site with scala.Double = js.native
  /* 3 */ val web: web with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[sharepointLib.SPNs.FeatureDefinitionScope with scala.Double] = js.native
}

