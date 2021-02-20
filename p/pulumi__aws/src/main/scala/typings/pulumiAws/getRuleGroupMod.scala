package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRuleGroupMod {
  
  @JSImport("@pulumi/aws/wafv2/getRuleGroup", "getRuleGroup")
  @js.native
  def getRuleGroup(args: GetRuleGroupArgs): js.Promise[GetRuleGroupResult] = js.native
  @JSImport("@pulumi/aws/wafv2/getRuleGroup", "getRuleGroup")
  @js.native
  def getRuleGroup(args: GetRuleGroupArgs, opts: InvokeOptions): js.Promise[GetRuleGroupResult] = js.native
  
  @js.native
  trait GetRuleGroupArgs extends StObject {
    
    /**
      * The name of the WAFv2 Rule Group.
      */
    val name: String = js.native
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: String = js.native
  }
  object GetRuleGroupArgs {
    
    @scala.inline
    def apply(name: String, scope: String): GetRuleGroupArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRuleGroupArgs]
    }
    
    @scala.inline
    implicit class GetRuleGroupArgsMutableBuilder[Self <: GetRuleGroupArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetRuleGroupResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the entity.
      */
    val arn: String = js.native
    
    /**
      * The description of the rule group that helps with identification.
      */
    val description: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    val scope: String = js.native
  }
  object GetRuleGroupResult {
    
    @scala.inline
    def apply(arn: String, description: String, id: String, name: String, scope: String): GetRuleGroupResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRuleGroupResult]
    }
    
    @scala.inline
    implicit class GetRuleGroupResultMutableBuilder[Self <: GetRuleGroupResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
