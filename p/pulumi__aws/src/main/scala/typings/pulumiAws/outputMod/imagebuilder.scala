package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagebuilder {
  
  trait DistributionConfigurationDistribution extends StObject {
    
    /**
      * Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
      */
    var amiDistributionConfiguration: js.UndefOr[DistributionConfigurationDistributionAmiDistributionConfiguration] = js.undefined
    
    /**
      * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
      */
    var licenseConfigurationArns: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * AWS Region for the distribution.
      */
    var region: String
  }
  object DistributionConfigurationDistribution {
    
    inline def apply(region: String): DistributionConfigurationDistribution = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributionConfigurationDistribution]
    }
    
    extension [Self <: DistributionConfigurationDistribution](x: Self) {
      
      inline def setAmiDistributionConfiguration(value: DistributionConfigurationDistributionAmiDistributionConfiguration): Self = StObject.set(x, "amiDistributionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAmiDistributionConfigurationUndefined: Self = StObject.set(x, "amiDistributionConfiguration", js.undefined)
      
      inline def setLicenseConfigurationArns(value: js.Array[String]): Self = StObject.set(x, "licenseConfigurationArns", value.asInstanceOf[js.Any])
      
      inline def setLicenseConfigurationArnsUndefined: Self = StObject.set(x, "licenseConfigurationArns", js.undefined)
      
      inline def setLicenseConfigurationArnsVarargs(value: String*): Self = StObject.set(x, "licenseConfigurationArns", js.Array(value :_*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistributionConfigurationDistributionAmiDistributionConfiguration extends StObject {
    
    /**
      * Key-value map of tags to apply to the distributed AMI.
      */
    var amiTags: js.UndefOr[StringDictionary[String]] = js.undefined
    
    /**
      * Description to apply to the distributed AMI.
      */
    var description: js.UndefOr[String] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key to encrypt the distributed AMI.
      */
    var kmsKeyId: js.UndefOr[String] = js.undefined
    
    /**
      * Configuration block of EC2 launch permissions to apply to the distributed AMI. Detailed below.
      */
    var launchPermission: js.UndefOr[
        DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
      ] = js.undefined
    
    /**
      * Name to apply to the distributed AMI.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * Set of AWS Account identifiers to distribute the AMI.
      */
    var targetAccountIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DistributionConfigurationDistributionAmiDistributionConfiguration {
    
    inline def apply(): DistributionConfigurationDistributionAmiDistributionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributionConfigurationDistributionAmiDistributionConfiguration]
    }
    
    extension [Self <: DistributionConfigurationDistributionAmiDistributionConfiguration](x: Self) {
      
      inline def setAmiTags(value: StringDictionary[String]): Self = StObject.set(x, "amiTags", value.asInstanceOf[js.Any])
      
      inline def setAmiTagsUndefined: Self = StObject.set(x, "amiTags", js.undefined)
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setLaunchPermission(value: DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission): Self = StObject.set(x, "launchPermission", value.asInstanceOf[js.Any])
      
      inline def setLaunchPermissionUndefined: Self = StObject.set(x, "launchPermission", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTargetAccountIds(value: js.Array[String]): Self = StObject.set(x, "targetAccountIds", value.asInstanceOf[js.Any])
      
      inline def setTargetAccountIdsUndefined: Self = StObject.set(x, "targetAccountIds", js.undefined)
      
      inline def setTargetAccountIdsVarargs(value: String*): Self = StObject.set(x, "targetAccountIds", js.Array(value :_*))
    }
  }
  
  trait DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission extends StObject {
    
    /**
      * Set of EC2 launch permission user groups to assign. Use `all` to distribute a public AMI.
      */
    var userGroups: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * Set of AWS Account identifiers to assign.
      */
    var userIds: js.UndefOr[js.Array[String]] = js.undefined
  }
  object DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
    
    inline def apply(): DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission]
    }
    
    extension [Self <: DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission](x: Self) {
      
      inline def setUserGroups(value: js.Array[String]): Self = StObject.set(x, "userGroups", value.asInstanceOf[js.Any])
      
      inline def setUserGroupsUndefined: Self = StObject.set(x, "userGroups", js.undefined)
      
      inline def setUserGroupsVarargs(value: String*): Self = StObject.set(x, "userGroups", js.Array(value :_*))
      
      inline def setUserIds(value: js.Array[String]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
      
      inline def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
      
      inline def setUserIdsVarargs(value: String*): Self = StObject.set(x, "userIds", js.Array(value :_*))
    }
  }
  
  trait GetDistributionConfigurationDistribution extends StObject {
    
    /**
      * Nested list of AMI distribution configuration.
      */
    var amiDistributionConfigurations: js.Array[GetDistributionConfigurationDistributionAmiDistributionConfiguration]
    
    /**
      * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
      */
    var licenseConfigurationArns: js.Array[String]
    
    /**
      * AWS Region of distribution.
      */
    var region: String
  }
  object GetDistributionConfigurationDistribution {
    
    inline def apply(
      amiDistributionConfigurations: js.Array[GetDistributionConfigurationDistributionAmiDistributionConfiguration],
      licenseConfigurationArns: js.Array[String],
      region: String
    ): GetDistributionConfigurationDistribution = {
      val __obj = js.Dynamic.literal(amiDistributionConfigurations = amiDistributionConfigurations.asInstanceOf[js.Any], licenseConfigurationArns = licenseConfigurationArns.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDistributionConfigurationDistribution]
    }
    
    extension [Self <: GetDistributionConfigurationDistribution](x: Self) {
      
      inline def setAmiDistributionConfigurations(value: js.Array[GetDistributionConfigurationDistributionAmiDistributionConfiguration]): Self = StObject.set(x, "amiDistributionConfigurations", value.asInstanceOf[js.Any])
      
      inline def setAmiDistributionConfigurationsVarargs(value: GetDistributionConfigurationDistributionAmiDistributionConfiguration*): Self = StObject.set(x, "amiDistributionConfigurations", js.Array(value :_*))
      
      inline def setLicenseConfigurationArns(value: js.Array[String]): Self = StObject.set(x, "licenseConfigurationArns", value.asInstanceOf[js.Any])
      
      inline def setLicenseConfigurationArnsVarargs(value: String*): Self = StObject.set(x, "licenseConfigurationArns", js.Array(value :_*))
      
      inline def setRegion(value: String): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetDistributionConfigurationDistributionAmiDistributionConfiguration extends StObject {
    
    /**
      * Key-value map of tags to apply to distributed AMI.
      */
    var amiTags: StringDictionary[String]
    
    /**
      * Description to apply to distributed AMI.
      */
    var description: String
    
    /**
      * Amazon Resource Name (ARN) of Key Management Service (KMS) Key to encrypt AMI.
      */
    var kmsKeyId: String
    
    /**
      * Nested list of EC2 launch permissions.
      */
    var launchPermissions: js.Array[
        GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
      ]
    
    /**
      * Name of the distribution configuration.
      */
    var name: String
    
    /**
      * Set of target AWS Account identifiers.
      */
    var targetAccountIds: js.Array[String]
  }
  object GetDistributionConfigurationDistributionAmiDistributionConfiguration {
    
    inline def apply(
      amiTags: StringDictionary[String],
      description: String,
      kmsKeyId: String,
      launchPermissions: js.Array[
          GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
        ],
      name: String,
      targetAccountIds: js.Array[String]
    ): GetDistributionConfigurationDistributionAmiDistributionConfiguration = {
      val __obj = js.Dynamic.literal(amiTags = amiTags.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], kmsKeyId = kmsKeyId.asInstanceOf[js.Any], launchPermissions = launchPermissions.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], targetAccountIds = targetAccountIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDistributionConfigurationDistributionAmiDistributionConfiguration]
    }
    
    extension [Self <: GetDistributionConfigurationDistributionAmiDistributionConfiguration](x: Self) {
      
      inline def setAmiTags(value: StringDictionary[String]): Self = StObject.set(x, "amiTags", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyId(value: String): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setLaunchPermissions(
        value: js.Array[
              GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
            ]
      ): Self = StObject.set(x, "launchPermissions", value.asInstanceOf[js.Any])
      
      inline def setLaunchPermissionsVarargs(value: GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission*): Self = StObject.set(x, "launchPermissions", js.Array(value :_*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTargetAccountIds(value: js.Array[String]): Self = StObject.set(x, "targetAccountIds", value.asInstanceOf[js.Any])
      
      inline def setTargetAccountIdsVarargs(value: String*): Self = StObject.set(x, "targetAccountIds", js.Array(value :_*))
    }
  }
  
  trait GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission extends StObject {
    
    /**
      * Set of EC2 launch permission user groups.
      */
    var userGroups: js.Array[String]
    
    /**
      * Set of AWS Account identifiers.
      */
    var userIds: js.Array[String]
  }
  object GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
    
    inline def apply(userGroups: js.Array[String], userIds: js.Array[String]): GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission = {
      val __obj = js.Dynamic.literal(userGroups = userGroups.asInstanceOf[js.Any], userIds = userIds.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission]
    }
    
    extension [Self <: GetDistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission](x: Self) {
      
      inline def setUserGroups(value: js.Array[String]): Self = StObject.set(x, "userGroups", value.asInstanceOf[js.Any])
      
      inline def setUserGroupsVarargs(value: String*): Self = StObject.set(x, "userGroups", js.Array(value :_*))
      
      inline def setUserIds(value: js.Array[String]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
      
      inline def setUserIdsVarargs(value: String*): Self = StObject.set(x, "userIds", js.Array(value :_*))
    }
  }
  
  trait GetInfrastructureConfigurationLogging extends StObject {
    
    /**
      * Nested list of S3 logs settings.
      */
    var s3Logs: js.Array[GetInfrastructureConfigurationLoggingS3Log]
  }
  object GetInfrastructureConfigurationLogging {
    
    inline def apply(s3Logs: js.Array[GetInfrastructureConfigurationLoggingS3Log]): GetInfrastructureConfigurationLogging = {
      val __obj = js.Dynamic.literal(s3Logs = s3Logs.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInfrastructureConfigurationLogging]
    }
    
    extension [Self <: GetInfrastructureConfigurationLogging](x: Self) {
      
      inline def setS3Logs(value: js.Array[GetInfrastructureConfigurationLoggingS3Log]): Self = StObject.set(x, "s3Logs", value.asInstanceOf[js.Any])
      
      inline def setS3LogsVarargs(value: GetInfrastructureConfigurationLoggingS3Log*): Self = StObject.set(x, "s3Logs", js.Array(value :_*))
    }
  }
  
  trait GetInfrastructureConfigurationLoggingS3Log extends StObject {
    
    /**
      * Name of the S3 Bucket for logging.
      */
    var s3BucketName: String
    
    /**
      * Key prefix for S3 Bucket logging.
      */
    var s3KeyPrefix: String
  }
  object GetInfrastructureConfigurationLoggingS3Log {
    
    inline def apply(s3BucketName: String, s3KeyPrefix: String): GetInfrastructureConfigurationLoggingS3Log = {
      val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any], s3KeyPrefix = s3KeyPrefix.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetInfrastructureConfigurationLoggingS3Log]
    }
    
    extension [Self <: GetInfrastructureConfigurationLoggingS3Log](x: Self) {
      
      inline def setS3BucketName(value: String): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
    }
  }
  
  trait InfrastructureConfigurationLogging extends StObject {
    
    /**
      * Configuration block with S3 logging settings. Detailed below.
      */
    var s3Logs: InfrastructureConfigurationLoggingS3Logs
  }
  object InfrastructureConfigurationLogging {
    
    inline def apply(s3Logs: InfrastructureConfigurationLoggingS3Logs): InfrastructureConfigurationLogging = {
      val __obj = js.Dynamic.literal(s3Logs = s3Logs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfrastructureConfigurationLogging]
    }
    
    extension [Self <: InfrastructureConfigurationLogging](x: Self) {
      
      inline def setS3Logs(value: InfrastructureConfigurationLoggingS3Logs): Self = StObject.set(x, "s3Logs", value.asInstanceOf[js.Any])
    }
  }
  
  trait InfrastructureConfigurationLoggingS3Logs extends StObject {
    
    /**
      * Name of the S3 Bucket.
      */
    var s3BucketName: String
    
    /**
      * Prefix to use for S3 logs. Defaults to `/`.
      */
    var s3KeyPrefix: js.UndefOr[String] = js.undefined
  }
  object InfrastructureConfigurationLoggingS3Logs {
    
    inline def apply(s3BucketName: String): InfrastructureConfigurationLoggingS3Logs = {
      val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfrastructureConfigurationLoggingS3Logs]
    }
    
    extension [Self <: InfrastructureConfigurationLoggingS3Logs](x: Self) {
      
      inline def setS3BucketName(value: String): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      inline def setS3KeyPrefix(value: String): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
    }
  }
}
