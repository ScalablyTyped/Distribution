package typings.pulumiAws.inputMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object imagebuilder {
  
  @js.native
  trait DistributionConfigurationDistribution extends StObject {
    
    /**
      * Configuration block with Amazon Machine Image (AMI) distribution settings. Detailed below.
      */
    var amiDistributionConfiguration: js.UndefOr[Input[DistributionConfigurationDistributionAmiDistributionConfiguration]] = js.native
    
    /**
      * Set of Amazon Resource Names (ARNs) of License Manager License Configurations.
      */
    var licenseConfigurationArns: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * AWS Region for the distribution.
      */
    var region: Input[String] = js.native
  }
  object DistributionConfigurationDistribution {
    
    @scala.inline
    def apply(region: Input[String]): DistributionConfigurationDistribution = {
      val __obj = js.Dynamic.literal(region = region.asInstanceOf[js.Any])
      __obj.asInstanceOf[DistributionConfigurationDistribution]
    }
    
    @scala.inline
    implicit class DistributionConfigurationDistributionMutableBuilder[Self <: DistributionConfigurationDistribution] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmiDistributionConfiguration(value: Input[DistributionConfigurationDistributionAmiDistributionConfiguration]): Self = StObject.set(x, "amiDistributionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmiDistributionConfigurationUndefined: Self = StObject.set(x, "amiDistributionConfiguration", js.undefined)
      
      @scala.inline
      def setLicenseConfigurationArns(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "licenseConfigurationArns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLicenseConfigurationArnsUndefined: Self = StObject.set(x, "licenseConfigurationArns", js.undefined)
      
      @scala.inline
      def setLicenseConfigurationArnsVarargs(value: Input[String]*): Self = StObject.set(x, "licenseConfigurationArns", js.Array(value :_*))
      
      @scala.inline
      def setRegion(value: Input[String]): Self = StObject.set(x, "region", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DistributionConfigurationDistributionAmiDistributionConfiguration extends StObject {
    
    /**
      * Key-value map of tags to apply to the distributed AMI.
      */
    var amiTags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
    
    /**
      * Description to apply to the distributed AMI.
      */
    var description: js.UndefOr[Input[String]] = js.native
    
    /**
      * Amazon Resource Name (ARN) of the Key Management Service (KMS) Key to encrypt the distributed AMI.
      */
    var kmsKeyId: js.UndefOr[Input[String]] = js.native
    
    /**
      * Configuration block of EC2 launch permissions to apply to the distributed AMI. Detailed below.
      */
    var launchPermission: js.UndefOr[
        Input[
          DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
        ]
      ] = js.native
    
    /**
      * Name to apply to the distributed AMI.
      */
    var name: js.UndefOr[Input[String]] = js.native
    
    /**
      * Set of AWS Account identifiers to distribute the AMI.
      */
    var targetAccountIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object DistributionConfigurationDistributionAmiDistributionConfiguration {
    
    @scala.inline
    def apply(): DistributionConfigurationDistributionAmiDistributionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributionConfigurationDistributionAmiDistributionConfiguration]
    }
    
    @scala.inline
    implicit class DistributionConfigurationDistributionAmiDistributionConfigurationMutableBuilder[Self <: DistributionConfigurationDistributionAmiDistributionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAmiTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "amiTags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAmiTagsUndefined: Self = StObject.set(x, "amiTags", js.undefined)
      
      @scala.inline
      def setDescription(value: Input[String]): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setKmsKeyId(value: Input[String]): Self = StObject.set(x, "kmsKeyId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyIdUndefined: Self = StObject.set(x, "kmsKeyId", js.undefined)
      
      @scala.inline
      def setLaunchPermission(
        value: Input[
              DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission
            ]
      ): Self = StObject.set(x, "launchPermission", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLaunchPermissionUndefined: Self = StObject.set(x, "launchPermission", js.undefined)
      
      @scala.inline
      def setName(value: Input[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setTargetAccountIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "targetAccountIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetAccountIdsUndefined: Self = StObject.set(x, "targetAccountIds", js.undefined)
      
      @scala.inline
      def setTargetAccountIdsVarargs(value: Input[String]*): Self = StObject.set(x, "targetAccountIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission extends StObject {
    
    /**
      * Set of EC2 launch permission user groups to assign. Use `all` to distribute a public AMI.
      */
    var userGroups: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
    
    /**
      * Set of AWS Account identifiers to assign.
      */
    var userIds: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  }
  object DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission {
    
    @scala.inline
    def apply(): DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission]
    }
    
    @scala.inline
    implicit class DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermissionMutableBuilder[Self <: DistributionConfigurationDistributionAmiDistributionConfigurationLaunchPermission] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUserGroups(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "userGroups", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserGroupsUndefined: Self = StObject.set(x, "userGroups", js.undefined)
      
      @scala.inline
      def setUserGroupsVarargs(value: Input[String]*): Self = StObject.set(x, "userGroups", js.Array(value :_*))
      
      @scala.inline
      def setUserIds(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "userIds", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUserIdsUndefined: Self = StObject.set(x, "userIds", js.undefined)
      
      @scala.inline
      def setUserIdsVarargs(value: Input[String]*): Self = StObject.set(x, "userIds", js.Array(value :_*))
    }
  }
  
  @js.native
  trait InfrastructureConfigurationLogging extends StObject {
    
    /**
      * Configuration block with S3 logging settings. Detailed below.
      */
    var s3Logs: Input[InfrastructureConfigurationLoggingS3Logs] = js.native
  }
  object InfrastructureConfigurationLogging {
    
    @scala.inline
    def apply(s3Logs: Input[InfrastructureConfigurationLoggingS3Logs]): InfrastructureConfigurationLogging = {
      val __obj = js.Dynamic.literal(s3Logs = s3Logs.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfrastructureConfigurationLogging]
    }
    
    @scala.inline
    implicit class InfrastructureConfigurationLoggingMutableBuilder[Self <: InfrastructureConfigurationLogging] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3Logs(value: Input[InfrastructureConfigurationLoggingS3Logs]): Self = StObject.set(x, "s3Logs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait InfrastructureConfigurationLoggingS3Logs extends StObject {
    
    /**
      * Name of the S3 Bucket.
      */
    var s3BucketName: Input[String] = js.native
    
    /**
      * Prefix to use for S3 logs. Defaults to `/`.
      */
    var s3KeyPrefix: js.UndefOr[Input[String]] = js.native
  }
  object InfrastructureConfigurationLoggingS3Logs {
    
    @scala.inline
    def apply(s3BucketName: Input[String]): InfrastructureConfigurationLoggingS3Logs = {
      val __obj = js.Dynamic.literal(s3BucketName = s3BucketName.asInstanceOf[js.Any])
      __obj.asInstanceOf[InfrastructureConfigurationLoggingS3Logs]
    }
    
    @scala.inline
    implicit class InfrastructureConfigurationLoggingS3LogsMutableBuilder[Self <: InfrastructureConfigurationLoggingS3Logs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setS3BucketName(value: Input[String]): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefix(value: Input[String]): Self = StObject.set(x, "s3KeyPrefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setS3KeyPrefixUndefined: Self = StObject.set(x, "s3KeyPrefix", js.undefined)
    }
  }
}
