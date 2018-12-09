package typings
package stellarDashSdkLib.stellarDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait CollectionPage[T /* <: Record */] extends js.Object {
  var records: js.Array[T]
  def next(): js.Promise[CollectionPage[T]]
  def prev(): js.Promise[CollectionPage[T]]
}

