package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnAddNewRowEventArgs[T /* <: SlickData */] extends GridEventArgs[T] {
  var column: Column[T]
  var item: T
}

