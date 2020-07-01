package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormatterFactory[T /* <: SlickData */] extends js.Object {
  def getFormatter(column: Column[T]): Formatter[_]
}

object FormatterFactory {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](getFormatter: Column[T] => Formatter[_]): FormatterFactory[T] = {
    val __obj = js.Dynamic.literal(getFormatter = js.Any.fromFunction1(getFormatter))
    __obj.asInstanceOf[FormatterFactory[T]]
  }
}

