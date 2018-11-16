package typings
package ramdaLib.ramdaMod.RNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Functor[T] extends js.Object {
  def map[U](fn: js.Function1[/* t */ T, U]): Functor[U]
}

