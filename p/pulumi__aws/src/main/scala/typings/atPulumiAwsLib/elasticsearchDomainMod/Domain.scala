package typings
package atPulumiAwsLib.elasticsearchDomainMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticsearch/domain", "Domain")
@js.native
class Domain protected ()
  extends atPulumiPulumiLib.atPulumiPulumiMod.CustomResource {
  /**
    * Create a Domain resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, args: DomainArgs) = this()
  def this(name: java.lang.String, args: DomainArgs, opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions) = this()
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Key-value string pairs to specify advanced configuration options.
    * Note that the values for these configuration options must be strings (wrapped in quotes) or they
    * may be wrong and cause a perpetual diff, causing Terraform to want to recreate your Elasticsearch
    * domain on every apply.
    */
  val advancedOptions: atPulumiPulumiLib.outputMod.Output[org.scalablytyped.runtime.StringDictionary[_]] = js.native
  /**
    * Amazon Resource Name (ARN) of the domain.
    */
  val arn: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Cluster configuration of the domain, see below.
    */
  val clusterConfig: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_DedicatedMasterCount] = js.native
  val cognitoOptions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_EnabledIdentityPoolId]] = js.native
  /**
    * Unique identifier for the domain.
    */
  val domainId: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Name of the domain.
    */
  val domainName: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
    */
  val ebsOptions: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_EbsEnabled] = js.native
  /**
    * The version of Elasticsearch to deploy. Defaults to `1.5`
    */
  val elasticsearchVersion: atPulumiPulumiLib.outputMod.Output[js.UndefOr[java.lang.String]] = js.native
  /**
    * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
    */
  val encryptAtRest: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_EnabledKmsKeyId] = js.native
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Domain-specific endpoint for kibana without https scheme.
    * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnet_ids` were created inside.
    * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
    */
  val kibanaEndpoint: atPulumiPulumiLib.outputMod.Output[java.lang.String] = js.native
  /**
    * Options for publishing slow logs to CloudWatch Logs.
    */
  val logPublishingOptions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[js.Array[atPulumiAwsLib.Anon_CloudwatchLogGroupArn]]] = js.native
  /**
    * Node-to-node encryption options. See below.
    */
  val nodeToNodeEncryption: atPulumiPulumiLib.outputMod.Output[atPulumiAwsLib.Anon_EnabledBoolean_1082978225] = js.native
  /**
    * Snapshot related options, see below.
    */
  val snapshotOptions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AutomatedSnapshotStartHour]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: atPulumiPulumiLib.outputMod.Output[js.UndefOr[org.scalablytyped.runtime.StringDictionary[_]]] = js.native
  /**
    * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
    */
  val vpcOptions: atPulumiPulumiLib.outputMod.Output[js.UndefOr[atPulumiAwsLib.Anon_AvailabilityZones]] = js.native
}

/* static members */
@JSImport("@pulumi/aws/elasticsearch/domain", "Domain")
@js.native
object Domain extends js.Object {
  /**
    * Get an existing Domain resource's state with the given name, ID, and optional extra
    * properties used to qualify the lookup.
    *
    * @param name The _unique_ name of the resulting resource.
    * @param id The _unique_ provider ID of the resource to lookup.
    * @param state Any extra arguments used during the lookup.
    */
  def get(name: java.lang.String, id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID]): atPulumiAwsLib.elasticsearchDomainMod.Domain = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticsearchDomainMod.DomainState
  ): atPulumiAwsLib.elasticsearchDomainMod.Domain = js.native
  def get(
    name: java.lang.String,
    id: atPulumiPulumiLib.outputMod.Input[atPulumiPulumiLib.resourceMod.ID],
    state: atPulumiAwsLib.elasticsearchDomainMod.DomainState,
    opts: atPulumiPulumiLib.resourceMod.CustomResourceOptions
  ): atPulumiAwsLib.elasticsearchDomainMod.Domain = js.native
}

