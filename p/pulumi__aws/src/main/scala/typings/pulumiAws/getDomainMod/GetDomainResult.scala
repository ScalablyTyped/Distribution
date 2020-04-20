package typings.pulumiAws.getDomainMod

import org.scalablytyped.runtime.StringDictionary
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
  val advancedOptions: StringDictionary[js.Any] = js.native
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
    * id is the provider-assigned unique ID for this managed resource.
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
  val processing: String = js.native
  val snapshotOptions: js.Array[GetDomainSnapshotOption] = js.native
  /**
    * The tags assigned to the domain.
    */
  val tags: StringDictionary[js.Any] = js.native
  /**
    * VPC Options for private Elasticsearch domains.
    */
  val vpcOptions: js.Array[GetDomainVpcOption] = js.native
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
    val __obj = js.Dynamic.literal(accessPolicies = accessPolicies.asInstanceOf[js.Any], advancedOptions = advancedOptions.asInstanceOf[js.Any], arn = arn.asInstanceOf[js.Any], clusterConfigs = clusterConfigs.asInstanceOf[js.Any], cognitoOptions = cognitoOptions.asInstanceOf[js.Any], created = created.asInstanceOf[js.Any], deleted = deleted.asInstanceOf[js.Any], domainId = domainId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any], ebsOptions = ebsOptions.asInstanceOf[js.Any], elasticsearchVersion = elasticsearchVersion.asInstanceOf[js.Any], encryptionAtRests = encryptionAtRests.asInstanceOf[js.Any], endpoint = endpoint.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], kibanaEndpoint = kibanaEndpoint.asInstanceOf[js.Any], logPublishingOptions = logPublishingOptions.asInstanceOf[js.Any], nodeToNodeEncryptions = nodeToNodeEncryptions.asInstanceOf[js.Any], processing = processing.asInstanceOf[js.Any], snapshotOptions = snapshotOptions.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any], vpcOptions = vpcOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDomainResult]
  }
}

