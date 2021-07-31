package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getAliasMod {
  
  @JSImport("@pulumi/aws/kms/getAlias", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getAlias(args: GetAliasArgs): js.Promise[GetAliasResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetAliasResult]]
  @scala.inline
  def getAlias(args: GetAliasArgs, opts: InvokeOptions): js.Promise[GetAliasResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getAlias")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetAliasResult]]
  
  trait GetAliasArgs extends StObject {
    
    /**
      * The display name of the alias. The name must start with the word "alias" followed by a forward slash (alias/)
      */
    val name: String
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
  
  trait GetAliasResult extends StObject {
    
    /**
      * The Amazon Resource Name(ARN) of the key alias.
      */
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    /**
      * ARN pointed to by the alias.
      */
    val targetKeyArn: String
    
    /**
      * Key identifier pointed to by the alias.
      */
    val targetKeyId: String
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
