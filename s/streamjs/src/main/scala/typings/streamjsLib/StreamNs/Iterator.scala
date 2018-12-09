package typings
package streamjsLib.StreamNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Iterator[T] extends js.Object {
  var done: scala.Boolean
  def next(): T
}

