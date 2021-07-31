package typings.pulumiAws

import typings.pulumiAws.outputMod.wafv2.GetRegexPatternSetRegularExpression
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getRegexPatternSetMod {
  
  @JSImport("@pulumi/aws/wafv2/getRegexPatternSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getRegexPatternSet(args: GetRegexPatternSetArgs): js.Promise[GetRegexPatternSetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getRegexPatternSet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetRegexPatternSetResult]]
  @scala.inline
  def getRegexPatternSet(args: GetRegexPatternSetArgs, opts: InvokeOptions): js.Promise[GetRegexPatternSetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getRegexPatternSet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetRegexPatternSetResult]]
  
  trait GetRegexPatternSetArgs extends StObject {
    
    /**
      * The name of the WAFv2 Regex Pattern Set.
      */
    val name: String
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: String
  }
  object GetRegexPatternSetArgs {
    
    @scala.inline
    def apply(name: String, scope: String): GetRegexPatternSetArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRegexPatternSetArgs]
    }
    
    @scala.inline
    implicit class GetRegexPatternSetArgsMutableBuilder[Self <: GetRegexPatternSetArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetRegexPatternSetResult extends StObject {
    
    /**
      * The Amazon Resource Name (ARN) of the entity.
      */
    val arn: String
    
    /**
      * The description of the set that helps with identification.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * One or more blocks of regular expression patterns that AWS WAF is searching for. See Regular Expression below for details.
      */
    val regularExpressions: js.Array[GetRegexPatternSetRegularExpression]
    
    val scope: String
  }
  object GetRegexPatternSetResult {
    
    @scala.inline
    def apply(
      arn: String,
      description: String,
      id: String,
      name: String,
      regularExpressions: js.Array[GetRegexPatternSetRegularExpression],
      scope: String
    ): GetRegexPatternSetResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], regularExpressions = regularExpressions.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetRegexPatternSetResult]
    }
    
    @scala.inline
    implicit class GetRegexPatternSetResultMutableBuilder[Self <: GetRegexPatternSetResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegularExpressions(value: js.Array[GetRegexPatternSetRegularExpression]): Self = StObject.set(x, "regularExpressions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegularExpressionsVarargs(value: GetRegexPatternSetRegularExpression*): Self = StObject.set(x, "regularExpressions", js.Array(value :_*))
      
      @scala.inline
      def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
