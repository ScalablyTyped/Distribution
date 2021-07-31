package typings.pulumiAws

import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object serviceQuotaMod {
  
  @JSImport("@pulumi/aws/servicequotas/serviceQuota", "ServiceQuota")
  @js.native
  class ServiceQuota protected () extends CustomResource {
    /**
      * Create a ServiceQuota resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: ServiceQuotaArgs) = this()
    def this(name: String, args: ServiceQuotaArgs, opts: CustomResourceOptions) = this()
    
    /**
      * Whether the service quota can be increased.
      */
    val adjustable: Output_[Boolean] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the service quota.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Default value of the service quota.
      */
    val defaultValue: Output_[Double] = js.native
    
    /**
      * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
      */
    val quotaCode: Output_[String] = js.native
    
    /**
      * Name of the quota.
      */
    val quotaName: Output_[String] = js.native
    
    val requestId: Output_[String] = js.native
    
    val requestStatus: Output_[String] = js.native
    
    /**
      * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
      */
    val serviceCode: Output_[String] = js.native
    
    /**
      * Name of the service.
      */
    val serviceName: Output_[String] = js.native
    
    /**
      * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
      */
    val value: Output_[Double] = js.native
  }
  /* static members */
  object ServiceQuota {
    
    @JSImport("@pulumi/aws/servicequotas/serviceQuota", "ServiceQuota")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing ServiceQuota resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): ServiceQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[ServiceQuota]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): ServiceQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ServiceQuota]
    @scala.inline
    def get(name: String, id: Input[ID], state: ServiceQuotaState): ServiceQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[ServiceQuota]
    @scala.inline
    def get(name: String, id: Input[ID], state: ServiceQuotaState, opts: CustomResourceOptions): ServiceQuota = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[ServiceQuota]
    
    /**
      * Returns true if the given object is an instance of ServiceQuota.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/servicequotas/serviceQuota.ServiceQuota */ Boolean]
  }
  
  trait ServiceQuotaArgs extends StObject {
    
    /**
      * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
      */
    val quotaCode: Input[String]
    
    /**
      * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
      */
    val serviceCode: Input[String]
    
    /**
      * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
      */
    val value: Input[Double]
  }
  object ServiceQuotaArgs {
    
    @scala.inline
    def apply(quotaCode: Input[String], serviceCode: Input[String], value: Input[Double]): ServiceQuotaArgs = {
      val __obj = js.Dynamic.literal(quotaCode = quotaCode.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServiceQuotaArgs]
    }
    
    @scala.inline
    implicit class ServiceQuotaArgsMutableBuilder[Self <: ServiceQuotaArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuotaCode(value: Input[String]): Self = StObject.set(x, "quotaCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCode(value: Input[String]): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait ServiceQuotaState extends StObject {
    
    /**
      * Whether the service quota can be increased.
      */
    val adjustable: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the service quota.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Default value of the service quota.
      */
    val defaultValue: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Code of the service quota to track. For example: `L-F678F1CE`. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
      */
    val quotaCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the quota.
      */
    val quotaName: js.UndefOr[Input[String]] = js.undefined
    
    val requestId: js.UndefOr[Input[String]] = js.undefined
    
    val requestStatus: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Code of the service to track. For example: `vpc`. Available values can be found with the [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
      */
    val serviceCode: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the service.
      */
    val serviceName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Float specifying the desired value for the service quota. If the desired value is higher than the current value, a quota increase request is submitted. When a known request is submitted and pending, the value reflects the desired value of the pending request.
      */
    val value: js.UndefOr[Input[Double]] = js.undefined
  }
  object ServiceQuotaState {
    
    @scala.inline
    def apply(): ServiceQuotaState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServiceQuotaState]
    }
    
    @scala.inline
    implicit class ServiceQuotaStateMutableBuilder[Self <: ServiceQuotaState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustable(value: Input[Boolean]): Self = StObject.set(x, "adjustable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdjustableUndefined: Self = StObject.set(x, "adjustable", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setDefaultValue(value: Input[Double]): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValueUndefined: Self = StObject.set(x, "defaultValue", js.undefined)
      
      @scala.inline
      def setQuotaCode(value: Input[String]): Self = StObject.set(x, "quotaCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaCodeUndefined: Self = StObject.set(x, "quotaCode", js.undefined)
      
      @scala.inline
      def setQuotaName(value: Input[String]): Self = StObject.set(x, "quotaName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaNameUndefined: Self = StObject.set(x, "quotaName", js.undefined)
      
      @scala.inline
      def setRequestId(value: Input[String]): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestIdUndefined: Self = StObject.set(x, "requestId", js.undefined)
      
      @scala.inline
      def setRequestStatus(value: Input[String]): Self = StObject.set(x, "requestStatus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequestStatusUndefined: Self = StObject.set(x, "requestStatus", js.undefined)
      
      @scala.inline
      def setServiceCode(value: Input[String]): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCodeUndefined: Self = StObject.set(x, "serviceCode", js.undefined)
      
      @scala.inline
      def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setValue(value: Input[Double]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
