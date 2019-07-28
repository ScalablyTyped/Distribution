package typings.s3rver.s3rverMod

import typings.node.httpMod.Server
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3rver extends js.Object {
  def run(): js.Promise[String] = js.native
  def run(
    callback: js.Function4[
      /* error */ Error, 
      /* hostname */ String, 
      /* port */ Double, 
      /* directory */ String, 
      Unit
    ]
  ): Server = js.native
  def setDirectory(directory: String): S3rver = js.native
  def setErrorDocument(errorDocument: String): S3rver = js.native
  def setHostname(hostname: String): S3rver = js.native
  def setIndexDocument(indexDocument: String): S3rver = js.native
  def setPort(port: Double): S3rver = js.native
  def setSilent(silent: Boolean): S3rver = js.native
}

