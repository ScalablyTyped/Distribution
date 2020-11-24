package typings.s3UploadStream

import typings.awsSdk.mod.S3
import typings.awsSdk.s3Mod.PutObjectRequest
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("s3-upload-stream", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def apply(client: S3): S3StreamUploader = js.native
  
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
}
