package typings.pulumiAws.outputMod.kinesis

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FirehoseDeliveryStreamRedshiftConfiguration extends StObject {
  
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions
  
  /**
    * The jdbcurl of the redshift cluster.
    */
  var clusterJdbcurl: String
  
  /**
    * Copy options for copying the data from the s3 intermediate bucket into redshift, for example to change the default delimiter. For valid values, see the [AWS documentation](http://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
    */
  var copyOptions: js.UndefOr[String] = js.undefined
  
  /**
    * The data table columns that will be targeted by the copy command.
    */
  var dataTableColumns: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the table in the redshift cluster that the s3 bucket will copy to.
    */
  var dataTableName: String
  
  /**
    * The password for the username above.
    */
  var password: String
  
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration] = js.undefined
  
  /**
    * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
    */
  var retryDuration: js.UndefOr[Double] = js.undefined
  
  /**
    * The arn of the role the stream assumes.
    */
  var roleArn: String
  
  /**
    * The configuration for backup in Amazon S3. Required if `s3BackupMode` is `Enabled`. Supports the same fields as `s3Configuration` object.
    */
  var s3BackupConfiguration: js.UndefOr[FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration] = js.undefined
  
  /**
    * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
    */
  var s3BackupMode: js.UndefOr[String] = js.undefined
  
  /**
    * The username that the firehose delivery stream will assume. It is strongly recommended that the username and password provided is used exclusively for Amazon Kinesis Firehose purposes, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.
    */
  var username: String
}
object FirehoseDeliveryStreamRedshiftConfiguration {
  
  @scala.inline
  def apply(
    cloudwatchLoggingOptions: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions,
    clusterJdbcurl: String,
    dataTableName: String,
    password: String,
    roleArn: String,
    username: String
  ): FirehoseDeliveryStreamRedshiftConfiguration = {
    val __obj = js.Dynamic.literal(cloudwatchLoggingOptions = cloudwatchLoggingOptions.asInstanceOf[js.Any], clusterJdbcurl = clusterJdbcurl.asInstanceOf[js.Any], dataTableName = dataTableName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfiguration]
  }
  
  @scala.inline
  implicit class FirehoseDeliveryStreamRedshiftConfigurationMutableBuilder[Self <: FirehoseDeliveryStreamRedshiftConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudwatchLoggingOptions(value: FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions): Self = StObject.set(x, "cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClusterJdbcurl(value: String): Self = StObject.set(x, "clusterJdbcurl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyOptions(value: String): Self = StObject.set(x, "copyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCopyOptionsUndefined: Self = StObject.set(x, "copyOptions", js.undefined)
    
    @scala.inline
    def setDataTableColumns(value: String): Self = StObject.set(x, "dataTableColumns", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDataTableColumnsUndefined: Self = StObject.set(x, "dataTableColumns", js.undefined)
    
    @scala.inline
    def setDataTableName(value: String): Self = StObject.set(x, "dataTableName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPassword(value: String): Self = StObject.set(x, "password", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfiguration(value: FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration): Self = StObject.set(x, "processingConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProcessingConfigurationUndefined: Self = StObject.set(x, "processingConfiguration", js.undefined)
    
    @scala.inline
    def setRetryDuration(value: Double): Self = StObject.set(x, "retryDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRetryDurationUndefined: Self = StObject.set(x, "retryDuration", js.undefined)
    
    @scala.inline
    def setRoleArn(value: String): Self = StObject.set(x, "roleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupConfiguration(value: FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration): Self = StObject.set(x, "s3BackupConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupConfigurationUndefined: Self = StObject.set(x, "s3BackupConfiguration", js.undefined)
    
    @scala.inline
    def setS3BackupMode(value: String): Self = StObject.set(x, "s3BackupMode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BackupModeUndefined: Self = StObject.set(x, "s3BackupMode", js.undefined)
    
    @scala.inline
    def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
  }
}
