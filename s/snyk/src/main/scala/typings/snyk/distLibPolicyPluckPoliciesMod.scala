package typings.snyk

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibPolicyPluckPoliciesMod {
  
  @JSImport("snyk/dist/lib/policy/pluck-policies", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def pluckPolicies(
    pkg: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify PackageExpanded */ Any
  ): js.Array[String] | String = ^.asInstanceOf[js.Dynamic].applyDynamic("pluckPolicies")(pkg.asInstanceOf[js.Any]).asInstanceOf[js.Array[String] | String]
}
