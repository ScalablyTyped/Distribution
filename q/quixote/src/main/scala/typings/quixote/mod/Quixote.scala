package typings.quixote.mod

import typings.quixote.QFrame
import typings.quixote.QuixoteFrameOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quixote extends js.Object {
  def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame
}

object Quixote {
  @scala.inline
  def apply(
    createFrame: (QuixoteFrameOptions, js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]) => QFrame
  ): Quixote = {
    val __obj = js.Dynamic.literal(createFrame = js.Any.fromFunction2(createFrame))
  
    __obj.asInstanceOf[Quixote]
  }
}

