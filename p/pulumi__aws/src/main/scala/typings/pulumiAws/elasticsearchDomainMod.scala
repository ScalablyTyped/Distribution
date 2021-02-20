package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.documentsMod.PolicyDocument
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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticsearchDomainMod {
  
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
  object Domain {
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @JSImport("@pulumi/aws/elasticsearch/domain", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID]): Domain = js.native
    @JSImport("@pulumi/aws/elasticsearch/domain", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: js.UndefOr[scala.Nothing], opts: CustomResourceOptions): Domain = js.native
    @JSImport("@pulumi/aws/elasticsearch/domain", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState): Domain = js.native
    @JSImport("@pulumi/aws/elasticsearch/domain", "Domain.get")
    @js.native
    def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = js.native
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @JSImport("@pulumi/aws/elasticsearch/domain", "Domain.isInstance")
    @js.native
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = js.native
  }
  
  @js.native
  trait DomainArgs extends StObject {
    
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
    val advancedSecurityOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions]] = js.native
    
    /**
      * Cluster configuration of the domain, see below.
      */
    val clusterConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig]] = js.native
    
    val cognitoOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions]] = js.native
    
    /**
      * Domain endpoint HTTP(S) related options. See below.
      */
    val domainEndpointOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions]] = js.native
    
    /**
      * Name of the domain.
      */
    val domainName: js.UndefOr[Input[String]] = js.native
    
    /**
      * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
      */
    val ebsOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions]] = js.native
    
    /**
      * The version of Elasticsearch to deploy. Defaults to `1.5`
      */
    val elasticsearchVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
      */
    val encryptAtRest: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest]] = js.native
    
    /**
      * Options for publishing slow  and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource.
      */
    val logPublishingOptions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]]
        ]
      ] = js.native
    
    /**
      * Node-to-node encryption options. See below.
      */
    val nodeToNodeEncryption: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption]] = js.native
    
    /**
      * Snapshot related options, see below.
      */
    val snapshotOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions]] = js.native
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
      */
    val vpcOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions]] = js.native
  }
  object DomainArgs {
    
    @scala.inline
    def apply(): DomainArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainArgs]
    }
    
    @scala.inline
    implicit class DomainArgsMutableBuilder[Self <: DomainArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicies(value: Input[String | PolicyDocument]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPoliciesUndefined: Self = StObject.set(x, "accessPolicies", js.undefined)
      
      @scala.inline
      def setAdvancedOptions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "advancedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedOptionsUndefined: Self = StObject.set(x, "advancedOptions", js.undefined)
      
      @scala.inline
      def setAdvancedSecurityOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions]): Self = StObject.set(x, "advancedSecurityOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "advancedSecurityOptions", js.undefined)
      
      @scala.inline
      def setClusterConfig(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig]): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
      
      @scala.inline
      def setCognitoOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions]): Self = StObject.set(x, "cognitoOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoOptionsUndefined: Self = StObject.set(x, "cognitoOptions", js.undefined)
      
      @scala.inline
      def setDomainEndpointOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions]): Self = StObject.set(x, "domainEndpointOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "domainEndpointOptions", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setEbsOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions]): Self = StObject.set(x, "ebsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptionsUndefined: Self = StObject.set(x, "ebsOptions", js.undefined)
      
      @scala.inline
      def setElasticsearchVersion(value: Input[String]): Self = StObject.set(x, "elasticsearchVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchVersionUndefined: Self = StObject.set(x, "elasticsearchVersion", js.undefined)
      
      @scala.inline
      def setEncryptAtRest(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest]): Self = StObject.set(x, "encryptAtRest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptAtRestUndefined: Self = StObject.set(x, "encryptAtRest", js.undefined)
      
      @scala.inline
      def setLogPublishingOptions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]]
            ]
      ): Self = StObject.set(x, "logPublishingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogPublishingOptionsUndefined: Self = StObject.set(x, "logPublishingOptions", js.undefined)
      
      @scala.inline
      def setLogPublishingOptionsVarargs(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]*): Self = StObject.set(x, "logPublishingOptions", js.Array(value :_*))
      
      @scala.inline
      def setNodeToNodeEncryption(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption]): Self = StObject.set(x, "nodeToNodeEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeToNodeEncryptionUndefined: Self = StObject.set(x, "nodeToNodeEncryption", js.undefined)
      
      @scala.inline
      def setSnapshotOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions]): Self = StObject.set(x, "snapshotOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotOptionsUndefined: Self = StObject.set(x, "snapshotOptions", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions]): Self = StObject.set(x, "vpcOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcOptionsUndefined: Self = StObject.set(x, "vpcOptions", js.undefined)
    }
  }
  
  @js.native
  trait DomainState extends StObject {
    
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
    val advancedSecurityOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the domain.
      */
    val arn: js.UndefOr[Input[String]] = js.native
    
    /**
      * Cluster configuration of the domain, see below.
      */
    val clusterConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig]] = js.native
    
    val cognitoOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions]] = js.native
    
    /**
      * Domain endpoint HTTP(S) related options. See below.
      */
    val domainEndpointOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions]] = js.native
    
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
    val ebsOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions]] = js.native
    
    /**
      * The version of Elasticsearch to deploy. Defaults to `1.5`
      */
    val elasticsearchVersion: js.UndefOr[Input[String]] = js.native
    
    /**
      * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
      */
    val encryptAtRest: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest]] = js.native
    
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
      * Options for publishing slow  and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource.
      */
    val logPublishingOptions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]]
        ]
      ] = js.native
    
    /**
      * Node-to-node encryption options. See below.
      */
    val nodeToNodeEncryption: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption]] = js.native
    
    /**
      * Snapshot related options, see below.
      */
    val snapshotOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions]] = js.native
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
      */
    val vpcOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions]] = js.native
  }
  object DomainState {
    
    @scala.inline
    def apply(): DomainState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainState]
    }
    
    @scala.inline
    implicit class DomainStateMutableBuilder[Self <: DomainState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccessPolicies(value: Input[String | PolicyDocument]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessPoliciesUndefined: Self = StObject.set(x, "accessPolicies", js.undefined)
      
      @scala.inline
      def setAdvancedOptions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "advancedOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedOptionsUndefined: Self = StObject.set(x, "advancedOptions", js.undefined)
      
      @scala.inline
      def setAdvancedSecurityOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions]): Self = StObject.set(x, "advancedSecurityOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "advancedSecurityOptions", js.undefined)
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setClusterConfig(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig]): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
      
      @scala.inline
      def setCognitoOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions]): Self = StObject.set(x, "cognitoOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCognitoOptionsUndefined: Self = StObject.set(x, "cognitoOptions", js.undefined)
      
      @scala.inline
      def setDomainEndpointOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions]): Self = StObject.set(x, "domainEndpointOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "domainEndpointOptions", js.undefined)
      
      @scala.inline
      def setDomainId(value: Input[String]): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setEbsOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions]): Self = StObject.set(x, "ebsOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEbsOptionsUndefined: Self = StObject.set(x, "ebsOptions", js.undefined)
      
      @scala.inline
      def setElasticsearchVersion(value: Input[String]): Self = StObject.set(x, "elasticsearchVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticsearchVersionUndefined: Self = StObject.set(x, "elasticsearchVersion", js.undefined)
      
      @scala.inline
      def setEncryptAtRest(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest]): Self = StObject.set(x, "encryptAtRest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptAtRestUndefined: Self = StObject.set(x, "encryptAtRest", js.undefined)
      
      @scala.inline
      def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      @scala.inline
      def setKibanaEndpoint(value: Input[String]): Self = StObject.set(x, "kibanaEndpoint", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKibanaEndpointUndefined: Self = StObject.set(x, "kibanaEndpoint", js.undefined)
      
      @scala.inline
      def setLogPublishingOptions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]]
            ]
      ): Self = StObject.set(x, "logPublishingOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogPublishingOptionsUndefined: Self = StObject.set(x, "logPublishingOptions", js.undefined)
      
      @scala.inline
      def setLogPublishingOptionsVarargs(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]*): Self = StObject.set(x, "logPublishingOptions", js.Array(value :_*))
      
      @scala.inline
      def setNodeToNodeEncryption(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption]): Self = StObject.set(x, "nodeToNodeEncryption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNodeToNodeEncryptionUndefined: Self = StObject.set(x, "nodeToNodeEncryption", js.undefined)
      
      @scala.inline
      def setSnapshotOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions]): Self = StObject.set(x, "snapshotOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSnapshotOptionsUndefined: Self = StObject.set(x, "snapshotOptions", js.undefined)
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setVpcOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions]): Self = StObject.set(x, "vpcOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcOptionsUndefined: Self = StObject.set(x, "vpcOptions", js.undefined)
    }
  }
}
