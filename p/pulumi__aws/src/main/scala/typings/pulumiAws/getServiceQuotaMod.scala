package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServiceQuotaMod {
  
  @JSImport("@pulumi/aws/servicequotas/getServiceQuota", "getServiceQuota")
  @js.native
  def getServiceQuota(args: GetServiceQuotaArgs): js.Promise[GetServiceQuotaResult] = js.native
  @JSImport("@pulumi/aws/servicequotas/getServiceQuota", "getServiceQuota")
  @js.native
  def getServiceQuota(args: GetServiceQuotaArgs, opts: InvokeOptions): js.Promise[GetServiceQuotaResult] = js.native
  
  @js.native
  trait GetServiceQuotaArgs extends StObject {
    
    /**
      * Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
      */
    val quotaCode: js.UndefOr[String] = js.native
    
    /**
      * Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
      */
    val quotaName: js.UndefOr[String] = js.native
    
    /**
      * Service code for the quota. Available values can be found with the `aws.servicequotas.getService` data source or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
      */
    val serviceCode: String = js.native
  }
  object GetServiceQuotaArgs {
    
    @scala.inline
    def apply(serviceCode: String): GetServiceQuotaArgs = {
      val __obj = js.Dynamic.literal(serviceCode = serviceCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceQuotaArgs]
    }
    
    @scala.inline
    implicit class GetServiceQuotaArgsMutableBuilder[Self <: GetServiceQuotaArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setQuotaCode(value: String): Self = StObject.set(x, "quotaCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaCodeUndefined: Self = StObject.set(x, "quotaCode", js.undefined)
      
      @scala.inline
      def setQuotaName(value: String): Self = StObject.set(x, "quotaName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaNameUndefined: Self = StObject.set(x, "quotaName", js.undefined)
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait GetServiceQuotaResult extends StObject {
    
    /**
      * Whether the service quota is adjustable.
      */
    val adjustable: Boolean = js.native
    
    /**
      * Amazon Resource Name (ARN) of the service quota.
      */
    val arn: String = js.native
    
    /**
      * Default value of the service quota.
      */
    val defaultValue: Double = js.native
    
    /**
      * Whether the service quota is global for the AWS account.
      */
    val globalQuota: Boolean = js.native
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String = js.native
    
    val quotaCode: String = js.native
    
    val quotaName: String = js.native
    
    val serviceCode: String = js.native
    
    /**
      * Name of the service.
      */
    val serviceName: String = js.native
    
    /**
      * Current value of the service quota.
      */
    val value: Double = js.native
  }
  object GetServiceQuotaResult {
    
    @scala.inline
    def apply(
      adjustable: Boolean,
      arn: String,
      defaultValue: Double,
      globalQuota: Boolean,
      id: String,
      quotaCode: String,
      quotaName: String,
      serviceCode: String,
      serviceName: String,
      value: Double
    ): GetServiceQuotaResult = {
      val __obj = js.Dynamic.literal(adjustable = adjustable.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], defaultValue = defaultValue.asInstanceOf[js.Any], globalQuota = globalQuota.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], quotaCode = quotaCode.asInstanceOf[js.Any], quotaName = quotaName.asInstanceOf[js.Any], serviceCode = serviceCode.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceQuotaResult]
    }
    
    @scala.inline
    implicit class GetServiceQuotaResultMutableBuilder[Self <: GetServiceQuotaResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdjustable(value: Boolean): Self = StObject.set(x, "adjustable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalQuota(value: Boolean): Self = StObject.set(x, "globalQuota", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaCode(value: String): Self = StObject.set(x, "quotaCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setQuotaName(value: String): Self = StObject.set(x, "quotaName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
