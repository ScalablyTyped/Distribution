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
  def write(data: java.lang.String): stdLib.Promise[scala.Unit]
}

