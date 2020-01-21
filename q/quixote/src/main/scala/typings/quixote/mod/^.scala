package typings.quixote.mod

import typings.quixote.QFrame
import typings.quixote.QuixoteFrameOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("quixote", JSImport.Namespace)
@js.native
class ^ () extends Quixote {
  /* CompleteClass */
  override def createFrame(
    options: QuixoteFrameOptions,
    callback: js.Function2[/* err */ Error, /* loadedFrame */ QFrame, Unit]
  ): QFrame = js.native
}

