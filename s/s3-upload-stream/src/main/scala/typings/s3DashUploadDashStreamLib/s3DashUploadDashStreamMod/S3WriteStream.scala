package typings
package s3DashUploadDashStreamLib.s3DashUploadDashStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3WriteStream
  extends nodeLib.streamMod.Writable {
  def concurrentParts(numberOfParts: scala.Double): scala.Unit = js.native
  def maxPartSize(sizeInBytes: scala.Double): scala.Unit = js.native
}

