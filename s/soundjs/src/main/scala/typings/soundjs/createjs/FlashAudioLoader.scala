package typings.soundjs.createjs

import typings.preloadjs.createjs.AbstractLoader
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FlashAudioLoader extends AbstractLoader {
  
  // properties
  var flashId: String = js.native
  
  // methods
  def setFlash(flash: js.Object): Unit = js.native
}
