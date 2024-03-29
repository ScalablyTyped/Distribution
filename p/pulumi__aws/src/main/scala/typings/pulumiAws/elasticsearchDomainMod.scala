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
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
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
    
    @JSImport("@pulumi/aws/elasticsearch/domain", "Domain")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Domain resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    inline def get(name: String, id: Input[ID]): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Domain]
    inline def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Domain]
    inline def get(name: String, id: Input[ID], state: DomainState): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Domain]
    inline def get(name: String, id: Input[ID], state: DomainState, opts: CustomResourceOptions): Domain = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Domain]
    
    /**
      * Returns true if the given object is an instance of Domain.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    inline def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/elasticsearch/domain.Domain */ Boolean]
  }
  
  trait DomainArgs extends StObject {
    
    /**
      * IAM policy document specifying the access policies for the domain
      */
    val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
    
    /**
      * Key-value string pairs to specify advanced configuration options.
      * Note that the values for these configuration options must be strings (wrapped in quotes) or they
      * may be wrong and cause a perpetual diff, causing this provider to want to recreate your Elasticsearch
      * domain on every apply.
      */
    val advancedOptions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Options for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). See below for more details.
      */
    val advancedSecurityOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions]] = js.undefined
    
    /**
      * Cluster configuration of the domain, see below.
      */
    val clusterConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig]] = js.undefined
    
    val cognitoOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions]] = js.undefined
    
    /**
      * Domain endpoint HTTP(S) related options. See below.
      */
    val domainEndpointOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions]] = js.undefined
    
    /**
      * Name of the domain.
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
      */
    val ebsOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions]] = js.undefined
    
    /**
      * The version of Elasticsearch to deploy. Defaults to `1.5`
      */
    val elasticsearchVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
      */
    val encryptAtRest: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest]] = js.undefined
    
    /**
      * Options for publishing slow  and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource.
      */
    val logPublishingOptions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]]
        ]
      ] = js.undefined
    
    /**
      * Node-to-node encryption options. See below.
      */
    val nodeToNodeEncryption: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption]] = js.undefined
    
    /**
      * Snapshot related options, see below.
      */
    val snapshotOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions]] = js.undefined
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
      */
    val vpcOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions]] = js.undefined
  }
  object DomainArgs {
    
    inline def apply(): DomainArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainArgs]
    }
    
    extension [Self <: DomainArgs](x: Self) {
      
      inline def setAccessPolicies(value: Input[String | PolicyDocument]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      inline def setAccessPoliciesUndefined: Self = StObject.set(x, "accessPolicies", js.undefined)
      
      inline def setAdvancedOptions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "advancedOptions", value.asInstanceOf[js.Any])
      
      inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "advancedOptions", js.undefined)
      
      inline def setAdvancedSecurityOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions]): Self = StObject.set(x, "advancedSecurityOptions", value.asInstanceOf[js.Any])
      
      inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "advancedSecurityOptions", js.undefined)
      
      inline def setClusterConfig(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig]): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
      
      inline def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
      
      inline def setCognitoOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions]): Self = StObject.set(x, "cognitoOptions", value.asInstanceOf[js.Any])
      
      inline def setCognitoOptionsUndefined: Self = StObject.set(x, "cognitoOptions", js.undefined)
      
      inline def setDomainEndpointOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions]): Self = StObject.set(x, "domainEndpointOptions", value.asInstanceOf[js.Any])
      
      inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "domainEndpointOptions", js.undefined)
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setEbsOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions]): Self = StObject.set(x, "ebsOptions", value.asInstanceOf[js.Any])
      
      inline def setEbsOptionsUndefined: Self = StObject.set(x, "ebsOptions", js.undefined)
      
      inline def setElasticsearchVersion(value: Input[String]): Self = StObject.set(x, "elasticsearchVersion", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchVersionUndefined: Self = StObject.set(x, "elasticsearchVersion", js.undefined)
      
      inline def setEncryptAtRest(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest]): Self = StObject.set(x, "encryptAtRest", value.asInstanceOf[js.Any])
      
      inline def setEncryptAtRestUndefined: Self = StObject.set(x, "encryptAtRest", js.undefined)
      
      inline def setLogPublishingOptions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]]
            ]
      ): Self = StObject.set(x, "logPublishingOptions", value.asInstanceOf[js.Any])
      
      inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "logPublishingOptions", js.undefined)
      
      inline def setLogPublishingOptionsVarargs(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]*): Self = StObject.set(x, "logPublishingOptions", js.Array(value :_*))
      
      inline def setNodeToNodeEncryption(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption]): Self = StObject.set(x, "nodeToNodeEncryption", value.asInstanceOf[js.Any])
      
      inline def setNodeToNodeEncryptionUndefined: Self = StObject.set(x, "nodeToNodeEncryption", js.undefined)
      
      inline def setSnapshotOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions]): Self = StObject.set(x, "snapshotOptions", value.asInstanceOf[js.Any])
      
      inline def setSnapshotOptionsUndefined: Self = StObject.set(x, "snapshotOptions", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions]): Self = StObject.set(x, "vpcOptions", value.asInstanceOf[js.Any])
      
      inline def setVpcOptionsUndefined: Self = StObject.set(x, "vpcOptions", js.undefined)
    }
  }
  
  trait DomainState extends StObject {
    
    /**
      * IAM policy document specifying the access policies for the domain
      */
    val accessPolicies: js.UndefOr[Input[String | PolicyDocument]] = js.undefined
    
    /**
      * Key-value string pairs to specify advanced configuration options.
      * Note that the values for these configuration options must be strings (wrapped in quotes) or they
      * may be wrong and cause a perpetual diff, causing this provider to want to recreate your Elasticsearch
      * domain on every apply.
      */
    val advancedOptions: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Options for [fine-grained access control](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/fgac.html). See below for more details.
      */
    val advancedSecurityOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the domain.
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Cluster configuration of the domain, see below.
      */
    val clusterConfig: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig]] = js.undefined
    
    val cognitoOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions]] = js.undefined
    
    /**
      * Domain endpoint HTTP(S) related options. See below.
      */
    val domainEndpointOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions]] = js.undefined
    
    /**
      * Unique identifier for the domain.
      */
    val domainId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Name of the domain.
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * EBS related options, may be required based on chosen [instance size](https://aws.amazon.com/elasticsearch-service/pricing/). See below.
      */
    val ebsOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions]] = js.undefined
    
    /**
      * The version of Elasticsearch to deploy. Defaults to `1.5`
      */
    val elasticsearchVersion: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Encrypt at rest options. Only available for [certain instance types](http://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/aes-supported-instance-types.html). See below.
      */
    val encryptAtRest: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest]] = js.undefined
    
    /**
      * Domain-specific endpoint used to submit index, search, and data upload requests.
      */
    val endpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Domain-specific endpoint for kibana without https scheme.
      * * `vpc_options.0.availability_zones` - If the domain was created inside a VPC, the names of the availability zones the configured `subnetIds` were created inside.
      * * `vpc_options.0.vpc_id` - If the domain was created inside a VPC, the ID of the VPC.
      */
    val kibanaEndpoint: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Options for publishing slow  and application logs to CloudWatch Logs. This block can be declared multiple times, for each log_type, within the same resource.
      */
    val logPublishingOptions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]]
        ]
      ] = js.undefined
    
    /**
      * Node-to-node encryption options. See below.
      */
    val nodeToNodeEncryption: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption]] = js.undefined
    
    /**
      * Snapshot related options, see below.
      */
    val snapshotOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions]] = js.undefined
    
    /**
      * A map of tags to assign to the resource
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * VPC related options, see below. Adding or removing this configuration forces a new resource ([documentation](https://docs.aws.amazon.com/elasticsearch-service/latest/developerguide/es-vpc.html#es-vpc-limitations)).
      */
    val vpcOptions: js.UndefOr[Input[typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions]] = js.undefined
  }
  object DomainState {
    
    inline def apply(): DomainState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainState]
    }
    
    extension [Self <: DomainState](x: Self) {
      
      inline def setAccessPolicies(value: Input[String | PolicyDocument]): Self = StObject.set(x, "accessPolicies", value.asInstanceOf[js.Any])
      
      inline def setAccessPoliciesUndefined: Self = StObject.set(x, "accessPolicies", js.undefined)
      
      inline def setAdvancedOptions(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "advancedOptions", value.asInstanceOf[js.Any])
      
      inline def setAdvancedOptionsUndefined: Self = StObject.set(x, "advancedOptions", js.undefined)
      
      inline def setAdvancedSecurityOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainAdvancedSecurityOptions]): Self = StObject.set(x, "advancedSecurityOptions", value.asInstanceOf[js.Any])
      
      inline def setAdvancedSecurityOptionsUndefined: Self = StObject.set(x, "advancedSecurityOptions", js.undefined)
      
      inline def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      inline def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      inline def setClusterConfig(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainClusterConfig]): Self = StObject.set(x, "clusterConfig", value.asInstanceOf[js.Any])
      
      inline def setClusterConfigUndefined: Self = StObject.set(x, "clusterConfig", js.undefined)
      
      inline def setCognitoOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainCognitoOptions]): Self = StObject.set(x, "cognitoOptions", value.asInstanceOf[js.Any])
      
      inline def setCognitoOptionsUndefined: Self = StObject.set(x, "cognitoOptions", js.undefined)
      
      inline def setDomainEndpointOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainDomainEndpointOptions]): Self = StObject.set(x, "domainEndpointOptions", value.asInstanceOf[js.Any])
      
      inline def setDomainEndpointOptionsUndefined: Self = StObject.set(x, "domainEndpointOptions", js.undefined)
      
      inline def setDomainId(value: Input[String]): Self = StObject.set(x, "domainId", value.asInstanceOf[js.Any])
      
      inline def setDomainIdUndefined: Self = StObject.set(x, "domainId", js.undefined)
      
      inline def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      inline def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      inline def setEbsOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainEbsOptions]): Self = StObject.set(x, "ebsOptions", value.asInstanceOf[js.Any])
      
      inline def setEbsOptionsUndefined: Self = StObject.set(x, "ebsOptions", js.undefined)
      
      inline def setElasticsearchVersion(value: Input[String]): Self = StObject.set(x, "elasticsearchVersion", value.asInstanceOf[js.Any])
      
      inline def setElasticsearchVersionUndefined: Self = StObject.set(x, "elasticsearchVersion", js.undefined)
      
      inline def setEncryptAtRest(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainEncryptAtRest]): Self = StObject.set(x, "encryptAtRest", value.asInstanceOf[js.Any])
      
      inline def setEncryptAtRestUndefined: Self = StObject.set(x, "encryptAtRest", js.undefined)
      
      inline def setEndpoint(value: Input[String]): Self = StObject.set(x, "endpoint", value.asInstanceOf[js.Any])
      
      inline def setEndpointUndefined: Self = StObject.set(x, "endpoint", js.undefined)
      
      inline def setKibanaEndpoint(value: Input[String]): Self = StObject.set(x, "kibanaEndpoint", value.asInstanceOf[js.Any])
      
      inline def setKibanaEndpointUndefined: Self = StObject.set(x, "kibanaEndpoint", js.undefined)
      
      inline def setLogPublishingOptions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]]
            ]
      ): Self = StObject.set(x, "logPublishingOptions", value.asInstanceOf[js.Any])
      
      inline def setLogPublishingOptionsUndefined: Self = StObject.set(x, "logPublishingOptions", js.undefined)
      
      inline def setLogPublishingOptionsVarargs(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainLogPublishingOption]*): Self = StObject.set(x, "logPublishingOptions", js.Array(value :_*))
      
      inline def setNodeToNodeEncryption(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainNodeToNodeEncryption]): Self = StObject.set(x, "nodeToNodeEncryption", value.asInstanceOf[js.Any])
      
      inline def setNodeToNodeEncryptionUndefined: Self = StObject.set(x, "nodeToNodeEncryption", js.undefined)
      
      inline def setSnapshotOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainSnapshotOptions]): Self = StObject.set(x, "snapshotOptions", value.asInstanceOf[js.Any])
      
      inline def setSnapshotOptionsUndefined: Self = StObject.set(x, "snapshotOptions", js.undefined)
      
      inline def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setVpcOptions(value: Input[typings.pulumiAws.inputMod.elasticsearch.DomainVpcOptions]): Self = StObject.set(x, "vpcOptions", value.asInstanceOf[js.Any])
      
      inline def setVpcOptionsUndefined: Self = StObject.set(x, "vpcOptions", js.undefined)
    }
  }
}
