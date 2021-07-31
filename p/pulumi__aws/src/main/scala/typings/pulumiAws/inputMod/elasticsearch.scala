package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object elasticsearch {
  
  trait DomainAdvancedSecurityOptions extends StObject {
    
    /**
      * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
      */
    var enabled: Input[Boolean]
    
    /**
      * Whether the internal user database is enabled. If not set, defaults to `false` by the AWS API.
      */
    var internalUserDatabaseEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Credentials for the master user: username and password, or ARN
      */
    var masterUserOptions: js.UndefOr[Input[DomainAdvancedSecurityOptionsMasterUserOptions]] = js.undefined
  }
  object DomainAdvancedSecurityOptions {
    
    @scala.inline
    def apply(enabled: Input[Boolean]): DomainAdvancedSecurityOptions = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainAdvancedSecurityOptions]
    }
    
    @scala.inline
    implicit class DomainAdvancedSecurityOptionsMutableBuilder[Self <: DomainAdvancedSecurityOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUserDatabaseEnabled(value: Input[Boolean]): Self = StObject.set(x, "internalUserDatabaseEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInternalUserDatabaseEnabledUndefined: Self = StObject.set(x, "internalUserDatabaseEnabled", js.undefined)
      
      @scala.inline
      def setMasterUserOptions(value: Input[DomainAdvancedSecurityOptionsMasterUserOptions]): Self = StObject.set(x, "masterUserOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUserOptionsUndefined: Self = StObject.set(x, "masterUserOptions", js.undefined)
    }
  }
  
  trait DomainAdvancedSecurityOptionsMasterUserOptions extends StObject {
    
    /**
      * ARN for the master user. Only specify if `internalUserDatabaseEnabled` is not set or set to `false`)
      */
    var masterUserArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The master user's username, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internalUserDatabaseEnabled` is set to `true`.
      */
    var masterUserName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The master user's password, which is stored in the Amazon Elasticsearch Service domain's internal database. Only specify if `internalUserDatabaseEnabled` is set to `true`.
      */
    var masterUserPassword: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainAdvancedSecurityOptionsMasterUserOptions {
    
    @scala.inline
    def apply(): DomainAdvancedSecurityOptionsMasterUserOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainAdvancedSecurityOptionsMasterUserOptions]
    }
    
    @scala.inline
    implicit class DomainAdvancedSecurityOptionsMasterUserOptionsMutableBuilder[Self <: DomainAdvancedSecurityOptionsMasterUserOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMasterUserArn(value: Input[String]): Self = StObject.set(x, "masterUserArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUserArnUndefined: Self = StObject.set(x, "masterUserArn", js.undefined)
      
      @scala.inline
      def setMasterUserName(value: Input[String]): Self = StObject.set(x, "masterUserName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUserNameUndefined: Self = StObject.set(x, "masterUserName", js.undefined)
      
      @scala.inline
      def setMasterUserPassword(value: Input[String]): Self = StObject.set(x, "masterUserPassword", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMasterUserPasswordUndefined: Self = StObject.set(x, "masterUserPassword", js.undefined)
    }
  }
  
  trait DomainClusterConfig extends StObject {
    
    /**
      * Number of dedicated master nodes in the cluster
      */
    var dedicatedMasterCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Indicates whether dedicated master nodes are enabled for the cluster.
      */
    var dedicatedMasterEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Instance type of the dedicated master nodes in the cluster.
      */
    var dedicatedMasterType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Number of instances in the cluster.
      */
    var instanceCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Instance type of data nodes in the cluster.
      */
    var instanceType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The number of warm nodes in the cluster. Valid values are between `2` and `150`. `warmCount` can be only and must be set when `warmEnabled` is set to `true`.
      */
    var warmCount: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Indicates whether to enable warm storage.
      */
    var warmEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * The instance type for the Elasticsearch cluster's warm nodes. Valid values are `ultrawarm1.medium.elasticsearch`, `ultrawarm1.large.elasticsearch` and `ultrawarm1.xlarge.elasticsearch`. `warmType` can be only and must be set when `warmEnabled` is set to `true`.
      */
    var warmType: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block containing zone awareness settings. Documented below.
      */
    var zoneAwarenessConfig: js.UndefOr[Input[DomainClusterConfigZoneAwarenessConfig]] = js.undefined
    
    /**
      * Indicates whether zone awareness is enabled, set to `true` for multi-az deployment. To enable awareness with three Availability Zones, the `availabilityZoneCount` within the `zoneAwarenessConfig` must be set to `3`.
      */
    var zoneAwarenessEnabled: js.UndefOr[Input[Boolean]] = js.undefined
  }
  object DomainClusterConfig {
    
    @scala.inline
    def apply(): DomainClusterConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainClusterConfig]
    }
    
    @scala.inline
    implicit class DomainClusterConfigMutableBuilder[Self <: DomainClusterConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDedicatedMasterCount(value: Input[Double]): Self = StObject.set(x, "dedicatedMasterCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDedicatedMasterCountUndefined: Self = StObject.set(x, "dedicatedMasterCount", js.undefined)
      
      @scala.inline
      def setDedicatedMasterEnabled(value: Input[Boolean]): Self = StObject.set(x, "dedicatedMasterEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDedicatedMasterEnabledUndefined: Self = StObject.set(x, "dedicatedMasterEnabled", js.undefined)
      
      @scala.inline
      def setDedicatedMasterType(value: Input[String]): Self = StObject.set(x, "dedicatedMasterType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDedicatedMasterTypeUndefined: Self = StObject.set(x, "dedicatedMasterType", js.undefined)
      
      @scala.inline
      def setInstanceCount(value: Input[Double]): Self = StObject.set(x, "instanceCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceCountUndefined: Self = StObject.set(x, "instanceCount", js.undefined)
      
      @scala.inline
      def setInstanceType(value: Input[String]): Self = StObject.set(x, "instanceType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInstanceTypeUndefined: Self = StObject.set(x, "instanceType", js.undefined)
      
      @scala.inline
      def setWarmCount(value: Input[Double]): Self = StObject.set(x, "warmCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarmCountUndefined: Self = StObject.set(x, "warmCount", js.undefined)
      
      @scala.inline
      def setWarmEnabled(value: Input[Boolean]): Self = StObject.set(x, "warmEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarmEnabledUndefined: Self = StObject.set(x, "warmEnabled", js.undefined)
      
      @scala.inline
      def setWarmType(value: Input[String]): Self = StObject.set(x, "warmType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWarmTypeUndefined: Self = StObject.set(x, "warmType", js.undefined)
      
      @scala.inline
      def setZoneAwarenessConfig(value: Input[DomainClusterConfigZoneAwarenessConfig]): Self = StObject.set(x, "zoneAwarenessConfig", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneAwarenessConfigUndefined: Self = StObject.set(x, "zoneAwarenessConfig", js.undefined)
      
      @scala.inline
      def setZoneAwarenessEnabled(value: Input[Boolean]): Self = StObject.set(x, "zoneAwarenessEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZoneAwarenessEnabledUndefined: Self = StObject.set(x, "zoneAwarenessEnabled", js.undefined)
    }
  }
  
  trait DomainClusterConfigZoneAwarenessConfig extends StObject {
    
    /**
      * Number of Availability Zones for the domain to use with `zoneAwarenessEnabled`. Defaults to `2`. Valid values: `2` or `3`.
      */
    var availabilityZoneCount: js.UndefOr[Input[Double]] = js.undefined
  }
  object DomainClusterConfigZoneAwarenessConfig {
    
    @scala.inline
    def apply(): DomainClusterConfigZoneAwarenessConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainClusterConfigZoneAwarenessConfig]
    }
    
    @scala.inline
    implicit class DomainClusterConfigZoneAwarenessConfigMutableBuilder[Self <: DomainClusterConfigZoneAwarenessConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZoneCount(value: Input[Double]): Self = StObject.set(x, "availabilityZoneCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZoneCountUndefined: Self = StObject.set(x, "availabilityZoneCount", js.undefined)
    }
  }
  
  trait DomainCognitoOptions extends StObject {
    
    /**
      * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * ID of the Cognito Identity Pool to use
      */
    var identityPoolId: Input[String]
    
    /**
      * ARN of the IAM role that has the AmazonESCognitoAccess policy attached
      */
    var roleArn: Input[String]
    
    /**
      * ID of the Cognito User Pool to use
      */
    var userPoolId: Input[String]
  }
  object DomainCognitoOptions {
    
    @scala.inline
    def apply(identityPoolId: Input[String], roleArn: Input[String], userPoolId: Input[String]): DomainCognitoOptions = {
      val __obj = js.Dynamic.literal(identityPoolId = identityPoolId.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], userPoolId = userPoolId.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainCognitoOptions]
    }
    
    @scala.inline
    implicit class DomainCognitoOptionsMutableBuilder[Self <: DomainCognitoOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setIdentityPoolId(value: Input[String]): Self = StObject.set(x, "identityPoolId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoleArn(value: Input[String]): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserPoolId(value: Input[String]): Self = StObject.set(x, "userPoolId", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainDomainEndpointOptions extends StObject {
    
    /**
      * Whether or not to require HTTPS
      */
    var enforceHttps: Input[Boolean]
    
    /**
      * The name of the TLS security policy that needs to be applied to the HTTPS endpoint. Valid values:  `Policy-Min-TLS-1-0-2019-07` and `Policy-Min-TLS-1-2-2019-07`. This provider will only perform drift detection if a configuration value is provided.
      */
    var tlsSecurityPolicy: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainDomainEndpointOptions {
    
    @scala.inline
    def apply(enforceHttps: Input[Boolean]): DomainDomainEndpointOptions = {
      val __obj = js.Dynamic.literal(enforceHttps = enforceHttps.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainDomainEndpointOptions]
    }
    
    @scala.inline
    implicit class DomainDomainEndpointOptionsMutableBuilder[Self <: DomainDomainEndpointOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnforceHttps(value: Input[Boolean]): Self = StObject.set(x, "enforceHttps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsSecurityPolicy(value: Input[String]): Self = StObject.set(x, "tlsSecurityPolicy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTlsSecurityPolicyUndefined: Self = StObject.set(x, "tlsSecurityPolicy", js.undefined)
    }
  }
  
  trait DomainEbsOptions extends StObject {
    
    /**
      * Whether EBS volumes are attached to data nodes in the domain.
      */
    var ebsEnabled: Input[Boolean]
    
    /**
      * The baseline input/output (I/O) performance of EBS volumes attached to data nodes. Applicable only for the Provisioned IOPS EBS volume type.
      */
    var iops: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The size of EBS volumes attached to data nodes (in GiB).
      * **Required** if `ebsEnabled` is set to `true`.
      */
    var volumeSize: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * The type of EBS volumes attached to data nodes.
      */
    var volumeType: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainEbsOptions {
    
    @scala.inline
    def apply(ebsEnabled: Input[Boolean]): DomainEbsOptions = {
      val __obj = js.Dynamic.literal(ebsEnabled = ebsEnabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainEbsOptions]
    }
    
    @scala.inline
    implicit class DomainEbsOptionsMutableBuilder[Self <: DomainEbsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEbsEnabled(value: Input[Boolean]): Self = StObject.set(x, "ebsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIops(value: Input[Double]): Self = StObject.set(x, "iops", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIopsUndefined: Self = StObject.set(x, "iops", js.undefined)
      
      @scala.inline
      def setVolumeSize(value: Input[Double]): Self = StObject.set(x, "volumeSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeSizeUndefined: Self = StObject.set(x, "volumeSize", js.undefined)
      
      @scala.inline
      def setVolumeType(value: Input[String]): Self = StObject.set(x, "volumeType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVolumeTypeUndefined: Self = StObject.set(x, "volumeType", js.undefined)
    }
  }
  
  trait DomainEncryptAtRest extends StObject {
    
    /**
      * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
      */
    var enabled: Input[Boolean]
    
    /**
      * The KMS key id to encrypt the Elasticsearch domain with. If not specified then it defaults to using the `aws/es` service KMS key.
      */
    var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainEncryptAtRest {
    
    @scala.inline
    def apply(enabled: Input[Boolean]): DomainEncryptAtRest = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainEncryptAtRest]
    }
    
    @scala.inline
    implicit class DomainEncryptAtRestMutableBuilder[Self <: DomainEncryptAtRest] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
    }
  }
  
  trait DomainLogPublishingOption extends StObject {
    
    /**
      * ARN of the Cloudwatch log group to which log needs to be published.
      */
    var cloudwatchLogGroupArn: Input[String]
    
    /**
      * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
      */
    var enabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * A type of Elasticsearch log. Valid values: INDEX_SLOW_LOGS, SEARCH_SLOW_LOGS, ES_APPLICATION_LOGS, AUDIT_LOGS
      */
    var logType: Input[String]
  }
  object DomainLogPublishingOption {
    
    @scala.inline
    def apply(cloudwatchLogGroupArn: Input[String], logType: Input[String]): DomainLogPublishingOption = {
      val __obj = js.Dynamic.literal(cloudwatchLogGroupArn = cloudwatchLogGroupArn.asInstanceOf[js.Any], logType = logType.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainLogPublishingOption]
    }
    
    @scala.inline
    implicit class DomainLogPublishingOptionMutableBuilder[Self <: DomainLogPublishingOption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCloudwatchLogGroupArn(value: Input[String]): Self = StObject.set(x, "cloudwatchLogGroupArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
      
      @scala.inline
      def setLogType(value: Input[String]): Self = StObject.set(x, "logType", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainNodeToNodeEncryption extends StObject {
    
    /**
      * Specifies whether Amazon Cognito authentication with Kibana is enabled or not
      */
    var enabled: Input[Boolean]
  }
  object DomainNodeToNodeEncryption {
    
    @scala.inline
    def apply(enabled: Input[Boolean]): DomainNodeToNodeEncryption = {
      val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainNodeToNodeEncryption]
    }
    
    @scala.inline
    implicit class DomainNodeToNodeEncryptionMutableBuilder[Self <: DomainNodeToNodeEncryption] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnabled(value: Input[Boolean]): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainSnapshotOptions extends StObject {
    
    /**
      * Hour during which the service takes an automated daily snapshot of the indices in the domain.
      */
    var automatedSnapshotStartHour: Input[Double]
  }
  object DomainSnapshotOptions {
    
    @scala.inline
    def apply(automatedSnapshotStartHour: Input[Double]): DomainSnapshotOptions = {
      val __obj = js.Dynamic.literal(automatedSnapshotStartHour = automatedSnapshotStartHour.asInstanceOf[js.Any])
      __obj.asInstanceOf[DomainSnapshotOptions]
    }
    
    @scala.inline
    implicit class DomainSnapshotOptionsMutableBuilder[Self <: DomainSnapshotOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutomatedSnapshotStartHour(value: Input[Double]): Self = StObject.set(x, "automatedSnapshotStartHour", value.asInstanceOf[js.Any])
    }
  }
  
  trait DomainVpcOptions extends StObject {
    
    var availabilityZones: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of VPC Security Group IDs to be applied to the Elasticsearch domain endpoints. If omitted, the default Security Group for the VPC will be used.
      */
    var securityGroupIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * List of VPC Subnet IDs for the Elasticsearch domain endpoints to be created in.
      */
    var subnetIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    var vpcId: js.UndefOr[Input[String]] = js.undefined
  }
  object DomainVpcOptions {
    
    @scala.inline
    def apply(): DomainVpcOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DomainVpcOptions]
    }
    
    @scala.inline
    implicit class DomainVpcOptionsMutableBuilder[Self <: DomainVpcOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAvailabilityZones(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "availabilityZones", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAvailabilityZonesUndefined: Self = StObject.set(x, "availabilityZones", js.undefined)
      
      @scala.inline
      def setAvailabilityZonesVarargs(value: Input[String]*): Self = StObject.set(x, "availabilityZones", js.Array(value :_*))
      
      @scala.inline
      def setSecurityGroupIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
      
      @scala.inline
      def setSecurityGroupIdsVarargs(value: Input[String]*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
      
      @scala.inline
      def setSubnetIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subnetIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubnetIdsUndefined: Self = StObject.set(x, "subnetIds", js.undefined)
      
      @scala.inline
      def setSubnetIdsVarargs(value: Input[String]*): Self = StObject.set(x, "subnetIds", js.Array(value :_*))
      
      @scala.inline
      def setVpcId(value: Input[String]): Self = StObject.set(x, "vpcId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVpcIdUndefined: Self = StObject.set(x, "vpcId", js.undefined)
    }
  }
}
