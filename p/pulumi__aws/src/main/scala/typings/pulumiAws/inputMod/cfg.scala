package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cfg {
  
  trait ConfigurationAggregatorAccountAggregationSource extends StObject {
    
    /**
      * List of 12-digit account IDs of the account(s) being aggregated.
      */
    var accountIds: Input[js.Array[Input[String]]]
    
    /**
      * If true, aggregate existing AWS Config regions and future regions.
      */
    var allRegions: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of source regions being aggregated.
      */
    var regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object ConfigurationAggregatorAccountAggregationSource {
    
    inline def apply(accountIds: Input[js.Array[Input[String]]]): ConfigurationAggregatorAccountAggregationSource = {
      val __obj = js.Dynamic.literal(accountIds = accountIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationAggregatorAccountAggregationSource]
    }
    
    extension [Self <: ConfigurationAggregatorAccountAggregationSource](x: Self) {
      
      inline def setAccountIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "accountIds", value.asInstanceOf[js.Any])
      
      inline def setAccountIdsVarargs(value: Input[String]*): Self = StObject.set(x, "accountIds", js.Array(value :_*))
      
      inline def setAllRegions(value: Input[Boolean]): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
      
      inline def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
      
      inline def setRegions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      inline def setRegionsVarargs(value: Input[String]*): Self = StObject.set(x, "regions", js.Array(value :_*))
    }
  }
  
  trait ConfigurationAggregatorOrganizationAggregationSource extends StObject {
    
    /**
      * If true, aggregate existing AWS Config regions and future regions.
      */
    var allRegions: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * List of source regions being aggregated.
      */
    var regions: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * ARN of the IAM role used to retrieve AWS Organization details associated with the aggregator account.
      */
    var roleArn: Input[String]
  }
  object ConfigurationAggregatorOrganizationAggregationSource {
    
    inline def apply(roleArn: Input[String]): ConfigurationAggregatorOrganizationAggregationSource = {
      val __obj = js.Dynamic.literal(roleArn = roleArn.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConfigurationAggregatorOrganizationAggregationSource]
    }
    
    extension [Self <: ConfigurationAggregatorOrganizationAggregationSource](x: Self) {
      
      inline def setAllRegions(value: Input[Boolean]): Self = StObject.set(x, "allRegions", value.asInstanceOf[js.Any])
      
      inline def setAllRegionsUndefined: Self = StObject.set(x, "allRegions", js.undefined)
      
      inline def setRegions(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "regions", value.asInstanceOf[js.Any])
      
      inline def setRegionsUndefined: Self = StObject.set(x, "regions", js.undefined)
      
      inline def setRegionsVarargs(value: Input[String]*): Self = StObject.set(x, "regions", js.Array(value :_*))
      
      inline def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    }
  }
  
  trait DeliveryChannelSnapshotDeliveryProperties extends StObject {
    
    /**
      * - The frequency with which AWS Config recurringly delivers configuration snapshots. e.g. `One_Hour` or `Three_Hours`. Valid values are listed [here](https://docs.aws.amazon.com/config/latest/APIReference/API_ConfigSnapshotDeliveryProperties.html#API_ConfigSnapshotDeliveryProperties_Contents).
      */
    var deliveryFrequency: js.UndefOr[Input[String]] = js.undefined
  }
  object DeliveryChannelSnapshotDeliveryProperties {
    
    inline def apply(): DeliveryChannelSnapshotDeliveryProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DeliveryChannelSnapshotDeliveryProperties]
    }
    
    extension [Self <: DeliveryChannelSnapshotDeliveryProperties](x: Self) {
      
      inline def setDeliveryFrequency(value: Input[String]): Self = StObject.set(x, "deliveryFrequency", value.asInstanceOf[js.Any])
      
      inline def setDeliveryFrequencyUndefined: Self = StObject.set(x, "deliveryFrequency", js.undefined)
    }
  }
  
  trait RecorderRecordingGroup extends StObject {
    
    /**
      * Specifies whether AWS Config records configuration changes for every supported type of regional resource (which includes any new type that will become supported in the future). Conflicts with `resourceTypes`. Defaults to `true`.
      */
    var allSupported: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Specifies whether AWS Config includes all supported types of *global resources* with the resources that it records. Requires `allSupported = true`. Conflicts with `resourceTypes`.
      */
    var includeGlobalResourceTypes: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A list that specifies the types of AWS resources for which AWS Config records configuration changes (for example, `AWS::EC2::Instance` or `AWS::CloudTrail::Trail`). See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
      */
    var resourceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object RecorderRecordingGroup {
    
    inline def apply(): RecorderRecordingGroup = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RecorderRecordingGroup]
    }
    
    extension [Self <: RecorderRecordingGroup](x: Self) {
      
      inline def setAllSupported(value: Input[Boolean]): Self = StObject.set(x, "allSupported", value.asInstanceOf[js.Any])
      
      inline def setAllSupportedUndefined: Self = StObject.set(x, "allSupported", js.undefined)
      
      inline def setIncludeGlobalResourceTypes(value: Input[Boolean]): Self = StObject.set(x, "includeGlobalResourceTypes", value.asInstanceOf[js.Any])
      
      inline def setIncludeGlobalResourceTypesUndefined: Self = StObject.set(x, "includeGlobalResourceTypes", js.undefined)
      
      inline def setResourceTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "resourceTypes", value.asInstanceOf[js.Any])
      
      inline def setResourceTypesUndefined: Self = StObject.set(x, "resourceTypes", js.undefined)
      
      inline def setResourceTypesVarargs(value: Input[String]*): Self = StObject.set(x, "resourceTypes", js.Array(value :_*))
    }
  }
  
  trait RemediationConfigurationParameter extends StObject {
    
    /**
      * The name of the attribute.
      */
    var name: Input[String]
    
    /**
      * The value is dynamic and changes at run-time.
      */
    var resourceValue: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The value is static and does not change at run-time.
      */
    var staticValue: js.UndefOr[Input[String]] = js.undefined
  }
  object RemediationConfigurationParameter {
    
    inline def apply(name: Input[String]): RemediationConfigurationParameter = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[RemediationConfigurationParameter]
    }
    
    extension [Self <: RemediationConfigurationParameter](x: Self) {
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResourceValue(value: Input[String]): Self = StObject.set(x, "resourceValue", value.asInstanceOf[js.Any])
      
      inline def setResourceValueUndefined: Self = StObject.set(x, "resourceValue", js.undefined)
      
      inline def setStaticValue(value: Input[String]): Self = StObject.set(x, "staticValue", value.asInstanceOf[js.Any])
      
      inline def setStaticValueUndefined: Self = StObject.set(x, "staticValue", js.undefined)
    }
  }
  
  trait RuleScope extends StObject {
    
    /**
      * The IDs of the only AWS resource that you want to trigger an evaluation for the rule. If you specify a resource ID, you must specify one resource type for `complianceResourceTypes`.
      */
    var complianceResourceId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A list of resource types of only those AWS resources that you want to trigger an evaluation for the rule. e.g. `AWS::EC2::Instance`. You can only specify one type if you also specify a resource ID for `complianceResourceId`. See [relevant part of AWS Docs](http://docs.aws.amazon.com/config/latest/APIReference/API_ResourceIdentifier.html#config-Type-ResourceIdentifier-resourceType) for available types.
      */
    var complianceResourceTypes: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * The tag key that is applied to only those AWS resources that you want you want to trigger an evaluation for the rule.
      */
    var tagKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The tag value applied to only those AWS resources that you want to trigger an evaluation for the rule.
      */
    var tagValue: js.UndefOr[Input[String]] = js.undefined
  }
  object RuleScope {
    
    inline def apply(): RuleScope = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleScope]
    }
    
    extension [Self <: RuleScope](x: Self) {
      
      inline def setComplianceResourceId(value: Input[String]): Self = StObject.set(x, "complianceResourceId", value.asInstanceOf[js.Any])
      
      inline def setComplianceResourceIdUndefined: Self = StObject.set(x, "complianceResourceId", js.undefined)
      
      inline def setComplianceResourceTypes(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "complianceResourceTypes", value.asInstanceOf[js.Any])
      
      inline def setComplianceResourceTypesUndefined: Self = StObject.set(x, "complianceResourceTypes", js.undefined)
      
      inline def setComplianceResourceTypesVarargs(value: Input[String]*): Self = StObject.set(x, "complianceResourceTypes", js.Array(value :_*))
      
      inline def setTagKey(value: Input[String]): Self = StObject.set(x, "tagKey", value.asInstanceOf[js.Any])
      
      inline def setTagKeyUndefined: Self = StObject.set(x, "tagKey", js.undefined)
      
      inline def setTagValue(value: Input[String]): Self = StObject.set(x, "tagValue", value.asInstanceOf[js.Any])
      
      inline def setTagValueUndefined: Self = StObject.set(x, "tagValue", js.undefined)
    }
  }
  
  trait RuleSource extends StObject {
    
    /**
      * Indicates whether AWS or the customer owns and manages the AWS Config rule. Valid values are `AWS` or `CUSTOM_LAMBDA`. For more information about managed rules, see the [AWS Config Managed Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_use-managed-rules.html). For more information about custom rules, see the [AWS Config Custom Rules documentation](https://docs.aws.amazon.com/config/latest/developerguide/evaluate-config_develop-rules.html). Custom Lambda Functions require permissions to allow the AWS Config service to invoke them, e.g. via the `aws.lambda.Permission` resource.
      */
    var owner: Input[String]
    
    /**
      * Provides the source and type of the event that causes AWS Config to evaluate your AWS resources. Only valid if `owner` is `CUSTOM_LAMBDA`.
      */
    var sourceDetails: js.UndefOr[Input[js.Array[Input[RuleSourceSourceDetail]]]] = js.undefined
    
    /**
      * For AWS Config managed rules, a predefined identifier, e.g `IAM_PASSWORD_POLICY`. For custom Lambda rules, the identifier is the ARN of the Lambda Function, such as `arn:aws:lambda:us-east-1:123456789012:function:custom_rule_name` or the `arn` attribute of the `aws.lambda.Function` resource.
      */
    var sourceIdentifier: Input[String]
  }
  object RuleSource {
    
    inline def apply(owner: Input[String], sourceIdentifier: Input[String]): RuleSource = {
      val __obj = js.Dynamic.literal(owner = owner.asInstanceOf[js.Any], sourceIdentifier = sourceIdentifier.asInstanceOf[js.Any])
      __obj.asInstanceOf[RuleSource]
    }
    
    extension [Self <: RuleSource](x: Self) {
      
      inline def setOwner(value: Input[String]): Self = StObject.set(x, "owner", value.asInstanceOf[js.Any])
      
      inline def setSourceDetails(value: Input[js.Array[Input[RuleSourceSourceDetail]]]): Self = StObject.set(x, "sourceDetails", value.asInstanceOf[js.Any])
      
      inline def setSourceDetailsUndefined: Self = StObject.set(x, "sourceDetails", js.undefined)
      
      inline def setSourceDetailsVarargs(value: Input[RuleSourceSourceDetail]*): Self = StObject.set(x, "sourceDetails", js.Array(value :_*))
      
      inline def setSourceIdentifier(value: Input[String]): Self = StObject.set(x, "sourceIdentifier", value.asInstanceOf[js.Any])
    }
  }
  
  trait RuleSourceSourceDetail extends StObject {
    
    /**
      * The source of the event, such as an AWS service, that triggers AWS Config to evaluate your AWS resources. This defaults to `aws.config` and is the only valid value.
      */
    var eventSource: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The frequency that you want AWS Config to run evaluations for a rule that is triggered periodically. If specified, requires `messageType` to be `ScheduledNotification`.
      */
    var maximumExecutionFrequency: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The type of notification that triggers AWS Config to run an evaluation for a rule. You can specify the following notification types:
      */
    var messageType: js.UndefOr[Input[String]] = js.undefined
  }
  object RuleSourceSourceDetail {
    
    inline def apply(): RuleSourceSourceDetail = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RuleSourceSourceDetail]
    }
    
    extension [Self <: RuleSourceSourceDetail](x: Self) {
      
      inline def setEventSource(value: Input[String]): Self = StObject.set(x, "eventSource", value.asInstanceOf[js.Any])
      
      inline def setEventSourceUndefined: Self = StObject.set(x, "eventSource", js.undefined)
      
      inline def setMaximumExecutionFrequency(value: Input[String]): Self = StObject.set(x, "maximumExecutionFrequency", value.asInstanceOf[js.Any])
      
      inline def setMaximumExecutionFrequencyUndefined: Self = StObject.set(x, "maximumExecutionFrequency", js.undefined)
      
      inline def setMessageType(value: Input[String]): Self = StObject.set(x, "messageType", value.asInstanceOf[js.Any])
      
      inline def setMessageTypeUndefined: Self = StObject.set(x, "messageType", js.undefined)
    }
  }
}
