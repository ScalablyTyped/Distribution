package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.ec2.GetVpcEndpointServiceFilter
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getVpcEndpointServiceMod {
  
  @JSImport("@pulumi/aws/ec2/getVpcEndpointService", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getVpcEndpointService(): js.Promise[GetVpcEndpointServiceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpointService")().asInstanceOf[js.Promise[GetVpcEndpointServiceResult]]
  inline def getVpcEndpointService(args: Unit, opts: InvokeOptions): js.Promise[GetVpcEndpointServiceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpointService")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpcEndpointServiceResult]]
  inline def getVpcEndpointService(args: GetVpcEndpointServiceArgs): js.Promise[GetVpcEndpointServiceResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpointService")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetVpcEndpointServiceResult]]
  inline def getVpcEndpointService(args: GetVpcEndpointServiceArgs, opts: InvokeOptions): js.Promise[GetVpcEndpointServiceResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getVpcEndpointService")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetVpcEndpointServiceResult]]
  
  trait GetVpcEndpointServiceArgs extends StObject {
    
    /**
      * Configuration block(s) for filtering. Detailed below.
      */
    val filters: js.UndefOr[js.Array[GetVpcEndpointServiceFilter]] = js.undefined
    
    /**
      * The common name of an AWS service (e.g. `s3`).
      */
    val service: js.UndefOr[String] = js.undefined
    
    /**
      * The service name that is specified when creating a VPC endpoint. For AWS services the service name is usually in the form `com.amazonaws.<region>.<service>` (the SageMaker Notebook service is an exception to this rule, the service name is in the form `aws.sagemaker.<region>.notebook`).
      */
    val serviceName: js.UndefOr[String] = js.undefined
    
    /**
      * The service type, `Gateway` or `Interface`.
      */
    val serviceType: js.UndefOr[String] = js.undefined
    
    /**
      * A map of tags, each pair of which must exactly match a pair on the desired VPC Endpoint Service.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetVpcEndpointServiceArgs {
    
    inline def apply(): GetVpcEndpointServiceArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GetVpcEndpointServiceArgs]
    }
    
    extension [Self <: GetVpcEndpointServiceArgs](x: Self) {
      
      inline def setFilters(value: js.Array[GetVpcEndpointServiceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: GetVpcEndpointServiceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      inline def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetVpcEndpointServiceResult extends StObject {
    
    /**
      * Whether or not VPC endpoint connection requests to the service must be accepted by the service owner - `true` or `false`.
      */
    val acceptanceRequired: Boolean
    
    /**
      * The Amazon Resource Name (ARN) of the VPC endpoint service.
      */
    val arn: String
    
    /**
      * The Availability Zones in which the service is available.
      */
    val availabilityZones: js.Array[String]
    
    /**
      * The DNS names for the service.
      */
    val baseEndpointDnsNames: js.Array[String]
    
    val filters: js.UndefOr[js.Array[typings.pulumiAws.outputMod.ec2.GetVpcEndpointServiceFilter]] = js.undefined
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    /**
      * Whether or not the service manages its VPC endpoints - `true` or `false`.
      */
    val managesVpcEndpoints: Boolean
    
    /**
      * The AWS account ID of the service owner or `amazon`.
      */
    val owner: String
    
    /**
      * The private DNS name for the service.
      */
    val privateDnsName: String
    
    val service: js.UndefOr[String] = js.undefined
    
    /**
      * The ID of the endpoint service.
      */
    val serviceId: String
    
    val serviceName: String
    
    val serviceType: String
    
    /**
      * A map of tags assigned to the resource.
      */
    val tags: StringDictionary[String]
    
    /**
      * Whether or not the service supports endpoint policies - `true` or `false`.
      */
    val vpcEndpointPolicySupported: Boolean
  }
  object GetVpcEndpointServiceResult {
    
    inline def apply(
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
    
    extension [Self <: GetVpcEndpointServiceResult](x: Self) {
      
      inline def setAcceptanceRequired(value: Boolean): Self = StObject.set(x, "acceptanceRequired", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZones(value: js.Array[String]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      inline def setAvailabilityZonesVarargs(value: String*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      inline def setBaseEndpointDnsNames(value: js.Array[String]): Self = StObject.set(x, "baseEndpointDnsNames", value.asInstanceOf[js.Any])
      
      inline def setBaseEndpointDnsNamesVarargs(value: String*): Self = StObject.set(x, "baseEndpointDnsNames", js.Array(value :_*))
      
      inline def setFilters(value: js.Array[typings.pulumiAws.outputMod.ec2.GetVpcEndpointServiceFilter]): Self = StObject.set(x, "filters", value.asInstanceOf[js.Any])
      
      inline def setFiltersUndefined: Self = StObject.set(x, "filters", js.undefined)
      
      inline def setFiltersVarargs(value: typings.pulumiAws.outputMod.ec2.GetVpcEndpointServiceFilter*): Self = StObject.set(x, "filters", js.Array(value :_*))
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setManagesVpcEndpoints(value: Boolean): Self = StObject.set(x, "managesVpcEndpoints", value.asInstanceOf[js.Any])
      
      inline def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setPrivateDnsName(value: String): Self = StObject.set(x, "privateDnsName", value.asInstanceOf[js.Any])
      
      inline def setService(value: String): Self = StObject.set(x, "service", value.asInstanceOf[js.Any])
      
      inline def setServiceId(value: String): Self = StObject.set(x, "serviceId", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setServiceType(value: String): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      inline def setServiceUndefined: Self = StObject.set(x, "service", js.undefined)
      
      inline def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setVpcEndpointPolicySupported(value: Boolean): Self = StObject.set(x, "vpcEndpointPolicySupported", value.asInstanceOf[js.Any])
    }
  }
}
