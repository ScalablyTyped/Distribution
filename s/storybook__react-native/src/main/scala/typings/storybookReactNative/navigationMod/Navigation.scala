package typings.storybookReactNative.navigationMod

import typings.react.mod.Component
import typings.storybookReactNative.anon.IsUIVisible
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Navigation
  extends Component[Props, js.Object, js.Any] {
  
  def handleSwipeLeft(): Unit = js.native
  
  def handleSwipeRight(): Unit = js.native
  
  def handleToggleUI(): Unit = js.native
  
  @JSName("state")
  var state_Navigation: IsUIVisible = js.native
}
