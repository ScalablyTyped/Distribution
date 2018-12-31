package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnCellChangeEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: scala.Double
  var item: T
  var row: scala.Double
}

