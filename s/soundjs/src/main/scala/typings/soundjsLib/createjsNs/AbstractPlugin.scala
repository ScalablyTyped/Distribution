package typings
package soundjsLib.createjsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("createjs.AbstractPlugin")
@js.native
class AbstractPlugin () extends js.Object {
  // methods
  def create(src: java.lang.String, startTime: scala.Double, duration: scala.Double): AbstractSoundInstance = js.native
  def getVolume(): scala.Double = js.native
  def isPreloadComplete(src: java.lang.String): scala.Boolean = js.native
  def isPreloadStarted(src: java.lang.String): scala.Boolean = js.native
  def isSupported(): scala.Boolean = js.native
  def preload(loader: js.Object): scala.Unit = js.native
  def register(loadItem: java.lang.String, instances: scala.Double): js.Object = js.native
  def removeAllSounds(src: java.lang.String): scala.Unit = js.native
  def removeSound(src: java.lang.String): scala.Unit = js.native
  def setMute(value: scala.Boolean): scala.Boolean = js.native
  def setVolume(value: scala.Double): scala.Boolean = js.native
}

