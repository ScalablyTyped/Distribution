package typings.reactNativeShareMenu.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ShareMenu extends js.Object {
  def clearSharedText(): Unit
  def getSharedText(callback: js.Function1[/* text */ String, Unit]): Unit
}

@JSImport("react-native-share-menu", "ShareMenu")
@js.native
object ShareMenu extends TopLevel[ShareMenu]

