package typings.pulumiAws

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
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object getDomainMod {
  
  @JSImport("@pulumi/aws/elasticsearch/getDomain", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getDomain(args: GetDomainArgs): js.Promise[GetDomainResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetDomainResult]]
  @scala.inline
  def getDomain(args: GetDomainArgs, opts: InvokeOptions): js.Promise[GetDomainResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getDomain")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetDomainResult]]
  
  trait GetDomainArgs extends StObject {
    
    /**
      * Name of the domain.
      */
    val domainName: String
    
    /**
      * The tags assigned to the domain.
      */
    val tags: js.UndefOr[StringDictionary[String]] = js.undefined
  }
  object GetDomainArgs {
    
    @scala.inline
    def apply(domainName: String): GetDomainArgs = {
      val __obj = js.Dynamic.literal(domainName = domainName.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDomainArgs]
    }
    
    @scala.inline
    implicit class GetDomainArgsMutableBuilder[Self <: GetDomainArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    }
  }
  
  trait GetDomainResult extends StObject {
    
    /**
      * The policy document attached to the domain.
      */
    val accessPolicies: String
    
    /**
      * Key-value string pairs to specify advanced configuration options.
      */
    val advancedOptions: StringDictionary[String]
    
    /**
      * Status of the Elasticsearch domain's advanced security options. The block consists of the following attributes:
      */
    val advancedSecurityOptions: js.Array[GetDomainAdvancedSecurityOption]
    
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
      * The provider-assigned unique ID for this managed resource.
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
    val processing: Boolean
    
    val snapshotOptions: js.Array[GetDomainSnapshotOption]
    
    /**
      * The tags assigned to the domain.
      */
    val tags: StringDictionary[String]
    
    /**
      * VPC Options for private Elasticsearch domains.
      */
    val vpcOptions: js.Array[GetDomainVpcOption]
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
    implicit class GetDomainResultMutableBuilder[Self <: GetDomainResult] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicies(value: String): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedOptions(value: StringDictionary[String]): Self = StObject.set(x, "advancedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedSecurityOptions(value: js.Array[GetDomainAdvancedSecurityOption]): Self = StObject.set(x, "advancedSecurityOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedSecurityOptionsVarargs(value: GetDomainAdvancedSecurityOption*): Self = StObject.set(x, "advancedSecurityOptions", js.Array(value :_*))
      
      @scala.inline
      def setArn(value: String): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterConfigs(value: js.Array[GetDomainClusterConfig]): Self = StObject.set(x, "clusterConfigs", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterConfigsVarargs(value: GetDomainClusterConfig*): Self = StObject.set(x, "clusterConfigs", js.Array(value :_*))
      
      @scala.inline
      def setCognitoOptions(value: js.Array[GetDomainCognitoOption]): Self = StObject.set(x, "cognitoOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoOptionsVarargs(value: GetDomainCognitoOption*): Self = StObject.set(x, "cognitoOptions", js.Array(value :_*))
      
      @scala.inline
      def setCreated(value: Boolean): Self = StObject.set(x, "created", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeleted(value: Boolean): Self = StObject.set(x, "deleted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainId(value: String): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainName(value: String): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptions(value: js.Array[GetDomainEbsOption]): Self = StObject.set(x, "ebsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptionsVarargs(value: GetDomainEbsOption*): Self = StObject.set(x, "ebsOptions", js.Array(value :_*))
      
      @scala.inline
      def setElasticsearchVersion(value: String): Self = StObject.set(x, "elasticsearchVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionAtRests(value: js.Array[GetDomainEncryptionAtRest]): Self = StObject.set(x, "encryptionAtRests", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionAtRestsVarargs(value: GetDomainEncryptionAtRest*): Self = StObject.set(x, "encryptionAtRests", js.Array(value :_*))
      
      @scala.inline
      def setEndpoint(value: String): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKibanaEndpoint(value: String): Self = StObject.set(x, "kibanaEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogPublishingOptions(value: js.Array[GetDomainLogPublishingOption]): Self = StObject.set(x, "logPublishingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogPublishingOptionsVarargs(value: GetDomainLogPublishingOption*): Self = StObject.set(x, "logPublishingOptions", js.Array(value :_*))
      
      @scala.inline
      def setNodeToNodeEncryptions(value: js.Array[GetDomainNodeToNodeEncryption]): Self = StObject.set(x, "nodeToNodeEncryptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeToNodeEncryptionsVarargs(value: GetDomainNodeToNodeEncryption*): Self = StObject.set(x, "nodeToNodeEncryptions", js.Array(value :_*))
      
      @scala.inline
      def setProcessing(value: Boolean): Self = StObject.set(x, "processing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotOptions(value: js.Array[GetDomainSnapshotOption]): Self = StObject.set(x, "snapshotOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotOptionsVarargs(value: GetDomainSnapshotOption*): Self = StObject.set(x, "snapshotOptions", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: StringDictionary[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcOptions(value: js.Array[GetDomainVpcOption]): Self = StObject.set(x, "vpcOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcOptionsVarargs(value: GetDomainVpcOption*): Self = StObject.set(x, "vpcOptions", js.Array(value :_*))
    }
  }
}
