package typings
package slickgridLib.SlickNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterFactory[T /* <: SlickData */] extends js.Object {
  def getFormatter(column: Column[T]): Formatter[_]
}

object FormatterFactory {
  @scala.inline
  def apply[T /* <: SlickData */](getFormatter: js.Function1[Column[T], Formatter[_]]): FormatterFactory[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("getFormatter")(getFormatter)
    __obj.asInstanceOf[FormatterFactory[T]]
  }
}

