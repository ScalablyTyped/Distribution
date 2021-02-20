package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getParameterMod {
  
  @JSImport("@pulumi/aws/ssm/getParameter", "getParameter")
  @js.native
  def getParameter(args: GetParameterArgs): js.Promise[GetParameterResult] = js.native
  @JSImport("@pulumi/aws/ssm/getParameter", "getParameter")
  @js.native
  def getParameter(args: GetParameterArgs, opts: InvokeOptions): js.Promise[GetParameterResult] = js.native
  
  @js.native
  trait GetParameterArgs extends StObject {
    
    /**
      * The name of the parameter.
      */
    val name: String = js.native
    
    /**
      * Whether to return decrypted `SecureString` value. Defaults to `true`.
      */
    val withDecryption: js.UndefOr[Boolean] = js.native
  }
  object GetParameterArgs {
    
    @scala.inline
    def apply(name: String): GetParameterArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetParameterArgs]
    }
    
    @scala.inline
    implicit class GetParameterArgsMutableBuilder[Self <: GetParameterArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithDecryption(value: Boolean): Self = StObject.set(x, "withDecryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithDecryptionUndefined: Self = StObject.set(x, "withDecryption", js.undefined)
    }
  }
  
  @js.native
  trait GetParameterResult extends StObject {
    
    val arn: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val name: String = js.native
    
    val `type`: String = js.native
    
    val value: String = js.native
    
    val version: Double = js.native
    
    val withDecryption: js.UndefOr[Boolean] = js.native
  }
  object GetParameterResult {
    
    @scala.inline
    def apply(arn: String, id: String, name: String, `type`: String, value: String, version: Double): GetParameterResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetParameterResult]
    }
    
    @scala.inline
    implicit class GetParameterResultMutableBuilder[Self <: GetParameterResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithDecryption(value: Boolean): Self = StObject.set(x, "withDecryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithDecryptionUndefined: Self = StObject.set(x, "withDecryption", js.undefined)
    }
  }
}
