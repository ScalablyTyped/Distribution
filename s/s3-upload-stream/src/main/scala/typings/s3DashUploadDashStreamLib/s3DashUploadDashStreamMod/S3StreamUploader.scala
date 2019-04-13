package typings
package s3DashUploadDashStreamLib.s3DashUploadDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3StreamUploader extends js.Object {
  def upload(destinationDetails: awsDashSdkLib.clientsS3Mod.PutObjectRequest): S3WriteStream = js.native
  def upload(destinationDetails: awsDashSdkLib.clientsS3Mod.PutObjectRequest, sessionDetails: js.Any): S3WriteStream = js.native
}

