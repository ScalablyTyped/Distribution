package typings
package s3rverLib.s3rverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("s3rver", JSImport.Namespace)
@js.native
class namespaced protected () extends S3rver {
  def this(options: S3rverOptions) = this()
  /* CompleteClass */
  override def run(
    callback: js.Function4[
      /* error */ nodeLib.Error, 
      /* hostname */ java.lang.String, 
      /* port */ scala.Double, 
      /* directory */ java.lang.String, 
      scala.Unit
    ]
  ): nodeLib.httpMod.Server = js.native
  /* CompleteClass */
  override def setDirectory(directory: java.lang.String): S3rver = js.native
  /* CompleteClass */
  override def setErrorDocument(errorDocument: java.lang.String): S3rver = js.native
  /* CompleteClass */
  override def setHostname(hostname: java.lang.String): S3rver = js.native
  /* CompleteClass */
  override def setIndexDocument(indexDocument: java.lang.String): S3rver = js.native
  /* CompleteClass */
  override def setPort(port: scala.Double): S3rver = js.native
  /* CompleteClass */
  override def setSilent(silent: scala.Boolean): S3rver = js.native
}

