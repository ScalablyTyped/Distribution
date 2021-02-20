package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcEndpointServiceFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcEndpointServiceMod {
  
  @JSImport("@pulumi/aws/ec2/getVpcEndpointService", "getVpcEndpointService")
  @js.native
  def getVpcEndpointService(): js.Promise[GetVpcEndpointServiceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcEndpointService", "getVpcEndpointService")
  @js.native
  def getVpcEndpointService(args: js.UndefOr[scala.Nothing], opts: InvokeOptions): js.Promise[GetVpcEndpointServiceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcEndpointService", "getVpcEndpointService")
  @js.native
  def getVpcEndpointService(args: GetVpcEndpointServiceArgs): js.Promise[GetVpcEndpointServiceResult] = js.native
  @JSImport("@pulumi/aws/ec2/getVpcEndpointService", "getVpcEndpointService")
  @js.native
  def getVpcEndpointService(args: GetVpcEndpointServiceArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointServiceResult] = js.native
  
  @js.native
  trait GetVpcEndpointServiceArgs extends StObject {
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetVpcEndpointServiceFilter]] = js.native
    
    /**
      * The common name of an AWS service (e.g. `s3`).
      */
    val service: js.UndefOr[String] = js.native
    
    /**
      * The service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
      */
    val serviceName: js.UndefOr[String] = js.native
    
    /**
      * The service type, `Gateway` or `Interface`.
      */
    val serviceType: js.UndefOr[String] = js.native
    
    /**
      * A map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.native
  }
  object GetVpcEndpointServiceArgs {
    
    @scala.inline
    def apply(): GetVpcEndpointServiceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcEndpointServiceArgs]
    }
    
    @scala.inline
    implicit class GetVpcEndpointServiceArgsMutableBuilder[Self <: GetVpcEndpointServiceArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFilters(value: js.Array[GetVpcEndpointServiceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: GetVpcEndpointServiceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  @js.native
  trait GetVpcEndpointServiceResult extends StObject {
    
    /**
      * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
      */
    val acceptanceRequired: Boolean = js.native
    
    /**
      * The Amazon Resource Name (ARN) of the VPC endpoint service.
      */
    val arn: String = js.native
    
    /**
      * The Availability Zones in which the service is available.
      */
    val availabilityZones: js.Array[String] = js.native
    
    /**
      * The DNS names for the service.
      */
    val baseEndpointDnsNames: js.Array[String] = js.native
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpcEndpointServiceFilter]] = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    /**
      * Whether or not the service manages its VPC endpoints - `true` or `false`.
      */
    val managesVpcEndpoints: Boolean = js.native
    
    /**
      * The AWS account ID of the service owner or `amazon`.
      */
    val owner: String = js.native
    
    /**
      * The private DNS name for the service.
      */
    val privateDnsName: String = js.native
    
    val service: js.UndefOr[String] = js.native
    
    /**
      * The ID of the endpoint service.
      */
    val serviceId: String = js.native
    
    val serviceName: String = js.native
    
    val serviceType: String = js.native
    
    /**
      * A map of tags assigned to the resource.
      */
    val tags: StringDictionary[String] = js.native
    
    /**
      * Whether or not the service supports endpoint policies - `true` or `false`.
      */
    val vpcEndpointPolicySupported: Boolean = js.native
  }
  object GetVpcEndpointServiceResult {
    
    @scala.inline
    def apply(
      acceptanceRequired: Boolean,
      arn: String,
      availabilityZones: js.Array[String],
      baseEndpointDnsNames: js.Array[String],
      id: String,
      managesVpcEndpoints: Boolean,
      owner: String,
      privateDnsName: String,
      serviceId: String,
      serviceName: String,
      serviceType: String,
      tags: StringDictionary[String],
      vpcEndpointPolicySupported: Boolean
    ): GetVpcEndpointServiceResult = {
      val __obj = js.Dynamic.literal(acceptanceRequired = acceptanceRequired.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], availabilityZones = availabilityZones.asInstanceOf[js.Any], baseEndpointDnsNames = baseEndpointDnsNames.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], managesVpcEndpoints = managesVpcEndpoints.asInstanceOf[js.Any], owner = owner.asInstanceOf[js.Any], privateDnsName = privateDnsName.asInstanceOf[js.Any], serviceId = serviceId.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcEndpointPolicySupported = vpcEndpointPolicySupported.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetVpcEndpointServiceResult]
    }
    
    @scala.inline
    implicit class GetVpcEndpointServiceResultMutableBuilder[Self <: GetVpcEndpointServiceResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "acceptanceRequired", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setBaseEndpointDnsNames(value: js.Array[String]): Self = StObject.set(x, "baseEndpointDnsNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseEndpointDnsNamesVarargs(value: String*): Self = StObject.set(x, "baseEndpointDnsNames", js.Array(value :_*))
      
      @scala.inline
      def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpcEndpointServiceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      @scala.inline
      def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpcEndpointServiceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setManagesVpcEndpoints(value: Boolean): Self = StObject.set(x, "managesVpcEndpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateDnsName(value: String): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcEndpointPolicySupported(value: Boolean): Self = StObject.set(x, "vpcEndpointPolicySupported", value.asInstanceOf[js.Any])
    }
  }
}
