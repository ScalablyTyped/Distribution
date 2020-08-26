package typings.pulumiAws.inputMod.kinesis

import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirehoseDeliveryStreamRedshiftConfiguration extends js.Object {
  /**
    * The CloudWatch Logging Options for the delivery stream. More details are given below
    */
  var cloudwatchLoggingOptions: js.UndefOr[Input[FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions]] = js.native
  /**
    * The jdbcurl of the redshift cluster.
    */
  var clusterJdbcurl: Input[String] = js.native
  /**
    * Copy options for copying the data from the s3 intermediate bucket into redshift, for example to change the default delimiter. For valid values, see the [AWS documentation](http://docs.aws.amazon.com/firehose/latest/APIReference/API_CopyCommand.html)
    */
  var copyOptions: js.UndefOr[Input[String]] = js.native
  /**
    * The data table columns that will be targeted by the copy command.
    */
  var dataTableColumns: js.UndefOr[Input[String]] = js.native
  /**
    * The name of the table in the redshift cluster that the s3 bucket will copy to.
    */
  var dataTableName: Input[String] = js.native
  /**
    * The password for the username above.
    */
  var password: Input[String] = js.native
  /**
    * The data processing configuration.  More details are given below.
    */
  var processingConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration]] = js.native
  /**
    * The length of time during which Firehose retries delivery after a failure, starting from the initial request and including the first attempt. The default value is 3600 seconds (60 minutes). Firehose does not retry if the value of DurationInSeconds is 0 (zero) or if the first delivery attempt takes longer than the current value.
    */
  var retryDuration: js.UndefOr[Input[Double]] = js.native
  /**
    * The arn of the role the stream assumes.
    */
  var roleArn: Input[String] = js.native
  /**
    * The configuration for backup in Amazon S3. Required if `s3BackupMode` is `Enabled`. Supports the same fields as `s3Configuration` object.
    */
  var s3BackupConfiguration: js.UndefOr[Input[FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration]] = js.native
  /**
    * The Amazon S3 backup mode.  Valid values are `Disabled` and `Enabled`.  Default value is `Disabled`.
    */
  var s3BackupMode: js.UndefOr[Input[String]] = js.native
  /**
    * The username that the firehose delivery stream will assume. It is strongly recommended that the username and password provided is used exclusively for Amazon Kinesis Firehose purposes, and that the permissions for the account are restricted for Amazon Redshift INSERT permissions.
    */
  var username: Input[String] = js.native
}

object FirehoseDeliveryStreamRedshiftConfiguration {
  @scala.inline
  def apply(
    clusterJdbcurl: Input[String],
    dataTableName: Input[String],
    password: Input[String],
    roleArn: Input[String],
    username: Input[String]
  ): FirehoseDeliveryStreamRedshiftConfiguration = {
    val __obj = js.Dynamic.literal(clusterJdbcurl = clusterJdbcurl.asInstanceOf[js.Any], dataTableName = dataTableName.asInstanceOf[js.Any], password = password.asInstanceOf[js.Any], roleArn = roleArn.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[FirehoseDeliveryStreamRedshiftConfiguration]
  }
  @scala.inline
  implicit class FirehoseDeliveryStreamRedshiftConfigurationOps[Self <: FirehoseDeliveryStreamRedshiftConfiguration] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClusterJdbcurl(value: Input[String]): Self = this.set("clusterJdbcurl", value.asInstanceOf[js.Any])
    @scala.inline
    def setDataTableName(value: Input[String]): Self = this.set("dataTableName", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassword(value: Input[String]): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setRoleArn(value: Input[String]): Self = this.set("roleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: Input[String]): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setCloudwatchLoggingOptions(value: Input[FirehoseDeliveryStreamRedshiftConfigurationCloudwatchLoggingOptions]): Self = this.set("cloudwatchLoggingOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCloudwatchLoggingOptions: Self = this.set("cloudwatchLoggingOptions", js.undefined)
    @scala.inline
    def setCopyOptions(value: Input[String]): Self = this.set("copyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCopyOptions: Self = this.set("copyOptions", js.undefined)
    @scala.inline
    def setDataTableColumns(value: Input[String]): Self = this.set("dataTableColumns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataTableColumns: Self = this.set("dataTableColumns", js.undefined)
    @scala.inline
    def setProcessingConfiguration(value: Input[FirehoseDeliveryStreamRedshiftConfigurationProcessingConfiguration]): Self = this.set("processingConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProcessingConfiguration: Self = this.set("processingConfiguration", js.undefined)
    @scala.inline
    def setRetryDuration(value: Input[Double]): Self = this.set("retryDuration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRetryDuration: Self = this.set("retryDuration", js.undefined)
    @scala.inline
    def setS3BackupConfiguration(value: Input[FirehoseDeliveryStreamRedshiftConfigurationS3BackupConfiguration]): Self = this.set("s3BackupConfiguration", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BackupConfiguration: Self = this.set("s3BackupConfiguration", js.undefined)
    @scala.inline
    def setS3BackupMode(value: Input[String]): Self = this.set("s3BackupMode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3BackupMode: Self = this.set("s3BackupMode", js.undefined)
  }
  
}

