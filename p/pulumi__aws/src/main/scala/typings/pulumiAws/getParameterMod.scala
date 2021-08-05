package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getParameterMod {
  
  @JSImport("@pulumi/aws/ssm/getParameter", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getParameter(args: GetParameterArgs): js.Promise[GetParameterResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetParameterResult]]
  inline def getParameter(args: GetParameterArgs, opts: InvokeOptions): js.Promise[GetParameterResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getParameter")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetParameterResult]]
  
  trait GetParameterArgs extends StObject {
    
    /**
      * The name of the parameter.
      */
    val name: String
    
    /**
      * Whether to return decrypted `SecureString` value. Defaults to `true`.
      */
    val withDecryption: js.UndefOr[Boolean] = js.undefined
  }
  object GetParameterArgs {
    
    inline def apply(name: String): GetParameterArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetParameterArgs]
    }
    
    extension [Self <: GetParameterArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setWithDecryption(value: Boolean): Self = StObject.set(x, "withDecryption", value.asInstanceOf[js.Any])
      
      inline def setWithDecryptionUndefined: Self = StObject.set(x, "withDecryption", js.undefined)
    }
  }
  
  trait GetParameterResult extends StObject {
    
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val name: String
    
    val `type`: String
    
    val value: String
    
    val version: Double
    
    val withDecryption: js.UndefOr[Boolean] = js.undefined
  }
  object GetParameterResult {
    
    inline def apply(arn: String, id: String, name: String, `type`: String, value: String, version: Double): GetParameterResult = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetParameterResult]
    }
    
    extension [Self <: GetParameterResult](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setWithDecryption(value: Boolean): Self = StObject.set(x, "withDecryption", value.asInstanceOf[js.Any])
      
      inline def setWithDecryptionUndefined: Self = StObject.set(x, "withDecryption", js.undefined)
    }
  }
}
