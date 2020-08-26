package typings.pulumiAws.domainMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.documentsMod.PolicyDocument
import typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions
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
  val advancedOptions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * Options for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). See below for more details.
    */
  val advancedSecurityOptions: js.UndefOr[Input[DomainAdvancedSecurityOptions]] = js.native
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
    * A map of tags to assign to the resource
    */
  val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
  /**
    * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
    */
  val vpcOptions: js.UndefOr[Input[DomainVpcOptions]] = js.native
}

object DomainState {
  @scala.inline
  def apply(): DomainState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainState]
  }
  @scala.inline
  implicit class DomainStateOps[Self <: DomainState] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessPolicies(value: Input[String | PolicyDocument]): Self = this.set("accessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessPolicies: Self = this.set("accessPolicies", js.undefined)
    @scala.inline
    def setAdvancedOptions(value: Input[StringDictionary[Input[String]]]): Self = this.set("advancedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedOptions: Self = this.set("advancedOptions", js.undefined)
    @scala.inline
    def setAdvancedSecurityOptions(value: Input[DomainAdvancedSecurityOptions]): Self = this.set("advancedSecurityOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdvancedSecurityOptions: Self = this.set("advancedSecurityOptions", js.undefined)
    @scala.inline
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    @scala.inline
    def setClusterConfig(value: Input[DomainClusterConfig]): Self = this.set("clusterConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClusterConfig: Self = this.set("clusterConfig", js.undefined)
    @scala.inline
    def setCognitoOptions(value: Input[DomainCognitoOptions]): Self = this.set("cognitoOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCognitoOptions: Self = this.set("cognitoOptions", js.undefined)
    @scala.inline
    def setDomainEndpointOptions(value: Input[DomainDomainEndpointOptions]): Self = this.set("domainEndpointOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainEndpointOptions: Self = this.set("domainEndpointOptions", js.undefined)
    @scala.inline
    def setDomainId(value: Input[String]): Self = this.set("domainId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainId: Self = this.set("domainId", js.undefined)
    @scala.inline
    def setDomainName(value: Input[String]): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomainName: Self = this.set("domainName", js.undefined)
    @scala.inline
    def setEbsOptions(value: Input[DomainEbsOptions]): Self = this.set("ebsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEbsOptions: Self = this.set("ebsOptions", js.undefined)
    @scala.inline
    def setElasticsearchVersion(value: Input[String]): Self = this.set("elasticsearchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElasticsearchVersion: Self = this.set("elasticsearchVersion", js.undefined)
    @scala.inline
    def setEncryptAtRest(value: Input[DomainEncryptAtRest]): Self = this.set("encryptAtRest", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEncryptAtRest: Self = this.set("encryptAtRest", js.undefined)
    @scala.inline
    def setEndpoint(value: Input[String]): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndpoint: Self = this.set("endpoint", js.undefined)
    @scala.inline
    def setKibanaEndpoint(value: Input[String]): Self = this.set("kibanaEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKibanaEndpoint: Self = this.set("kibanaEndpoint", js.undefined)
    @scala.inline
    def setLogPublishingOptionsVarargs(value: Input[DomainLogPublishingOption]*): Self = this.set("logPublishingOptions", js.Array(value :_*))
    @scala.inline
    def setLogPublishingOptions(value: Input[js.Array[Input[DomainLogPublishingOption]]]): Self = this.set("logPublishingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLogPublishingOptions: Self = this.set("logPublishingOptions", js.undefined)
    @scala.inline
    def setNodeToNodeEncryption(value: Input[DomainNodeToNodeEncryption]): Self = this.set("nodeToNodeEncryption", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNodeToNodeEncryption: Self = this.set("nodeToNodeEncryption", js.undefined)
    @scala.inline
    def setSnapshotOptions(value: Input[DomainSnapshotOptions]): Self = this.set("snapshotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSnapshotOptions: Self = this.set("snapshotOptions", js.undefined)
    @scala.inline
    def setTags(value: Input[StringDictionary[Input[String]]]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setVpcOptions(value: Input[DomainVpcOptions]): Self = this.set("vpcOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcOptions: Self = this.set("vpcOptions", js.undefined)
  }
  
}

