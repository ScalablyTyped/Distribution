package typings
package s3DashUploadDashStreamLib.s3DashUploadDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3StreamUploader extends js.Object {
  def upload(
    destinationDetails: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.S3.PutObjectRequest */ js.Any
  ): S3WriteStream = js.native
  def upload(
    destinationDetails: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify AWS.S3.PutObjectRequest */ js.Any,
    sessionDetails: js.Any
  ): S3WriteStream = js.native
}

