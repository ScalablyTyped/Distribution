package typings.s3Streams.mod

import typings.awsSdk.mod.S3
import typings.awsSdk.s3Mod.CreateMultipartUploadRequest
import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("s3-streams", "WriteStream")
@js.native
class WriteStream protected () extends Writable {
  def this(client: S3, options: CreateMultipartUploadRequest) = this()
  def this(client: S3, options: CreateMultipartUploadRequest, streamOptions: StreamOptions) = this()
}
