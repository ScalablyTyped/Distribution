package typings.reactNativeDrawerLayout.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DrawerLayout
  extends Component[DrawerLayoutProperties, js.Object, js.Any] {
  /**
    * Closes the drawer.
    */
  def closeDrawer(): Unit = js.native
  /**
    * Opens the drawer.
    */
  def openDrawer(): Unit = js.native
}

