package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object samplingRuleMod {
  
  @JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule")
  @js.native
  class SamplingRule protected () extends CustomResource {
    /**
      * Create a SamplingRule resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String, args: SamplingRuleArgs) = this()
    def this(name: String, args: SamplingRuleArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the sampling rule.
      */
    val arn: Output_[String] = js.native
    
    /**
      * Matches attributes derived from the request.
      */
    val attributes: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * The percentage of matching requests to instrument, after the reservoir is exhausted.
      */
    val fixedRate: Output_[Double] = js.native
    
    /**
      * Matches the hostname from a request URL.
      */
    val host: Output_[String] = js.native
    
    /**
      * Matches the HTTP method of a request.
      */
    val httpMethod: Output_[String] = js.native
    
    /**
      * The priority of the sampling rule.
      */
    val priority: Output_[Double] = js.native
    
    /**
      * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
      */
    val reservoirSize: Output_[Double] = js.native
    
    /**
      * Matches the ARN of the AWS resource on which the service runs.
      */
    val resourceArn: Output_[String] = js.native
    
    /**
      * The name of the sampling rule.
      */
    val ruleName: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Matches the `name` that the service uses to identify itself in segments.
      */
    val serviceName: Output_[String] = js.native
    
    /**
      * Matches the `origin` that the service uses to identify its type in segments.
      */
    val serviceType: Output_[String] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * Matches the path from a request URL.
      */
    val urlPath: Output_[String] = js.native
    
    /**
      * The version of the sampling rule format (`1` )
      */
    val version: Output_[Double] = js.native
  }
  /* static members */
  object SamplingRule {
    
    /**
      * Get an existing SamplingRule resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule.get")
    @js.native
    def get(name: String, id: Input[ID]): SamplingRule = js.native
    @JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): SamplingRule = js.native
    @JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: SamplingRuleState): SamplingRule = js.native
    @JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule.get")
    @js.native
    def get(name: String, id: Input[ID], state: SamplingRuleState, opts: CustomResourceOptions): SamplingRule = js.native
    
    /**
      * Returns true if the given object is an instance of SamplingRule.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/xray/samplingRule", "SamplingRule.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/xray/samplingRule.SamplingRule */ Boolean = js.native
  }
  
  @js.native
  trait SamplingRuleArgs extends StObject {
    
    /**
      * Matches attributes derived from the request.
      */
    val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The percentage of matching requests to instrument, after the reservoir is exhausted.
      */
    val fixedRate: Input[Double] = js.native
    
    /**
      * Matches the hostname from a request URL.
      */
    val host: Input[String] = js.native
    
    /**
      * Matches the HTTP method of a request.
      */
    val httpMethod: Input[String] = js.native
    
    /**
      * The priority of the sampling rule.
      */
    val priority: Input[Double] = js.native
    
    /**
      * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
      */
    val reservoirSize: Input[Double] = js.native
    
    /**
      * Matches the ARN of the AWS resource on which the service runs.
      */
    val resourceArn: Input[String] = js.native
    
    /**
      * The name of the sampling rule.
      */
    val ruleName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Matches the `name` that the service uses to identify itself in segments.
      */
    val serviceName: Input[String] = js.native
    
    /**
      * Matches the `origin` that the service uses to identify its type in segments.
      */
    val serviceType: Input[String] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Matches the path from a request URL.
      */
    val urlPath: Input[String] = js.native
    
    /**
      * The version of the sampling rule format (`1` )
      */
    val version: Input[Double] = js.native
  }
  object SamplingRuleArgs {
    
    @scala.inline
    def apply(
      fixedRate: Input[Double],
      host: Input[String],
      httpMethod: Input[String],
      priority: Input[Double],
      reservoirSize: Input[Double],
      resourceArn: Input[String],
      serviceName: Input[String],
      serviceType: Input[String],
      urlPath: Input[String],
      version: Input[Double]
    ): SamplingRuleArgs = {
      val __obj = js.Dynamic.literal(fixedRate = fixedRate.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], httpMethod = httpMethod.asInstanceOf[js.Any], priority = priority.asInstanceOf[js.Any], reservoirSize = reservoirSize.asInstanceOf[js.Any], resourceArn = resourceArn.asInstanceOf[js.Any], serviceName = serviceName.asInstanceOf[js.Any], serviceType = serviceType.asInstanceOf[js.Any], urlPath = urlPath.asInstanceOf[js.Any], version = version.asInstanceOf[js.Any])
      __obj.asInstanceOf[SamplingRuleArgs]
    }
    
    @scala.inline
    implicit class SamplingRuleArgsMutableBuilder[Self <: SamplingRuleArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setFixedRate(value: Input[Double]): Self = StObject.set(x, "fixedRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirSize(value: Input[Double]): Self = StObject.set(x, "reservoirSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleName(value: Input[String]): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
      
      @scala.inline
      def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceType(value: Input[String]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUrlPath(value: Input[String]): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Input[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SamplingRuleState extends StObject {
    
    /**
      * The ARN of the sampling rule.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Matches attributes derived from the request.
      */
    val attributes: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * The percentage of matching requests to instrument, after the reservoir is exhausted.
      */
    val fixedRate: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Matches the hostname from a request URL.
      */
    val host: js.UndefOr[Input[String]] = js.native
    
    /**
      * Matches the HTTP method of a request.
      */
    val httpMethod: js.UndefOr[Input[String]] = js.native
    
    /**
      * The priority of the sampling rule.
      */
    val priority: js.UndefOr[Input[Double]] = js.native
    
    /**
      * A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
      */
    val reservoirSize: js.UndefOr[Input[Double]] = js.native
    
    /**
      * Matches the ARN of the AWS resource on which the service runs.
      */
    val resourceArn: js.UndefOr[Input[String]] = js.native
    
    /**
      * The name of the sampling rule.
      */
    val ruleName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Matches the `name` that the service uses to identify itself in segments.
      */
    val serviceName: js.UndefOr[Input[String]] = js.native
    
    /**
      * Matches the `origin` that the service uses to identify its type in segments.
      */
    val serviceType: js.UndefOr[Input[String]] = js.native
    
    /**
      * Key-value mapping of resource tags
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Matches the path from a request URL.
      */
    val urlPath: js.UndefOr[Input[String]] = js.native
    
    /**
      * The version of the sampling rule format (`1` )
      */
    val version: js.UndefOr[Input[Double]] = js.native
  }
  object SamplingRuleState {
    
    @scala.inline
    def apply(): SamplingRuleState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SamplingRuleState]
    }
    
    @scala.inline
    implicit class SamplingRuleStateMutableBuilder[Self <: SamplingRuleState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setAttributes(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
      
      @scala.inline
      def setFixedRate(value: Input[Double]): Self = StObject.set(x, "fixedRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedRateUndefined: Self = StObject.set(x, "fixedRate", js.undefined)
      
      @scala.inline
      def setHost(value: Input[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHostUndefined: Self = StObject.set(x, "host", js.undefined)
      
      @scala.inline
      def setHttpMethod(value: Input[String]): Self = StObject.set(x, "httpMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHttpMethodUndefined: Self = StObject.set(x, "httpMethod", js.undefined)
      
      @scala.inline
      def setPriority(value: Input[Double]): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPriorityUndefined: Self = StObject.set(x, "priority", js.undefined)
      
      @scala.inline
      def setReservoirSize(value: Input[Double]): Self = StObject.set(x, "reservoirSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReservoirSizeUndefined: Self = StObject.set(x, "reservoirSize", js.undefined)
      
      @scala.inline
      def setResourceArn(value: Input[String]): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceArnUndefined: Self = StObject.set(x, "resourceArn", js.undefined)
      
      @scala.inline
      def setRuleName(value: Input[String]): Self = StObject.set(x, "ruleName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRuleNameUndefined: Self = StObject.set(x, "ruleName", js.undefined)
      
      @scala.inline
      def setServiceName(value: Input[String]): Self = StObject.set(x, "serviceName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceNameUndefined: Self = StObject.set(x, "serviceName", js.undefined)
      
      @scala.inline
      def setServiceType(value: Input[String]): Self = StObject.set(x, "serviceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setServiceTypeUndefined: Self = StObject.set(x, "serviceType", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setUrlPath(value: Input[String]): Self = StObject.set(x, "urlPath", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlPathUndefined: Self = StObject.set(x, "urlPath", js.undefined)
      
      @scala.inline
      def setVersion(value: Input[Double]): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
}
