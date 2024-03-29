package typings.sharepoint.SP

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait FeatureDefinitionScope extends StObject
@JSGlobal("SP.FeatureDefinitionScope")
@js.native
object FeatureDefinitionScope extends StObject {
  
  @js.native
  sealed trait farm
    extends StObject
       with FeatureDefinitionScope
  
  @js.native
  sealed trait none
    extends StObject
       with FeatureDefinitionScope
  
  @js.native
  sealed trait site
    extends StObject
       with FeatureDefinitionScope
  
  @js.native
  sealed trait web
    extends StObject
       with FeatureDefinitionScope
}
