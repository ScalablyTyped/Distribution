package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getIpRangesMod {
  
  @JSImport("@pulumi/aws/getIpRanges", "getIpRanges")
  @js.native
  def getIpRanges(args: GetIpRangesArgs): js.Promise[GetIpRangesResult] = js.native
  @JSImport("@pulumi/aws/getIpRanges", "getIpRanges")
  @js.native
  def getIpRanges(args: GetIpRangesArgs, opts: InvokeOptions): js.Promise[GetIpRangesResult] = js.native
  
  @js.native
  trait GetIpRangesArgs extends StObject {
    
    /**
      * Filter IP ranges by regions (or include all regions, if
      * omitted). Valid items are `global` (for `cloudfront`) as well as all AWS regions
      * (e.g. `eu-central-1`)
      */
    val regions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * Filter IP ranges by services. Valid items are `amazon`
      * (for amazon.com), `amazonConnect`, `apiGateway`, `cloud9`, `cloudfront`,
      * `codebuild`, `dynamodb`, `ec2`, `ec2InstanceConnect`, `globalaccelerator`,
      * `route53`, `route53Healthchecks`, `s3` and `workspacesGateways`. See the
      * [`service` attribute][2] documentation for other possible values.
      */
    val services: js.Array[String] = js.native
    
    /**
      * Custom URL for source JSON file. Syntax must match [AWS IP Address Ranges documentation](https://docs.aws.amazon.com/general/latest/gr/aws-ip-ranges.html). Defaults to `https://ip-ranges.amazonaws.com/ip-ranges.json`.
      */
    val url: js.UndefOr[String] = js.native
  }
  object GetIpRangesArgs {
    
    @scala.inline
    def apply(services: js.Array[String]): GetIpRangesArgs = {
      val __obj = js.Dynamic.literal(services = services.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetIpRangesArgs]
    }
    
    @scala.inline
    implicit class GetIpRangesArgsMutableBuilder[Self <: GetIpRangesArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      @scala.inline
      def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      @scala.inline
      def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
  
  @js.native
  trait GetIpRangesResult extends StObject {
    
    /**
      * The lexically ordered list of CIDR blocks.
      */
    val cidrBlocks: js.Array[String] = js.native
    
    /**
      * The publication time of the IP ranges (e.g. `2016-08-03-23-46-05`).
      */
    val createDate: String = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * The lexically ordered list of IPv6 CIDR blocks.
      */
    val ipv6CidrBlocks: js.Array[String] = js.native
    
    val regions: js.UndefOr[js.Array[String]] = js.native
    
    val services: js.Array[String] = js.native
    
    /**
      * The publication time of the IP ranges, in Unix epoch time format
      * (e.g. `1470267965`).
      */
    val syncToken: Double = js.native
    
    val url: js.UndefOr[String] = js.native
  }
  object GetIpRangesResult {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class GetIpRangesResultMutableBuilder[Self <: GetIpRangesResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCidrBlocks(value: js.Array[String]): Self = StObject.set(x, "cidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCidrBlocksVarargs(value: String*): Self = StObject.set(x, "cidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setCreateDate(value: String): Self = StObject.set(x, "createDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlocks(value: js.Array[String]): Self = StObject.set(x, "ipv6CidrBlocks", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIpv6CidrBlocksVarargs(value: String*): Self = StObject.set(x, "ipv6CidrBlocks", js.Array(value :_*))
      
      @scala.inline
      def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      @scala.inline
      def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      @scala.inline
      def setServices(value: js.Array[String]): Self = StObject.set(x, "services", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServicesVarargs(value: String*): Self = StObject.set(x, "services", js.Array(value :_*))
      
      @scala.inline
      def setSyncToken(value: Double): Self = StObject.set(x, "syncToken", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
    }
  }
}
