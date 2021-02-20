package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOutpostInstanceTypeMod {
  
  @JSImport("@pulumi/aws/outposts/getOutpostInstanceType", "getOutpostInstanceType")
  @js.native
  def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs): js.Promise[GetOutpostInstanceTypeResult] = js.native
  @JSImport("@pulumi/aws/outposts/getOutpostInstanceType", "getOutpostInstanceType")
  @js.native
  def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypeResult] = js.native
  
  @js.native
  trait GetOutpostInstanceTypeArgs extends StObject {
    
    /**
      * Outpost Amazon Resource Name (ARN).
      */
    val arn: String = js.native
    
    /**
      * Desired instance type. Conflicts with `preferredInstanceTypes`.
      */
    val instanceType: js.UndefOr[String] = js.native
    
    /**
      * Ordered list of preferred instance types. The first match in this list will be returned. If no preferred matches are found and the original search returned more than one result, an error is returned. Conflicts with `instanceType`.
      */
    val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object GetOutpostInstanceTypeArgs {
    
    @scala.inline
    def apply(arn: String): GetOutpostInstanceTypeArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostInstanceTypeArgs]
    }
    
    @scala.inline
    implicit class GetOutpostInstanceTypeArgsMutableBuilder[Self <: GetOutpostInstanceTypeArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      @scala.inline
      def setPreferredInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceTypesUndefined: Self = StObject.set(x, "preferredInstanceTypes", js.undefined)
      
      @scala.inline
      def setPreferredInstanceTypesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetOutpostInstanceTypeResult extends StObject {
    
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val instanceType: String = js.native
    
    val preferredInstanceTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object GetOutpostInstanceTypeResult {
    
    @scala.inline
    def apply(arn: String, id: String, instanceType: String): GetOutpostInstanceTypeResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceType = instanceType.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostInstanceTypeResult]
    }
    
    @scala.inline
    implicit class GetOutpostInstanceTypeResultMutableBuilder[Self <: GetOutpostInstanceTypeResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceType(value: String): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "preferredInstanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreferredInstanceTypesUndefined: Self = StObject.set(x, "preferredInstanceTypes", js.undefined)
      
      @scala.inline
      def setPreferredInstanceTypesVarargs(value: String*): Self = StObject.set(x, "preferredInstanceTypes", js.Array(value :_*))
    }
  }
}
