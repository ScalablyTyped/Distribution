package typings
package s3rverLib.s3rverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait S3rver extends js.Object {
  def run(
    callback: js.Function4[
      /* error */ stdLib.Error, 
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

object S3rver {
  @scala.inline
  def apply(
    run: js.Function4[
      /* error */ stdLib.Error, 
      /* hostname */ java.lang.String, 
      /* port */ scala.Double, 
      /* directory */ java.lang.String, 
      scala.Unit
    ] => nodeLib.httpMod.Server,
    setDirectory: java.lang.String => S3rver,
    setErrorDocument: java.lang.String => S3rver,
    setHostname: java.lang.String => S3rver,
    setIndexDocument: java.lang.String => S3rver,
    setPort: scala.Double => S3rver,
    setSilent: scala.Boolean => S3rver
  ): S3rver = {
    val __obj = js.Dynamic.literal(run = js.Any.fromFunction1(run), setDirectory = js.Any.fromFunction1(setDirectory), setErrorDocument = js.Any.fromFunction1(setErrorDocument), setHostname = js.Any.fromFunction1(setHostname), setIndexDocument = js.Any.fromFunction1(setIndexDocument), setPort = js.Any.fromFunction1(setPort), setSilent = js.Any.fromFunction1(setSilent))
  
    __obj.asInstanceOf[S3rver]
  }
}

