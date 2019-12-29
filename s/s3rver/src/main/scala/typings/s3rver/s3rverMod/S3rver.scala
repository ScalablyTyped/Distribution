package typings.s3rver.s3rverMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3rver extends js.Object {
  def close(): js.Promise[Unit] = js.native
  // Should return S3rver, but doesn't in all cases, currently
  // See https://github.com/jamhall/s3rver/pull/571
  def close(callback: js.Function1[/* error */ Error | Null, Unit]): Unit = js.native
  def run(): js.Promise[String] = js.native
  def run(
    callback: js.Function4[
      /* error */ Error | Null, 
      /* hostname */ String, 
      /* port */ Double, 
      /* directory */ String, 
      Unit
    ]
  ): S3rver = js.native
  def setDirectory(directory: String): S3rver = js.native
  def setErrorDocument(errorDocument: String): S3rver = js.native
  def setHostname(hostname: String): S3rver = js.native
  def setIndexDocument(indexDocument: String): S3rver = js.native
  def setPort(port: Double): S3rver = js.native
  def setSilent(silent: Boolean): S3rver = js.native
}

