package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticloadbalancingGetServiceAccountMod {
  
  @JSImport("@pulumi/aws/elasticloadbalancing/getServiceAccount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getServiceAccount(): js.Promise[GetServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")().asInstanceOf[js.Promise[GetServiceAccountResult]]
  @scala.inline
  def getServiceAccount(args: Unit, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceAccountResult]]
  @scala.inline
  def getServiceAccount(args: GetServiceAccountArgs): js.Promise[GetServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServiceAccountResult]]
  @scala.inline
  def getServiceAccount(args: GetServiceAccountArgs, opts: InvokeOptions): js.Promise[GetServiceAccountResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceAccount")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceAccountResult]]
  
  trait GetServiceAccountArgs extends StObject {
    
    /**
      * Name of the region whose AWS ELB account ID is desired.
      * Defaults to the region from the AWS provider configuration.
      */
    val region: js.UndefOr[String] = js.undefined
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
  
  trait GetServiceAccountResult extends StObject {
    
    /**
      * The ARN of the AWS ELB service account in the selected region.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val region: js.UndefOr[String] = js.undefined
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
