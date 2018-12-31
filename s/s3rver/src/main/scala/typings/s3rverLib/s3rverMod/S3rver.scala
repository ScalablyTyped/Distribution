package typings
package s3rverLib.s3rverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3rver extends js.Object {
  def run(
    callback: js.Function4[
      /* error */ nodeLib.Error, 
      /* hostname */ java.lang.String, 
      /* port */ scala.Double, 
      /* directory */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.httpMod.Server
  def setDirectory(directory: java.lang.String): S3rver
  def setErrorDocument(errorDocument: java.lang.String): S3rver
  def setHostname(hostname: java.lang.String): S3rver
  def setIndexDocument(indexDocument: java.lang.String): S3rver
  def setPort(port: scala.Double): S3rver
  def setSilent(silent: scala.Boolean): S3rver
}

