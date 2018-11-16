package typings
package s3DashUploadDashStreamLib.s3DashUploadDashStreamMod.s3StreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3StreamUploader extends js.Object {
  def upload(destinationDetails: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRequest): S3WriteStream = js.native
  def upload(destinationDetails: awsDashSdkLib.clientsS3Mod.S3Ns.PutObjectRequest, sessionDetails: js.Any): S3WriteStream = js.native
}

