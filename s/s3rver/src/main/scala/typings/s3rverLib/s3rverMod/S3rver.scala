package typings
package s3rverLib.s3rverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait S3rver extends js.Object {
  def run(): js.Promise[java.lang.String] = js.native
  def run(
    callback: js.Function4[
      /* error */ stdLib.Error, 
      /* hostname */ java.lang.String, 
      /* port */ scala.Double, 
      /* directory */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.httpMod.Server = js.native
  def setDirectory(directory: java.lang.String): S3rver = js.native
  def setErrorDocument(errorDocument: java.lang.String): S3rver = js.native
  def setHostname(hostname: java.lang.String): S3rver = js.native
  def setIndexDocument(indexDocument: java.lang.String): S3rver = js.native
  def setPort(port: scala.Double): S3rver = js.native
  def setSilent(silent: scala.Boolean): S3rver = js.native
}

