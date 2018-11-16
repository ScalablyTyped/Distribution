package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait FormatterFactory[T /* <: SlickData */] extends js.Object {
  def getFormatter(column: Column[T]): Formatter[_]
}

