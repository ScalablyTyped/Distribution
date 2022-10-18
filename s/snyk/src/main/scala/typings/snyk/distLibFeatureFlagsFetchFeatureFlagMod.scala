package typings.snyk

import typings.snyk.distLibFeatureFlagsTypesMod.OrgFeatureFlagResponse
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFeatureFlagsFetchFeatureFlagMod {
  
  @JSImport("snyk/dist/lib/feature-flags/fetchFeatureFlag", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fetchFeatureFlag(featureFlag: String, org_ : Any): js.Promise[OrgFeatureFlagResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetchFeatureFlag")(featureFlag.asInstanceOf[js.Any], org_.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OrgFeatureFlagResponse]]
}
