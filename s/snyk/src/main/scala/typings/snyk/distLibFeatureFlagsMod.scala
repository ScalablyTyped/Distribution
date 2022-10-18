package typings.snyk

import typings.snyk.distLibFeatureFlagsTypesMod.OrgFeatureFlagResponse
import typings.snyk.distLibTypesMod.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibFeatureFlagsMod {
  
  @JSImport("snyk/dist/lib/feature-flags", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def hasFeatureFlag(featureFlag: String, options: Options): js.Promise[js.UndefOr[Boolean]] = (^.asInstanceOf[js.Dynamic].applyDynamic("hasFeatureFlag")(featureFlag.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.UndefOr[Boolean]]]
  
  inline def isFeatureFlagSupportedForOrg(featureFlag: String, org_ : Any): js.Promise[OrgFeatureFlagResponse] = (^.asInstanceOf[js.Dynamic].applyDynamic("isFeatureFlagSupportedForOrg")(featureFlag.asInstanceOf[js.Any], org_.asInstanceOf[js.Any])).asInstanceOf[js.Promise[OrgFeatureFlagResponse]]
}
