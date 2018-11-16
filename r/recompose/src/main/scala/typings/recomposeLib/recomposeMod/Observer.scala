package typings
package recomposeLib.recomposeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Observer[T] extends js.Object {
  def complete(): scala.Unit
  def next(props: T): scala.Unit
}

