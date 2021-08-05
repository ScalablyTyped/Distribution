package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object wafv2GetIpSetMod {
  
  @JSImport("@pulumi/aws/wafv2/getIpSet", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIpSet(args: GetIpSetArgs): js.Promise[GetIpSetResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIpSet")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetIpSetResult]]
  inline def getIpSet(args: GetIpSetArgs, opts: InvokeOptions): js.Promise[GetIpSetResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIpSet")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIpSetResult]]
  
  trait GetIpSetArgs extends StObject {
    
    /**
      * The name of the WAFv2 IP Set.
      */
    val name: String
    
    /**
      * Specifies whether this is for an AWS CloudFront distribution or for a regional application. Valid values are `CLOUDFRONT` or `REGIONAL`. To work with CloudFront, you must also specify the region `us-east-1` (N. Virginia) on the AWS provider.
      */
    val scope: String
  }
  object GetIpSetArgs {
    
    inline def apply(name: String, scope: String): GetIpSetArgs = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpSetArgs]
    }
    
    extension [Self <: GetIpSetArgs](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetIpSetResult extends StObject {
    
    /**
      * An array of strings that specify one or more IP addresses or blocks of IP addresses in Classless Inter-Domain Routing (CIDR) notation.
      */
    val addresses: js.Array[String]
    
    /**
      * The Amazon Resource Name (ARN) of the entity.
      */
    val arn: String
    
    /**
      * The description of the set that helps with identification.
      */
    val description: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The IP address version of the set.
      */
    val ipAddressVersion: String
    
    val name: String
    
    val scope: String
  }
  object GetIpSetResult {
    
    inline def apply(
      addresses: js.Array[String],
      arn: String,
      description: String,
      id: String,
      ipAddressVersion: String,
      name: String,
      scope: String
    ): GetIpSetResult = {
      val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipAddressVersion = ipAddressVersion.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], scope = scope.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpSetResult]
    }
    
    extension [Self <: GetIpSetResult](x: Self) {
      
      inline def setAddresses(value: js.Array[String]): Self = StObject.set(x, "addresses", value.asInstanceOf[js.Any])
      
      inline def setAddressesVarargs(value: String*): Self = StObject.set(x, "addresses", js.Array(value :_*))
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIpAddressVersion(value: String): Self = StObject.set(x, "ipAddressVersion", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setScope(value: String): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
    }
  }
}
