package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIpRangesMod {
  
  @JSImport("@pulumi/aws/getIpRanges", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getIpRanges(args: GetIpRangesArgs): js.Promise[GetIpRangesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getIpRanges")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetIpRangesResult]]
  inline def getIpRanges(args: GetIpRangesArgs, opts: InvokeOptions): js.Promise[GetIpRangesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getIpRanges")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetIpRangesResult]]
  
  trait GetIpRangesArgs extends StObject {
    
    /**
      * Filter IP ranges by regions (or include all regions, if
      * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
      * (e.g. `eu-central-1`)
      */
    val regions: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Filter IP ranges by services. Valid items are `amazon`
      * (for amazon.com), `amazonConnect`, `apiGateway`, `cloud9`, `cloudfront`,
      * `codebuild`, `dynamodb`, `ec2`, `ec2InstanceConnect`, `globalaccelerator`,
      * `route53`, `route53Healthchecks`, `s3` and `workspacesGateways`. See the
      * [`service` attribute][2] documentation for other possible values.
      */
    val services: js.Array[String]
    
    /**
      * Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html). Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
      */
    val url: js.UndefOr[String] = js.undefined
  }
  object GetIpRangesArgs {
    
    inline def apply(services: js.Array[String]): GetIpRangesArgs = {
      val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpRangesArgs]
    }
    
    extension [Self <: GetIpRangesArgs](x: Self) {
      
      inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  trait GetIpRangesResult extends StObject {
    
    /**
      * The lexically ordered list of CIDR blocks.
      */
    val cidrBlocks: js.Array[String]
    
    /**
      * The publication time of the IP ranges (e.g. `2016-08-03-23-46-05`).
      */
    val createDate: String
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * The lexically ordered list of IPv6 CIDR blocks.
      */
    val ipv6CidrBlocks: js.Array[String]
    
    val regions: js.UndefOr[js.Array[String]] = js.undefined
    
    val services: js.Array[String]
    
    /**
      * The publication time of the IP ranges, in Unix epoch time format
      * (e.g. `1470267965`).
      */
    val syncToken: Double
    
    val url: js.UndefOr[String] = js.undefined
  }
  object GetIpRangesResult {
    
    inline def apply(
      cidrBlocks: js.Array[String],
      createDate: String,
      id: String,
      ipv6CidrBlocks: js.Array[String],
      services: js.Array[String],
      syncToken: Double
    ): GetIpRangesResult = {
      val __obj = js.Dynamic.literal(cidrBlocks = cidrBlocks.asInstanceOf[js.Any], createDate = createDate.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], ipv6CidrBlocks = ipv6CidrBlocks.asInstanceOf[js.Any], services = services.asInstanceOf[js.Any], syncToken = syncToken.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpRangesResult]
    }
    
    extension [Self <: GetIpRangesResult](x: Self) {
      
      inline def setCidrBlocks(value: js.Array[String]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
      
      inline def setCidrBlocksVarargs(value: String*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
      
      inline def setCreateDate(value: String): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIpv6CidrBlocks(value: js.Array[String]): Self = StObject.set(x, "ipv6CidrBlocks", value.asInstanceOf[js.Any])
      
      inline def setIpv6CidrBlocksVarargs(value: String*): Self = StObject.set(x, "ipv6CidrBlocks", js.Array(value :_*))
      
      inline def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      inline def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      inline def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      inline def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
      
      inline def setSyncToken(value: Double): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      inline def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
