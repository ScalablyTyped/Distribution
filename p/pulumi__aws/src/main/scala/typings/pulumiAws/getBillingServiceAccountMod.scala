package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getBillingServiceAccountMod {
  
  @JSImport("@pulumi/aws/getBillingServiceAccount", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getBillingServiceAccount(): js.Promise[GetBillingServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBillingServiceAccount")().asInstanceOf[js.Promise[GetBillingServiceAccountResult]]
  @scala.inline
  def getBillingServiceAccount(opts: InvokeOptions): js.Promise[GetBillingServiceAccountResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getBillingServiceAccount")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetBillingServiceAccountResult]]
  
  trait GetBillingServiceAccountResult extends StObject {
    
    /**
      * The ARN of the AWS billing service account.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
  }
  object GetBillingServiceAccountResult {
    
    @scala.inline
    def apply(arn: String, id: String): GetBillingServiceAccountResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetBillingServiceAccountResult]
    }
    
    @scala.inline
    implicit class GetBillingServiceAccountResultMutableBuilder[Self <: GetBillingServiceAccountResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
