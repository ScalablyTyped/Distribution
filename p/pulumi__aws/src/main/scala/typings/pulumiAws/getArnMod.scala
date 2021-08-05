package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getArnMod {
  
  @JSImport("@pulumi/aws/getArn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getArn(args: GetArnArgs): js.Promise[GetArnResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getArn")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetArnResult]]
  inline def getArn(args: GetArnArgs, opts: InvokeOptions): js.Promise[GetArnResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getArn")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetArnResult]]
  
  trait GetArnArgs extends StObject {
    
    /**
      * The ARN to parse.
      */
    val arn: String
  }
  object GetArnArgs {
    
    inline def apply(arn: String): GetArnArgs = {
      val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetArnArgs]
    }
    
    extension [Self <: GetArnArgs](x: Self) {
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetArnResult extends StObject {
    
    /**
      * The [ID](https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html) of the AWS account that owns the resource, without the hyphens.
      */
    val account: String
    
    val arn: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The partition that the resource is in.
      */
    val partition: String
    
    /**
      * The region the resource resides in.
      * Note that the ARNs for some resources do not require a region, so this component might be omitted.
      */
    val region: String
    
    /**
      * The content of this part of the ARN varies by service.
      * It often includes an indicator of the type of resource—for example, an IAM user or Amazon RDS database —followed by a slash (/) or a colon (:), followed by the resource name itself.
      */
    val resource: String
    
    /**
      * The [service namespace](https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#genref-aws-service-namespaces) that identifies the AWS product.
      */
    val service: String
  }
  object GetArnResult {
    
    inline def apply(
      account: String,
      arn: String,
      id: String,
      partition: String,
      region: String,
      resource: String,
      service: String
    ): GetArnResult = {
      val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], partition = partition.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any], service = service.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetArnResult]
    }
    
    extension [Self <: GetArnResult](x: Self) {
      
      inline def setAccount(value: String): Self = StObject.set(x, "account", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPartition(value: String): Self = StObject.set(x, "partition", value.asInstanceOf[js.Any])
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
      
      inline def setResource(value: String): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
    }
  }
}
