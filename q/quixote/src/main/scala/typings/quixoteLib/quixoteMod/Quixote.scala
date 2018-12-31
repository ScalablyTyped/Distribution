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

