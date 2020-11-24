package typings.reactSplitPane.mod

import typings.react.mod.Component
import typings.std.MouseEvent
import typings.std.TouchEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SplitPane
  extends Component[SplitPaneProps, SplitPaneState, js.Any] {
  
  def onMouseDown(event: MouseEvent): Unit = js.native
  
  def onMouseMove(event: MouseEvent): Unit = js.native
  
  def onMouseUp(): Unit = js.native
  
  def onTouchMove(event: TouchEvent): Unit = js.native
  
  def onTouchStart(event: TouchEvent): Unit = js.native
}
