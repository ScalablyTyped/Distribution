package typings
package atPulumiAwsLib.elasticsearchDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DomainArgs extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: js.UndefOr[atPulumiPulumiLib.outputMod.Input[java.lang.String]] = js.undefined
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
    atPulumiPulumiLib.outputMod.Input[atPulumiAwsLib.Anon_EnabledBooleanInput_654448986]
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

