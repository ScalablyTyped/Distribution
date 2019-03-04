package typings
package reactDashNativeDashFetchDashBlobLib.reactDashNativeDashFetchDashBlobMod

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
    close: js.Function0[scala.Unit],
    encoding: java.lang.String,
    id: java.lang.String,
    write: js.Function1[java.lang.String, js.Promise[scala.Unit]]
  ): RNFetchBlobWriteStream = {
    val __obj = js.Dynamic.literal(append = append, close = close, encoding = encoding, id = id, write = write)
  
    __obj.asInstanceOf[RNFetchBlobWriteStream]
  }
}

