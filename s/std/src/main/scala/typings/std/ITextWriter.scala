package typings.std

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITextWriter extends js.Object {
  def Close(): Unit = js.native
  def Write(s: java.lang.String): Unit = js.native
  def WriteLine(s: java.lang.String): Unit = js.native
}

object ITextWriter {
  @scala.inline
  def apply(Close: () => Unit, Write: java.lang.String => Unit, WriteLine: java.lang.String => Unit): ITextWriter = {
    val __obj = js.Dynamic.literal(Close = js.Any.fromFunction0(Close), Write = js.Any.fromFunction1(Write), WriteLine = js.Any.fromFunction1(WriteLine))
    __obj.asInstanceOf[ITextWriter]
  }
  @scala.inline
  implicit class ITextWriterOps[Self <: ITextWriter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setClose(value: () => Unit): Self = this.set("Close", js.Any.fromFunction0(value))
    @scala.inline
    def setWrite(value: java.lang.String => Unit): Self = this.set("Write", js.Any.fromFunction1(value))
    @scala.inline
    def setWriteLine(value: java.lang.String => Unit): Self = this.set("WriteLine", js.Any.fromFunction1(value))
  }
  
}

