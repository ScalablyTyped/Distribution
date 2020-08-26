package typings.rockset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateIntegrationRequest extends js.Object {
  // longer explanation for the integration
  var description: js.UndefOr[String] = js.native
  // Amazon DynamoDB details, must have one of aws_access_key or aws_role
  var dynamodb: js.UndefOr[DynamodbIntegration] = js.native
  // GCS details
  var gcs: js.UndefOr[GcsIntegration] = js.native
  // Amazon Kinesis details, must have one of aws_access_key or aws_role
  var kinesis: js.UndefOr[KinesisIntegration] = js.native
  // descriptive label
  var name: String = js.native
  // Amazon Redshift details
  var redshift: js.UndefOr[RedshiftIntegration] = js.native
  // Amazon S3 details, must have one of aws_access_key or aws_role
  var s3: js.UndefOr[S3Integration] = js.native
}

object CreateIntegrationRequest {
  @scala.inline
  def apply(name: String): CreateIntegrationRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateIntegrationRequest]
  }
  @scala.inline
  implicit class CreateIntegrationRequestOps[Self <: CreateIntegrationRequest] (val x: Self) extends AnyVal {
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setDynamodb(value: DynamodbIntegration): Self = this.set("dynamodb", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamodb: Self = this.set("dynamodb", js.undefined)
    @scala.inline
    def setGcs(value: GcsIntegration): Self = this.set("gcs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGcs: Self = this.set("gcs", js.undefined)
    @scala.inline
    def setKinesis(value: KinesisIntegration): Self = this.set("kinesis", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKinesis: Self = this.set("kinesis", js.undefined)
    @scala.inline
    def setRedshift(value: RedshiftIntegration): Self = this.set("redshift", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRedshift: Self = this.set("redshift", js.undefined)
    @scala.inline
    def setS3(value: S3Integration): Self = this.set("s3", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteS3: Self = this.set("s3", js.undefined)
  }
  
}

