package typings.s3Streams.mod

import typings.awsSdk.mod.S3
import typings.awsSdk.s3Mod.GetObjectRequest
import typings.node.streamMod.Readable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("s3-streams", "ReadStream")
@js.native
class ReadStream protected () extends Readable {
  def this(client: S3, options: GetObjectRequest) = this()
  def this(client: S3, options: GetObjectRequest, streamOptions: StreamOptions) = this()
}
