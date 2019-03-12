package typings
package rnDashFetchDashBlobLib.rnDashFetchDashBlobMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RNFetchBlobWriteStream extends js.Object {
  var append: scala.Boolean
  var encoding: java.lang.String
  var id: java.lang.String
  def close(): scala.Unit
  def write(data: java.lang.String): js.Promise[scala.Unit]
}

object RNFetchBlobWriteStream {
  @scala.inline
  def apply(
    append: scala.Boolean,
    close: () => scala.Unit,
    encoding: java.lang.String,
    id: java.lang.String,
    write: java.lang.String => js.Promise[scala.Unit]
  ): RNFetchBlobWriteStream = {
    val __obj = js.Dynamic.literal(append = append, close = js.Any.fromFunction0(close), encoding = encoding, id = id, write = js.Any.fromFunction1(write))
  
    __obj.asInstanceOf[RNFetchBlobWriteStream]
  }
}

