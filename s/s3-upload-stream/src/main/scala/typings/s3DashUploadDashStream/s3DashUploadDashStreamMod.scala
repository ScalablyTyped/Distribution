package typings.s3DashUploadDashStream

import typings.awsDashSdk.awsDashSdkMod.S3
import typings.awsDashSdk.clientsS3Mod.PutObjectRequest
import typings.node.streamMod.Writable
import typings.s3DashUploadDashStream.s3DashUploadDashStreamMod.S3StreamUploader
import typings.s3DashUploadDashStream.s3DashUploadDashStreamMod.S3WriteStream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("s3-upload-stream", JSImport.Namespace)
@js.native
object s3DashUploadDashStreamMod extends js.Object {
  @js.native
  trait S3StreamUploader extends js.Object {
    def upload(destinationDetails: PutObjectRequest): S3WriteStream = js.native
    def upload(destinationDetails: PutObjectRequest, sessionDetails: js.Any): S3WriteStream = js.native
  }
  
  @js.native
  trait S3WriteStream extends Writable {
    def concurrentParts(numberOfParts: Double): Unit = js.native
    def maxPartSize(sizeInBytes: Double): Unit = js.native
  }
  
  def apply(client: S3): S3StreamUploader = js.native
}

