package typings.pulumiAws.getDomainMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.elasticsearch.GetDomainAdvancedSecurityOption
import typings.pulumiAws.outputMod.elasticsearch.GetDomainClusterConfig
import typings.pulumiAws.outputMod.elasticsearch.GetDomainCognitoOption
import typings.pulumiAws.outputMod.elasticsearch.GetDomainEbsOption
import typings.pulumiAws.outputMod.elasticsearch.GetDomainEncryptionAtRest
import typings.pulumiAws.outputMod.elasticsearch.GetDomainLogPublishingOption
import typings.pulumiAws.outputMod.elasticsearch.GetDomainNodeToNodeEncryption
import typings.pulumiAws.outputMod.elasticsearch.GetDomainSnapshotOption
import typings.pulumiAws.outputMod.elasticsearch.GetDomainVpcOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDomainResult extends js.Object {
  /**
    * The policy document attached to the domain.
    */
  val accessPolicies: String = js.native
  /**
    * Key-value string pairs to specify advanced configuration options.
    */
  val advancedOptions: StringDictionary[String] = js.native
  /**
    * Status of the Elasticsearch domain's advanced security options. The block consists of the following attributes:
    */
  val advancedSecurityOptions: js.Array[GetDomainAdvancedSecurityOption] = js.native
  /**
    * The Amazon Resource Name (ARN) of the domain.
    */
  val arn: String = js.native
  /**
    * Cluster configuration of the domain.
    */
  val clusterConfigs: js.Array[GetDomainClusterConfig] = js.native
  /**
    * Domain Amazon Cognito Authentication options for Kibana.
    */
  val cognitoOptions: js.Array[GetDomainCognitoOption] = js.native
  /**
    * Status of the creation of the domain.
    */
  val created: Boolean = js.native
  /**
    * Status of the deletion of the domain.
    */
  val deleted: Boolean = js.native
  /**
    * Unique identifier for the domain.
    */
  val domainId: String = js.native
  val domainName: String = js.native
  /**
    * EBS Options for the instances in the domain.
    */
  val ebsOptions: js.Array[GetDomainEbsOption] = js.native
  /**
    * ElasticSearch version for the domain.
    */
  val elasticsearchVersion: String = js.native
  /**
    * Domain encryption at rest related options.
    */
  val encryptionAtRests: js.Array[GetDomainEncryptionAtRest] = js.native
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: String = js.native
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  /**
    * Domain-specific endpoint used to access the Kibana application.
    */
  val kibanaEndpoint: String = js.native
  /**
    * Domain log publishing related options.
    */
  val logPublishingOptions: js.Array[GetDomainLogPublishingOption] = js.native
  /**
    * Domain in transit encryption related options.
    */
  val nodeToNodeEncryptions: js.Array[GetDomainNodeToNodeEncryption] = js.native
  /**
    * Status of a configuration change in the domain.
    * * `snapshotOptions` – Domain snapshot related options.
    */
  val processing: Boolean = js.native
  val snapshotOptions: js.Array[GetDomainSnapshotOption] = js.native
  /**
    * The tags assigned to the domain.
    */
  val tags: StringDictionary[String] = js.native
  /**
    * VPC Options for private Elasticsearch domains.
    */
  val vpcOptions: js.Array[GetDomainVpcOption] = js.native
}

object GetDomainResult {
  @scala.inline
  def apply(
    accessPolicies: String,
    advancedOptions: StringDictionary[String],
    advancedSecurityOptions: js.Array[GetDomainAdvancedSecurityOption],
    arn: String,
    clusterConfigs: js.Array[GetDomainClusterConfig],
    cognitoOptions: js.Array[GetDomainCognitoOption],
    created: Boolean,
    deleted: Boolean,
    domainId: String,
    domainName: String,
    ebsOptions: js.Array[GetDomainEbsOption],
    elasticsearchVersion: String,
    encryptionAtRests: js.Array[GetDomainEncryptionAtRest],
    endpoint: String,
    id: String,
    kibanaEndpoint: String,
    logPublishingOptions: js.Array[GetDomainLogPublishingOption],
    nodeToNodeEncryptions: js.Array[GetDomainNodeToNodeEncryption],
    processing: Boolean,
    snapshotOptions: js.Array[GetDomainSnapshotOption],
    tags: StringDictionary[String],
    vpcOptions: js.Array[GetDomainVpcOption]
  ): GetDomainResult = {
    val __obj = js.Dynamic.literal(accessPolicies = accessPolicies.asInstanceOf[js.Any], advancedOptions = advancedOptions.asInstanceOf[js.Any], advancedSecurityOptions = advancedSecurityOptions.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], clusterConfigs = clusterConfigs.asInstanceOf[js.Any], cognitoOptions = cognitoOptions.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], ebsOptions = ebsOptions.asInstanceOf[js.Any], elasticsearchVersion = elasticsearchVersion.asInstanceOf[js.Any], encryptionAtRests = encryptionAtRests.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kibanaEndpoint = kibanaEndpoint.asInstanceOf[js.Any], logPublishingOptions = logPublishingOptions.asInstanceOf[js.Any], nodeToNodeEncryptions = nodeToNodeEncryptions.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], snapshotOptions = snapshotOptions.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcOptions = vpcOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainResult]
  }
  @scala.inline
  implicit class GetDomainResultOps[Self <: GetDomainResult] (val x: Self) extends AnyVal {
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
    def setAccessPolicies(value: String): Self = this.set("accessPolicies", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvancedOptions(value: StringDictionary[String]): Self = this.set("advancedOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAdvancedSecurityOptionsVarargs(value: GetDomainAdvancedSecurityOption*): Self = this.set("advancedSecurityOptions", js.Array(value :_*))
    @scala.inline
    def setAdvancedSecurityOptions(value: js.Array[GetDomainAdvancedSecurityOption]): Self = this.set("advancedSecurityOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setArn(value: String): Self = this.set("arn", value.asInstanceOf[js.Any])
    @scala.inline
    def setClusterConfigsVarargs(value: GetDomainClusterConfig*): Self = this.set("clusterConfigs", js.Array(value :_*))
    @scala.inline
    def setClusterConfigs(value: js.Array[GetDomainClusterConfig]): Self = this.set("clusterConfigs", value.asInstanceOf[js.Any])
    @scala.inline
    def setCognitoOptionsVarargs(value: GetDomainCognitoOption*): Self = this.set("cognitoOptions", js.Array(value :_*))
    @scala.inline
    def setCognitoOptions(value: js.Array[GetDomainCognitoOption]): Self = this.set("cognitoOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreated(value: Boolean): Self = this.set("created", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeleted(value: Boolean): Self = this.set("deleted", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainId(value: String): Self = this.set("domainId", value.asInstanceOf[js.Any])
    @scala.inline
    def setDomainName(value: String): Self = this.set("domainName", value.asInstanceOf[js.Any])
    @scala.inline
    def setEbsOptionsVarargs(value: GetDomainEbsOption*): Self = this.set("ebsOptions", js.Array(value :_*))
    @scala.inline
    def setEbsOptions(value: js.Array[GetDomainEbsOption]): Self = this.set("ebsOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setElasticsearchVersion(value: String): Self = this.set("elasticsearchVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setEncryptionAtRestsVarargs(value: GetDomainEncryptionAtRest*): Self = this.set("encryptionAtRests", js.Array(value :_*))
    @scala.inline
    def setEncryptionAtRests(value: js.Array[GetDomainEncryptionAtRest]): Self = this.set("encryptionAtRests", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoint(value: String): Self = this.set("endpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setKibanaEndpoint(value: String): Self = this.set("kibanaEndpoint", value.asInstanceOf[js.Any])
    @scala.inline
    def setLogPublishingOptionsVarargs(value: GetDomainLogPublishingOption*): Self = this.set("logPublishingOptions", js.Array(value :_*))
    @scala.inline
    def setLogPublishingOptions(value: js.Array[GetDomainLogPublishingOption]): Self = this.set("logPublishingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setNodeToNodeEncryptionsVarargs(value: GetDomainNodeToNodeEncryption*): Self = this.set("nodeToNodeEncryptions", js.Array(value :_*))
    @scala.inline
    def setNodeToNodeEncryptions(value: js.Array[GetDomainNodeToNodeEncryption]): Self = this.set("nodeToNodeEncryptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setProcessing(value: Boolean): Self = this.set("processing", value.asInstanceOf[js.Any])
    @scala.inline
    def setSnapshotOptionsVarargs(value: GetDomainSnapshotOption*): Self = this.set("snapshotOptions", js.Array(value :_*))
    @scala.inline
    def setSnapshotOptions(value: js.Array[GetDomainSnapshotOption]): Self = this.set("snapshotOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTags(value: StringDictionary[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def setVpcOptionsVarargs(value: GetDomainVpcOption*): Self = this.set("vpcOptions", js.Array(value :_*))
    @scala.inline
    def setVpcOptions(value: js.Array[GetDomainVpcOption]): Self = this.set("vpcOptions", value.asInstanceOf[js.Any])
  }
  
}

