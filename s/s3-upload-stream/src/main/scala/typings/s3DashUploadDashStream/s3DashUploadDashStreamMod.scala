package typings.s3DashUploadDashStream

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("s3-upload-stream", JSImport.Namespace)
@js.native
object s3DashUploadDashStreamMod extends js.Object {
  @js.native
  trait S3StreamUploader extends js.Object {
    def upload(
      destinationDetails: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.S3.PutObjectRequest */ js.Any
    ): S3WriteStream = js.native
    def upload(
      destinationDetails: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.S3.PutObjectRequest */ js.Any,
      sessionDetails: js.Any
    ): S3WriteStream = js.native
  }
  
  @js.native
  trait S3WriteStream extends Writable {
    def concurrentParts(numberOfParts: Double): Unit = js.native
    def maxPartSize(sizeInBytes: Double): Unit = js.native
  }
  
  def apply(
    client: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify AWS.S3 */ js.Any
  ): S3StreamUploader = js.native
}

