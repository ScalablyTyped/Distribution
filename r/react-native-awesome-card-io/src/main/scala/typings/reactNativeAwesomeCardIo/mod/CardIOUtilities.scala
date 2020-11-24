package typings.reactNativeAwesomeCardIo.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("react-native-awesome-card-io", "CardIOUtilities")
@js.native
object CardIOUtilities extends js.Object {
  
  val CAN_READ_CARD_WITH_CAMERA: Boolean = js.native
  
  val DETECTION_MODE: CardIODetectionMode = js.native
  
  /**  iOS only - prepares card.io to launch faster. */
  def preload(): Unit = js.native
}
