package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITextWriter extends js.Object {
  def Close(): Unit
  def Write(s: java.lang.String): Unit
  def WriteLine(s: java.lang.String): Unit
}

object ITextWriter {
  @scala.inline
  def apply(Close: () => Unit, Write: java.lang.String => Unit, WriteLine: java.lang.String => Unit): ITextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine))
    __obj.asInstanceOf[ITextWriter]
  }
}

