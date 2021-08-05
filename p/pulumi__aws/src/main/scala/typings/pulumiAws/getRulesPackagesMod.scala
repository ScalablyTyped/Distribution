package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRulesPackagesMod {
  
  @JSImport("@pulumi/aws/inspector/getRulesPackages", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRulesPackages(): js.Promise[GetRulesPackagesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesPackages")().asInstanceOf[js.Promise[GetRulesPackagesResult]]
  inline def getRulesPackages(opts: InvokeOptions): js.Promise[GetRulesPackagesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRulesPackages")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRulesPackagesResult]]
  
  trait GetRulesPackagesResult extends StObject {
    
    /**
      * A list of the AWS Inspector Rules Packages arns available in the AWS region.
      */
    val arns: js.Array[String]
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
  }
  object GetRulesPackagesResult {
    
    inline def apply(arns: js.Array[String], id: String): GetRulesPackagesResult = {
      val __obj = js.Dynamic.literal(arns = arns.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRulesPackagesResult]
    }
    
    extension [Self <: GetRulesPackagesResult](x: Self) {
      
      inline def setArns(value: js.Array[String]): Self = StObject.set(x, "arns", value.asInstanceOf[js.Any])
      
      inline def setArnsVarargs(value: String*): Self = StObject.set(x, "arns", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
