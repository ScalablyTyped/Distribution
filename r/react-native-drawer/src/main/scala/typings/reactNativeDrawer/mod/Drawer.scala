package typings.reactNativeDrawer.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Drawer
  extends Component[DrawerProperties, js.Object, js.Any] {
  
  /** Close the drawer programmatically. */
  def close(): Unit = js.native
  
  /** Open the drawer programmatically. */
  def open(): Unit = js.native
}
