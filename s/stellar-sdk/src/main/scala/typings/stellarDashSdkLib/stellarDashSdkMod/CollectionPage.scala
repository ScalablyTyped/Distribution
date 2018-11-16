package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CollectionPage[T /* <: Record */] extends js.Object {
  var records: js.Array[T]
  def next(): stdLib.Promise[CollectionPage[T]]
  def prev(): stdLib.Promise[CollectionPage[T]]
}

