package typings.soundjs.createjs

import typings.preloadjs.createjs.AbstractLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FlashAudioLoader extends AbstractLoader {
  // properties
  var flashId: String = js.native
  // methods
  def setFlash(flash: js.Object): Unit = js.native
}

