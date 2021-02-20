package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAliasMod {
  
  @JSImport("@pulumi/aws/kms/getAlias", "getAlias")
  @js.native
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = js.native
  @JSImport("@pulumi/aws/kms/getAlias", "getAlias")
  @js.native
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = js.native
  
  @js.native
  trait GetAliasArgs extends StObject {
    
    /**
      * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
      */
    val name: String = js.native
  }
  object GetAliasArgs {
    
    @scala.inline
    def apply(name: String): GetAliasArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAliasArgs]
    }
    
    @scala.inline
    implicit class GetAliasArgsMutableBuilder[Self <: GetAliasArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetAliasResult extends StObject {
    
    /**
      * The Amazon Resource Name(ARN) of the key alias.
      */
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    /**
      * ARN pointed to by the alias.
      */
    val targetKeyArn: String = js.native
    
    /**
      * Key identifier pointed to by the alias.
      */
    val targetKeyId: String = js.native
  }
  object GetAliasResult {
    
    @scala.inline
    def apply(arn: String, id: String, name: String, targetKeyArn: String, targetKeyId: String): GetAliasResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetKeyArn = targetKeyArn.asInstanceOf[js.Any], targetKeyId = targetKeyId.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetAliasResult]
    }
    
    @scala.inline
    implicit class GetAliasResultMutableBuilder[Self <: GetAliasResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetKeyArn(value: String): Self = StObject.set(x, "targetKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetKeyId(value: String): Self = StObject.set(x, "targetKeyId", value.asInstanceOf[js.Any])
    }
  }
}
