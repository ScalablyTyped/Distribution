package typings.atPulumiAws.elasticsearchDomainMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.elasticsearch.DomainClusterConfig
import typings.atPulumiAws.typesOutputMod.elasticsearch.DomainCognitoOptions
import typings.atPulumiAws.typesOutputMod.elasticsearch.DomainEbsOptions
import typings.atPulumiAws.typesOutputMod.elasticsearch.DomainEncryptAtRest
import typings.atPulumiAws.typesOutputMod.elasticsearch.DomainLogPublishingOption
import typings.atPulumiAws.typesOutputMod.elasticsearch.DomainNodeToNodeEncryption
import typings.atPulumiAws.typesOutputMod.elasticsearch.DomainSnapshotOptions
import typings.atPulumiAws.typesOutputMod.elasticsearch.DomainVpcOptions
import typings.atPulumiPulumi.atPulumiPulumiMod.CustomResource
import typings.atPulumiPulumi.outputMod.Input
import typings.atPulumiPulumi.outputMod.Output
import typings.atPulumiPulumi.resourceMod.CustomResourceOptions
import typings.atPulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/aws/elasticsearch/domain", "Domain")
@js.native
class Domain protected () extends CustomResource {
  /**
    * Create a Domain resource with the given unique name, arguments, and options.
    *
    * @param name The _unique_ name of the resource.
    * @param args The arguments to use to populate this resource's properties.
    * @param opts A bag of options that control this resource's behavior.
    */
  def this(name: String) = this()
  def this(name: String, args: DomainArgs) = this()
  def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: Output[String] = js.native
  /**
    * Key-value string pairs to specify advanced configuration options.
    * Note that the values for these configuration options must be strings (wrapped in quotes) or they
    * may be wrong and cause a perpetual diff, causing this provider to want to recreate your Elasticsearch
    * domain on every apply.
    */
  val advancedOptions: Output[StringDictionary[_]] = js.native
  /**
    * Amazon Resource Name (ARN) of the domain.
    */
  val arn: Output[String] = js.native
  /**
    * Cluster configuration of the domain, see below.
    */
  val clusterConfig: Output[DomainClusterConfig] = js.native
  val cognitoOptions: Output[js.UndefOr[DomainCognitoOptions]] = js.native
  /**
    * Unique identifier for the domain.
    */
  val domainId: Output[String] = js.native
  /**
    * Name of the domain.
    */
  val domainName: Output[String] = js.native
  /**
    * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
    */
  val ebsOptions: Output[DomainEbsOptions] = js.native
  /**
    * The version of Elasticsearch to deploy. Defaults to `1.5`
    */
  val elasticsearchVersion: Output[js.UndefOr[String]] = js.native
  /**
    * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
    */
  val encryptAtRest: Output[DomainEncryptAtRest] = js.native
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: Output[String] = js.native
  /**
    * Domain-specific endpoint for kibana without https scheme.
    * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnetIds` were created inside.
    * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
    */
  val kibanaEndpoint: Output[String] = js.native
  /**
    * Options for publishing slow logs to CloudWatch Logs.
    */
  val logPublishingOptions: Output[js.UndefOr[js.Array[DomainLogPublishingOption]]] = js.native
  /**
    * Node-to-node encryption options. See below.
    */
  val nodeToNodeEncryption: Output[DomainNodeToNodeEncryption] = js.native
  /**
    * Snapshot related options, see below.
    */
  val snapshotOptions: Output[js.UndefOr[DomainSnapshotOptions]] = js.native
  /**
    * A mapping of tags to assign to the resource
    */
  val tags: Output[js.UndefOr[StringDictionary[_]]] = js.native
  /**
    * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
    */
  val vpcOptions: Output[js.UndefOr[DomainVpcOptions]] = js.native
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
  def get(name: String, id: Input[ID]): Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState): Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = js.native
  /**
    * Returns true if the given object is an instance of Domain.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = js.native
}

