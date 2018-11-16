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
  
  val farm: farm with java.lang.String = js.native
  val none: none with java.lang.String = js.native
  val site: site with java.lang.String = js.native
  val web: web with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[sharepointLib.SPNs.FeatureDefinitionScope with java.lang.String] = js.native
}

