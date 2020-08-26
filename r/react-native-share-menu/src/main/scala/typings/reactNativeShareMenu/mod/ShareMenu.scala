package typings.reactNativeShareMenu.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ShareMenu extends js.Object {
  def clearSharedText(): Unit = js.native
  def getSharedText(callback: js.Function1[/* text */ String, Unit]): Unit = js.native
}

@JSImport("react-native-share-menu", "ShareMenu")
@js.native
object ShareMenu extends TopLevel[ShareMenu]

