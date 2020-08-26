package typings.quixote.mod

import typings.quixote.QFrame
import typings.quixote.QuixoteFrameOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Quixote extends js.Object {
  def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame = js.native
}

object Quixote {
  @scala.inline
  def apply(
    createFrame: (QuixoteFrameOptions, js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]) => QFrame
  ): Quixote = {
    val __obj = js.Dynamic.literal(createFrame = js.Any.fromFunction2(createFrame))
    __obj.asInstanceOf[Quixote]
  }
  @scala.inline
  implicit class QuixoteOps[Self <: Quixote] (val x: Self) extends AnyVal {
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
    def setCreateFrame(
      value: (QuixoteFrameOptions, js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]) => QFrame
    ): Self = this.set("createFrame", js.Any.fromFunction2(value))
  }
  
}

