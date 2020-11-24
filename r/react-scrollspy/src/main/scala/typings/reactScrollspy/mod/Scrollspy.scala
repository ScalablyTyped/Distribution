package typings.reactScrollspy.mod

import typings.react.mod.Component
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Scrollspy
  extends Component[ScrollspyProps, js.Object, js.Any] {
  
  // Remove event listener of scrollspy.
  def offEvent(): Unit = js.native
  
  // Add event listener of scrollspy.
  def onEvent(): Unit = js.native
}
