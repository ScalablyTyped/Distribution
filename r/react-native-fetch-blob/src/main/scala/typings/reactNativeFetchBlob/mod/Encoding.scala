package typings.reactNativeFetchBlob.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8
  - typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.ascii
  - typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64
*/
trait Encoding extends js.Object

object Encoding {
  @scala.inline
  def ascii: typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.ascii = this.cast("ascii")
  @scala.inline
  def base64: typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.base64 = this.cast("base64")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def utf8: typings.reactNativeFetchBlob.reactNativeFetchBlobStrings.utf8 = this.cast("utf8")
}

