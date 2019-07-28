package typings.s3DashUploadDashStream.s3DashUploadDashStreamMod

import typings.node.streamMod.Writable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3WriteStream extends Writable {
  def concurrentParts(numberOfParts: Double): Unit = js.native
  def maxPartSize(sizeInBytes: Double): Unit = js.native
}

