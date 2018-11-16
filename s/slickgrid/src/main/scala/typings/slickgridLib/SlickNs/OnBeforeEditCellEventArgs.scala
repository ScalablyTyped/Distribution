package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnBeforeEditCellEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var cell: scala.Double
  var column: Column[T]
  var item: T
  var row: scala.Double
}

