package typings.pulumiAws.elasticsearchDomainMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticsearch.DomainAdvancedSecurityOptions
import typings.pulumiAws.outputMod.elasticsearch.DomainClusterConfig
import typings.pulumiAws.outputMod.elasticsearch.DomainCognitoOptions
import typings.pulumiAws.outputMod.elasticsearch.DomainDomainEndpointOptions
import typings.pulumiAws.outputMod.elasticsearch.DomainEbsOptions
import typings.pulumiAws.outputMod.elasticsearch.DomainEncryptAtRest
import typings.pulumiAws.outputMod.elasticsearch.DomainLogPublishingOption
import typings.pulumiAws.outputMod.elasticsearch.DomainNodeToNodeEncryption
import typings.pulumiAws.outputMod.elasticsearch.DomainSnapshotOptions
import typings.pulumiAws.outputMod.elasticsearch.DomainVpcOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  def this(name: String, args: js.UndefOr[scala.Nothing], opts: CustomResourceOptions) = this()
  def this(name: String, args: DomainArgs, opts: CustomResourceOptions) = this()
  
  /**
    * IAM policy document specifying the access policies for the domain
    */
  val accessPolicies: Output_[String] = js.native
  
  /**
    * Key-value string pairs to specify advanced configuration options.
    * Note that the values for these configuration options must be strings (wrapped in quotes) or they
    * may be wrong and cause a perpetual diff, causing this provider to want to recreate your Elasticsearch
    * domain on every apply.
    */
  val advancedOptions: Output_[StringDictionary[String]] = js.native
  
  /**
    * Options for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). See below for more details.
    */
  val advancedSecurityOptions: Output_[DomainAdvancedSecurityOptions] = js.native
  
  /**
    * Amazon Resource Name (ARN) of the domain.
    */
  val arn: Output_[String] = js.native
  
  /**
    * Cluster configuration of the domain, see below.
    */
  val clusterConfig: Output_[DomainClusterConfig] = js.native
  
  val cognitoOptions: Output_[js.UndefOr[DomainCognitoOptions]] = js.native
  
  /**
    * Domain endpoint HTTP(S) related options. See below.
    */
  val domainEndpointOptions: Output_[DomainDomainEndpointOptions] = js.native
  
  /**
    * Unique identifier for the domain.
    */
  val domainId: Output_[String] = js.native
  
  /**
    * Name of the domain.
    */
  val domainName: Output_[String] = js.native
  
  /**
    * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
    */
  val ebsOptions: Output_[DomainEbsOptions] = js.native
  
  /**
    * The version of Elasticsearch to deploy. Defaults to `1.5`
    */
  val elasticsearchVersion: Output_[js.UndefOr[String]] = js.native
  
  /**
    * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
    */
  val encryptAtRest: Output_[DomainEncryptAtRest] = js.native
  
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: Output_[String] = js.native
  
  /**
    * Domain-specific endpoint for kibana without https scheme.
    * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnetIds` were created inside.
    * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
    */
  val kibanaEndpoint: Output_[String] = js.native
  
  /**
    * Options for publishing slow  and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource.
    */
  val logPublishingOptions: Output_[js.UndefOr[js.Array[DomainLogPublishingOption]]] = js.native
  
  /**
    * Node-to-node encryption options. See below.
    */
  val nodeToNodeEncryption: Output_[DomainNodeToNodeEncryption] = js.native
  
  /**
    * Snapshot related options, see below.
    */
  val snapshotOptions: Output_[js.UndefOr[DomainSnapshotOptions]] = js.native
  
  /**
    * A map of tags to assign to the resource
    */
  val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
  
  /**
    * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
    */
  val vpcOptions: Output_[js.UndefOr[DomainVpcOptions]] = js.native
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
    * @param opts Optional settings to control the behavior of the CustomResource.
    */
  def get(name: String, id: Input[ID]): Domain = js.native
  def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState): Domain = js.native
  def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = js.native
  
  /**
    * Returns true if the given object is an instance of Domain.  This is designed to work even
    * when multiple copies of the Pulumi SDK have been loaded into the same process.
    */
  def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = js.native
}
