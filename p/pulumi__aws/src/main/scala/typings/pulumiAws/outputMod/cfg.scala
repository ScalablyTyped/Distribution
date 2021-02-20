package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cfg {
  
  @js.native
  trait ConfigurationAggregatorAccountAggregationSource extends StObject {
    
    /**
      * List of 12-digit account IDs of the account(s) being aggregated.
      */
    var accountIds: js.Array[String] = js.native
    
    /**
      * If true, aggregate existing AWS Config regions and future regions.
      */
    var allRegions: js.UndefOr[Boolean] = js.native
    
    /**
      * List of source regions being aggregated.
      */
    var regions: js.UndefOr[js.Array[String]] = js.native
  }
  object ConfigurationAggregatorAccountAggregationSource {
    
    @scala.inline
    def apply(accountIds: js.Array[String]): ConfigurationAggregatorAccountAggregationSource = {
      val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationAggregatorAccountAggregationSource]
    }
    
    @scala.inline
    implicit class ConfigurationAggregatorAccountAggregationSourceMutableBuilder[Self <: ConfigurationAggregatorAccountAggregationSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountIds(value: js.Array[String]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountIdsVarargs(value: String*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
      
      @scala.inline
      def setAllRegions(value: Boolean): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
      
      @scala.inline
      def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      @scala.inline
      def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait ConfigurationAggregatorOrganizationAggregationSource extends StObject {
    
    /**
      * If true, aggregate existing AWS Config regions and future regions.
      */
    var allRegions: js.UndefOr[Boolean] = js.native
    
    /**
      * List of source regions being aggregated.
      */
    var regions: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
      */
    var roleArn: String = js.native
  }
  object ConfigurationAggregatorOrganizationAggregationSource {
    
    @scala.inline
    def apply(roleArn: String): ConfigurationAggregatorOrganizationAggregationSource = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationAggregatorOrganizationAggregationSource]
    }
    
    @scala.inline
    implicit class ConfigurationAggregatorOrganizationAggregationSourceMutableBuilder[Self <: ConfigurationAggregatorOrganizationAggregationSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllRegions(value: Boolean): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
      
      @scala.inline
      def setRegions(value: js.Array[String]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      @scala.inline
      def setRegionsVarargs(value: String*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      @scala.inline
      def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DeliveryChannelSnapshotDeliveryProperties extends StObject {
    
    /**
      * - The frequency with which AWS Config recurringly delivers configuration snapshots. e.g. `One_Hour` or `Three_Hours`. Valid values are listed [here](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html#API_ConfigSnapshotDeliveryProperties_Contents).
      */
    var deliveryFrequency: js.UndefOr[String] = js.native
  }
  object DeliveryChannelSnapshotDeliveryProperties {
    
    @scala.inline
    def apply(): DeliveryChannelSnapshotDeliveryProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeliveryChannelSnapshotDeliveryProperties]
    }
    
    @scala.inline
    implicit class DeliveryChannelSnapshotDeliveryPropertiesMutableBuilder[Self <: DeliveryChannelSnapshotDeliveryProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeliveryFrequency(value: String): Self = StObject.set(x, "deliveryFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeliveryFrequencyUndefined: Self = StObject.set(x, "deliveryFrequency", js.undefined)
    }
  }
  
  @js.native
  trait RecorderRecordingGroup extends StObject {
    
    /**
      * Specifies whether AWS Config records configuration changes for every supported type of regional resource (which includes any new type that will become supported in the future). Conflicts with `resourceTypes`. Defaults to `true`.
      */
    var allSupported: js.UndefOr[Boolean] = js.native
    
    /**
      * Specifies whether AWS Config includes all supported types of *global resources* with the resources that it records. Requires `allSupported = true`. Conflicts with `resourceTypes`.
      */
    var includeGlobalResourceTypes: js.UndefOr[Boolean] = js.native
    
    /**
      * A list that specifies the types of AWS resources for which AWS Config records configuration changes (for example, `AWS::EC2::Instance` or `AWS::CloudTrail::Trail`). See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
      */
    var resourceTypes: js.UndefOr[js.Array[String]] = js.native
  }
  object RecorderRecordingGroup {
    
    @scala.inline
    def apply(): RecorderRecordingGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecorderRecordingGroup]
    }
    
    @scala.inline
    implicit class RecorderRecordingGroupMutableBuilder[Self <: RecorderRecordingGroup] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllSupported(value: Boolean): Self = StObject.set(x, "allSupported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllSupportedUndefined: Self = StObject.set(x, "allSupported", js.undefined)
      
      @scala.inline
      def setIncludeGlobalResourceTypes(value: Boolean): Self = StObject.set(x, "includeGlobalResourceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludeGlobalResourceTypesUndefined: Self = StObject.set(x, "includeGlobalResourceTypes", js.undefined)
      
      @scala.inline
      def setResourceTypes(value: js.Array[String]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
      
      @scala.inline
      def setResourceTypesVarargs(value: String*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
    }
  }
  
  @js.native
  trait RemediationConfigurationParameter extends StObject {
    
    /**
      * The name of the attribute.
      */
    var name: String = js.native
    
    /**
      * The value is dynamic and changes at run-time.
      */
    var resourceValue: js.UndefOr[String] = js.native
    
    /**
      * The value is static and does not change at run-time.
      */
    var staticValue: js.UndefOr[String] = js.native
  }
  object RemediationConfigurationParameter {
    
    @scala.inline
    def apply(name: String): RemediationConfigurationParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemediationConfigurationParameter]
    }
    
    @scala.inline
    implicit class RemediationConfigurationParameterMutableBuilder[Self <: RemediationConfigurationParameter] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceValue(value: String): Self = StObject.set(x, "resourceValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResourceValueUndefined: Self = StObject.set(x, "resourceValue", js.undefined)
      
      @scala.inline
      def setStaticValue(value: String): Self = StObject.set(x, "staticValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStaticValueUndefined: Self = StObject.set(x, "staticValue", js.undefined)
    }
  }
  
  @js.native
  trait RuleScope extends StObject {
    
    /**
      * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for `complianceResourceTypes`.
      */
    var complianceResourceId: js.UndefOr[String] = js.native
    
    /**
      * A list of resource types of only those AWS resources that you want to trigger an evaluation for the rule. e.g. `AWS::EC2::Instance`. You can only specify one type if you also specify a resource ID for `complianceResourceId`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
      */
    var complianceResourceTypes: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the rule.
      */
    var tagKey: js.UndefOr[String] = js.native
    
    /**
      * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
      */
    var tagValue: js.UndefOr[String] = js.native
  }
  object RuleScope {
    
    @scala.inline
    def apply(): RuleScope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleScope]
    }
    
    @scala.inline
    implicit class RuleScopeMutableBuilder[Self <: RuleScope] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComplianceResourceId(value: String): Self = StObject.set(x, "complianceResourceId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplianceResourceIdUndefined: Self = StObject.set(x, "complianceResourceId", js.undefined)
      
      @scala.inline
      def setComplianceResourceTypes(value: js.Array[String]): Self = StObject.set(x, "complianceResourceTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComplianceResourceTypesUndefined: Self = StObject.set(x, "complianceResourceTypes", js.undefined)
      
      @scala.inline
      def setComplianceResourceTypesVarargs(value: String*): Self = StObject.set(x, "complianceResourceTypes", js.Array(value :_*))
      
      @scala.inline
      def setTagKey(value: String): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
      
      @scala.inline
      def setTagValue(value: String): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
    }
  }
  
  @js.native
  trait RuleSource extends StObject {
    
    /**
      * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
      */
    var owner: String = js.native
    
    /**
      * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
      */
    var sourceDetails: js.UndefOr[js.Array[RuleSourceSourceDetail]] = js.native
    
    /**
      * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
      */
    var sourceIdentifier: String = js.native
  }
  object RuleSource {
    
    @scala.inline
    def apply(owner: String, sourceIdentifier: String): RuleSource = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleSource]
    }
    
    @scala.inline
    implicit class RuleSourceMutableBuilder[Self <: RuleSource] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOwner(value: String): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDetails(value: js.Array[RuleSourceSourceDetail]): Self = StObject.set(x, "sourceDetails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSourceDetailsUndefined: Self = StObject.set(x, "sourceDetails", js.undefined)
      
      @scala.inline
      def setSourceDetailsVarargs(value: RuleSourceSourceDetail*): Self = StObject.set(x, "sourceDetails", js.Array(value :_*))
      
      @scala.inline
      def setSourceIdentifier(value: String): Self = StObject.set(x, "sourceIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RuleSourceSourceDetail extends StObject {
    
    /**
      * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources. This defaults to `aws.config` and is the only valid value.
      */
    var eventSource: js.UndefOr[String] = js.native
    
    /**
      * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
      */
    var maximumExecutionFrequency: js.UndefOr[String] = js.native
    
    /**
      * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:
      */
    var messageType: js.UndefOr[String] = js.native
  }
  object RuleSourceSourceDetail {
    
    @scala.inline
    def apply(): RuleSourceSourceDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleSourceSourceDetail]
    }
    
    @scala.inline
    implicit class RuleSourceSourceDetailMutableBuilder[Self <: RuleSourceSourceDetail] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEventSource(value: String): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
      
      @scala.inline
      def setMaximumExecutionFrequency(value: String): Self = StObject.set(x, "maximumExecutionFrequency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "maximumExecutionFrequency", js.undefined)
      
      @scala.inline
      def setMessageType(value: String): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    }
  }
}
