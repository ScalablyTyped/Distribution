package typings.pulumiAws.domainMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig
import typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions
import typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions
import typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions
import typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest
import typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption
import typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption
import typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions
import typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainState extends js.Object {
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.native
  /**
    * Key-value string pairs to specify advanced configuration options.
    * Note that the values for these configuration options must be strings (wrapped in quotes) or they
    * may be wrong and cause a perpetual diff, causing this provider to want to recreate your Elasticsearch
    * domain on every apply.
    */
  val advancedOptions: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * Amazon Resource Name (ARN) of the domain.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  /**
    * Cluster configuration of the domain, see below.
    */
  val clusterConfig: js.UndefOr[Input[DomainClusterConfig]] = js.native
  val cognitoOptions: js.UndefOr[Input[DomainCognitoOptions]] = js.native
  /**
    * Domain endpoint HTTP(S) related options. See below.
    */
  val domainEndpointOptions: js.UndefOr[Input[DomainDomainEndpointOptions]] = js.native
  /**
    * Unique identifier for the domain.
    */
  val domainId: js.UndefOr[Input[String]] = js.native
  /**
    * Name of the domain.
    */
  val domainName: js.UndefOr[Input[String]] = js.native
  /**
    * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
    */
  val ebsOptions: js.UndefOr[Input[DomainEbsOptions]] = js.native
  /**
    * The version of Elasticsearch to deploy. Defaults to `1.5`
    */
  val elasticsearchVersion: js.UndefOr[Input[String]] = js.native
  /**
    * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
    */
  val encryptAtRest: js.UndefOr[Input[DomainEncryptAtRest]] = js.native
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Domain-specific endpoint for kibana without https scheme.
    * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnetIds` were created inside.
    * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
    */
  val kibanaEndpoint: js.UndefOr[Input[String]] = js.native
  /**
    * Options for publishing slow logs to CloudWatch Logs.
    */
  val logPublishingOptions: js.UndefOr[Input[js.Array[Input[DomainLogPublishingOption]]]] = js.native
  /**
    * Node-to-node encryption options. See below.
    */
  val nodeToNodeEncryption: js.UndefOr[Input[DomainNodeToNodeEncryption]] = js.native
  /**
    * Snapshot related options, see below.
    */
  val snapshotOptions: js.UndefOr[Input[DomainSnapshotOptions]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[_]]] = js.native
  /**
    * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
    */
  val vpcOptions: js.UndefOr[Input[DomainVpcOptions]] = js.native
}

object DomainState {
  @scala.inline
  def apply(
    accessPolicies: Input[String | PolicyDocument] = null,
    advancedOptions: Input[StringDictionary[_]] = null,
    arn: Input[String] = null,
    clusterConfig: Input[DomainClusterConfig] = null,
    cognitoOptions: Input[DomainCognitoOptions] = null,
    domainEndpointOptions: Input[DomainDomainEndpointOptions] = null,
    domainId: Input[String] = null,
    domainName: Input[String] = null,
    ebsOptions: Input[DomainEbsOptions] = null,
    elasticsearchVersion: Input[String] = null,
    encryptAtRest: Input[DomainEncryptAtRest] = null,
    endpoint: Input[String] = null,
    kibanaEndpoint: Input[String] = null,
    logPublishingOptions: Input[js.Array[Input[DomainLogPublishingOption]]] = null,
    nodeToNodeEncryption: Input[DomainNodeToNodeEncryption] = null,
    snapshotOptions: Input[DomainSnapshotOptions] = null,
    tags: Input[StringDictionary[_]] = null,
    vpcOptions: Input[DomainVpcOptions] = null
  ): DomainState = {
    val __obj = js.Dynamic.literal()
    if (accessPolicies != null) __obj.updateDynamic("accessPolicies")(accessPolicies.asInstanceOf[js.Any])
    if (advancedOptions != null) __obj.updateDynamic("advancedOptions")(advancedOptions.asInstanceOf[js.Any])
    if (arn != null) __obj.updateDynamic("arn")(arn.asInstanceOf[js.Any])
    if (clusterConfig != null) __obj.updateDynamic("clusterConfig")(clusterConfig.asInstanceOf[js.Any])
    if (cognitoOptions != null) __obj.updateDynamic("cognitoOptions")(cognitoOptions.asInstanceOf[js.Any])
    if (domainEndpointOptions != null) __obj.updateDynamic("domainEndpointOptions")(domainEndpointOptions.asInstanceOf[js.Any])
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

