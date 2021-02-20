package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getOutpostInstanceTypesMod {
  
  @JSImport("@pulumi/aws/outposts/getOutpostInstanceTypes", "getOutpostInstanceTypes")
  @js.native
  def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs): js.Promise[GetOutpostInstanceTypesResult] = js.native
  @JSImport("@pulumi/aws/outposts/getOutpostInstanceTypes", "getOutpostInstanceTypes")
  @js.native
  def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypesResult] = js.native
  
  @js.native
  trait GetOutpostInstanceTypesArgs extends StObject {
    
    /**
      * Outpost Amazon Resource Name (ARN).
      */
    val arn: String = js.native
  }
  object GetOutpostInstanceTypesArgs {
    
    @scala.inline
    def apply(arn: String): GetOutpostInstanceTypesArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostInstanceTypesArgs]
    }
    
    @scala.inline
    implicit class GetOutpostInstanceTypesArgsMutableBuilder[Self <: GetOutpostInstanceTypesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetOutpostInstanceTypesResult extends StObject {
    
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Set of instance types.
      */
    val instanceTypes: js.Array[String] = js.native
  }
  object GetOutpostInstanceTypesResult {
    
    @scala.inline
    def apply(arn: String, id: String, instanceTypes: js.Array[String]): GetOutpostInstanceTypesResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], instanceTypes = instanceTypes.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetOutpostInstanceTypesResult]
    }
    
    @scala.inline
    implicit class GetOutpostInstanceTypesResultMutableBuilder[Self <: GetOutpostInstanceTypesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypes(value: js.Array[String]): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypesVarargs(value: String*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
    }
  }
}
