package typings.s3DashUploadDashStream.s3DashUploadDashStreamMod

import typings.awsDashSdk.clientsS3Mod.PutObjectRequest
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3StreamUploader extends js.Object {
  def upload(destinationDetails: PutObjectRequest): S3WriteStream = js.native
  def upload(destinationDetails: PutObjectRequest, sessionDetails: js.Any): S3WriteStream = js.native
}

