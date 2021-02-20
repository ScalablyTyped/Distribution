package typings.pulumiAws.outputMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object athena {
  
  @js.native
  trait DatabaseEncryptionConfiguration extends StObject {
    
    /**
      * The type of key; one of `SSE_S3`, `SSE_KMS`, `CSE_KMS`
      */
    var encryptionOption: String = js.native
    
    /**
      * The KMS key ARN or ID; required for key types `SSE_KMS` and `CSE_KMS`.
      */
    var kmsKey: js.UndefOr[String] = js.native
  }
  object DatabaseEncryptionConfiguration {
    
    @scala.inline
    def apply(encryptionOption: String): DatabaseEncryptionConfiguration = {
      val __obj = js.Dynamic.literal(encryptionOption = encryptionOption.asInstanceOf[js.Any])
      __obj.asInstanceOf[DatabaseEncryptionConfiguration]
    }
    
    @scala.inline
    implicit class DatabaseEncryptionConfigurationMutableBuilder[Self <: DatabaseEncryptionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionOption(value: String): Self = StObject.set(x, "encryptionOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKey(value: String): Self = StObject.set(x, "kmsKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyUndefined: Self = StObject.set(x, "kmsKey", js.undefined)
    }
  }
  
  @js.native
  trait WorkgroupConfiguration extends StObject {
    
    /**
      * Integer for the upper data usage limit (cutoff) for the amount of bytes a single query in a workgroup is allowed to scan. Must be at least `10485760`.
      */
    var bytesScannedCutoffPerQuery: js.UndefOr[Double] = js.native
    
    /**
      * Boolean whether the settings for the workgroup override client-side settings. For more information, see [Workgroup Settings Override Client-Side Settings](https://docs.aws.amazon.com/athena/latest/ug/workgroups-settings-override.html). Defaults to `true`.
      */
    var enforceWorkgroupConfiguration: js.UndefOr[Boolean] = js.native
    
    /**
      * Boolean whether Amazon CloudWatch metrics are enabled for the workgroup. Defaults to `true`.
      */
    var publishCloudwatchMetricsEnabled: js.UndefOr[Boolean] = js.native
    
    /**
      * Configuration block with result settings. Documented below.
      */
    var resultConfiguration: js.UndefOr[WorkgroupConfigurationResultConfiguration] = js.native
  }
  object WorkgroupConfiguration {
    
    @scala.inline
    def apply(): WorkgroupConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupConfiguration]
    }
    
    @scala.inline
    implicit class WorkgroupConfigurationMutableBuilder[Self <: WorkgroupConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBytesScannedCutoffPerQuery(value: Double): Self = StObject.set(x, "bytesScannedCutoffPerQuery", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBytesScannedCutoffPerQueryUndefined: Self = StObject.set(x, "bytesScannedCutoffPerQuery", js.undefined)
      
      @scala.inline
      def setEnforceWorkgroupConfiguration(value: Boolean): Self = StObject.set(x, "enforceWorkgroupConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnforceWorkgroupConfigurationUndefined: Self = StObject.set(x, "enforceWorkgroupConfiguration", js.undefined)
      
      @scala.inline
      def setPublishCloudwatchMetricsEnabled(value: Boolean): Self = StObject.set(x, "publishCloudwatchMetricsEnabled", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPublishCloudwatchMetricsEnabledUndefined: Self = StObject.set(x, "publishCloudwatchMetricsEnabled", js.undefined)
      
      @scala.inline
      def setResultConfiguration(value: WorkgroupConfigurationResultConfiguration): Self = StObject.set(x, "resultConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultConfigurationUndefined: Self = StObject.set(x, "resultConfiguration", js.undefined)
    }
  }
  
  @js.native
  trait WorkgroupConfigurationResultConfiguration extends StObject {
    
    /**
      * Configuration block with encryption settings. Documented below.
      */
    var encryptionConfiguration: js.UndefOr[WorkgroupConfigurationResultConfigurationEncryptionConfiguration] = js.native
    
    /**
      * The location in Amazon S3 where your query results are stored, such as `s3://path/to/query/bucket/`. For more information, see [Queries and Query Result Files](https://docs.aws.amazon.com/athena/latest/ug/querying.html).
      */
    var outputLocation: js.UndefOr[String] = js.native
  }
  object WorkgroupConfigurationResultConfiguration {
    
    @scala.inline
    def apply(): WorkgroupConfigurationResultConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupConfigurationResultConfiguration]
    }
    
    @scala.inline
    implicit class WorkgroupConfigurationResultConfigurationMutableBuilder[Self <: WorkgroupConfigurationResultConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionConfiguration(value: WorkgroupConfigurationResultConfigurationEncryptionConfiguration): Self = StObject.set(x, "encryptionConfiguration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionConfigurationUndefined: Self = StObject.set(x, "encryptionConfiguration", js.undefined)
      
      @scala.inline
      def setOutputLocation(value: String): Self = StObject.set(x, "outputLocation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputLocationUndefined: Self = StObject.set(x, "outputLocation", js.undefined)
    }
  }
  
  @js.native
  trait WorkgroupConfigurationResultConfigurationEncryptionConfiguration extends StObject {
    
    /**
      * Indicates whether Amazon S3 server-side encryption with Amazon S3-managed keys (`SSE_S3`), server-side encryption with KMS-managed keys (`SSE_KMS`), or client-side encryption with KMS-managed keys (`CSE_KMS`) is used. If a query runs in a workgroup and the workgroup overrides client-side settings, then the workgroup's setting for encryption is used. It specifies whether query results must be encrypted, for all queries that run in this workgroup.
      */
    var encryptionOption: js.UndefOr[String] = js.native
    
    /**
      * For `SSE_KMS` and `CSE_KMS`, this is the KMS key Amazon Resource Name (ARN).
      */
    var kmsKeyArn: js.UndefOr[String] = js.native
  }
  object WorkgroupConfigurationResultConfigurationEncryptionConfiguration {
    
    @scala.inline
    def apply(): WorkgroupConfigurationResultConfigurationEncryptionConfiguration = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WorkgroupConfigurationResultConfigurationEncryptionConfiguration]
    }
    
    @scala.inline
    implicit class WorkgroupConfigurationResultConfigurationEncryptionConfigurationMutableBuilder[Self <: WorkgroupConfigurationResultConfigurationEncryptionConfiguration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncryptionOption(value: String): Self = StObject.set(x, "encryptionOption", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEncryptionOptionUndefined: Self = StObject.set(x, "encryptionOption", js.undefined)
      
      @scala.inline
      def setKmsKeyArn(value: String): Self = StObject.set(x, "kmsKeyArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKmsKeyArnUndefined: Self = StObject.set(x, "kmsKeyArn", js.undefined)
    }
  }
}
