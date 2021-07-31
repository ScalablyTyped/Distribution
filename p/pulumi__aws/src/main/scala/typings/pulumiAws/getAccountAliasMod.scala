package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccountAliasMod {
  
  @JSImport("@pulumi/aws/iam/getAccountAlias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAccountAlias(): js.Promise[GetAccountAliasResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountAlias")().asInstanceOf[js.Promise[GetAccountAliasResult]]
  @scala.inline
  def getAccountAlias(opts: InvokeOptions): js.Promise[GetAccountAliasResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAccountAlias")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAccountAliasResult]]
  
  trait GetAccountAliasResult extends StObject {
    
    /**
      * The alias associated with the AWS account.
      */
    val accountAlias: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
  }
  object GetAccountAliasResult {
    
    @scala.inline
    def apply(accountAlias: String, id: String): GetAccountAliasResult = {
      val __obj = js.Dynamic.literal(accountAlias = accountAlias.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAccountAliasResult]
    }
    
    @scala.inline
    implicit class GetAccountAliasResultMutableBuilder[Self <: GetAccountAliasResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountAlias(value: String): Self = StObject.set(x, "accountAlias", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
}
