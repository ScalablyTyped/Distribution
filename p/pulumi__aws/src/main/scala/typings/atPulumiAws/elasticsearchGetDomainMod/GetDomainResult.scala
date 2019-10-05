package typings.atPulumiAws.elasticsearchGetDomainMod

import org.scalablytyped.runtime.StringDictionary
import typings.atPulumiAws.typesOutputMod.elasticsearch.GetDomainClusterConfig
import typings.atPulumiAws.typesOutputMod.elasticsearch.GetDomainCognitoOption
import typings.atPulumiAws.typesOutputMod.elasticsearch.GetDomainEbsOption
import typings.atPulumiAws.typesOutputMod.elasticsearch.GetDomainEncryptionAtRest
import typings.atPulumiAws.typesOutputMod.elasticsearch.GetDomainLogPublishingOption
import typings.atPulumiAws.typesOutputMod.elasticsearch.GetDomainNodeToNodeEncryption
import typings.atPulumiAws.typesOutputMod.elasticsearch.GetDomainSnapshotOption
import typings.atPulumiAws.typesOutputMod.elasticsearch.GetDomainVpcOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetDomainResult extends js.Object {
  /**
    * The policy document attached to the domain.
    */
  val accessPolicies: String
  /**
    * Key-value string pairs to specify advanced configuration options.
    */
  val advancedOptions: StringDictionary[js.Any]
  /**
    * The Amazon Resource Name (ARN) of the domain.
    */
  val arn: String
  /**
    * Cluster configuration of the domain.
    */
  val clusterConfigs: js.Array[GetDomainClusterConfig]
  /**
    * Domain Amazon Cognito Authentication options for Kibana.
    */
  val cognitoOptions: js.Array[GetDomainCognitoOption]
  /**
    * Status of the creation of the domain.
    */
  val created: Boolean
  /**
    * Status of the deletion of the domain.
    */
  val deleted: Boolean
  /**
    * Unique identifier for the domain.
    */
  val domainId: String
  val domainName: String
  /**
    * EBS Options for the instances in the domain.
    */
  val ebsOptions: js.Array[GetDomainEbsOption]
  /**
    * ElasticSearch version for the domain.
    */
  val elasticsearchVersion: String
  /**
    * Domain encryption at rest related options.
    */
  val encryptionAtRests: js.Array[GetDomainEncryptionAtRest]
  /**
    * Domain-specific endpoint used to submit index, search, and data upload requests.
    */
  val endpoint: String
  /**
    * id is the provider-assigned unique ID for this managed resource.
    */
  val id: String
  /**
    * Domain-specific endpoint used to access the Kibana application.
    */
  val kibanaEndpoint: String
  /**
    * Domain log publishing related options.
    */
  val logPublishingOptions: js.Array[GetDomainLogPublishingOption]
  /**
    * Domain in transit encryption related options.
    */
  val nodeToNodeEncryptions: js.Array[GetDomainNodeToNodeEncryption]
  /**
    * Status of a configuration change in the domain.
    * * `snapshotOptions` – Domain snapshot related options.
    */
  val processing: String
  val snapshotOptions: js.Array[GetDomainSnapshotOption]
  /**
    * The tags assigned to the domain.
    */
  val tags: StringDictionary[js.Any]
  /**
    * VPC Options for private Elasticsearch domains.
    */
  val vpcOptions: js.Array[GetDomainVpcOption]
}

object GetDomainResult {
  @scala.inline
  def apply(
    accessPolicies: String,
    advancedOptions: StringDictionary[js.Any],
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
    processing: String,
    snapshotOptions: js.Array[GetDomainSnapshotOption],
    tags: StringDictionary[js.Any],
    vpcOptions: js.Array[GetDomainVpcOption]
  ): GetDomainResult = {
    val __obj = js.Dynamic.literal(accessPolicies = accessPolicies, advancedOptions = advancedOptions, arn = arn, clusterConfigs = clusterConfigs, cognitoOptions = cognitoOptions, created = created, deleted = deleted, domainId = domainId, domainName = domainName, ebsOptions = ebsOptions, elasticsearchVersion = elasticsearchVersion, encryptionAtRests = encryptionAtRests, endpoint = endpoint, id = id, kibanaEndpoint = kibanaEndpoint, logPublishingOptions = logPublishingOptions, nodeToNodeEncryptions = nodeToNodeEncryptions, processing = processing, snapshotOptions = snapshotOptions, tags = tags, vpcOptions = vpcOptions)
  
    __obj.asInstanceOf[GetDomainResult]
  }
}

