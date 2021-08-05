package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRuleGroupMod {
  
  @JSImport("@pulumi/aws/wafv2/getRuleGroup", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getRuleGroup(args: GetRuleGroupArgs): js.Promise[GetRuleGroupResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRuleGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRuleGroupResult]]
  inline def getRuleGroup(args: GetRuleGroupArgs, opts: InvokeOptions): js.Promise[GetRuleGroupResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRuleGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRuleGroupResult]]
  
  trait GetRuleGroupArgs extends StObject {
    
    /**
      * The name of the WAFv2 Rule Group.
      */
    val name: String
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: String
  }
  object GetRuleGroupArgs {
    
    inline def apply(name: String, scope: String): GetRuleGroupArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRuleGroupArgs]
    }
    
    extension [Self <: GetRuleGroupArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRuleGroupResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the entity.
      */
    val arn: String
    
    /**
      * The description of the rule group that helps with identification.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    val scope: String
  }
  object GetRuleGroupResult {
    
    inline def apply(arn: String, description: String, id: String, name: String, scope: String): GetRuleGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRuleGroupResult]
    }
    
    extension [Self <: GetRuleGroupResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
