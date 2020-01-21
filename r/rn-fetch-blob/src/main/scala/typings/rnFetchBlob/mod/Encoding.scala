package typings.rnFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.rnFetchBlob.rnFetchBlobStrings.utf8
  - typings.rnFetchBlob.rnFetchBlobStrings.ascii
  - typings.rnFetchBlob.rnFetchBlobStrings.base64
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typings.rnFetchBlob.rnFetchBlobStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typings.rnFetchBlob.rnFetchBlobStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def utf8: typings.rnFetchBlob.rnFetchBlobStrings.utf8 = this.cast("utf8")
}

