package typings.atPulumiAws.elasticsearchDomainMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.Anon_AutomatedSnapshotStartHourInput
import typings.atPulumiAws.Anon_AvailabilityZonesSecurityGroupIds
import typings.atPulumiAws.Anon_CloudwatchLogGroupArnEnabled
import typings.atPulumiAws.Anon_DedicatedMasterCountDedicatedMasterEnabled
import typings.atPulumiAws.Anon_EbsEnabledIops
import typings.atPulumiAws.Anon_EnabledBooleanInput_2072549229
import typings.atPulumiAws.Anon_EnabledIdentityPoolIdRoleArn
import typings.atPulumiAws.Anon_EnabledKmsKeyIdBoolean
import typings.atPulumiAws.iamDocumentsMod.PolicyDocument
import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainState extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
  /**
    * Key-value string pairs to specify advanced configuration options.
    * Note that the values for these configuration options must be strings (wrapped in quotes) or they
    * may be wrong and cause a perpetual diff, causing this provider to want to recreate your Elasticsearch
    * domain on every apply.
    */
  val advancedOptions: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * Amazon Resource Name (ARN) of the domain.
    */
  val arn: js.UndefOr[Input[String]] = js.undefined
  /**
    * Cluster configuration of the domain, see below.
    */
  val clusterConfig: js.UndefOr[Input[Anon_DedicatedMasterCountDedicatedMasterEnabled]] = js.undefined
  val cognitoOptions: js.UndefOr[Input[Anon_EnabledIdentityPoolIdRoleArn]] = js.undefined
  /**
    * Unique identifier for the domain.
    */
  val domainId: js.UndefOr[Input[String]] = js.undefined
  /**
    * Name of the domain.
    */
  val domainName: js.UndefOr[Input[String]] = js.undefined
  /**
    * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
    */
  val ebsOptions: js.UndefOr[Input[Anon_EbsEnabledIops]] = js.undefined
  /**
    * The version of Elasticsearch to deploy. Defaults to `1.5`
    */
  val elasticsearchVersion: js.UndefOr[Input[String]] = js.undefined
  /**
    * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
    */
  val encryptAtRest: js.UndefOr[Input[Anon_EnabledKmsKeyIdBoolean]] = js.undefined
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * Domain-specific endpoint for kibana without https scheme.
    * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnetIds` were created inside.
    * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
    */
  val kibanaEndpoint: js.UndefOr[Input[String]] = js.undefined
  /**
    * Options for publishing slow logs to CloudWatch Logs.
    */
  val logPublishingOptions: js.UndefOr[Input[js.Array[Input[Anon_CloudwatchLogGroupArnEnabled]]]] = js.undefined
  /**
    * Node-to-node encryption options. See below.
    */
  val nodeToNodeEncryption: js.UndefOr[Input[Anon_EnabledBooleanInput_2072549229]] = js.undefined
  /**
    * Snapshot related options, see below.
    */
  val snapshotOptions: js.UndefOr[Input[Anon_AutomatedSnapshotStartHourInput]] = js.undefined
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.undefined
  /**
    * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
    */
  val vpcOptions: js.UndefOr[Input[Anon_AvailabilityZonesSecurityGroupIds]] = js.undefined
}

object DomainState {
  @scala.inline
  def apply(
    accessPolicies: Input[String | PolicyDocument] = null,
    advancedOptions: Input[StringDictionary[_]] = null,
    arn: Input[String] = null,
    clusterConfig: Input[Anon_DedicatedMasterCountDedicatedMasterEnabled] = null,
    cognitoOptions: Input[Anon_EnabledIdentityPoolIdRoleArn] = null,
    domainId: Input[String] = null,
    domainName: Input[String] = null,
    ebsOptions: Input[Anon_EbsEnabledIops] = null,
    elasticsearchVersion: Input[String] = null,
    encryptAtRest: Input[Anon_EnabledKmsKeyIdBoolean] = null,
    endpoint: Input[String] = null,
    kibanaEndpoint: Input[String] = null,
    logPublishingOptions: Input[js.Array[Input[Anon_CloudwatchLogGroupArnEnabled]]] = null,
    nodeToNodeEncryption: Input[Anon_EnabledBooleanInput_2072549229] = null,
    snapshotOptions: Input[Anon_AutomatedSnapshotStartHourInput] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcOptions: Input[Anon_AvailabilityZonesSecurityGroupIds] = null
  ): DomainState = {
    val __obj = js.Dynamic.literal()
    if (accessPolicies != null) __obj.updateDynamic("accessPolicies")(accessPolicies.asInstanceOf[js.Any])
    if (advancedOptions != null) __obj.updateDynamic("advancedOptions")(advancedOptions.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (clusterConfig != null) __obj.updateDynamic("clusterConfig")(clusterConfig.asInstanceOf[js.Any])
    if (cognitoOptions != null) __obj.updateDynamic("cognitoOptions")(cognitoOptions.asInstanceOf[js.Any])
    if (domainId != null) __obj.updateDynamic("domainId")(domainId.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (ebsOptions != null) __obj.updateDynamic("ebsOptions")(ebsOptions.asInstanceOf[js.Any])
    if (elasticsearchVersion != null) __obj.updateDynamic("elasticsearchVersion")(elasticsearchVersion.asInstanceOf[js.Any])
    if (encryptAtRest != null) __obj.updateDynamic("encryptAtRest")(encryptAtRest.asInstanceOf[js.Any])
    if (endpoint != null) __obj.updateDynamic("endpoint")(endpoint.asInstanceOf[js.Any])
    if (kibanaEndpoint != null) __obj.updateDynamic("kibanaEndpoint")(kibanaEndpoint.asInstanceOf[js.Any])
    if (logPublishingOptions != null) __obj.updateDynamic("logPublishingOptions")(logPublishingOptions.asInstanceOf[js.Any])
    if (nodeToNodeEncryption != null) __obj.updateDynamic("nodeToNodeEncryption")(nodeToNodeEncryption.asInstanceOf[js.Any])
    if (snapshotOptions != null) __obj.updateDynamic("snapshotOptions")(snapshotOptions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcOptions != null) __obj.updateDynamic("vpcOptions")(vpcOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainState]
  }
}

