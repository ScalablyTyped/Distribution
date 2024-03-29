package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagebuilder {
  
  trait DistributionConfigurationDistribution extends StObject {
    
    /**
      * Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
      */
    var amiDistributionConfiguration: js.UndefOr[Input[DistributionConfigurationDistributionAmiDistributionConfiguration]] = js.undefined
    
    /**
      * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
      */
    var licenseConfigurationArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * AWS Region for the distribution.
      */
    var region: Input[String]
  }
  object DistributionConfigurationDistribution {
    
    inline def apply(region: Input[String]): DistributionConfigurationDistribution = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributionConfigurationDistribution]
    }
    
    extension [Self <: DistributionConfigurationDistribution](x: Self) {
      
      inline def setAmiDistributionConfiguration(value: Input[DistributionConfigurationDistributionAmiDistributionConfiguration]): Self = StObject.set(x, "amiDistributionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setAmiDistributionConfigurationUndefined: Self = StObject.set(x, "amiDistributionConfiguration", js.undefined)
      
      inline def setLicenseConfigurationArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "licenseConfigurationArns", value.asInstanceOf[js.Any])
      
      inline def setLicenseConfigurationArnsUndefined: Self = StObject.set(x, "licenseConfigurationArns", js.undefined)
      
      inline def setLicenseConfigurationArnsVarargs(value: Input[String]*): Self = StObject.set(x, "licenseConfigurationArns", js.Array(value :_*))
      
      inline def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  trait DistributionConfigurationDistributionAmiDistributionConfiguration extends StObject {
    
    /**
      * Key-value map of tags to apply to the distributed AMI.
      */
    var amiTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Description to apply to the distributed AMI.
      */
    var description: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key to encrypt the distributed AMI.
      */
    var kmsKeyId: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block of EC2 launch permissions to apply to the distributed AMI. Detailed below.
      */
    var launchPermission: js.UndefOr[
        Input[
          DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
        ]
      ] = js.undefined
    
    /**
      * Name to apply to the distributed AMI.
      */
    var name: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of AWS Account identifiers to distribute the AMI.
      */
    var targetAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object DistributionConfigurationDistributionAmiDistributionConfiguration {
    
    inline def apply(): DistributionConfigurationDistributionAmiDistributionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributionConfigurationDistributionAmiDistributionConfiguration]
    }
    
    extension [Self <: DistributionConfigurationDistributionAmiDistributionConfiguration](x: Self) {
      
      inline def setAmiTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "amiTags", value.asInstanceOf[js.Any])
      
      inline def setAmiTagsUndefined: Self = StObject.set(x, "amiTags", js.undefined)
      
      inline def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      inline def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      inline def setLaunchPermission(
        value: Input[
              DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
            ]
      ): Self = StObject.set(x, "launchPermission", value.asInstanceOf[js.Any])
      
      inline def setLaunchPermissionUndefined: Self = StObject.set(x, "launchPermission", js.undefined)
      
      inline def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setTargetAccountIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "targetAccountIds", value.asInstanceOf[js.Any])
      
      inline def setTargetAccountIdsUndefined: Self = StObject.set(x, "targetAccountIds", js.undefined)
      
      inline def setTargetAccountIdsVarargs(value: Input[String]*): Self = StObject.set(x, "targetAccountIds", js.Array(value :_*))
    }
  }
  
  trait DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission extends StObject {
    
    /**
      * Set of EC2 launch permission user groups to assign. Use `all` to distribute a public AMI.
      */
    var userGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Set of AWS Account identifiers to assign.
      */
    var userIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
  }
  object DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
    
    inline def apply(): DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission]
    }
    
    extension [Self <: DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission](x: Self) {
      
      inline def setUserGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "userGroups", value.asInstanceOf[js.Any])
      
      inline def setUserGroupsUndefined: Self = StObject.set(x, "userGroups", js.undefined)
      
      inline def setUserGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "userGroups", js.Array(value :_*))
      
      inline def setUserIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
      
      inline def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
      
      inline def setUserIdsVarargs(value: Input[String]*): Self = StObject.set(x, "userIds", js.Array(value :_*))
    }
  }
  
  trait InfrastructureConfigurationLogging extends StObject {
    
    /**
      * Configuration block with S3 logging settings. Detailed below.
      */
    var s3Logs: Input[InfrastructureConfigurationLoggingS3Logs]
  }
  object InfrastructureConfigurationLogging {
    
    inline def apply(s3Logs: Input[InfrastructureConfigurationLoggingS3Logs]): InfrastructureConfigurationLogging = {
      val __obj = js.Dynamic.literal(s3Logs = s3Logs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfrastructureConfigurationLogging]
    }
    
    extension [Self <: InfrastructureConfigurationLogging](x: Self) {
      
      inline def setS3Logs(value: Input[InfrastructureConfigurationLoggingS3Logs]): Self = StObject.set(x, "s3Logs", value.asInstanceOf[js.Any])
    }
  }
  
  trait InfrastructureConfigurationLoggingS3Logs extends StObject {
    
    /**
      * Name of the S3 Bucket.
      */
    var s3BucketName: Input[String]
    
    /**
      * Prefix to use for S3 logs. Defaults to `/`.
      */
    var s3KeyPrefix: js.UndefOr[Input[String]] = js.undefined
  }
  object InfrastructureConfigurationLoggingS3Logs {
    
    inline def apply(s3BucketName: Input[String]): InfrastructureConfigurationLoggingS3Logs = {
      val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfrastructureConfigurationLoggingS3Logs]
    }
    
    extension [Self <: InfrastructureConfigurationLoggingS3Logs](x: Self) {
      
      inline def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      inline def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      inline def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
    }
  }
}
