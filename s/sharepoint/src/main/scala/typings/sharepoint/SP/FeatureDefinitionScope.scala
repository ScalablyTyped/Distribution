package typings.sharepoint.SP

import org.scalablytyped.runtime.TopLevel
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
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[FeatureDefinitionScope with Double] = js.native
  /* 1 */ @js.native
  object farm extends TopLevel[farm with Double]
  
  /* 0 */ @js.native
  object none extends TopLevel[none with Double]
  
  /* 2 */ @js.native
  object site extends TopLevel[site with Double]
  
  /* 3 */ @js.native
  object web extends TopLevel[web with Double]
  
}

