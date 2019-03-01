package typings
package quixoteLib.quixoteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Quixote extends js.Object {
  def createFrame(
    options: quixoteLib.QuixoteFrameOptions,
    callback: js.Function2[/* err */ stdLib.Error, /* loadedFrame */ quixoteLib.QFrame, scala.Unit]
  ): quixoteLib.QFrame
}

object Quixote {
  @scala.inline
  def apply(
    createFrame: js.Function2[
      quixoteLib.QuixoteFrameOptions, 
      js.Function2[/* err */ stdLib.Error, /* loadedFrame */ quixoteLib.QFrame, scala.Unit], 
      quixoteLib.QFrame
    ]
  ): Quixote = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFrame")(createFrame)
    __obj.asInstanceOf[Quixote]
  }
}

