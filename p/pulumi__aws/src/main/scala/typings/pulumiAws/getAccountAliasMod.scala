package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAccountAliasMod {
  
  @JSImport("@pulumi/aws/iam/getAccountAlias", "getAccountAlias")
  @js.native
  def getAccountAlias(): js.Promise[GetAccountAliasResult] = js.native
  @JSImport("@pulumi/aws/iam/getAccountAlias", "getAccountAlias")
  @js.native
  def getAccountAlias(opts: InvokeOptions): js.Promise[GetAccountAliasResult] = js.native
  
  @js.native
  trait GetAccountAliasResult extends StObject {
    
    /**
      * The alias associated with the AWS account.
      */
    val accountAlias: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
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
