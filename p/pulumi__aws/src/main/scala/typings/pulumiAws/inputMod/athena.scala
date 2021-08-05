package typings.pulumiAws.inputMod

import typings.pulumiPulumi.outputMod.Input
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object athena {
  
  trait DatabaseEncryptionConfiguration extends StObject {
    
    /**
      * The type of key; one of `SSE_S3`, `SSE_KMS`, `CSE_KMS`
      */
    var encryptionOption: Input[String]
    
    /**
      * The KMS key ARN or ID; required for key types `SSE_KMS` and `CSE_KMS`.
      */
    var kmsKey: js.UndefOr[Input[String]] = js.undefined
  }
  object DatabaseEncryptionConfiguration {
    
    inline def apply(encryptionOption: Input[String]): DatabaseEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(encryptionOption = encryptionOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseEncryptionConfiguration]
    }
    
    extension [Self <: DatabaseEncryptionConfiguration](x: Self) {
      
      inline def setEncryptionOption(value: Input[String]): Self = StObject.set(x, "encryptionOption", value.asInstanceOf[js.Any])
      
      inline def setKmsKey(value: Input[String]): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    }
  }
  
  trait WorkgroupConfiguration extends StObject {
    
    /**
      * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
      */
    var bytesScannedCutoffPerQuery: js.UndefOr[Input[Double]] = js.undefined
    
    /**
      * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
      */
    var enforceWorkgroupConfiguration: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
      */
    var publishCloudwatchMetricsEnabled: js.UndefOr[Input[Boolean]] = js.undefined
    
    /**
      * Configuration block with result settings. Documented below.
      */
    var resultConfiguration: js.UndefOr[Input[WorkgroupConfigurationResultConfiguration]] = js.undefined
  }
  object WorkgroupConfiguration {
    
    inline def apply(): WorkgroupConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupConfiguration]
    }
    
    extension [Self <: WorkgroupConfiguration](x: Self) {
      
      inline def setBytesScannedCutoffPerQuery(value: Input[Double]): Self = StObject.set(x, "bytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
      
      inline def setBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "bytesScannedCutoffPerQuery", js.undefined)
      
      inline def setEnforceWorkgroupConfiguration(value: Input[Boolean]): Self = StObject.set(x, "enforceWorkgroupConfiguration", value.asInstanceOf[js.Any])
      
      inline def setEnforceWorkgroupConfigurationUndefined: Self = StObject.set(x, "enforceWorkgroupConfiguration", js.undefined)
      
      inline def setPublishCloudwatchMetricsEnabled(value: Input[Boolean]): Self = StObject.set(x, "publishCloudwatchMetricsEnabled", value.asInstanceOf[js.Any])
      
      inline def setPublishCloudwatchMetricsEnabledUndefined: Self = StObject.set(x, "publishCloudwatchMetricsEnabled", js.undefined)
      
      inline def setResultConfiguration(value: Input[WorkgroupConfigurationResultConfiguration]): Self = StObject.set(x, "resultConfiguration", value.asInstanceOf[js.Any])
      
      inline def setResultConfigurationUndefined: Self = StObject.set(x, "resultConfiguration", js.undefined)
    }
  }
  
  trait WorkgroupConfigurationResultConfiguration extends StObject {
    
    /**
      * Configuration block with encryption settings. Documented below.
      */
    var encryptionConfiguration: js.UndefOr[Input[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]] = js.undefined
    
    /**
      * The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
      */
    var outputLocation: js.UndefOr[Input[String]] = js.undefined
  }
  object WorkgroupConfigurationResultConfiguration {
    
    inline def apply(): WorkgroupConfigurationResultConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupConfigurationResultConfiguration]
    }
    
    extension [Self <: WorkgroupConfigurationResultConfiguration](x: Self) {
      
      inline def setEncryptionConfiguration(value: Input[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      inline def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
      
      inline def setOutputLocation(value: Input[String]): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
      
      inline def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    }
  }
  
  trait WorkgroupConfigurationResultConfigurationEncryptionConfiguration extends StObject {
    
    /**
      * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (`SSE_S3`), server-side encryption with KMS-managed keys (`SSE_KMS`), or client-side encryption with KMS-managed keys (`CSE_KMS`) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup.
      */
    var encryptionOption: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * For `SSE_KMS` and `CSE_KMS`, this is the KMS key Amazon Resource Name (ARN).
      */
    var kmsKeyArn: js.UndefOr[Input[String]] = js.undefined
  }
  object WorkgroupConfigurationResultConfigurationEncryptionConfiguration {
    
    inline def apply(): WorkgroupConfigurationResultConfigurationEncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]
    }
    
    extension [Self <: WorkgroupConfigurationResultConfigurationEncryptionConfiguration](x: Self) {
      
      inline def setEncryptionOption(value: Input[String]): Self = StObject.set(x, "encryptionOption", value.asInstanceOf[js.Any])
      
      inline def setEncryptionOptionUndefined: Self = StObject.set(x, "encryptionOption", js.undefined)
      
      inline def setKmsKeyArn(value: Input[String]): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      inline def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    }
  }
}
