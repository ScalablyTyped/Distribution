package typings.slickgrid.Slick

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormatterFactory[T /* <: SlickData */] extends js.Object {
  def getFormatter(column: Column[T]): Formatter[_] = js.native
}

object FormatterFactory {
  @scala.inline
  def apply[/* <: typings.slickgrid.Slick.SlickData */ T](getFormatter: Column[T] => Formatter[_]): FormatterFactory[T] = {
    val __obj = js.Dynamic.literal(getFormatter = js.Any.fromFunction1(getFormatter))
    __obj.asInstanceOf[FormatterFactory[T]]
  }
  @scala.inline
  implicit class FormatterFactoryOps[Self <: FormatterFactory[_], /* <: typings.slickgrid.Slick.SlickData */ T] (val x: Self with FormatterFactory[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setGetFormatter(value: Column[T] => Formatter[_]): Self = this.set("getFormatter", js.Any.fromFunction1(value))
  }
  
}

