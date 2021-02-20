package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancingGetServiceAccountMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/getServiceAccount", "getServiceAccount")
  @js.native
  def getServiceAccount(): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/elasticloadbalancing/getServiceAccount", "getServiceAccount")
  @js.native
  def getServiceAccount(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/elasticloadbalancing/getServiceAccount", "getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = js.native
  @JSImport("@pulumi/aws/elasticloadbalancing/getServiceAccount", "getServiceAccount")
  @js.native
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = js.native
  
  @js.native
  trait GetServiceAccountArgs extends StObject {
    
    /**
      * Name of the region whose AWS ELB account ID is desired.
      * Defaults to the region from the AWS provider configuration.
      */
    val region: js.UndefOr[String] = js.native
  }
  object GetServiceAccountArgs {
    
    @scala.inline
    def apply(): GetServiceAccountArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetServiceAccountArgs]
    }
    
    @scala.inline
    implicit class GetServiceAccountArgsMutableBuilder[Self <: GetServiceAccountArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
  
  @js.native
  trait GetServiceAccountResult extends StObject {
    
    /**
      * The ARN of the AWS ELB service account in the selected region.
      */
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val region: js.UndefOr[String] = js.native
  }
  object GetServiceAccountResult {
    
    @scala.inline
    def apply(arn: String, id: String): GetServiceAccountResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceAccountResult]
    }
    
    @scala.inline
    implicit class GetServiceAccountResultMutableBuilder[Self <: GetServiceAccountResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionUndefined: Self = StObject.set(x, "region", js.undefined)
    }
  }
}
