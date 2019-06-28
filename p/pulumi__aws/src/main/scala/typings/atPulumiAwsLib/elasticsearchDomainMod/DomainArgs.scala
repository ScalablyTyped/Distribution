package typings
package atPulumiAwsLib.elasticsearchDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainArgs extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument]
  ] = js.undefined
  /**
    * Key-value string pairs to specify advanced configuration options.
    * Note that the values for these configuration options must be strings (wrapped in quotes) or they
    * may be wrong and cause a perpetual diff, causing Terraform to want to recreate your Elasticsearch
    * domain on every apply.
    */
  val advancedOptions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * Cluster configuration of the domain, see below.
    */
  val clusterConfig: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DedicatedMasterCountDedicatedMasterEnabled]
  ] = js.undefined
  val cognitoOptions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledIdentityPoolIdRoleArn]
  ] = js.undefined
  /**
    * Name of the domain.
    */
  val domainName: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
    */
  val ebsOptions: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EbsEnabledIops]] = js.undefined
  /**
    * The version of Elasticsearch to deploy. Defaults to `1.5`
    */
  val elasticsearchVersion: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
  /**
    * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
    */
  val encryptAtRest: js.UndefOr[atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledKmsKeyIdBoolean]] = js.undefined
  /**
    * Options for publishing slow logs to CloudWatch Logs.
    */
  val logPublishingOptions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLogGroupArnEnabled]
      ]
    ]
  ] = js.undefined
  /**
    * Node-to-node encryption options. See below.
    */
  val nodeToNodeEncryption: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput_2072549229]
  ] = js.undefined
  /**
    * Snapshot related options, see below.
    */
  val snapshotOptions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AutomatedSnapshotStartHourInput]
  ] = js.undefined
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]]] = js.undefined
  /**
    * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
    */
  val vpcOptions: js.UndefOr[
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AvailabilityZonesSecurityGroupIds]
  ] = js.undefined
}

object DomainArgs {
  @scala.inline
  def apply(
    accessPolicies: atPulumiPulumiLib.outputMod.Input[java.lang.String | atPulumiAwsLib.iamDocumentsMod.PolicyDocument] = null,
    advancedOptions: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    clusterConfig: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_DedicatedMasterCountDedicatedMasterEnabled] = null,
    cognitoOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledIdentityPoolIdRoleArn] = null,
    domainName: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    ebsOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EbsEnabledIops] = null,
    elasticsearchVersion: atPulumiPulumiLib.outputMod.Input[java.lang.String] = null,
    encryptAtRest: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledKmsKeyIdBoolean] = null,
    logPublishingOptions: atPulumiPulumiLib.outputMod.Input[
      js.Array[
        atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_CloudwatchLogGroupArnEnabled]
      ]
    ] = null,
    nodeToNodeEncryption: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput_2072549229] = null,
    snapshotOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AutomatedSnapshotStartHourInput] = null,
    tags: atPulumiPulumiLib.outputMod.Input[org.scalablytyped.runtime.StringDictionary[_]] = null,
    vpcOptions: atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_AvailabilityZonesSecurityGroupIds] = null
  ): DomainArgs = {
    val __obj = js.Dynamic.literal()
    if (accessPolicies != null) __obj.updateDynamic("accessPolicies")(accessPolicies.asInstanceOf[js.Any])
    if (advancedOptions != null) __obj.updateDynamic("advancedOptions")(advancedOptions.asInstanceOf[js.Any])
    if (clusterConfig != null) __obj.updateDynamic("clusterConfig")(clusterConfig.asInstanceOf[js.Any])
    if (cognitoOptions != null) __obj.updateDynamic("cognitoOptions")(cognitoOptions.asInstanceOf[js.Any])
    if (domainName != null) __obj.updateDynamic("domainName")(domainName.asInstanceOf[js.Any])
    if (ebsOptions != null) __obj.updateDynamic("ebsOptions")(ebsOptions.asInstanceOf[js.Any])
    if (elasticsearchVersion != null) __obj.updateDynamic("elasticsearchVersion")(elasticsearchVersion.asInstanceOf[js.Any])
    if (encryptAtRest != null) __obj.updateDynamic("encryptAtRest")(encryptAtRest.asInstanceOf[js.Any])
    if (logPublishingOptions != null) __obj.updateDynamic("logPublishingOptions")(logPublishingOptions.asInstanceOf[js.Any])
    if (nodeToNodeEncryption != null) __obj.updateDynamic("nodeToNodeEncryption")(nodeToNodeEncryption.asInstanceOf[js.Any])
    if (snapshotOptions != null) __obj.updateDynamic("snapshotOptions")(snapshotOptions.asInstanceOf[js.Any])
    if (tags != null) __obj.updateDynamic("tags")(tags.asInstanceOf[js.Any])
    if (vpcOptions != null) __obj.updateDynamic("vpcOptions")(vpcOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[DomainArgs]
  }
}

