package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait OnCommandEventArgs[T /* <: SlickData */] extends js.Object {
  var button: HeaderButton
  var column: Column[T]
  var command: java.lang.String
  var grid: Grid[T]
}

