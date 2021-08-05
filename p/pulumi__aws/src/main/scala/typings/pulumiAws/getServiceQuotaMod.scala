package typings.pulumiAws

import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getServiceQuotaMod {
  
  @JSImport("@pulumi/aws/servicequotas/getServiceQuota", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getServiceQuota(args: GetServiceQuotaArgs): js.Promise[GetServiceQuotaResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getServiceQuota")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetServiceQuotaResult]]
  inline def getServiceQuota(args: GetServiceQuotaArgs, opts: InvokeOptions): js.Promise[GetServiceQuotaResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getServiceQuota")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetServiceQuotaResult]]
  
  trait GetServiceQuotaArgs extends StObject {
    
    /**
      * Quota code within the service. When configured, the data source directly looks up the service quota. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
      */
    val quotaCode: js.UndefOr[String] = js.undefined
    
    /**
      * Quota name within the service. When configured, the data source searches through all service quotas to find the matching quota name. Available values can be found with the [AWS CLI service-quotas list-service-quotas command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-service-quotas.html).
      */
    val quotaName: js.UndefOr[String] = js.undefined
    
    /**
      * Service code for the quota. Available values can be found with the `aws.servicequotas.getService` data source or [AWS CLI service-quotas list-services command](https://docs.aws.amazon.com/cli/latest/reference/service-quotas/list-services.html).
      */
    val serviceCode: String
  }
  object GetServiceQuotaArgs {
    
    inline def apply(serviceCode: String): GetServiceQuotaArgs = {
      val __obj = js.Dynamic.literal(serviceCode = serviceCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetServiceQuotaArgs]
    }
    
    extension [Self <: GetServiceQuotaArgs](x: Self) {
      
      inline def setQuotaCode(value: String): Self = StObject.set(x, "quotaCode", value.asInstanceOf[js.Any])
      
      inline def setQuotaCodeUndefined: Self = StObject.set(x, "quotaCode", js.undefined)
      
      inline def setQuotaName(value: String): Self = StObject.set(x, "quotaName", value.asInstanceOf[js.Any])
      
      inline def setQuotaNameUndefined: Self = StObject.set(x, "quotaName", js.undefined)
      
      inline def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetServiceQuotaResult extends StObject {
    
    /**
      * Whether the service quota is adjustable.
      */
    val adjustable: Boolean
    
    /**
      * Amazon Resource Name (ARN) of the service quota.
      */
    val arn: String
    
    /**
      * Default value of the service quota.
      */
    val defaultValue: Double
    
    /**
      * Whether the service quota is global for the AWS account.
      */
    val globalQuota: Boolean
    
    /**
      * The provider-assigned unique ID for this managed resource.
      */
    val id: String
    
    val quotaCode: String
    
    val quotaName: String
    
    val serviceCode: String
    
    /**
      * Name of the service.
      */
    val serviceName: String
    
    /**
      * Current value of the service quota.
      */
    val value: Double
  }
  object GetServiceQuotaResult {
    
    inline def apply(
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
    
    extension [Self <: GetServiceQuotaResult](x: Self) {
      
      inline def setAdjustable(value: Boolean): Self = StObject.set(x, "adjustable", value.asInstanceOf[js.Any])
      
      inline def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setDefaultValue(value: Double): Self = StObject.set(x, "defaultValue", value.asInstanceOf[js.Any])
      
      inline def setGlobalQuota(value: Boolean): Self = StObject.set(x, "globalQuota", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setQuotaCode(value: String): Self = StObject.set(x, "quotaCode", value.asInstanceOf[js.Any])
      
      inline def setQuotaName(value: String): Self = StObject.set(x, "quotaName", value.asInstanceOf[js.Any])
      
      inline def setServiceCode(value: String): Self = StObject.set(x, "serviceCode", value.asInstanceOf[js.Any])
      
      inline def setServiceName(value: String): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
