package typings.reactNativeGestureHandler.drawerLayoutMod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayout
  extends Component[DrawerLayoutProperties, js.Object, js.Any] {
  def closeDrawer(): Unit = js.native
  def closeDrawer(options: DrawerMovementOptionType): Unit = js.native
  def openDrawer(): Unit = js.native
  def openDrawer(options: DrawerMovementOptionType): Unit = js.native
}

